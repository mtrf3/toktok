package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.T0x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73959T0x extends AbstractC73945T0j {
    public final ScheduledExecutorService LJLIL;
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();
    public volatile boolean LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJI) {
            this.LJLJI = true;
            this.LJLILLLLZI.dispose();
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI;
    }

    public C73959T0x(ScheduledExecutorService scheduledExecutorService) {
        this.LJLIL = scheduledExecutorService;
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        if (this.LJLJI) {
            return EnumC73538Sta.INSTANCE;
        }
        C73320Sq4.LIZ(runnable, "run is null");
        RunnableC73954T0s runnableC73954T0s = new RunnableC73954T0s(runnable, this.LJLILLLLZI);
        this.LJLILLLLZI.LIZ(runnableC73954T0s);
        try {
            if (j <= 0) {
                schedule = this.LJLIL.submit((Callable) runnableC73954T0s);
            } else {
                schedule = this.LJLIL.schedule((Callable) runnableC73954T0s, j, timeUnit);
            }
            runnableC73954T0s.setFuture(schedule);
            return runnableC73954T0s;
        } catch (RejectedExecutionException e) {
            dispose();
            C73548Stk.LIZIZ(e);
            return EnumC73538Sta.INSTANCE;
        }
    }
}
