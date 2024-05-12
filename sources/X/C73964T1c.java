package X;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.T1c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73964T1c extends AbstractC73946T0k {
    public final Handler LIZIZ;
    public final boolean LIZJ = false;

    @Override // X.AbstractC73946T0k
    public final AbstractC73945T0j LIZ() {
        return new C73963T1b(this.LIZIZ, this.LIZJ);
    }

    public C73964T1c(HandlerC212798Wt handlerC212798Wt) {
        this.LIZIZ = handlerC212798Wt;
    }

    @Override // X.AbstractC73946T0k
    public final InterfaceC92693kP LIZJ(Runnable rawRunnable, long j, TimeUnit unit) {
        o.LJIIIZ(rawRunnable, "rawRunnable");
        o.LJIIIZ(unit, "unit");
        boolean LIZ = C73374Sqw.LIZ();
        RunnableC73965T1d runnableC73965T1d = new RunnableC73965T1d(this.LIZIZ, rawRunnable, LIZ);
        if (LIZ) {
            runnableC73965T1d.run();
            return runnableC73965T1d;
        }
        this.LIZIZ.postDelayed(runnableC73965T1d, unit.toMillis(j));
        return runnableC73965T1d;
    }
}
