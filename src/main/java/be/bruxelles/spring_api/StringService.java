package be.bruxelles.spring_api;//be.bruxelles.spring_api;
import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String toUpperCase(String input){
        return input.toUpperCase();
    }

}
