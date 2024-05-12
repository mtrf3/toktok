package X;

/* loaded from: classes15.dex */
public final class VLB implements InterfaceC80828Vns {
    public boolean LIZ;
    public final /* synthetic */ C80796VnM LIZIZ;

    @Override // X.InterfaceC80828Vns
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC80828Vns
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC80828Vns
    public final boolean LIZIZ() {
        if (!this.LIZ) {
            this.LIZ = true;
            this.LIZIZ.setOffscreenPageLimit(1);
            C55537Lqv c55537Lqv = VL7.LJII;
            if (c55537Lqv != null) {
                c55537Lqv.LIZJ();
            }
            VL7.LJII = null;
            VL7.LJIIIIZZ = null;
            VL7.LJFF = true;
            return false;
        }
        return false;
    }

    public VLB(C80796VnM c80796VnM) {
        this.LIZIZ = c80796VnM;
    }
}
