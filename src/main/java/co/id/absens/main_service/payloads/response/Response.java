package co.id.absens.main_service.payloads.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Response {
    private Boolean status;
    @JsonProperty("status_code")
    private String statusCode;
    @JsonProperty("response_code")
    private String responseCode;
    @JsonProperty("response_message")
    private String responseMessage;
    private Object result;

    public Response(){
    }

    public Response(Boolean status, String statusCode, String responseCode, String responseMessage, Object result) {
        this.status = status;
        this.statusCode = statusCode;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status='" + status + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", responseMessage='" + responseMessage + '\'' +
                ", result=" + result +
                '}';
    }

}
