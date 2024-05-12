package X;

import java.util.concurrent.Callable;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes16.dex */
public final class XP5<V> extends AbstractRunnableC73972T1k<V> {
    public final Callable<V> LJLJI;
    public final /* synthetic */ RunnableFutureC84777XOz LJLJJI;

    @Override // X.AbstractRunnableC73972T1k
    public final boolean LIZIZ() {
        return this.LJLJJI.isDone();
    }

    @Override // X.AbstractRunnableC73972T1k
    public final V LIZJ() {
        return this.LJLJI.call();
    }

    @Override // X.AbstractRunnableC73972T1k
    public final String LIZLLL() {
        return this.LJLJI.toString();
    }

    public XP5(RunnableFutureC84777XOz runnableFutureC84777XOz, Callable<V> callable) {
        this.LJLJJI = runnableFutureC84777XOz;
        callable.getClass();
        this.LJLJI = callable;
    }

    @Override // X.AbstractRunnableC73972T1k
    public final void LIZ(V v, Throwable th) {
        if (th == null) {
            this.LJLJJI.LJIIJ(v);
        } else {
            this.LJLJJI.LJIIJJI(th);
        }
    }
}
