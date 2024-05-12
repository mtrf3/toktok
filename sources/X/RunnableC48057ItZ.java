package X;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: X.ItZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC48057ItZ implements Runnable {
    public final Runnable LJLIL;

    public final void LIZ() {
        this.LJLIL.run();
        synchronized (C48056ItY.class) {
            Deque<RunnableC48057ItZ> deque = C48056ItY.LIZJ;
            ((ArrayDeque) deque).remove(this);
            Deque<RunnableC48057ItZ> deque2 = C48056ItY.LIZIZ;
            if (((ArrayDeque) deque2).size() > 0) {
                Iterator it = ((ArrayDeque) deque2).iterator();
                if (it.hasNext()) {
                    RunnableC48057ItZ runnableC48057ItZ = (RunnableC48057ItZ) it.next();
                    it.remove();
                    ((ArrayDeque) deque).add(runnableC48057ItZ);
                    C48056ItY.LIZ.execute(runnableC48057ItZ);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC48057ItZ(Runnable runnable) {
        this.LJLIL = runnable;
    }
}
