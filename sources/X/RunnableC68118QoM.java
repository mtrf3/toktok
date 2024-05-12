package X;

import android.os.Bundle;

/* renamed from: X.QoM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68118QoM implements Runnable {
    public final long LJLIL;
    public final long LJLILLLLZI;
    public final /* synthetic */ C51367KDz LJLJI;

    public RunnableC68118QoM(C51367KDz c51367KDz, long j, long j2) {
        this.LJLJI = c51367KDz;
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            ((C68110QoE) this.LJLJI.LIZIZ).LIZ.LIZIZ().LJIILIIL(new Runnable() { // from class: X.Qo0
                public final void LIZ() {
                    RunnableC68118QoM runnableC68118QoM = RunnableC68118QoM.this;
                    C51367KDz c51367KDz = runnableC68118QoM.LJLJI;
                    long j = runnableC68118QoM.LJLIL;
                    long j2 = runnableC68118QoM.LJLILLLLZI;
                    ((C68048QnE) c51367KDz.LIZIZ).LJFF();
                    ((C68048QnE) c51367KDz.LIZIZ).LIZ.LIZJ().LJIIL.LIZ("Application going to the background");
                    ((C68048QnE) c51367KDz.LIZIZ).LIZ.LJIILLIIL().LJIILL.LIZ(true);
                    Bundle bundle = new Bundle();
                    if (!((C68048QnE) c51367KDz.LIZIZ).LIZ.LJI.LJIILL()) {
                        ((C68110QoE) c51367KDz.LIZIZ).LJ.LIZJ.LIZ();
                        ((C68110QoE) c51367KDz.LIZIZ).LJ.LIZ(j2, false, false);
                    }
                    ((C68048QnE) c51367KDz.LIZIZ).LIZ.LJIJ().LJIILIIL(j, "auto", "_ab", bundle);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        } finally {
            if (LIZ) {
            }
        }
    }
}
