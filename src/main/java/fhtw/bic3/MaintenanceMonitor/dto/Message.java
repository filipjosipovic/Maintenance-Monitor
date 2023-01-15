package fhtw.bic3.MaintenanceMonitor.dto;

/**
 * Message Class
 * the message is stored here
 */
public class Message {
    private String mes = "Stored Message";  //the message string

    public String getMes() { return mes; }  //get Message

    public void setMes(String message) {    //set Message
        mes = message;
    }

    public void resetMes() { mes = "";}     //reset Message

}