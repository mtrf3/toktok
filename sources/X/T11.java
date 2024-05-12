package X;

import java.util.concurrent.Callable;

/* loaded from: classes13.dex */
public final class T11 extends AbstractC73961T0z implements Callable<Void> {
    public static final long serialVersionUID = 1811839108042568751L;

    @Override // java.util.concurrent.Callable
    public Void call() {
        this.LJLILLLLZI = C16880lQ.LLLLIIIILLL();
        try {
            this.LJLIL.run();
            return null;
        } finally {
            lazySet(AbstractC73961T0z.LJLJI);
            this.LJLILLLLZI = null;
        }
    }

    @Override // X.AbstractC73961T0z
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public T11(Runnable runnable) {
        super(runnable);
    }
}
