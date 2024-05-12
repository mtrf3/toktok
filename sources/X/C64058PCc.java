package X;

import Y.ARunnableS47S0100000_11;
import android.os.Message;

/* renamed from: X.PCc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64058PCc {
    public final boolean LIZ(Object obj, ARunnableS47S0100000_11 aRunnableS47S0100000_11) {
        Message message;
        Message message2;
        C64060PCe c64060PCe = (C64060PCe) obj;
        if (aRunnableS47S0100000_11 != null ? !(c64060PCe == null || (message = c64060PCe.LIZ) == null || !aRunnableS47S0100000_11.equals(message.getCallback())) : !(c64060PCe != null && (message2 = c64060PCe.LIZ) != null && message2.getCallback() != null)) {
            return true;
        }
        return false;
    }
}
