package X;

/* renamed from: X.Qnv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68091Qnv implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C68110QoE LJLILLLLZI;

    public RunnableC68091Qnv(C68110QoE c68110QoE, long j) {
        this.LJLILLLLZI = c68110QoE;
        this.LJLIL = j;
    }

    public final void LIZ() {
        C68110QoE c68110QoE = this.LJLILLLLZI;
        long j = this.LJLIL;
        c68110QoE.LJFF();
        c68110QoE.LJIIIZ();
        c68110QoE.LIZ.LIZJ().LJIILIIL.LIZIZ(Long.valueOf(j), "Activity resumed, time");
        if (c68110QoE.LIZ.LJI.LJIILL() || c68110QoE.LIZ.LJIILLIIL().LJIILL.LIZIZ()) {
            C68088Qns c68088Qns = c68110QoE.LJ;
            c68088Qns.LIZLLL.LJFF();
            c68088Qns.LIZJ.LIZ();
            c68088Qns.LIZ = j;
            c68088Qns.LIZIZ = j;
        }
        C51367KDz c51367KDz = c68110QoE.LJFF;
        ((C68048QnE) c51367KDz.LIZIZ).LJFF();
        RunnableC68118QoM runnableC68118QoM = (RunnableC68118QoM) c51367KDz.LIZ;
        if (runnableC68118QoM != null) {
            ((C68110QoE) c51367KDz.LIZIZ).LIZJ.removeCallbacks(runnableC68118QoM);
        }
        ((C68048QnE) c51367KDz.LIZIZ).LIZ.LJIILLIIL().LJIILL.LIZ(false);
        C68035Qn1 c68035Qn1 = c68110QoE.LIZLLL;
        c68035Qn1.LIZ.LJFF();
        if (!c68035Qn1.LIZ.LIZ.LJII()) {
            return;
        }
        c68035Qn1.LIZ.LIZ.LJIILIIL.getClass();
        c68035Qn1.LIZIZ(System.currentTimeMillis(), false);
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
