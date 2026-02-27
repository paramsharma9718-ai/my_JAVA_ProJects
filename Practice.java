import java.util.*;
class Travel{
    private String T_code;
    private int children,adults,distance;
    private float totalfare;

    Scanner sc = new Scanner(System.in);

    public Travel(){
        T_code="NULL";
        adults=0;
        children=0;
        distance=0;
        totalfare=0;
    }

    void Assignfare(){
        if(distance>=1000){
            totalfare = adults*500+children*250;
        }
        else if(distance<1000 && distance>=500){
            totalfare = adults*300+children*150;
        }
        else{
            totalfare = adults*200+children*100;
    }
}

void entertravel(){
    System.out.print("ENTER T_CODE : ");
    T_code = sc.nextLine();
    System.out.print("ENTER TOTAL NUMBER OF ADULTS : ");
    adults = sc.nextInt();
    System.out.print("ENTER TOTAL NUMBER OF CHILDRENS : ");
    children = sc.nextInt();
    System.out.println("ENTER TOTAL DISTANCE TRAVELLED : ");
    distance = sc.nextInt();

    Assignfare();

}

void showtravel(){
    System.out.println("T_CODE : "+T_code);
    System.out.println("TOTAL ADULTS : "+adults);
    System.out.println("TOTAL CHILDRENS : "+children);
    System.out.println("TOTAL DISTANCE TRAVELLED : "+distance);
    System.out.println("TOTAL FARE : "+totalfare);
}

class Practice{
    public static void main(String[] args) {
        Travel t = new Travel();
        t.entertravel();
        t.showtravel();
    }
}
}

    

