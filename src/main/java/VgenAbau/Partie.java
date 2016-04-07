package VgenAbau;

/**
 * Created by 21102934 on 07/03/2016.
 */
public class Partie {

    /**
     * score max.
     *
     */
    public static final int SCORE_MAX = 10;

    /**
     * nb de lancers max.
     *
     */
    public static final int NB_LANCERS_MAX = 10;

    /**
     * nb de lancers max.
     *
     */
    public static final int NB_LANCERS_MAX_MOINS_DEUX = 8;

    /**
     * les lancers.
     *
     */
    private Frame[] lancers;

    /**
     * les lancers complémentaires.
     *
     */
    private Frame lancersComplementaires;

    /**
     * le score.
     *
     */
    private int score;

    /**
     * Constructeur Partie.
     *
     */
    public Partie() {
        lancers = new Frame[NB_LANCERS_MAX];
        lancersComplementaires = new Frame();
        score = 0;
    }

    /**
     * Constructeur du score.
     *
     */
    public final void calculerScore() {
        for (int i = 0; i < lancers.length - 1; ++i) {
            if (lancers[i].isStrike()) {
                score += SCORE_MAX + calculeStrike(i);

            } else if (lancers[i].isSpare()) {
                score += SCORE_MAX + calculeSpare(i);
            } else {
                score += lancers[i].getLancer()[0] + lancers[i].getLancer()[1];
            }
        }

        if (lancers[lancers.length - 1].isStrike()) {
            score += SCORE_MAX + calculeStrikeComplementaire();

        } else if (lancers[lancers.length - 1].isSpare()) {
            score += SCORE_MAX + calculeSpareComplementaire();
        } else {
            score += lancers[lancers.length - 1].getLancer()[0]
                    + lancers[lancers.length - 1].getLancer()[1];
        }
    }

    /**
     * calcul en cas de strike.
     * @param i frame avec le strike
     * @return score avec un strike
     */
    public final int calculeStrike(final int i) {
        int scoreStrike = 0;
        if (lancers[i + 1].isStrike()) {
            scoreStrike += SCORE_MAX;
            if (i == NB_LANCERS_MAX_MOINS_DEUX) {
                scoreStrike += lancersComplementaires.getLancer()[0];
            } else {
                scoreStrike += lancers[i + 2].getLancer()[0];
            }
        } else {
            scoreStrike += lancers[i + 1].getLancer()[0]
                    + lancers[i + 1].getLancer()[1];
        }
        return scoreStrike;
    }

    /**
     * calcul en cas de spare.
     * @param i frame avec le spare
     * @return score avec un spare
     */
    public final int calculeSpare(final int i) {
        return lancers[i + 1].getLancer()[0];
    }

    /**
     * calcul en cas de strike complementaire.
     *  @return score avec un strike en lancer complementaire
     */
    public final int calculeStrikeComplementaire() {
        return lancersComplementaires.getLancer()[0]
                + lancersComplementaires.getLancer()[1];
    }

    /**
     * calcul en cas de spare complementaire.
     * @return score avec un spare en lancer complementaire
     */
    public final int calculeSpareComplementaire() {
        return lancersComplementaires.getLancer()[0];
    }

    /**
     * getLancers.
     * @param nb numero de la frame
     * @return les lancers
     */
    public final Frame getLancers(final int nb) {
        return lancers[nb];
    }

    /**
     * setLancers.
     * @param i numero du lancer
     * @param l1 score du lancer 1
     * @param l2 score du lancer 2
     */
    public final void setLancers(final int i, final int l1,
                                 final int l2) {
        this.lancers[i] = new Frame();
        this.lancers[i].setLancer1(l1);
        this.lancers[i].setLancer2(l2);
    }

    /**
     * getLancersComplementaires.
     * @return les lancers complementaires
     */
    public final Frame getLancersComplementaires() {
        return lancersComplementaires;
    }

    /**
     * setLancersComplementaires.
     * @param l1 score du lancer 1
     * @param l2 score du lancer 2
     */
    public final void setLancersComplementaires(final int l1,
                                                final int l2) {
        this.lancersComplementaires.setLancer1(l1);
        this.lancersComplementaires.setLancer2(l2);
    }

    /**
     * getLancersComplementaires.
     * @return le score
     */
    public final int getScore() {
        return score;
    }
}




