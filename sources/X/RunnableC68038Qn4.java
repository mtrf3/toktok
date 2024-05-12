package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qn4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68038Qn4 implements Runnable {
    public final /* synthetic */ AtomicReference LJLIL;
    public final /* synthetic */ C68082Qnm LJLILLLLZI;

    public RunnableC68038Qn4(C68082Qnm c68082Qnm, AtomicReference atomicReference) {
        this.LJLILLLLZI = c68082Qnm;
        this.LJLIL = atomicReference;
    }

    public final void LIZ() {
        String str;
        synchronized (this.LJLIL) {
            try {
                AtomicReference atomicReference = this.LJLIL;
                C68033Qmz c68033Qmz = this.LJLILLLLZI.LIZ;
                C68034Qn0 c68034Qn0 = c68033Qmz.LJI;
                String LJIIJ = c68033Qmz.LJIILJJIL().LJIIJ();
                C68067QnX c68067QnX = C68555QvP.LJJIL;
                if (LJIIJ == null) {
                    c68034Qn0.getClass();
                    str = (String) c68067QnX.LIZ(null);
                } else {
                    str = (String) c68067QnX.LIZ(c68034Qn0.LIZJ.LJJIIZ(LJIIJ, c68067QnX.LIZ));
                }
                atomicReference.set(str);
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
