import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        List<Pillar> pillars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

//maybe i'll use for other plans
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;




//the MBTI PILLARS, aka
// E - Extroversion AND I – Introversion
// S – Sensing AND N – Intuition
// T – Thinking AND F – Feeling
// J – Judging AND P – Perceiving
// A – Assertive AND T – Turbulent

        Pillar E = new Pillar(0, "E");
        Pillar I = new Pillar(0, "I");
        Pillar S = new Pillar(0, "S");
        Pillar N = new Pillar(0, "N");
        Pillar T = new Pillar(0, "T");
        Pillar F = new Pillar(0, "F");
        Pillar J = new Pillar(0, "J");
        Pillar P = new Pillar(0, "P");
        Pillar A = new Pillar(0, "A");
        Pillar t = new Pillar(0, "T");

        pillars.add(E);
        pillars.add(I);
        pillars.add(S);
        pillars.add(N);
        pillars.add(T);
        pillars.add(F);
        pillars.add(J);
        pillars.add(P);
        pillars.add(A);
        pillars.add(t);



 //THE questions or rather affirmations
        Question q1 = new Question(1, "You regularly make new friends.", E, I, "default");
        Question q2 = new Question(2, "Complex and novel ideas excite you more than simple and straightforward ones.", N, S, "default");
        Question q3 = new Question(3, "You usually feel more persuaded by what resonates emotionally with you than by factual arguments.", F, T, "default");
        Question q4 = new Question(4, "Your living and working spaces are clean and organized.", J, P, "default");
        Question q5 = new Question(5, "You usually stay calm, even under a lot of pressure.", A, t, "default");
        Question q6 = new Question(6, "You find the idea of networking or promoting yourself to strangers very daunting.", I, E, "default");
        Question q7 = new Question(7, "You prioritize and plan tasks effectively, often completing them well before the deadline.", J, P, "default");
        Question q8 = new Question(8, "People’s stories and emotions speak louder to you than numbers or data.", F, T, "default");
        Question q9 = new Question(9, "You like to use organizing tools like schedules and lists.", J, P, "default");
        Question q10 = new Question(10, "Even a small mistake can cause you to doubt your overall abilities and knowledge.", t, A, "default");
        Question q11 = new Question(11, "You feel comfortable just walking up to someone you find interesting and striking up a conversation.", E, I, "default");
        Question q12 = new Question(12, "You are not too interested in discussions about various interpretations of creative works.", S, N, "default");
        Question q13 = new Question(13, "You prioritize facts over people’s feelings when determining a course of action.", T, F, "default");
        Question q14 = new Question(14, "You often allow the day to unfold without any schedule at all.", P, J, "default");
        Question q15 = new Question(15, "You rarely worry about whether you make a good impression on people you meet.", A, t, "default");
        Question q16 = new Question(16, "You enjoy participating in team-based activities.", E, I, "default");
        Question q17 = new Question(17, "You enjoy experimenting with new and untested approaches.", N, S, "default");
        Question q18 = new Question(18, "You prioritize being sensitive over being completely honest.", F, T, "default");
        Question q19 = new Question(19, "You actively seek out new experiences and knowledge areas to explore.", N, S, "default");
        Question q20 = new Question(20, "You are prone to worrying that things will take a turn for the worse.", t, A, "default");
        Question q21 = new Question(21, "You enjoy solitary hobbies or activities more than group ones.", I, E, "default");
        Question q22 = new Question(22, "You cannot imagine yourself writing fictional stories for a living.", S, N, "default");
        Question q23 = new Question(23, "You favor efficiency in decisions, even if it means disregarding some emotional aspects.", t, F, "default");
        Question q24 = new Question(24, "You prefer to do your chores before allowing yourself to relax.", J, P, "default");
        Question q25 = new Question(25, "You usually wait for others to introduce themselves first at social gatherings.", I, E, "default");
        Question q26 = new Question(26, "Your mood can change very quickly.", t, A, "default");
        Question q27 = new Question(27, "You are not easily swayed by emotional arguments.", T, F, "default");
        Question q28 = new Question(28, "You often end up doing things at the last possible moment.", P, J, "default");
        Question q29 = new Question(29, "You enjoy debating ethical dilemmas.", N, S, "default");
        Question q30 = new Question(30, "You usually prefer to be around others rather than on your own.", E, I, "default");
        Question q31 = new Question(31, "You become bored or lose interest when the discussion gets highly theoretical.", S, N, "default");
        Question q32 = new Question(32, "When facts and feelings conflict, you usually find yourself following your heart.", F, T, "default");
        Question q33 = new Question(33, "You find it challenging to maintain a consistent work or study schedule.", P, J, "default");
        Question q34 = new Question(34, "You rarely second-guess the choices that you have made.", A, t, "default");
        Question q35 = new Question(35, "Your friends would describe you as lively and outgoing.", E, I, "default");
        Question q36 = new Question(36, "In disagreements, you prioritize proving your point over preserving the feelings of others.", T, F, "default");
        Question q37 = new Question(37, "You are drawn to various forms of creative expression, such as writing.", N, S, "default");
        Question q38 = new Question(38, "You usually base your choices on objective facts rather than emotional impressions.", T, F, "default");
        Question q39 = new Question(39, "You like to have a to-do list for each day.", J, P, "default");
        Question q40 = new Question(40, "You rarely feel insecure.", A, t, "default");
        Question q41 = new Question(41, "You avoid making phone calls.", I, E, "default");
        Question q42 = new Question(42, "You enjoy exploring unfamiliar ideas and viewpoints.", N, S, "default");
        Question q43 = new Question(43, "You can easily connect with people you have just met.", E, I, "default");
        Question q44 = new Question(44, "If your plans are interrupted, your top priority is to get back on track as soon as possible.", J, P, "default");
        Question q45 = new Question(45, "You are still bothered by mistakes that you made a long time ago.", t, A, "default");
        Question q46 = new Question(46, "You are not too interested in discussing theories on what the world could look like in the future.", S, N, "default");
        Question q47 = new Question(47, "Your emotions control you more than you control them.", t, A, "default");
        Question q48 = new Question(48, "When making decisions, you focus more on how the affected people might feel than on what is most logical or efficient.", F, T, "default");
        Question q49 = new Question(49, "Your personal work style is closer to spontaneous bursts of energy than organized and consistent efforts.", P, J, "default");
        Question q50 = new Question(50, "When someone thinks highly of you, you wonder how long it will take them to feel disappointed in you.", t, A, "default");
        Question q51 = new Question(51, "You would love a job that requires you to work alone most of the time.", I, E, "default");
        Question q52 = new Question(52, "You believe that pondering abstract philosophical questions is a waste of time.", S, N, "default");
        Question q53 = new Question(53, "You feel more drawn to busy, bustling atmospheres than to quiet, intimate places.", E, I, "default");
        Question q54 = new Question(54, "If a decision feels right to you, you often act without needing further proof.", F, T, "default");
        Question q55 = new Question(55, "You often feel overwhelmed.", t, A, "default");
        Question q56 = new Question(56, "You complete things methodically without skipping over any steps.", J, P, "default");
        Question q57 = new Question(57, "You prefer tasks that require you to come up with creative solutions rather than follow concrete steps.", N, S, "default");
        Question q58 = new Question(58, "You are more likely to rely on emotional intuition than logical reasoning when making a choice.", F, T, "default");
        Question q59 = new Question(59, "You struggle with deadlines.", P, J, "default");
        Question q60 = new Question(60, "You feel confident that things will work out for you.", A, t, "default");

//adding'em should be important, i dunno UHAUHAHUSHU
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);
        questions.add(q6);
        questions.add(q7);
        questions.add(q8);
        questions.add(q9);
        questions.add(q10);
        questions.add(q11);
        questions.add(q12);
        questions.add(q13);
        questions.add(q14);
        questions.add(q15);
        questions.add(q16);
        questions.add(q17);
        questions.add(q18);
        questions.add(q19);
        questions.add(q20);
        questions.add(q21);
        questions.add(q22);
        questions.add(q23);
        questions.add(q24);
        questions.add(q25);
        questions.add(q26);
        questions.add(q27);
        questions.add(q28);
        questions.add(q29);
        questions.add(q30);
        questions.add(q31);
        questions.add(q32);
        questions.add(q33);
        questions.add(q34);
        questions.add(q35);
        questions.add(q36);
        questions.add(q37);
        questions.add(q38);
        questions.add(q39);
        questions.add(q40);
        questions.add(q41);
        questions.add(q42);
        questions.add(q43);
        questions.add(q44);
        questions.add(q45);
        questions.add(q46);
        questions.add(q47);
        questions.add(q48);
        questions.add(q49);
        questions.add(q50);
        questions.add(q51);
        questions.add(q52);
        questions.add(q53);
        questions.add(q54);
        questions.add(q55);
        questions.add(q56);
        questions.add(q57);
        questions.add(q58);
        questions.add(q59);
        questions.add(q60);



        for (Question q : questions) {
            System.out.println("-------------------------------------------------------------------");
          System.out.println(q.getText());
          System.out.println("-------------------------------------------------------------------");
          System.out.println(" A) I totally agree \n B) I agree \n C) I partially agree \n D) I'm not sure \n E) I partially disagree \n F) I disagree \n G) I totally disagree");
            System.out.println("-------------------------------------------------------------------");
          String escolha = scanner.next();
          switch (escolha) {
              case "a":
                  escolha = "A";
                  break;
              case "b":
                  escolha = "B";
                  break;
              case "c":
                  escolha = "C";
                  break;
              case "d":
                  escolha = "D";
                  break;
              case "e":
                  escolha = "E";
                  break;
              case "f":
                  escolha = "F";
                  break;
              case "g":
                  escolha = "G";
                  break;
              default:   System.out.println("");
          }
            switch (escolha) {
                case "A":
                    q.getP1().incrementa(3);
                    a++;
                    break;
                case "B":
                    q.getP1().incrementa(2);
                    b++;
                    break;
                case "C":
                    q.getP1().incrementa(1);
                    c++;
                    break;
                case "D":
                    //nothin' to do here huauhahuuhs
                    q.getP1().incrementa(0);
                    d++;
                    break;
                case "E":
                    q.getP2().incrementa(1);
                    e++;
                    break;
                case "F":
                    q.getP2().incrementa(2);
                    f++;
                    break;
                case "G":
                    q.getP2().incrementa(3);
                    g++;
                    break;
                default:   System.out.println("");
            }

        }

// Mind (E/I)
    String mind;
    if (E.getContador() > I.getContador()) {
         mind = "E";
    } else {
         mind = "I";
    }
//Energy (S/N)
    String energy;
    if (S.getContador() > N.getContador()) {
        energy = "S";
    } else {
        energy = "N";
    }

//Nature (T/F)
    String nature;
    if (T.getContador() > F.getContador()) {
        nature = "T";
    } else {
        nature = "F";
    }
//Tactics (J/P)
    String tactics;
    if(J.getContador() > P.getContador()) {
        tactics = "J";
    } else {
        tactics = "P";
    }
//Identity (A/T)
    String identity;
    if(A.getContador() > t.getContador()) {
        identity = "-A";
    }else {
        identity = "-T";
    }

    // MBTI TYPE
        String type = mind + energy + nature + tactics + identity;
        System.out.println("-------------------------------------------------------------------");
        System.out.println(type);
        System.out.println("-------------------------------------------------------------------");

        int decisive = a+g;
        int inconstant = c+f;

        System.out.println("Decisive: " + a+g); //decisive
        System.out.println("Incostant: "+ c+f); //inconstant
        System.out.println("Not sure: " + d);  // not sure
        System.out.println("Extroversion: " +E.getContador());
        System.out.println("Introversion: " + I.getContador());
        System.out.println("Sensing: " + S.getContador());
        System.out.println("Intuition: " + N.getContador());
        System.out.println("Thinking: " + T.getContador());
        System.out.println("Feeling: "+ F.getContador());
        System.out.println("Judging: " + J.getContador());
        System.out.println("Perceiving: " + P.getContador());
        System.out.println(" Assertive: " + A.getContador());
        System.out.println("Turbulent: " +t.getContador());

    }

}
