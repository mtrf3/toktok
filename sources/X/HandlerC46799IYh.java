package X;

import Y.ARunnableS44S0100000_8;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IYh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC46799IYh extends Handler {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Object LIZ;
    public final List<Runnable> LIZIZ;
    public final ARunnableS44S0100000_8 LIZJ;

    public HandlerC46799IYh(Looper looper) {
        super(looper);
        this.LIZ = new Object();
        this.LIZIZ = new ArrayList();
        this.LIZJ = new ARunnableS44S0100000_8(this, 167);
    }

    public final void LIZ(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        synchronized (this.LIZ) {
            ((ArrayList) this.LIZIZ).add(runnable);
        }
        Message obtain = Message.obtain(this, this.LIZJ);
        Object value = IZ8.j.getValue();
        o.LJIIIIZZ(value, "<get-enableHandlerUseAsyncMsg>(...)");
        if (((Boolean) value).booleanValue() && Build.VERSION.SDK_INT >= 22) {
            obtain.setAsynchronous(true);
        }
        sendMessageAtFrontOfQueue(obtain);
    }
}
