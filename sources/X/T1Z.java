package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T1Z extends AbstractC73946T0k {
    public final Handler LIZIZ;
    public final boolean LIZJ = false;

    @Override // X.AbstractC73946T0k
    public final AbstractC73945T0j LIZ() {
        return new C73962T1a(this.LIZIZ, this.LIZJ);
    }

    public T1Z(Handler handler) {
        this.LIZIZ = handler;
    }

    @Override // X.AbstractC73946T0k
    public final InterfaceC92693kP LIZJ(Runnable rawRunnable, long j, TimeUnit unit) {
        boolean z;
        o.LJIIJ(rawRunnable, "rawRunnable");
        o.LJIIJ(unit, "unit");
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            z = true;
        } else {
            z = false;
        }
        T1Y t1y = new T1Y(this.LIZIZ, rawRunnable, z);
        if (z) {
            t1y.run();
            return t1y;
        }
        this.LIZIZ.postDelayed(t1y, unit.toMillis(j));
        return t1y;
    }
}
