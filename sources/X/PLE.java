package X;

import Y.ARunnableS18S0000000_11;
import android.os.Message;

/* loaded from: classes12.dex */
public class PLE implements InterfaceC64290PLa<PLZ, Runnable> {
    @Override // X.InterfaceC64290PLa
    public final boolean LIZ(Object obj) {
        Message message;
        ARunnableS18S0000000_11 aRunnableS18S0000000_11 = PKO.LJIIJJI;
        PLZ plz = (PLZ) obj;
        if (plz != null && (message = plz.LIZ) != null && aRunnableS18S0000000_11.equals(message.getCallback())) {
            return true;
        }
        return false;
    }
}
