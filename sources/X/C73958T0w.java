package X;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.T0w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73958T0w extends AbstractC73946T0k {
    public static final T12 LIZJ;
    public static final P3I LIZLLL;
    public static final int LJ;
    public static final T13 LJFF;
    public final AtomicReference<T12> LIZIZ;

    public C73958T0w() {
        int i;
        P3I p3i = LIZLLL;
        T12 t12 = LIZJ;
        AtomicReference<T12> atomicReference = new AtomicReference<>(t12);
        this.LIZIZ = atomicReference;
        T12 t122 = new T12(LJ, p3i);
        do {
            if (atomicReference.compareAndSet(t12, t122)) {
                return;
            }
        } while (atomicReference.get() == t12);
        for (T13 t13 : t122.LIZIZ) {
            t13.dispose();
        }
    }

    @Override // X.AbstractC73946T0k
    public final AbstractC73945T0j LIZ() {
        return new C73948T0m(this.LIZIZ.get().LIZ());
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        LJ = availableProcessors;
        T13 t13 = new T13(new P3I("RxComputationShutdown"));
        LJFF = t13;
        t13.dispose();
        P3I p3i = new P3I("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        LIZLLL = p3i;
        T12 t12 = new T12(0, p3i);
        LIZJ = t12;
        for (T13 t132 : t12.LIZIZ) {
            t132.dispose();
        }
    }

    @Override // X.AbstractC73946T0k
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        T13 LIZ = this.LIZIZ.get().LIZ();
        LIZ.getClass();
        C73320Sq4.LIZ(runnable, "run is null");
        T11 t11 = new T11(runnable);
        try {
            if (j <= 0) {
                schedule = LIZ.LJLIL.submit(t11);
            } else {
                schedule = LIZ.LJLIL.schedule(t11, j, timeUnit);
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
        T13 LIZ = this.LIZIZ.get().LIZ();
        LIZ.getClass();
        C73320Sq4.LIZ(runnable, "run is null");
        if (j2 <= 0) {
            CallableC73960T0y callableC73960T0y = new CallableC73960T0y(runnable, LIZ.LJLIL);
            try {
                if (j <= 0) {
                    schedule = LIZ.LJLIL.submit(callableC73960T0y);
                } else {
                    schedule = LIZ.LJLIL.schedule(callableC73960T0y, j, timeUnit);
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
            t10.setFuture(LIZ.LJLIL.scheduleAtFixedRate(t10, j, j2, timeUnit));
            return t10;
        } catch (RejectedExecutionException e2) {
            C73548Stk.LIZIZ(e2);
            return EnumC73538Sta.INSTANCE;
        }
    }
}
