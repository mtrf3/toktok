package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.jvm.internal.o;

/* renamed from: X.EIn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerC36197EIn extends Handler {
    public HandlerC36197EIn(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Runnable runnable;
        o.LJIIIZ(msg, "msg");
        Object obj = msg.obj;
        if (!(obj instanceof Runnable) || (runnable = (Runnable) obj) == null) {
            return;
        }
        runnable.run();
    }
}
