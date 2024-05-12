package X;

import Y.ARunnableS18S0000000_11;
import android.os.Message;

/* loaded from: classes12.dex */
public class PF7 {
    public final boolean LIZ(Object obj, ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        Message message;
        Message message2;
        PFA pfa = (PFA) obj;
        if (aRunnableS18S0000000_11 != null ? !(pfa == null || (message = pfa.LIZ) == null || !aRunnableS18S0000000_11.equals(message.getCallback())) : !(pfa != null && (message2 = pfa.LIZ) != null && message2.getCallback() != null)) {
            return true;
        }
        return false;
    }
}
