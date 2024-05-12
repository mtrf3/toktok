package X;

import Y.ARunnableS47S0100000_11;
import android.os.Message;

/* renamed from: X.PCd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64059PCd {
    public final boolean LIZ(Object obj, ARunnableS47S0100000_11 aRunnableS47S0100000_11) {
        Message message = (Message) obj;
        if (aRunnableS47S0100000_11 != null ? !(message == null || !aRunnableS47S0100000_11.equals(message.getCallback())) : !(message != null && message.getCallback() != null)) {
            return true;
        }
        return false;
    }
}
