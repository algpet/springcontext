package pack;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by algis on 16.29.8.
 */
@Component
@Transactional
public class SomeClassWithTransactional implements SomeInterface{
    public int number(){
        return 43;
    }
}
