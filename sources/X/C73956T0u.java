package X;

import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.T0u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73956T0u extends AbstractC73945T0j {
    public final ScheduledExecutorService LJLIL;
    public volatile boolean LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLILLLLZI) {
            this.LJLILLLLZI = true;
            this.LJLIL.shutdownNow();
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI;
    }

    public C73956T0u(ThreadFactory threadFactory) {
        this.LJLIL = SchedulerPoolFactory.create(threadFactory);
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZIZ(Runnable runnable) {
        return LIZJ(runnable, 0L, null);
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.LJLILLLLZI) {
            return EnumC73538Sta.INSTANCE;
        }
        return LJ(runnable, j, timeUnit, null);
    }

    public final RunnableC73954T0s LJ(Runnable runnable, long j, TimeUnit timeUnit, InterfaceC73955T0t interfaceC73955T0t) {
        Future<?> schedule;
        C73320Sq4.LIZ(runnable, "run is null");
        RunnableC73954T0s runnableC73954T0s = new RunnableC73954T0s(runnable, interfaceC73955T0t);
        if (interfaceC73955T0t != null && !interfaceC73955T0t.LIZ(runnableC73954T0s)) {
            return runnableC73954T0s;
        }
        try {
            if (j <= 0) {
                schedule = this.LJLIL.submit((Callable) runnableC73954T0s);
            } else {
                schedule = this.LJLIL.schedule((Callable) runnableC73954T0s, j, timeUnit);
            }
            runnableC73954T0s.setFuture(schedule);
        } catch (RejectedExecutionException e) {
            if (interfaceC73955T0t != null) {
                interfaceC73955T0t.LIZIZ(runnableC73954T0s);
            }
            C73548Stk.LIZIZ(e);
        }
        return runnableC73954T0s;
    }
}
