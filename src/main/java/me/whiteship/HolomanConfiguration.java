package me.whiteship;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HoloManProperties.class)
public class HolomanConfiguration {

    /**
     * @ConditionalOnMissingBean을 이용해서 Bean이 없는 경우 등록
     * @return
     */
    @Bean
    @ConditionalOnMissingBean
    public Holoman holoman(HoloManProperties properties) {
        Holoman holoman = new Holoman();
        holoman.setHowLong(properties.getHowLong());
        holoman.setName(properties.getName());
        return holoman;
    }
}
