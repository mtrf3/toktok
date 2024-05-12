package X;

/* renamed from: X.OCh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61515OCh extends OEL {
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL = 1;
    public final /* synthetic */ C61532OCy LJ;

    @Override // X.OEL
    public final void LIZ() {
        OC6.LIZ("gecko-debug-tag", "register gecko try to trigger update");
        C61532OCy c61532OCy = this.LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("occasion_gecko_register-");
        LIZ.append(this.LIZJ);
        c61532OCy.LJIIL(this.LIZLLL, X1D.LIZIZ(LIZ));
    }

    @Override // X.OEL
    public final int LIZIZ() {
        return 6;
    }

    public C61515OCh(C61532OCy c61532OCy, String str) {
        this.LJ = c61532OCy;
        this.LIZJ = str;
    }
}
