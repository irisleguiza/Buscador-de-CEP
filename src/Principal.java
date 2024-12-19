import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
            Scanner leitura= new Scanner(System.in);
            ConsultaCEP consultacep = new ConsultaCEP();

            System.out.println("Digite um numero de CEP para consulta");
            var cep =leitura.nextLine();

            try{
                Endereco novoEndereco = consultacep.buscaEndereco("01001000");
                System.out.println(novoEndereco);
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Finalizando a aplicacao");
            }



    }
}
