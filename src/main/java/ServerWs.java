import jakarta.xml.ws.Endpoint;

public class ServerWs {
    public static void main(String[] args) {
            String url ="http://0.0.0.0:8383/";
            Endpoint.publish(url,new BanqueService());
            System.out.println("Web service deploye "+url);

    }
}
