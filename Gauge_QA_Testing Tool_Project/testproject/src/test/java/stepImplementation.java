import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

import java.lang.*;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class stepImplementation {

    @Step("The array <arr[]> that has odd occurance <count> value")
    public void verifyOddCountInArray(int arr[], int count) {
        int actualValue = OddOccurrence(arr, 13);
        assertThat(count).isEqualTo(actualValue);
    }

    
    public int OddOccurrence(int arr[], int arr_size) 
    {    
        int i; 
        for (i = 0; i < arr_size; i++) { 
            int count = 0; 
            for (int j = 0; j < arr_size; j++) { 
                if (arr[i] == arr[j]) 
                    count++; 
            } 
            if (count % 2 != 0) 
                return arr[i]; 
        } 
        return -1; 
    }  

    
    public static void main(String[] args) 
    { 
        int arr[] =  new int [] {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2}; 
        int n = arr.length;        
    }
    
}
