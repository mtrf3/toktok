package X;

/* loaded from: classes12.dex */
public final class Q26 extends Q20 {
    public final Q27 LIZJ = new Q27(this);
    public final Q27 LIZLLL = new Q27(this);

    @Override // X.Q20
    public final boolean LIZIZ(C66343Q1z c66343Q1z) {
        Q27 q27 = this.LIZJ;
        q27.getClass();
        if (c66343Q1z.LIZ(q27).LIZ) {
            Q27 q272 = this.LIZLLL;
            q272.getClass();
            if (c66343Q1z.LIZ(q272).LIZ && super.LIZIZ(c66343Q1z)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.Q20
    public final void LJFF(int i) {
        super.LJFF(i);
        this.LIZJ.LJFF(i);
        this.LIZLLL.LJFF(i);
    }
}
