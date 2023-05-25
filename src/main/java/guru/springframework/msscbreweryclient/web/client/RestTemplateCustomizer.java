package guru.springframework.msscbreweryclient.web.client;

import org.springframework.web.client.RestTemplate;

public interface RestTemplateCustomizer {

    void customize(RestTemplate restTemplate);
}
