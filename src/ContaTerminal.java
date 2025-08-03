import java.util.Scanner;

public class ContaTerminal {

     public static void main (String[] args) {

          Scanner sc = new Scanner(System.in);
          int numero;
          String agencia;
          String nomeCliente;
          double saldo;


          System.out.println("-------------ContaBancária-------------");
          System.out.println();

          System.out.println("Por favor, digite numero da sua conta: (1021) ");
          numero = sc.nextInt();

          System.out.println("Digite seu nome por gentileza: ");
          nomeCliente = sc.next();
          sc.nextLine();

          System.out.println("Por favor, digite numero da sua agencia: (067-8) ");
          agencia = sc.next();

          System.out.println("Agora me informa  seu saldo atual: ");
          saldo = sc.nextDouble();
          sc.nextInt();
          System.out.println();

               String first = "Olá! [Mario Andrade],";
               String second = "obrigado por criar sua conta em nosso banco [Santander],";

          String third = first + second;
               System.out.println(third);

               // yet another way to concatenate strings
               first += second;
               System.out.println(first);
               System.out.println();

          System.out.printf("Olá! [Mario Andrade],+= obrigado por criar sua conta em, "
                  +"nosso banco", "sua agencia é [067-8], "
                  +"conta: [1021], e seu saldo é: [237.48], e já está disponivel em conta "
                  +"para saque.", numero, agencia, nomeCliente, saldo) ;

          System.out.println();


     }

}
