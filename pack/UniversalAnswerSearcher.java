package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UniversalAnswerSearcher {

    /*
    @Autowired
    SomeClassWithTransactional someClassWithTransactional;
    */

    public int getNumber(){
        //return someClassWithTransactional.number();
        return -1;
    }

}
