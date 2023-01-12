import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Feriados {
    
    private List<Feriado> feriados = new ArrayList<>(Arrays.asList(
        new Feriado("01/01/2023", "Confraternização mundial"),
        new Feriado("21/02/2023", "Carnaval"),
        new Feriado("17/04/2023", "Páscoa"),
        new Feriado("21/04/2023", "Tiradentes"),
        new Feriado("01/05/2023", "Dia do trabalho"),
        new Feriado("08/06/2023", "Corpus Christi"),
        new Feriado("07/09/2023", "Independência do Brasil"),
        new Feriado("12/10/2023", "Nossa Senhora Aparecida"),
        new Feriado("02/11/2023", "Finados"),
        new Feriado("15/11/2023", "Proclamação da República"),
        new Feriado("25/12/2023", "Natal")   
    )
    );

    
    public List<Feriado> getFeriados() {
        return this.feriados;
    }

    public String checarFeriado(String data){

        for(Feriado feriado : feriados){
            if(feriado.getData().equals(data)){
                return "A data " + data + " é referente ao feriado de " + feriado.getNome();
            }
        }

        return "Esta data não é um feriado!";

    }
}
