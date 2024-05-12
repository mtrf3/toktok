package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.Otb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class HandlerC63347Otb extends Handler {
    public final WeakReference<InterfaceC63351Otf> LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC63351Otf interfaceC63351Otf = this.LIZ.get();
        if (interfaceC63351Otf != null && message != null) {
            interfaceC63351Otf.handleMsg(message);
        }
    }

    public HandlerC63347Otb(Looper looper, InterfaceC63351Otf interfaceC63351Otf) {
        super(looper);
        this.LIZ = new WeakReference<>(interfaceC63351Otf);
    }
}
