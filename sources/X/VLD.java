package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class VLD extends Handler {
    public final WeakReference<VLE> LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        VLE vle = this.LIZ.get();
        if (vle != null && message != null) {
            vle.handleMsg(message);
        }
    }

    public VLD(Looper looper, YMI ymi) {
        super(looper);
        this.LIZ = new WeakReference<>(ymi);
    }
}
