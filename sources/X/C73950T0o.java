package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.T0o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73950T0o extends AbstractC73946T0k {
    public static final AbstractC73946T0k LIZLLL = T16.LIZ;
    public final boolean LIZIZ = false;
    public final Executor LIZJ;

    @Override // X.AbstractC73946T0k
    public final AbstractC73945T0j LIZ() {
        return new RunnableC73949T0n(this.LIZJ, this.LIZIZ);
    }

    public C73950T0o(Executor executor) {
        this.LIZJ = executor;
    }

    @Override // X.AbstractC73946T0k
    public final InterfaceC92693kP LIZIZ(Runnable runnable) {
        C73320Sq4.LIZ(runnable, "run is null");
        try {
            if (this.LIZJ instanceof ExecutorService) {
                T11 t11 = new T11(runnable);
                t11.setFuture(((ExecutorService) this.LIZJ).submit(t11));
                return t11;
            }
            if (this.LIZIZ) {
                RunnableC73953T0r runnableC73953T0r = new RunnableC73953T0r(runnable, null);
                this.LIZJ.execute(runnableC73953T0r);
                return runnableC73953T0r;
            }
            POE poe = new POE(runnable);
            this.LIZJ.execute(poe);
            return poe;
        } catch (RejectedExecutionException e) {
            C73548Stk.LIZIZ(e);
            return EnumC73538Sta.INSTANCE;
        }
    }

    @Override // X.AbstractC73946T0k
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        C73320Sq4.LIZ(runnable, "run is null");
        if (this.LIZJ instanceof ScheduledExecutorService) {
            try {
                T11 t11 = new T11(runnable);
                t11.setFuture(((ScheduledExecutorService) this.LIZJ).schedule(t11, j, timeUnit));
                return t11;
            } catch (RejectedExecutionException e) {
                C73548Stk.LIZIZ(e);
                return EnumC73538Sta.INSTANCE;
            }
        }
        RunnableC73623Sux runnableC73623Sux = new RunnableC73623Sux(runnable);
        runnableC73623Sux.LJLIL.replace(LIZLLL.LIZJ(new RunnableC73624Suy(this, runnableC73623Sux), j, timeUnit));
        return runnableC73623Sux;
    }

    @Override // X.AbstractC73946T0k
    public final InterfaceC92693kP LIZLLL(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (this.LIZJ instanceof ScheduledExecutorService) {
            C73320Sq4.LIZ(runnable, "run is null");
            try {
                T10 t10 = new T10(runnable);
                t10.setFuture(((ScheduledExecutorService) this.LIZJ).scheduleAtFixedRate(t10, j, j2, timeUnit));
                return t10;
            } catch (RejectedExecutionException e) {
                C73548Stk.LIZIZ(e);
                return EnumC73538Sta.INSTANCE;
            }
        }
        return super.LIZLLL(runnable, j, j2, timeUnit);
    }
}
