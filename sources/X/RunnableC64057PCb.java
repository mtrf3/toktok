package X;

import android.os.Message;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.PCb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class RunnableC64057PCb implements Runnable {
    public final /* synthetic */ C64056PCa LJLIL;

    public final void LIZ() {
        while (!((ConcurrentLinkedQueue) this.LJLIL.LIZJ).isEmpty()) {
            if (this.LJLIL.LIZLLL != null) {
                this.LJLIL.LIZLLL.sendMessageAtFrontOfQueue((Message) ((ConcurrentLinkedQueue) this.LJLIL.LIZJ).poll());
            }
        }
        while (!((ConcurrentLinkedQueue) this.LJLIL.LIZIZ).isEmpty()) {
            C64060PCe c64060PCe = (C64060PCe) ((ConcurrentLinkedQueue) this.LJLIL.LIZIZ).poll();
            if (this.LJLIL.LIZLLL != null) {
                this.LJLIL.LIZLLL.sendMessageAtTime(c64060PCe.LIZ, c64060PCe.LIZIZ);
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

    public RunnableC64057PCb(C64056PCa c64056PCa) {
        this.LJLIL = c64056PCa;
    }
}
