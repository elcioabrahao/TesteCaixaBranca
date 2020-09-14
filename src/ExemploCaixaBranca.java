

public class ExemploCaixaBranca {

    public static void main(String[] args){
        ExemploCaixaBranca tcb = new ExemploCaixaBranca();
        int VAR1 = 1;
        int VAR2 = 1;
        int VAR3 = 1;
        System.out.println("Entrada: VAR1="+VAR1+"   VAR2="+VAR2+"   VAR3="+VAR3);
        System.out.println("Saída  : "+tcb.execute(VAR1,VAR2,VAR3));
    }

    public String execute(int VAR1, int VAR2, int VAR3){

        String trechos = "";
        String comandos = "";

        System.out.println("INICIO");

        System.out.println("VAR1="+VAR1+"   VAR2="+VAR2+"   VAR3="+VAR3);

        System.out.println("Trecho: a");
        trechos += "a";

        System.out.println("Comando --> 1");
        comandos += "1";
        if(VAR1 > 1 && VAR2 == 0){
            System.out.println("Trecho: c");
            trechos += "c";
            System.out.println("Comando --> 2");
            comandos += "2";
            VAR3 = VAR3 / VAR1;
        }else{
            System.out.println("Trecho: b");
            trechos += "b";
        }

        System.out.println("VAR1="+VAR1+"   VAR2="+VAR2+"   VAR3="+VAR3);

        System.out.println("Comando --> 3");
        comandos += "3";
        if(VAR1 == 2 || VAR3 > 1){
            System.out.println("Trecho: e");
            trechos += "e";
            System.out.println("Comando --> 4");
            comandos += "4";
            VAR3 = VAR3 + VAR1;
        }else{
            System.out.println("Trecho: d");
            trechos += "d";
        }
        System.out.println("FIM");

        return trechos+"-"+comandos;

    }
}
