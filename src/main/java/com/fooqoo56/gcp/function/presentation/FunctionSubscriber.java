package com.fooqoo56.gcp.function.presentation;


import java.util.Locale;
import java.util.function.Function;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class FunctionSubscriber {

    /**
     * メッセージを受け取る関数
     *
     * @return メッセージを引数に持つ関数
     */
    @Bean
    @NonNull
    public Function<String, String> toUpperCaseFunction() {
        return message -> message.toUpperCase(Locale.ROOT);
    }
}
