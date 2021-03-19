import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> output = new ArrayList<>();
        if ((number & 1) == 1) {
            output.add(Signal.WINK);
        }
        if ((number & 2) == 2) {
            output.add(Signal.DOUBLE_BLINK);
        }
        if ((number & 4) == 4) {
            output.add(Signal.CLOSE_YOUR_EYES);
        }
        if ((number & 8) == 8) {
            output.add(Signal.JUMP);
        }
        if ((number & 16) == 16) {
            Collections.reverse(output);
        }
        return output;
    }
}
