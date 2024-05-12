package X;

import Y.ARunnableS18S0000000_11;
import android.os.Message;

/* loaded from: classes12.dex */
public class PLG implements InterfaceC64290PLa<Message, Runnable> {
    @Override // X.InterfaceC64290PLa
    public final boolean LIZ(Object obj) {
        ARunnableS18S0000000_11 aRunnableS18S0000000_11 = PKO.LJIIJJI;
        Message message = (Message) obj;
        if (message != null && aRunnableS18S0000000_11.equals(message.getCallback())) {
            return true;
        }
        return false;
    }
}
