import java.util.Scanner;

public class ExemploCaixaPreta {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String command="";
        String mensagem="";
        do{
            System.out.print("compiler>");
            command = reader.nextLine();
            if(!command.equals("")){
                mensagem = validaCommando(command);
                System.out.println(mensagem);
            }
            System.out.println();
        }while(!command.equals(""));


    }

    private static String validaCommando(String command){
        command = command.trim();
        if(command.indexOf("MOVTOX")==0 ||
            command.indexOf("MOVTOY")==0){
            if(command.indexOf(" ")==6 &&
            command.substring(7,8).matches("^[A-Z]$")) {
                return "OK";
            }else{
                return "Token 2 incorreto.";
            }
        }else{
            return "Token 1 incorreto.";
        }
    }

}
