package az.company.chatapp.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Message {

    private String receiverName;
    private String senderName;
    private String message;
    private Status status;
}
