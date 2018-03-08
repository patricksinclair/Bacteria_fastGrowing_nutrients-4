public class Bacteria {

   private int m;

   private double b = 0.1;
   private double d = 0.0;
   private double mu = 0.;

   private double K_prime = 33.;

    public Bacteria(int m){this. m = m;}

    public int getM(){return m;}
    public double getB(){return b;}
    public double getD(){return d;}
    public double getMu(){return mu;}

    public double beta(double s, double s_max){

        double mu = s/(K_prime+s);
        double mu_max = s_max/(K_prime+s_max);
        return 10. - 9.*mu/mu_max;
    }

    public double growthRate(double c, double s, double s_max){

        double phi_c = 1./(1 + c/beta(s, s_max));
        //System.out.println("growth rate: \t"+phi_c);
        if(phi_c < 0.) return 0.;
        else return phi_c;
    }

    public double replicationRate(double c, double s, double s_max){

        //System.out.println("rep rate:\t"+growthRate(c, s, s_max, K) * s/(K + s));
        return growthRate(c, s, s_max) * (s/(K_prime + s));
    }
}
