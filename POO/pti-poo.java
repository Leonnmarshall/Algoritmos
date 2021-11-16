import java.util.Scanner;
public class DistanciaPontos {
  public static void main(String[] args) {
   double x1, y1, x2, y2;
   double distancia;
   Scanner leitor = new Scanner(System.in);
   System.out.println("Digite o valor de x1:");
   x1 = leitor.nextDouble();
   System.out.println("Digite o valor de y1:");
   y1 = leitor.nextDouble();
   System.out.println("Digite o valor de x2:");
   x2 = leitor.nextDouble();
   System.out.println("Digite o valor de y2:");
   y2 = leitor.nextDouble();

   distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

   System.out.println("A Distância entre os pontos é: " + distancia);

  }
}