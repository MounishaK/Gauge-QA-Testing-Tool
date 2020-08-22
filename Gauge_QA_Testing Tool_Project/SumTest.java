import com.thoughtworks.gauge.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class SumTest    {
    int finalsum;
    int expected_sum;

    @Step ("The sum of <a> and <b> should be <expected_sum>.")
    public void verifysum(int a, int b, int expected_sum){
        int actual_sum = sum(a,b);
        assertThat(expected_sum).isEqualTo(actual_sum);
    }

    public int sum(int a, int b){
        finalsum = a + b;
        return finalsum;
    }

}