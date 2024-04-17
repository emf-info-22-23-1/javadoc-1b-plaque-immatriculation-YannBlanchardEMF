package ch.emf.atelierpo.wrk;

/**
 *
 * @author Yann Blanchard
 */
public class Worker {

    /**
     * Description : Vérifier si la plaque d'immatriculation est correct. Pour
     * qu'une plaque soit correcte il faut que le canton soit parmis les
     * suivants : AG, AI, AR, BE, BL, BS, FR, GE, GL, GR, JU, LU, NE, NW, OW,
     * SG, SH, SO, SZ, TG, TI, UR, VD, VS, ZG, ZH donc que les deux lettres
     * soient en majuscule et sans chiffres. Pour le numéro de plaque il faut
     * qu'il n'y ai que deux caractères et sans lettre
     * @param canton
     * @param numeroDePlaque
     * @return true si la plaque est correct ou false si incorrect
     */
    public boolean controlePlaqueImmatriculation(String canton, String numeroDePlaque) {

        return false;
    }

}
