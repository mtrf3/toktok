package X;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.XOz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableFutureC84777XOz<V> extends XP4<V> implements RunnableFuture<V> {
    public volatile XP5 LJLJLJ;

    @Override // X.AbstractC84773XOv
    public final void LIZIZ() {
        XP5 xp5;
        Object obj = this.LJLIL;
        if ((obj instanceof XPA) && ((XPA) obj).LIZ && (xp5 = this.LJLJLJ) != null) {
            Runnable runnable = (Runnable) xp5.get();
            if ((runnable instanceof Thread) && xp5.compareAndSet(runnable, AbstractRunnableC73972T1k.LJLILLLLZI)) {
                ((Thread) runnable).interrupt();
                xp5.set(AbstractRunnableC73972T1k.LJLIL);
            }
        }
        this.LJLJLJ = null;
    }

    @Override // X.AbstractC84773XOv
    public final String LJIIIIZZ() {
        XP5 xp5 = this.LJLJLJ;
        if (xp5 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("task=[");
            LIZ.append(xp5);
            LIZ.append("]");
            return X1D.LIZIZ(LIZ);
        }
        return super.LJIIIIZZ();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        XP5 xp5 = this.LJLJLJ;
        if (xp5 != null) {
            xp5.run();
        }
        this.LJLJLJ = null;
    }

    public RunnableFutureC84777XOz(Callable<V> callable) {
        this.LJLJLJ = new XP5(this, callable);
    }
}
