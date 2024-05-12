package X;

/* renamed from: X.Qaj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67273Qaj implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C68082Qnm LJLILLLLZI;

    public RunnableC67273Qaj(C68082Qnm c68082Qnm, long j) {
        this.LJLILLLLZI = c68082Qnm;
        this.LJLIL = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.LIZ.LJIILLIIL().LJIIIZ.LIZIZ(this.LJLIL);
            this.LJLILLLLZI.LIZ.LIZJ().LJIIL.LIZIZ(Long.valueOf(this.LJLIL), "Session timeout duration set");
        } finally {
            if (LIZ) {
            }
        }
    }
}
