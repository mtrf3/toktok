package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.T0j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73945T0j implements InterfaceC92693kP {
    public abstract InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit);

    public static long LIZ(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public InterfaceC92693kP LIZIZ(Runnable runnable) {
        return LIZJ(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public final InterfaceC92693kP LIZLLL(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C73616Suq c73616Suq = new C73616Suq();
        C73616Suq c73616Suq2 = new C73616Suq(c73616Suq);
        C73320Sq4.LIZ(runnable, "run is null");
        long nanos = timeUnit.toNanos(j2);
        long LIZ = LIZ(TimeUnit.NANOSECONDS);
        InterfaceC92693kP LIZJ = LIZJ(new RunnableC73944T0i(this, timeUnit.toNanos(j) + LIZ, runnable, LIZ, c73616Suq2, nanos), j, timeUnit);
        if (LIZJ == EnumC73538Sta.INSTANCE) {
            return LIZJ;
        }
        c73616Suq.replace(LIZJ);
        return c73616Suq2;
    }
}
