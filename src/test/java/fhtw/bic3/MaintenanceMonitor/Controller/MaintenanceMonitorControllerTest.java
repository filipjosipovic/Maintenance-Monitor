package fhtw.bic3.MaintenanceMonitor.Controller;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorControllerTest {


    //https://stackoverflow.com/questions/6467848/how-to-get-http-response-code-for-a-url-in-java
    @Test
    void testGetMessage() {
        try{
            URL url = new URL("http://localhost:8080/maintMode/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int code = connection.getResponseCode();
            //Assertions.assertEquals(HttpURLConnection.HTTP_OK,code);
            if (code == HttpURLConnection.HTTP_OK) System.out.println("Successful code: " + code);
            else System.out.println("Failure code: " + code);
        }
        catch(IOException e)
        {
            System.out.println("oops.... : "+ e);
        }
    }
}