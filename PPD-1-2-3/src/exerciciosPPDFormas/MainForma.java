package exerciciosPPDFormas;

abstract class Forma {
    abstract double area();
    abstract double perimetro();
}

class Retangulo extends Forma {
    private double altura;
    private double largura;
    
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getLargura() {
        return largura;
    }
    
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double area() {
        return altura * largura;
    }
    
    public double perimetro() {
        return 2 * (altura + largura);
    }
}

class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }
}

class Circulo extends Forma {
    private double raio;
    private final double PI = 3.1415;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double area() {
        return PI * raio * raio;
    }
    
    public double perimetro() {
        return 2 * PI * raio;
    }
}

public class MainForma {
    public static void main(String[] args) {
        Forma retangulo = new Retangulo(5, 10);
        Forma quadrado = new Quadrado(5);
        Forma circulo = new Circulo(5);
        
        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Perímetro do retângulo: " + retangulo.perimetro());
        
        System.out.println("Área do quadrado: " + quadrado.area());
        System.out.println("Perímetro do quadrado: " + quadrado.perimetro());
        
        System.out.println("Área do círculo: " + circulo.area());
        System.out.println("Perímetro do círculo: " + circulo.perimetro());
    }
}
