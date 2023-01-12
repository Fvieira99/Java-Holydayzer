import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       
        Feriados feriados = new Feriados();

        System.out.println(feriados.checarFeriado("01/01/2023")); 

        System.out.println(feriados.checarFeriado("10/10/2023"));

        System.out.println(feriados.checarFeriado("25/12/2023"));
        
    }
}
