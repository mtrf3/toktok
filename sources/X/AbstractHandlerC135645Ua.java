package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.5Ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractHandlerC135645Ua<T> extends Handler {
    public final WeakReference<T> LIZ;

    public abstract void LIZ(Object obj, Message message);

    public AbstractHandlerC135645Ua(T t) {
        this.LIZ = new WeakReference<>(t);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        T t = this.LIZ.get();
        if (t != null) {
            LIZ(t, message);
        }
    }
}
