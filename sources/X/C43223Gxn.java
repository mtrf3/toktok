package X;

/* renamed from: X.Gxn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43223Gxn implements FTD {
    public final /* synthetic */ int LIZ = 3000;
    public final /* synthetic */ int LIZIZ = 800;
    public final /* synthetic */ C82722WdK LIZJ;

    @Override // X.FTD
    public final void LIZ() {
    }

    @Override // X.FTD
    public final void LIZIZ() {
        C82722WdK c82722WdK = this.LIZJ;
        c82722WdK.LJLL = this.LIZ;
        c82722WdK.LJLJLLL = this.LIZIZ;
        c82722WdK.LJLLI.removeCallbacksAndMessages(null);
        c82722WdK.LJLLI.postDelayed(c82722WdK.LJLLILLLL, c82722WdK.LJLJJL.nextInt(4) * 100);
    }

    public C43223Gxn(C82722WdK c82722WdK) {
        this.LIZJ = c82722WdK;
    }
}
