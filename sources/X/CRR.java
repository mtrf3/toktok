package X;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CRR {
    public final Handler LIZ;
    public final Handler LIZIZ;
    public final Looper LIZJ;
    public final Looper LIZLLL;

    public final void LIZIZ(Runnable runnable) {
        o.LJIIIZ(runnable, "runnable");
        if (!o.LJ(Looper.myLooper(), this.LIZLLL)) {
            this.LIZIZ.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final void LIZJ(Runnable runnable) {
        if (!o.LJ(Looper.myLooper(), this.LIZJ)) {
            this.LIZ.post(runnable);
        } else {
            runnable.run();
        }
    }

    public CRR(Handler mainHandler, Handler scheduleHandler) {
        o.LJIIIZ(mainHandler, "mainHandler");
        o.LJIIIZ(scheduleHandler, "scheduleHandler");
        this.LIZ = mainHandler;
        this.LIZIZ = scheduleHandler;
        this.LIZJ = mainHandler.getLooper();
        this.LIZLLL = scheduleHandler.getLooper();
    }

    public final void LIZ(long j, Runnable runnable) {
        o.LJIIIZ(runnable, "runnable");
        this.LIZIZ.postDelayed(runnable, j);
    }
}
