import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWS")
public class BanqueService {

  @WebMethod(operationName = "ConversionEuroToDH") public double ConvertToDh (@WebParam(name = "Montant")double Amount){
        return Amount*11;
    }
    @WebMethod(operationName = "RecuperateAccount")public BankAccount getAccount(@WebParam(name = "code") int code){
    return new BankAccount(code,7000,new Date());

    }

  @WebMethod(operationName = "ListsAccounts") public List<BankAccount> getListAccount() {
    return List.of( new BankAccount(1, 8500, new Date()),
            new BankAccount(1, 10000, new Date()),
            new BankAccount(1, 700, new Date()));
  };
}
