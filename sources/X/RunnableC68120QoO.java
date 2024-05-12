package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.QoO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68120QoO implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C68082Qnm LJLILLLLZI;

    public RunnableC68120QoO(C68082Qnm c68082Qnm, long j) {
        this.LJLILLLLZI = c68082Qnm;
        this.LJLIL = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.LJIILL(this.LJLIL, true);
            this.LJLILLLLZI.LIZ.LJIJJ().LJIJJLI(new AtomicReference());
        } finally {
            if (LIZ) {
            }
        }
    }
}
