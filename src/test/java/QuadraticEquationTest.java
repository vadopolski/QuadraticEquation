import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadraticEquationTest {

    private QuadraticEquation quadraticEquation1;
    private QuadraticEquation quadraticEquation2;
    private QuadraticEquation quadraticEquation3;

    private float expectedDiscriminant1;
    private float expectedDiscriminant2;
    private float expectedDiscriminant3;

    private float[] expectedRoots1;
    private float[] expectedRoots3;

    @Before
    public void setUp() throws Exception {
        quadraticEquation1 = new QuadraticEquation(2.5f, 3f, -2.9f);
        quadraticEquation2 = new QuadraticEquation(5, 5, 3);
        quadraticEquation3 = new QuadraticEquation(1, 2, 1);

        expectedDiscriminant1 = 38.0f;
        expectedDiscriminant2 = -35f;
        expectedDiscriminant3 = 0f;

        expectedRoots1 = new float[] {0.6328828f, -1.8328828f};
        expectedRoots3 = new float[] {-1f, -1f};
    }

    @Test
    public void getDiscriminantTest_realFloatCoefficient_realDiscriminantEqualExpected() {
        float actualDiscriminant1 = quadraticEquation1.getDiscriminant();
        float actualDiscriminant2 = quadraticEquation2.getDiscriminant();
        float actualDiscriminant3 = quadraticEquation3.getDiscriminant();

        assertEquals(expectedDiscriminant1, actualDiscriminant1, 0);
        assertEquals(expectedDiscriminant2, actualDiscriminant2, 0);
        assertEquals(expectedDiscriminant3, actualDiscriminant3, 0);
    }

    @Test
    public void getRootsTest_realFloatCoefficient_twoDifferentRealRoots() {
        float[] actualRoots1 = quadraticEquation1.getRoots();

        assertEquals(expectedRoots1[0], actualRoots1[0], 0);
        assertEquals(expectedRoots1[1], actualRoots1[1], 0);
    }

    @Test
    public void getRootsTest_realFloatCoefficient_rootsAreNotRealAssert() {
        try {
            float[] actualRoots2 = quadraticEquation2.getRoots();
        } catch (AssertionError e){
            assertEquals( "Roots are not real", e.getMessage());
        }
    }

    @Test
    public void quadraticEquationTest_coefAIsZero_invalidCoefficientAssert() throws Exception {
        try {
            QuadraticEquation quadraticEquation = new QuadraticEquation(0,1,1);
        }catch (RuntimeException e){
            assertEquals("Invalid coefficient.", e.getMessage());
        }
    }

    @Test
    public void getRootsTest_realFloatCoefficient_twoEqualRealRoots() {
        float[] actualRoots3 = quadraticEquation3.getRoots();

        assertEquals(expectedRoots3[0], actualRoots3[0], 0);
        assertEquals(expectedRoots3[1], actualRoots3[1], 0);
    }
}