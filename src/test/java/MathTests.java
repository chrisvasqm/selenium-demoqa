import org.example.Math;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assertThat;

public class MathTests {
    @Test
    public void sum_TwoPlusTwo_ReturnsFour() {
        var actual = Math.sum(2, 2);

        assertThat(actual).isEqualTo(4);
    }
}
