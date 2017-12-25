public class QuadraticEquation {

    private float coefA;
    private float coefB;
    private float coefC;

    public QuadraticEquation(float coefA, float coefB, float coefC) throws Exception {

        if (coefA != 0f) {
            this.coefA = coefA;
        } else {
//            assert false: "Invalid coefficient.";
            throw new RuntimeException("Invalid coefficient.");

        }

        this.coefB = coefB;
        this.coefC = coefC;
    }

    public float getCoefA() {
        return coefA;
    }
    public float getCoefB() {
        return coefB;
    }
    public float getCoefC() {
        return coefC;
    }

    public float getDiscriminant() {
        float discriminant = coefB*coefB - 4*coefA*coefC;
        return discriminant;
    }

    public float[] getRoots(){
        float [] roots = new float[2];

        float d = getDiscriminant();

        if(d > 0) {
            roots[0] = (float)((-coefB + Math.sqrt(getDiscriminant())) / (2 * coefA));
            roots[1] = (float)((-coefB - Math.sqrt(getDiscriminant())) / (2 * coefA));
        } else if(d == 0) {
            roots[0] = roots[1] = -coefB / (2 * coefA);
        } else {
            assert false: "Roots are not real";
        }

        return roots;
    }
}