package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.QgY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67634QgY implements Runnable {
    public final /* synthetic */ AtomicReference LJLIL;
    public final /* synthetic */ C68082Qnm LJLILLLLZI;

    public RunnableC67634QgY(C68082Qnm c68082Qnm, AtomicReference atomicReference) {
        this.LJLILLLLZI = c68082Qnm;
        this.LJLIL = atomicReference;
    }

    public final void LIZ() {
        synchronized (this.LJLIL) {
            try {
                AtomicReference atomicReference = this.LJLIL;
                C68033Qmz c68033Qmz = this.LJLILLLLZI.LIZ;
                atomicReference.set(Integer.valueOf(c68033Qmz.LJI.LJIIIZ(c68033Qmz.LJIILJJIL().LJIIJ(), C68555QvP.LJJJ)));
            } finally {
                this.LJLIL.notify();
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
}
