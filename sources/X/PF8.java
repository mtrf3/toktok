package X;

import Y.ARunnableS18S0000000_11;
import android.os.Message;

/* loaded from: classes12.dex */
public class PF8 {
    public final boolean LIZ(Object obj, ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        Message message = (Message) obj;
        if (aRunnableS18S0000000_11 != null ? !(message == null || !aRunnableS18S0000000_11.equals(message.getCallback())) : !(message != null && message.getCallback() != null)) {
            return true;
        }
        return false;
    }
}
