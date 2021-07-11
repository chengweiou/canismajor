package chengweiou.universe.canismajor.data;

import chengweiou.universe.canismajor.manager.andromeda.AccountManager;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class MockConfig {
    @Bean("accountManager")
    public AccountManager accountManager() {
        return Mockito.mock(AccountManager.class);
    }
}
