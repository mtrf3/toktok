package X;

import android.os.Message;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes12.dex */
public class PL8 implements Runnable {
    public final /* synthetic */ C64284PKu LJLIL;

    public final void LIZ() {
        while (!((ConcurrentLinkedQueue) this.LJLIL.LIZJ).isEmpty()) {
            if (this.LJLIL.LIZLLL != null) {
                try {
                    this.LJLIL.LIZLLL.sendMessageAtFrontOfQueue((Message) ((ConcurrentLinkedQueue) this.LJLIL.LIZJ).poll());
                } catch (Throwable unused) {
                }
            }
        }
        while (!((ConcurrentLinkedQueue) this.LJLIL.LIZIZ).isEmpty()) {
            PLZ plz = (PLZ) ((ConcurrentLinkedQueue) this.LJLIL.LIZIZ).poll();
            if (this.LJLIL.LIZLLL != null) {
                try {
                    this.LJLIL.LIZLLL.sendMessageAtTime(plz.LIZ, plz.LIZIZ);
                } catch (Throwable unused2) {
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

    public PL8(C64284PKu c64284PKu) {
        this.LJLIL = c64284PKu;
    }
}
