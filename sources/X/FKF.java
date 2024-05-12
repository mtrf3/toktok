package X;

/* loaded from: classes7.dex */
public final class FKF implements YU5<Object> {
    public volatile C106504Fy LJLIL;
    public final Object LJLILLLLZI = new Object();
    public final FKI LJLJI;

    @Override // X.YU5
    public final Object generatedComponent() {
        if (this.LJLIL == null) {
            synchronized (this.LJLILLLLZI) {
                if (this.LJLIL == null) {
                    FKG fkg = (FKG) this.LJLJI;
                    fkg.getClass();
                    this.LJLIL = new C106504Fy(new C253119wZ(fkg.LIZ));
                }
            }
        }
        return this.LJLIL;
    }

    public FKF(FKG fkg) {
        this.LJLJI = fkg;
    }
}
