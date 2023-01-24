public class Switchcase {
    public static void main(String[] args) {

        //Değişken tanımlama.

        int day=1;

        //If, else if uygulaması.

        if(day==1) {
            System.out.println("Bugün Pazartesi.");
        }
            else if(day==2){
                System.out.println("Bugün Salı.");
            }
        else if(day==3){
            System.out.println("Bugün Çarşamba.");
        }
        else if(day==4){
            System.out.println("Bugün Perşembe.");
        }
        else if(day==5){
            System.out.println("Bugün Cuma.");
        }
        else if(day==6){
            System.out.println("Bugün Cumartesi.");
        }
        else if(day==7){
            System.out.println("Bugün Pazar.");
        }
        else {
            System.out.println("Hatalı giriş yaptınız.");
        }

        //Switch-Case Uygulaması.

        switch(day){

            case 1:
                System.out.println("Bugün Pazartesi.");
                System.out.println("Program bitti.");
                break;

            case 2:
                System.out.println("Bugün Salı.");
                break;

            case 3:
                System.out.println("Bugün Çarşamba.");
                break;

            case 4:
                System.out.println("Bugün Perşembe.");
                break;

            case 5:
                System.out.println("Bugün Cuma.");
                break;

            case 6:
                System.out.println("Bugün Cumartesi.");
                break;

            case 7:
                System.out.println("Bugün Pazar.");
                break;

            default:
                System.out.println("Hatalı giriş yaptınız.");

        }
    }
}