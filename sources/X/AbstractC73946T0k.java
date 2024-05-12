package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.T0k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73946T0k {
    public static final long LIZ = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract AbstractC73945T0j LIZ();

    public InterfaceC92693kP LIZIZ(Runnable runnable) {
        return LIZJ(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        AbstractC73945T0j LIZ2 = LIZ();
        C73320Sq4.LIZ(runnable, "run is null");
        RunnableC73947T0l runnableC73947T0l = new RunnableC73947T0l(runnable, LIZ2);
        LIZ2.LIZJ(runnableC73947T0l, j, timeUnit);
        return runnableC73947T0l;
    }

    public InterfaceC92693kP LIZLLL(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        AbstractC73945T0j LIZ2 = LIZ();
        C73320Sq4.LIZ(runnable, "run is null");
        RunnableC73335SqJ runnableC73335SqJ = new RunnableC73335SqJ(runnable, LIZ2);
        InterfaceC92693kP LIZLLL = LIZ2.LIZLLL(runnableC73335SqJ, j, j2, timeUnit);
        if (LIZLLL == EnumC73538Sta.INSTANCE) {
            return LIZLLL;
        }
        return runnableC73335SqJ;
    }
}
