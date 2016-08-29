package pack;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by algis on 16.29.8.
 */
@Component
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SomeClassWithTransactionalAndProxyMode implements SomeInterface{
    public int number(){
        return 44;
    }
}
