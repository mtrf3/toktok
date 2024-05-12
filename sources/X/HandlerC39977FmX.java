package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.FmX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerC39977FmX extends Handler {
    public final WeakReference<InterfaceC39978FmY> LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC39978FmY interfaceC39978FmY = this.LIZ.get();
        if (interfaceC39978FmY != null && message != null) {
            interfaceC39978FmY.handleMsg(message);
        }
    }

    public HandlerC39977FmX(Looper looper, InterfaceC39978FmY interfaceC39978FmY) {
        super(looper);
        this.LIZ = new WeakReference<>(interfaceC39978FmY);
    }
}
