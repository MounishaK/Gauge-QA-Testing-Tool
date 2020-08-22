import com.thoughtworks.gauge.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class unicodeExample   {
    
    String expected_string;

    @Step ("The concatenation of two strings <a> and <b> should be <expected_sum>.")
    public void verifyUnicode(String a, String b, String expected_string){
        String actual_string = unicodeChar(a,b);
        assertThat(expected_string).isEqualTo(actual_string);
    }

    public String unicodeChar(String a, String b){
         a += b;
         return a;
    }
    
}
