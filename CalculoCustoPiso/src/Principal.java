
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
     CustoPiso piso = new CustoPiso();
     
             
 int op;
      double a,b;
      
      do{
          op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao \n" + "\n 1- Insirir Valor do Comodo \n 2- Calcular Preco por Area \n 3- Mostrar Valores \n 0- Sair" ));

          switch (op)
          {
            case 1:
              piso.InserirValores();
              break;
            case 2:
              piso.CalcularPrecoArea();
              break;
            case 3:
                piso.MostrarValores();
                break;
             
            case 0:
             JOptionPane.showMessageDialog(null,"A Finalizar Programa");
              break;
              default:
              JOptionPane.showMessageDialog(null,"Opcao Invalida");
              break;
          }
      } while(op!=0);
    }
    
}
    