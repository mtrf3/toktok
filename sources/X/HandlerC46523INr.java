package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.INr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC46523INr extends Handler {
    public final WeakReference<InterfaceC46524INs> LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC46524INs interfaceC46524INs = this.LIZ.get();
        if (interfaceC46524INs != null && message != null) {
            interfaceC46524INs.LIZ();
        }
    }

    public HandlerC46523INr(Looper looper, C46525INt c46525INt) {
        super(looper);
        this.LIZ = new WeakReference<>(c46525INt);
    }
}
