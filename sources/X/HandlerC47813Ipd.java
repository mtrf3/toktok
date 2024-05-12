package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.Ipd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC47813Ipd extends Handler {
    public final WeakReference<C47804IpU> LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC47844Iq8 interfaceC47844Iq8;
        C47804IpU c47804IpU = this.LIZ.get();
        if (c47804IpU == null || (interfaceC47844Iq8 = c47804IpU.LJII) == null) {
            return;
        }
        if (c47804IpU.LIZIZ) {
            interfaceC47844Iq8.LIZIZ("fetcher is cancelled");
            return;
        }
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    interfaceC47844Iq8.LIZLLL(message.arg1, (String) message.obj);
                    return;
                }
                interfaceC47844Iq8.LIZJ((C47164IfA) message.obj, null);
                return;
            }
            interfaceC47844Iq8.LIZJ(null, (C47789IpF) message.obj);
            return;
        }
        interfaceC47844Iq8.LIZ((C47789IpF) message.obj);
    }

    public HandlerC47813Ipd(C47804IpU c47804IpU, Looper looper) {
        super(looper);
        this.LIZ = new WeakReference<>(c47804IpU);
    }
}
