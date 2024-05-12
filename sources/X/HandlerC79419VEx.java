package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.VEx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class HandlerC79419VEx extends Handler {
    public final WeakReference<InterfaceC79420VEy> LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC79420VEy interfaceC79420VEy = this.LIZ.get();
        if (interfaceC79420VEy != null && message != null) {
            interfaceC79420VEy.handleMsg(message);
        }
    }

    public HandlerC79419VEx(VXM vxm, Looper looper) {
        super(looper);
        this.LIZ = new WeakReference<>(vxm);
    }
}
