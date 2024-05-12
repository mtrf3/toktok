package X;

import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: X.Usn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class RunnableC78585Usn implements Runnable {
    public final ArrayBlockingQueue<Runnable> LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    this.LJLIL.take().run();
                } catch (InterruptedException e) {
                    C0NB.LJ(ExecutorC78584Usm.LJLJI, e.getMessage());
                }
            } catch (Throwable th) {
                if (C39223FaN.LIZ(th)) {
                    return;
                } else {
                    throw th;
                }
            }
        }
    }

    public RunnableC78585Usn(ArrayBlockingQueue arrayBlockingQueue) {
        this.LJLIL = arrayBlockingQueue;
    }
}
