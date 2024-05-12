package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes12.dex */
public class PF2 extends Handler {
    public final PF1 LIZ;

    public PF2(PF1 pf1, Looper looper) {
        super(looper);
        this.LIZ = pf1;
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        if (message.getCallback() != null) {
            this.LIZ.LIZ(message.getCallback());
            return true;
        }
        return true;
    }
}
