package X;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class QD0 {
    public final Deque<Runnable> LIZ = new LinkedList();
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final int LIZJ = 200;

    public final void LIZ() {
        synchronized (this) {
            this.LIZIZ.set(true);
            while (((LinkedList) this.LIZ).size() > 0) {
                ((Runnable) ((LinkedList) this.LIZ).pop()).run();
            }
        }
    }

    public final void LIZIZ(Runnable runnable) {
        synchronized (this) {
            if (this.LIZIZ.get()) {
                runnable.run();
            } else if (((LinkedList) this.LIZ).size() < this.LIZJ) {
                ((LinkedList) this.LIZ).add(runnable);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("throw task ");
                LIZ.append(runnable);
                LIZ.append(", because there are too many tasks in queue");
                C66629QCz.LIZIZ(X1D.LIZIZ(LIZ));
            }
        }
    }
}
