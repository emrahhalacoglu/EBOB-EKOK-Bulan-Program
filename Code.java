import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Numbers to Find Out EBOB-EKOK value");
        System.out.print("n1 : ");
        int n1 = input.nextInt();
        System.out.print("n2 : ");
        int n2 = input.nextInt();

        System.out.print("1-EBOB\n2-EKOK\nPlease Select : ");
        int selection = input.nextInt();
        int EBOB = 0, EKOK = 0;
        /*
         * //SOLUTION WITH FOR LOOP
         * if (n1<=n2) {
         * 
         * for(int i=n1;i>0;i--){
         * if(n1%i==0&&n2%i==0){
         * EBOB=i;
         * break;
         * }
         * 
         * }
         * }else{
         * for(int i=n2;i>0;i--){
         * if(n1%i==0&&n2%i==0){
         * EBOB=i;
         * break;
         * }
         * }
         * }
         */
        // SOLUTION WITH WHILE LOOP
        if (n1 <= n2) {
            int i = n1;
            while (i > 0) {

                if (n1 % i == 0 && n2 % i == 0) {
                    EBOB = i;
                    break;
                }
                i--;
            }
        } else {
            int i = n2;
            while (i > 0) {
                if (n1 % i == 0 && n2 % i == 0) {
                    EBOB = i;
                    break;
                }
                i--;
            }
        }

        if (selection == 1) {
            System.out.println("EBOB : " + EBOB);

        } else {
            /*//SOLUTION WITH FOR LOOP
            if(n1<=n2){
                for (int i=1;i<=n1;i++){
                    int x=n2*i;
                    for (int j=1;j<=n2;j++){
                        int y=n1*j;
                        if(y==x){
                            System.out.println( "EKOK : "+y);
                            break;
                        }
                        else if(y>x){
                            break;
                        }
                    }
                    if(y==x){
                        break;
                }
            }else{
                for (int i=1;i<=n2;i++){
                    int x=n1*i;
                    for (int j=1;j<=n1;j++){
                        int y=n2*j;
                        if(y==x){
                            System.out.println( "EKOK : "+y);
                            break;
                        }
                        else if(y>x){
                            break;
                        }
                    }
                    if(y==x){
                        break;
                } 
            }*/
 
            //SOLUTION WITH WHILE LOOP
            if(n1<=n2){
                int i=1;
                while (i<=n1){
                    int x=n2*i;
                    int j=1;
                    int y=0;
                    while (j<=n2){
                        y=n1*j;
                        if(y==x){
                            System.out.println( "EKOK : "+y);
                            break;
                        }
                        else if(y>x){
                            break;
                        }
                        j++;
                    }
                    if(y==x){
                        break;
                    }
                    i++;
                }
            }else{
                int i=1;
                while (i<=n2){
                    int x=n1*i;
                    int j=1;
                    int y=0;
                    while (j<=n1){
                        y=n2*j;
                        if(y==x){
                            System.out.println( "EKOK : "+y);
                            break;
                        }
                        else if(y>x){
                            break;
                        }
                        j++;
                    }
                    if(y==x){
                        break;
                    }
                    i++;
                } 
            }
            /*//CHECK BLOCK
            EKOK = n1 * n2 / EBOB;
            System.out.println("EKOK : " + EKOK);
            */
        }
    }
}
