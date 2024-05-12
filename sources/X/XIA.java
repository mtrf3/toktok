package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes16.dex */
public final class XIA extends XIC implements X9R, Executor {
    public static final /* synthetic */ AtomicIntegerFieldUpdater LJLJJLL = AtomicIntegerFieldUpdater.newUpdater(XIA.class, "inFlightTasks");
    public final XIB LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI = "Dispatchers.IO";
    public final int LJLJJI = 1;
    public final ConcurrentLinkedQueue<Runnable> LJLJJL = new ConcurrentLinkedQueue<>();
    public volatile /* synthetic */ int inFlightTasks = 0;

    @Override // X.X9R
    public final void LJIILIIL() {
        Runnable poll = this.LJLJJL.poll();
        if (poll != null) {
            XIB xib = this.LJLIL;
            xib.getClass();
            try {
                xib.LJLIL.dispatch(poll, this, true);
                return;
            } catch (RejectedExecutionException unused) {
                XJE.LJLIL.enqueue(xib.LJLIL.createTask(poll, this));
                return;
            }
        }
        LJLJJLL.decrementAndGet(this);
        Runnable poll2 = this.LJLJJL.poll();
        if (poll2 == null) {
            return;
        }
        LJJIJIL(poll2, true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        "Close cannot be invoked on LimitingBlockingDispatcher".toString();
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher");
    }

    @Override // X.XKW
    public final String toString() {
        String str = this.LJLJI;
        if (str == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(super.toString());
            LIZ.append("[dispatcher = ");
            LIZ.append(this.LJLIL);
            LIZ.append(']');
            return X1D.LIZIZ(LIZ);
        }
        return str;
    }

    @Override // X.X9R
    public final int LJJIJIIJIL() {
        return this.LJLJJI;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        LJJIJIL(runnable, false);
    }

    public XIA(C78872UxQ c78872UxQ, int i) {
        this.LJLIL = c78872UxQ;
        this.LJLILLLLZI = i;
    }

    public final void LJJIJIL(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LJLJJLL;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.LJLILLLLZI) {
                XIB xib = this.LJLIL;
                xib.getClass();
                try {
                    xib.LJLIL.dispatch(runnable, this, z);
                    return;
                } catch (RejectedExecutionException unused) {
                    XJE.LJLIL.enqueue(xib.LJLIL.createTask(runnable, this));
                    return;
                }
            }
            this.LJLJJL.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.LJLILLLLZI) {
                return;
            } else {
                runnable = this.LJLJJL.poll();
            }
        } while (runnable != null);
    }

    @Override // X.XKW
    public final void dispatch(MBA mba, Runnable runnable) {
        LJJIJIL(runnable, false);
    }

    @Override // X.XKW
    public final void dispatchYield(MBA mba, Runnable runnable) {
        LJJIJIL(runnable, true);
    }
}
