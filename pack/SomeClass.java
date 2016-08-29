package pack;

import org.springframework.stereotype.Component;

@Component
public class SomeClass implements SomeInterface{
    public int number(){
        return 42;
    }
}
