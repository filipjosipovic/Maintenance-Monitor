package fhtw.bic3.MaintenanceMonitor.Service;

import fhtw.bic3.MaintenanceMonitor.dto.Message;
import org.springframework.stereotype.Service;

/**
 * Service Class
 * Spring Service get,setter,reset
 */
@Service
public class MaintenanceMonitorService {
    private final Message message = new Message();

    public void resetMessage() {    //reset Message Spring
        message.resetMes();
    }

    public String getMessage() {    //get Message Spring
        return message.getMes();
    }

    public void setMessage(String mes) {    //set Message Spring
        message.setMes(mes);
    }
}