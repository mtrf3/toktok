package X;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.T0y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class CallableC73960T0y implements Callable<Void>, InterfaceC92693kP {
    public static final FutureTask<Void> LJLJJLL = new FutureTask<>(C73674Svm.LIZIZ, null);
    public final Runnable LJLIL;
    public final ExecutorService LJLJJI;
    public Thread LJLJJL;
    public final AtomicReference<Future<?>> LJLJI = new AtomicReference<>();
    public final AtomicReference<Future<?>> LJLILLLLZI = new AtomicReference<>();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        boolean z;
        AtomicReference<Future<?>> atomicReference = this.LJLJI;
        FutureTask<Void> futureTask = LJLJJLL;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        boolean z2 = true;
        if (andSet != null && andSet != futureTask) {
            if (this.LJLJJL != C16880lQ.LLLLIIIILLL()) {
                z = true;
            } else {
                z = false;
            }
            andSet.cancel(z);
        }
        Future<?> andSet2 = this.LJLILLLLZI.getAndSet(futureTask);
        if (andSet2 != null && andSet2 != futureTask) {
            if (this.LJLJJL == C16880lQ.LLLLIIIILLL()) {
                z2 = false;
            }
            andSet2.cancel(z2);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (this.LJLJI.get() == LJLJJLL) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.LJLJJL = C16880lQ.LLLLIIIILLL();
        try {
            this.LJLIL.run();
            Future<?> submit = this.LJLJJI.submit(this);
            loop0: while (true) {
                Future<?> future = this.LJLILLLLZI.get();
                boolean z = false;
                if (future == LJLJJLL) {
                    if (this.LJLJJL != C16880lQ.LLLLIIIILLL()) {
                        z = true;
                    }
                    submit.cancel(z);
                } else {
                    AtomicReference<Future<?>> atomicReference = this.LJLILLLLZI;
                    while (!atomicReference.compareAndSet(future, submit)) {
                        if (atomicReference.get() != future) {
                            break;
                        }
                    }
                    break loop0;
                }
            }
            this.LJLJJL = null;
        } catch (Throwable th) {
            this.LJLJJL = null;
            C73548Stk.LIZIZ(th);
        }
        return null;
    }

    public final void LIZ(Future<?> future) {
        while (true) {
            Future<?> future2 = this.LJLJI.get();
            boolean z = false;
            if (future2 == LJLJJLL) {
                if (this.LJLJJL != C16880lQ.LLLLIIIILLL()) {
                    z = true;
                }
                future.cancel(z);
                return;
            } else {
                AtomicReference<Future<?>> atomicReference = this.LJLJI;
                while (!atomicReference.compareAndSet(future2, future)) {
                    if (atomicReference.get() != future2) {
                        break;
                    }
                }
                return;
            }
        }
    }

    public CallableC73960T0y(Runnable runnable, ExecutorService executorService) {
        this.LJLIL = runnable;
        this.LJLJJI = executorService;
    }
}
