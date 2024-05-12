package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.BAn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class HandlerC28345BAn extends Handler {
    public final WeakReference<InterfaceC28344BAm> LIZ;

    public HandlerC28345BAn(InterfaceC28344BAm interfaceC28344BAm) {
        this.LIZ = new WeakReference<>(interfaceC28344BAm);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC28344BAm interfaceC28344BAm = this.LIZ.get();
        if (interfaceC28344BAm != null && message != null) {
            interfaceC28344BAm.handleMsg(message);
        }
    }

    public HandlerC28345BAn(Looper looper, InterfaceC28344BAm interfaceC28344BAm) {
        super(looper);
        this.LIZ = new WeakReference<>(interfaceC28344BAm);
    }
}
