package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public final class T1G extends AbstractC73946T0k {
    public static final T1G LIZIZ = new T1G();

    @Override // X.AbstractC73946T0k
    public final AbstractC73945T0j LIZ() {
        return new T1I();
    }

    @Override // X.AbstractC73946T0k
    public final InterfaceC92693kP LIZIZ(Runnable runnable) {
        C73320Sq4.LIZ(runnable, "run is null");
        runnable.run();
        return EnumC73538Sta.INSTANCE;
    }

    @Override // X.AbstractC73946T0k
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C73320Sq4.LIZ(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIIILLL().interrupt();
            C73548Stk.LIZIZ(e);
        }
        return EnumC73538Sta.INSTANCE;
    }
}
