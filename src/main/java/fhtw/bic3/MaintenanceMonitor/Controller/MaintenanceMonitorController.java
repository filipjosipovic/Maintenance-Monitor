package fhtw.bic3.MaintenanceMonitor.Controller;
import fhtw.bic3.MaintenanceMonitor.Service.MaintenanceMonitorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Controller class
 * REST functionality
 */
@Controller
public class MaintenanceMonitorController {

    private final MaintenanceMonitorService monitorService;

    public MaintenanceMonitorController(MaintenanceMonitorService monitorService) {
        this.monitorService = monitorService;
    }

    /**
     * Basic test of Web
     * @return home the home.html site
     */
    @GetMapping("/home")
    public String home() {
        return "home";  //home.html
    }

    /**
     * The message view
     * @param model basic spring model
     * @return mes the mes.html site
     */
    @GetMapping("/message")
    String getMes(Model model) {
        String message = monitorService.getMessage();
        model.addAttribute("message", message); //set the message for mes.html

        if (message.equals("error")) {
            model.addAttribute("color", "#ec1110"); //background red
        } else {
            model.addAttribute("color", "#129721"); //background green
        }

        return "mes";   //mes.html
    }

    /**
     * The set message view
     * @param message the set message
     * @param model basic spring model
     * @return change the change.html site
     */
    @GetMapping("/message/{message}")
    String setMes(@PathVariable String message, Model model) {
        if (!message.equals("reset")) {
            monitorService.setMessage(message); //set message with given path variable
        } else {
            monitorService.resetMessage();  //reset message
        }
        model.addAttribute("setText","You just set the message to: \""+monitorService.getMessage()+"\"");   //set the text for change.html
        return "change";    //change.html
    }
}