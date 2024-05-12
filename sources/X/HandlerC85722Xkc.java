package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.Xkc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class HandlerC85722Xkc extends Handler {
    public final WeakReference<InterfaceC85741Xkv> LIZ;

    public HandlerC85722Xkc(InterfaceC85741Xkv interfaceC85741Xkv) {
        this.LIZ = new WeakReference<>(interfaceC85741Xkv);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC85741Xkv interfaceC85741Xkv = this.LIZ.get();
        if (interfaceC85741Xkv != null && message != null) {
            interfaceC85741Xkv.handleMsg(message);
        }
    }
}
