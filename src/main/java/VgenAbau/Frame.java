package VgenAbau;

/**
 * Created by 21102934 on 07/03/2016.
 */
public class Frame {

    int lancer[];
    int score;

    public Frame() {
        this.lancer = new int[2];
        score = 0;
        this.lancer[0] = 0;
        this.lancer[1] = 0;
    }

    void setLancer1(int s) {
        this.lancer[0] = s;
    }

    void setLancer2(int s) {
        this.lancer[1] = s;
    }

    boolean isStrike() {
        return (this.lancer[0] == 10);
    }

    boolean isSpare() {
        return (this.lancer[0]+this.lancer[1] == 10);
    }

    int getScore() {
        return score;
    }

    void setScore(int s) {
        score = s;
    }

    void MAJScore (int s) {
        score = score + s;
    }







}
