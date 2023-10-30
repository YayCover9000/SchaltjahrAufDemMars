import java.util.Scanner;
public class SchaltjahrAufDemMars {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int eingabe = sc.nextInt();
        boolean schaltjahr = false;
        boolean gemeinjahr = false;
        
        
        if(eingabe >= 2001 && eingabe <= 4800){
            if(eingabe%2==0){
                schaltjahr = true;gemeinjahr = false;
                if(eingabe%10 == 0){
                    if(eingabe%150 == 0){
                        //Schaltjahr
                        schaltjahr = true;gemeinjahr = false;
                    }else{  
                        //Gemeinjahr
                        gemeinjahr = true;schaltjahr = false;
                    }
                }else{
                    //Schaltjahr
                    schaltjahr = true;gemeinjahr = false;
                }
            }else{ 
                gemeinjahr = true;
            }
        }else{
            System.out.println("Berechnung für das Marsjahr " + eingabe + " ist nicht bekannt.");
        }
        
        if(schaltjahr == true) {
            System.out.println("Das Marsjahr " + eingabe + " ist ein Schaltjahr.");
        }else if(gemeinjahr == true){
            System.out.println("Das Marsjahr " + eingabe + " ist ein Gemeinjahr.");
        }
        
        sc.close();
        
    }
}
