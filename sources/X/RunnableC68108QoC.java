package X;

/* renamed from: X.QoC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68108QoC implements Runnable {
    public final /* synthetic */ C68090Qnu LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ C68090Qnu LJLJJLL;
    public final /* synthetic */ C68082Qnm LJLJL;

    public RunnableC68108QoC(C68082Qnm c68082Qnm, C68090Qnu c68090Qnu, long j, int i, long j2, boolean z, C68090Qnu c68090Qnu2) {
        this.LJLJL = c68082Qnm;
        this.LJLIL = c68090Qnu;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = j2;
        this.LJLJJL = z;
        this.LJLJJLL = c68090Qnu2;
    }

    public final void LIZ() {
        this.LJLJL.LJIJI(this.LJLIL);
        this.LJLJL.LJIILL(this.LJLILLLLZI, false);
        C68082Qnm.LJJIII(this.LJLJL, this.LJLIL, this.LJLJI, this.LJLJJI, true, this.LJLJJL);
        C68572Qvg.LIZ();
        if (this.LJLJL.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJLJJI)) {
            C68082Qnm.LJJII(this.LJLJL, this.LJLIL, this.LJLJJLL);
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
