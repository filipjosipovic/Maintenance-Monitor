package fhtw.bic3.MaintenanceMonitor.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class
 * REST functionality
 */
@RestController
@CrossOrigin
public class MaintenanceMonitorController {


    public String message="0";

    @GetMapping("/maintMode/")
    public ResponseEntity<String> displayMessage() {
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @RequestMapping("/maintMessage/{message}")
    public String writeMessage(@PathVariable("message") String message) {
        this.message=message;
        return (message.equals("0")) ? "You good g" : "Error occured. Message: "+message;
    }

}