package X;

/* loaded from: classes15.dex */
public final class VEW extends O3R {
    public final /* synthetic */ QXX LIZ;
    public final /* synthetic */ C08200Tw LIZIZ;
    public final /* synthetic */ VEX LIZJ;

    @Override // X.O3R
    public final void LIZ(InterfaceC79289V9x interfaceC79289V9x) {
        int i;
        if (interfaceC79289V9x.LIZIZ().booleanValue()) {
            this.LIZ.LLLILZJ(VEH.LIZ(interfaceC79289V9x.LIZLLL()));
            return;
        }
        VEX vex = this.LIZJ;
        QXX qxx = this.LIZ;
        String str = (String) this.LIZIZ.LIZ;
        if (interfaceC79289V9x.getErrorCode().intValue() == -1) {
            i = -3;
        } else {
            i = -2;
        }
        String LIZJ = interfaceC79289V9x.LIZJ();
        vex.getClass();
        VEX.LIZIZ(qxx, str, i, LIZJ);
    }

    public VEW(VEX vex, QXX qxx, C08200Tw c08200Tw) {
        this.LIZJ = vex;
        this.LIZ = qxx;
        this.LIZIZ = c08200Tw;
    }
}
