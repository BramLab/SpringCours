package be.bruxelles.spring_api;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class StringService {

    //private final List<String> strings = new ArrayList<>(List.of("michou","toto","louise") );

    private final List<String> strings= new ArrayList<>(
            List.of("michou",
                    "toto",
                    "louise")
    );

    public String toUpperCase(String input){
        return input.toUpperCase();
    }

    public String get(int index) {  return strings.get(index);  }

    public void add(int index, String element){
        strings.add(index, element);
    }

}