package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class INK extends Handler {
    public final WeakReference<INL> LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        INL inl = this.LIZ.get();
        if (inl != null && message != null) {
            inl.handleMsg(message);
        }
    }

    public INK(Looper looper, INL inl) {
        super(looper);
        this.LIZ = new WeakReference<>(inl);
    }
}
