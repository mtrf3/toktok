package X;

import Y.ARunnableS25S0200000_6;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Er8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ExecutorC37714Er8 implements Executor {
    public final Executor LJLIL;
    public final Queue<Runnable> LJLILLLLZI = new LinkedList();
    public final AtomicInteger LJLJI = new AtomicInteger(2);

    public final synchronized void LIZ() {
        if (!this.LJLILLLLZI.isEmpty() && this.LJLJI.get() != 0) {
            Runnable runnable = (Runnable) ((LinkedList) this.LJLILLLLZI).poll();
            if (runnable != null) {
                LIZIZ(runnable);
                LIZ();
            }
        }
    }

    public ExecutorC37714Er8(Executor executor) {
        this.LJLIL = executor;
    }

    public final synchronized void LIZIZ(Runnable runnable) {
        this.LJLJI.decrementAndGet();
        this.LJLIL.execute(new ARunnableS25S0200000_6(runnable, this, 64));
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (this.LJLJI.get() > 0) {
            LIZIZ(runnable);
        } else {
            ((LinkedList) this.LJLILLLLZI).add(runnable);
            LIZ();
        }
    }
}
