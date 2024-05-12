package X;

/* renamed from: X.QoD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68109QoD implements Runnable {
    public final /* synthetic */ C68090Qnu LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C68090Qnu LJLJJL;
    public final /* synthetic */ C68082Qnm LJLJJLL;

    public RunnableC68109QoD(C68082Qnm c68082Qnm, C68090Qnu c68090Qnu, int i, long j, boolean z, C68090Qnu c68090Qnu2) {
        this.LJLJJLL = c68082Qnm;
        this.LJLIL = c68090Qnu;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = z;
        this.LJLJJL = c68090Qnu2;
    }

    public final void LIZ() {
        this.LJLJJLL.LJIJI(this.LJLIL);
        C68082Qnm.LJJIII(this.LJLJJLL, this.LJLIL, this.LJLILLLLZI, this.LJLJI, false, this.LJLJJI);
        C68572Qvg.LIZ();
        if (this.LJLJJLL.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJLJJI)) {
            C68082Qnm.LJJII(this.LJLJJLL, this.LJLIL, this.LJLJJL);
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
