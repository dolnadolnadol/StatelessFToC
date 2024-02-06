package ftocclient;

import java.util.Scanner;
import javax.ejb.EJB;
import myBean.StatelessFToCRemote;

public class Main {

    @EJB
    private static StatelessFToCRemote statelessFToC;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter degree in Fahrenheit: ");
        
        double input = in.nextDouble();
        System.out.printf("%.2f Fahrenheit is %.2f\n", input, statelessFToC.fToC(input));

    }

}
