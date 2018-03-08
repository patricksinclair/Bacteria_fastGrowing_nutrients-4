//this is a version of the fast growing bacteria with nutrients simulations, which include the more realistic
//growth curves
//now with averaging anf other tidiness

public class FastBacMain {

    public static void main(String[] args){
        double specific_alpha = Math.log(11.5)/500.;
        BioSystem.spatialAndNutrientDistributions(specific_alpha);

    }
}
