package X;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes16.dex */
public final class XI8 extends XIC implements InterfaceC74210TAo {
    public final Executor LJLIL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.LJLIL;
        if (!(executor instanceof ExecutorService) || (executorService = (ExecutorService) executor) == null) {
            return;
        }
        executorService.shutdown();
    }

    public final int hashCode() {
        return System.identityHashCode(this.LJLIL);
    }

    @Override // X.XKW
    public final String toString() {
        return this.LJLIL.toString();
    }

    public XI8(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.LJLIL = executor;
        try {
            if ((executor instanceof ScheduledThreadPoolExecutor) && (scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor) != null && (method = C64072PCq.LIZ) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof XI8) && ((XI8) obj).LJLIL == this.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // X.XKW
    public final void dispatch(MBA mba, Runnable runnable) {
        try {
            this.LJLIL.execute(runnable);
        } catch (RejectedExecutionException e) {
            C79146V4k.LJIJ(mba, C62848OlY.LIZ("The task was rejected", e));
            C78613UtF.LIZJ.LJJIJIL(runnable, false);
        }
    }

    @Override // X.InterfaceC74210TAo
    public final void scheduleResumeAfterDelay(long j, XJL<? super C76800UCe> xjl) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.LJLIL;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            XKS xks = (XKS) xjl;
            XI9 xi9 = new XI9(this, xks);
            MBA mba = xks.LJLJJL;
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(xi9, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    ((XKS) xjl).LJIILIIL(new X9F(schedule));
                    return;
                }
            } catch (RejectedExecutionException e) {
                C79146V4k.LJIJ(mba, C62848OlY.LIZ("The task was rejected", e));
            }
        }
        XJE.LJLIL.scheduleResumeAfterDelay(j, xjl);
    }

    @Override // X.InterfaceC74210TAo
    public final T2N invokeOnTimeout(long j, Runnable runnable, MBA mba) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.LJLIL;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    return new C42372Gk4(schedule);
                }
            } catch (RejectedExecutionException e) {
                C79146V4k.LJIJ(mba, C62848OlY.LIZ("The task was rejected", e));
            }
        }
        return XJE.LJLIL.scheduleInvokeOnTimeout(j, runnable);
    }
}
