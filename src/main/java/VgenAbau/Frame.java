package VgenAbau;

/**
 * Created by 21102934 on 07/03/2016.
 */
public class Frame {

    /**
     * score max.
     *
     */
    public static final int SCORE_MAX = 10;


    /**
     * lancer.
     *
     */
    private int[] lancer;

    /**
     * Constructeur frame.
     *
     */
    public Frame() {
        this.lancer = new int[2];
        this.lancer[0] = 0;
        this.lancer[1] = 0;
    }

    /**
     * isStrike().
     * @param s parametre
     */
    final void setLancer1(final int s) {
        this.lancer[0] = s;
    }

    /**
     * isStrike().
     * @param s parametre
     */
    final void setLancer2(final int s) {
        this.lancer[1] = s;
    }

    /**
     * isStrike().
     * @return vrai si la frame est un strike faux sinon
     */
    final boolean isStrike() {
        return (this.lancer[0] == SCORE_MAX);
    }

    /**
     * isSpare().
     * @return vrai si la frame est un spare faux sinon
     */
    final boolean isSpare() {
        return (this.lancer[0] + this.lancer[1] == SCORE_MAX);
    }

    /**
     * isSpare().
     * @return retourne le resultat du premier lancer
     */
    final int getLancer1() {
        return lancer[0];
    }

    /**
     * getLancer2().
     * @return retourne le resultat du second lancer
     */
    final int getLancer2() {
        return lancer[1];
    }


    /**
     * getLancer().
     * @return retourne les lancers
     */
    final int[] getLancer() {
        return this.lancer;
    }



}
