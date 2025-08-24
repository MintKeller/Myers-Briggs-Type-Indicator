public class Pillar {
    private int contador;
    private String letter;

    // construtor
     public Pillar (int contador, String letter) {
         this.contador = contador;
         this.letter = letter;
     }



    //Getters

    public int getContador() {
        return contador;
    }

    public String getLetter() {
        return letter;
    }

    //Setters

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
    //methods

    public void incrementa (int value) {
        contador = contador + value;
    }


}
