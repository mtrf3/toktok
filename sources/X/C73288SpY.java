package X;

/* renamed from: X.SpY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73288SpY extends AbstractC73313Spx {
    public static final C73286SpW LJLJI = new C73286SpW();
    public final C73663Svb LJLILLLLZI;

    public C73288SpY() {
        C73663Svb c73663Svb = new C73663Svb();
        this.LJLILLLLZI = c73663Svb;
        LJJIJL(UC0.LJI(c73663Svb), UC0.LJ(LJLJI), C73302Spm.LIZ(C73283SpT.LJLIL));
    }

    public final C73428Sro LLLLZ(C73284SpU c73284SpU, boolean z) {
        C73422Sri LIZ;
        C73985T1x LJJIIJZLJL;
        if (c73284SpU.getCursor() == -1 && z) {
            LJJIIJZLJL = C77117UOj.LJJIIJZLJL(this.LJLILLLLZI, LJLJI, C77118UOk.LJLIL);
            LIZ = LJJIIJZLJL.LIZ(C73329SqD.LJLIL).LIZ(c73284SpU);
        } else {
            LIZ = this.LJLILLLLZI.LIZ(c73284SpU);
        }
        return LIZ.LJJL(T16.LIZ());
    }
}
