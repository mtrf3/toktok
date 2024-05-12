package X;

/* loaded from: classes12.dex */
public final class PI4 extends PMI {
    @Override // X.PMI
    public final void LJII() {
        super.LJII();
    }

    @Override // X.PMI
    public final PI8 LJIIIIZZ() {
        return PI8.IDLE;
    }

    public PI4(PI1 pi1) {
        super(pi1);
    }

    @Override // X.PMI
    public final void LJI(boolean z) {
        super.LJI(z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("life cycle change when state is idle, lifecycle change to back?: ");
        LIZ.append(z);
        LIZ(X1D.LIZIZ(LIZ));
        ((PI1) this.LIZ).LIZJ();
    }

    @Override // X.PMI
    public final void LJFF(C64198PHm c64198PHm, boolean z) {
        super.LJFF(c64198PHm, z);
        ((PI1) this.LIZ).LIZJ();
    }
}
