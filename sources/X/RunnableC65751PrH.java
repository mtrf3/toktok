package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.PrH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC65751PrH<V> implements Runnable {
    public final Future<V> LJLIL;
    public final InterfaceC65753PrJ<? super V> LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                this.LJLILLLLZI.onSuccess(C65734Pr0.LLLLZIL(this.LJLIL));
            } catch (Error e) {
                e = e;
                this.LJLILLLLZI.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.LJLILLLLZI.onFailure(e);
            } catch (ExecutionException e3) {
                this.LJLILLLLZI.onFailure(e3.getCause());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public final String toString() {
        C65752PrI LIZIZ = C65749PrF.LIZIZ(this);
        InterfaceC65753PrJ<? super V> interfaceC65753PrJ = this.LJLILLLLZI;
        C65754PrK c65754PrK = new C65754PrK();
        LIZIZ.LIZJ.LIZJ = c65754PrK;
        LIZIZ.LIZJ = c65754PrK;
        c65754PrK.LIZIZ = interfaceC65753PrJ;
        return LIZIZ.toString();
    }

    public RunnableC65751PrH(Future<V> future, InterfaceC65753PrJ<? super V> interfaceC65753PrJ) {
        this.LJLIL = future;
        this.LJLILLLLZI = interfaceC65753PrJ;
    }
}
