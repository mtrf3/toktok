package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.Im0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC47588Im0 extends Handler {
    public final WeakReference<C47589Im1> LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C47587Ilz c47587Ilz;
        C47589Im1 c47589Im1 = this.LIZ.get();
        if (c47589Im1 == null || (c47587Ilz = c47589Im1.LIZJ) == null) {
            return;
        }
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            c47587Ilz.LIZ(null, (String) message.obj);
            return;
        }
        c47587Ilz.LIZ((C47789IpF) message.obj, null);
    }

    public HandlerC47588Im0(C47589Im1 c47589Im1, Looper looper) {
        super(looper);
        this.LIZ = new WeakReference<>(c47589Im1);
    }
}
