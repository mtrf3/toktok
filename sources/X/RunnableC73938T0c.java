package X;

import java.util.Collection;
import java.util.LinkedList;

/* JADX WARN: Incorrect field signature: TU; */
/* renamed from: X.T0c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73938T0c implements Runnable {
    public final Collection LJLIL;
    public final /* synthetic */ T0Y LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            synchronized (this.LJLILLLLZI) {
                ((LinkedList) this.LJLILLLLZI.LJLLI).remove(this.LJLIL);
            }
            T0Y t0y = this.LJLILLLLZI;
            t0y.LJFF(this.LJLIL, t0y.LJLL);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC73938T0c(T0Y t0y, U u) {
        this.LJLILLLLZI = t0y;
        this.LJLIL = u;
    }
}
