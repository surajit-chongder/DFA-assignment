import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String json = "{\"states\":[\"q1\",\"q2\"],\"alphabet_set\":[\"0\",\"1\"],\"transition_function\":[[\"q1\",\"1\",\"q1\"],[\"q1\",\"0\",\"q2\"]],\"initial_state\":\"q1\",\"final_states\":[\"q2\"]}";
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.readValue(json, Tuple.class);
//
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createJsonParser(json);
        while (!parser.isClosed()) {
            JsonToken jsonToken = parser.nextToken();
            if (JsonToken.FIELD_NAME.equals(jsonToken)) {
                String fieldName = parser.getCurrentName();
                if("states".equals(fieldName)){
                    System.out.println(parser);
                }

            }

        }

    }
}
