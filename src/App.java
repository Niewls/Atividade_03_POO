import poo.dominio.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Professor P1 = new Professor(78637, "Marcos", "rua tal", "67933456573", LocalDate.of(1993, 06, 23), "4567875", "67549809534", LocalDate.now(), "93827642", LocalDate.of(2019, 05, 13));
        System.out.println(P1.getCodigo());
    }
}
