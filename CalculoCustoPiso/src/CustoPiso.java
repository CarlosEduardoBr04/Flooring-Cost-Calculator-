
import javax.swing.JOptionPane;


public class CustoPiso {
    private double ComprimentoComodo;
    private double LarguraComodo;
    private double PrecoPorArea;
    private double CustoTotalComodo; 

    public CustoPiso() {
   this(0.0,0.0,0.0,0.0); }

    public CustoPiso(double ComprimentoComodo, double LarguraComodo, double PrecoPorArea, double CustoTotalComodo) {
        this.ComprimentoComodo = ComprimentoComodo;
        this.LarguraComodo = LarguraComodo;
        this.PrecoPorArea = PrecoPorArea;
        this.CustoTotalComodo = CustoTotalComodo;
    }

    public double getComprimentoComodo() {
        return ComprimentoComodo;
    }

    public void setComprimentoComodo(double ComprimentoComodo) {
        this.ComprimentoComodo = ComprimentoComodo;
    }

    public double getLarguraComodo() {
        return LarguraComodo;
    }

    public void setLarguraComodo(double LarguraComodo) {
        this.LarguraComodo = LarguraComodo;
    }

    public double getPrecoPorArea() {
        return PrecoPorArea;
    }

    public void setPrecoPorArea(double PrecoPorArea) {
        this.PrecoPorArea = PrecoPorArea;
    }

    public double getCustoTotalComodo() {
        return CustoTotalComodo;
    }

    public void setCustoTotalComodo(double CustoTotalComodo) {
        this.CustoTotalComodo = CustoTotalComodo;
    }
    
    public void InserirValores(){
   
        setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Insira o Comprimento do Comodo:")));
        setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Insira Largura do Comodo:")));
        setPrecoPorArea(Double.parseDouble(JOptionPane.showInputDialog("Insira o Preço por Area:")));
    }
    public void CalcularPrecoArea(){
    this.setCustoTotalComodo(this.getComprimentoComodo()* this.getLarguraComodo()* this.getPrecoPorArea());
    JOptionPane.showMessageDialog(null, "Valor Total:"+getCustoTotalComodo());

    }
    
    public void MostrarValores(){
    JOptionPane.showMessageDialog(null,"\nComprimento do Comodo:"+ getComprimentoComodo()+"\nLargura do Comodo:"+getLarguraComodo()+"\nPreco Por Area:"+getPrecoPorArea());
    }
}
