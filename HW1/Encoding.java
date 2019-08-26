import java.util.*;

public class Encoding {

    public static Set<String> morseCodes(int m, int n) {
        Set<String> result = new TreeSet<>();

        // base cases
        if (m == 0 && n == 0){
            result.add("");
        }
        else if (n == 0){
            String s = "";
            for(int i=0; i<m; i++) {
                s += ".";
            }
            result.add(s);
        }
        else if (m == 0){
            String s = "";
            for(int i=0; i<n; i++) {
                s += "-";
            }
            result.add(s);
        }
        // recursive case
        else{
            Set<String> subresult1 = morseCodes(m-1, n);
            Set<String> subresult2 = morseCodes(m, n-1);

            for(String str : subresult1){
                // append "." to str and add it to "result"
                result.add(str + ".");
            }
            for(String str : subresult2){
                // append "-" to str and add it to "result"
                result.add(str + "-");
            }

        }
        return result;
    }
}
