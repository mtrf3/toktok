package X;

/* renamed from: X.Qnw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68092Qnw implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C68110QoE LJLILLLLZI;

    public RunnableC68092Qnw(C68110QoE c68110QoE, long j) {
        this.LJLILLLLZI = c68110QoE;
        this.LJLIL = j;
    }

    public final void LIZ() {
        C68110QoE c68110QoE = this.LJLILLLLZI;
        long j = this.LJLIL;
        c68110QoE.LJFF();
        c68110QoE.LJIIIZ();
        c68110QoE.LIZ.LIZJ().LJIILIIL.LIZIZ(Long.valueOf(j), "Activity paused, time");
        C51367KDz c51367KDz = c68110QoE.LJFF;
        c51367KDz.getClass();
        ((C68048QnE) c51367KDz.LIZIZ).LIZ.LJIILIIL.getClass();
        RunnableC68118QoM runnableC68118QoM = new RunnableC68118QoM(c51367KDz, System.currentTimeMillis(), j);
        c51367KDz.LIZ = runnableC68118QoM;
        ((C68110QoE) c51367KDz.LIZIZ).LIZJ.postDelayed(runnableC68118QoM, 2000L);
        if (c68110QoE.LIZ.LJI.LJIILL()) {
            c68110QoE.LJ.LIZJ.LIZ();
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
