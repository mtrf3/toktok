package X;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.T0z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73961T0z extends AtomicReference<Future<?>> implements InterfaceC92693kP {
    public static final FutureTask<Void> LJLJI;
    public static final FutureTask<Void> LJLJJI;
    public static final long serialVersionUID = 1811839108042568751L;
    public final Runnable LJLIL;
    public Thread LJLILLLLZI;

    static {
        RunnableC73688Sw0 runnableC73688Sw0 = C73674Svm.LIZIZ;
        LJLJI = new FutureTask<>(runnableC73688Sw0, null);
        LJLJJI = new FutureTask<>(runnableC73688Sw0, null);
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        FutureTask<Void> futureTask;
        boolean z;
        Future<?> future = get();
        if (future != LJLJI && future != (futureTask = LJLJJI) && compareAndSet(future, futureTask) && future != null) {
            if (this.LJLILLLLZI != C16880lQ.LLLLIIIILLL()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        Future<?> future = get();
        if (future == LJLJI || future == LJLJJI) {
            return true;
        }
        return false;
    }

    public Runnable getWrappedRunnable() {
        return this.LJLIL;
    }

    public AbstractC73961T0z(Runnable runnable) {
        this.LJLIL = runnable;
    }

    public final void setFuture(Future<?> future) {
        Future<?> future2;
        boolean z;
        do {
            future2 = get();
            if (future2 == LJLJI) {
                return;
            }
            if (future2 == LJLJJI) {
                if (this.LJLILLLLZI != C16880lQ.LLLLIIIILLL()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
