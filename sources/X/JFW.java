package X;

import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes9.dex */
public class JFW extends JFP<Looper> {
    @Override // X.JFP
    public final Looper LIZ(Object[] objArr) {
        try {
            HandlerThread handlerThread = new HandlerThread("bd_install");
            handlerThread.start();
            return handlerThread.getLooper();
        } catch (Exception unused) {
            return C16880lQ.LLJJJJ();
        }
    }
}
