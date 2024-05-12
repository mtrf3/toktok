package X;

import com.google.ar.core.v;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.aSG, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class RunnableC93524aSG implements Runnable {
    public final /* synthetic */ AtomicBoolean LJLIL;
    public final /* synthetic */ RunnableC93525aSH LJLILLLLZI;

    public RunnableC93524aSG(RunnableC93525aSH runnableC93525aSH, AtomicBoolean atomicBoolean) {
        this.LJLILLLLZI = runnableC93525aSH;
        this.LJLIL = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!this.LJLIL.getAndSet(true)) {
                RunnableC93525aSH runnableC93525aSH = this.LJLILLLLZI;
                v vVar = runnableC93525aSH.LJLJI;
                v.o(runnableC93525aSH.LJLIL, runnableC93525aSH.LJLILLLLZI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
