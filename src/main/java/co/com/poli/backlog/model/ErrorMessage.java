package co.com.poli.backlog.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;


@Data
@Builder
public class ErrorMessage {
    private String code;
    private List<Map<String, String>> messages;

    public ErrorMessage(String code, List<Map<String, String>> messages) {
        this.code = code;
        this.messages = messages;
    }
}
