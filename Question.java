//maybe it should be an affirmation, but k
public class Question {
    private int id;
    private String text;
    private Pillar p1;
    private Pillar p2;
    private String answer;
            //question has a double choice pillar
            //question has an answer
            //answer define pillar


    public Question (int id, String text, Pillar p1, Pillar p2, String answer) {
        this.id = id;
        this.text = text;
        this.p1 = p1;
        this.p2 = p2;
        this.answer = answer;
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }
    public Pillar getP1() {
       return p1;
    }

    public Pillar getP2() {
        return p2;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }



}
