package X;

import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.T0v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73957T0v extends AbstractC73946T0k {
    public static final P3I LIZJ;
    public final AtomicReference<ScheduledExecutorService> LIZIZ;

    static {
        C16880lQ.LLLLZIL(0).shutdown();
        LIZJ = new P3I("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C73957T0v() {
        P3I p3i = LIZJ;
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.LIZIZ = atomicReference;
        atomicReference.lazySet(SchedulerPoolFactory.create(p3i));
    }

    @Override // X.AbstractC73946T0k
    public final AbstractC73945T0j LIZ() {
        return new C73959T0x(this.LIZIZ.get());
    }

    @Override // X.AbstractC73946T0k
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        C73320Sq4.LIZ(runnable, "run is null");
        T11 t11 = new T11(runnable);
        try {
            if (j <= 0) {
                schedule = this.LIZIZ.get().submit(t11);
            } else {
                schedule = this.LIZIZ.get().schedule(t11, j, timeUnit);
            }
            t11.setFuture(schedule);
            return t11;
        } catch (RejectedExecutionException e) {
            C73548Stk.LIZIZ(e);
            return EnumC73538Sta.INSTANCE;
        }
    }

    @Override // X.AbstractC73946T0k
    public final InterfaceC92693kP LIZLLL(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> schedule;
        C73320Sq4.LIZ(runnable, "run is null");
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.LIZIZ.get();
            CallableC73960T0y callableC73960T0y = new CallableC73960T0y(runnable, scheduledExecutorService);
            try {
                if (j <= 0) {
                    schedule = scheduledExecutorService.submit(callableC73960T0y);
                } else {
                    schedule = scheduledExecutorService.schedule(callableC73960T0y, j, timeUnit);
                }
                callableC73960T0y.LIZ(schedule);
                return callableC73960T0y;
            } catch (RejectedExecutionException e) {
                C73548Stk.LIZIZ(e);
                return EnumC73538Sta.INSTANCE;
            }
        }
        T10 t10 = new T10(runnable);
        try {
            t10.setFuture(this.LIZIZ.get().scheduleAtFixedRate(t10, j, j2, timeUnit));
            return t10;
        } catch (RejectedExecutionException e2) {
            C73548Stk.LIZIZ(e2);
            return EnumC73538Sta.INSTANCE;
        }
    }
}
