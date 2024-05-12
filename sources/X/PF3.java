package X;

import android.os.Message;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes12.dex */
public class PF3 implements Runnable {
    public final /* synthetic */ PF4 LJLIL;

    public final void LIZ() {
        while (!((ConcurrentLinkedQueue) this.LJLIL.LIZJ).isEmpty()) {
            synchronized (this.LJLIL.LJ) {
                if (this.LJLIL.LIZLLL != null) {
                    this.LJLIL.LIZLLL.sendMessageAtFrontOfQueue((Message) ((ConcurrentLinkedQueue) this.LJLIL.LIZJ).poll());
                }
            }
        }
        LIZIZ();
    }

    public final void LIZIZ() {
        while (!((ConcurrentLinkedQueue) this.LJLIL.LIZIZ).isEmpty()) {
            synchronized (this.LJLIL.LJ) {
                PFA pfa = (PFA) ((ConcurrentLinkedQueue) this.LJLIL.LIZIZ).poll();
                if (this.LJLIL.LIZLLL != null) {
                    this.LJLIL.LIZLLL.sendMessageAtTime(pfa.LIZ, pfa.LIZIZ);
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

    public PF3(PF4 pf4) {
        this.LJLIL = pf4;
    }
}
