package X;

/* renamed from: X.PGp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64175PGp extends PFB {
    public final /* synthetic */ C64176PGq LIZLLL;

    @Override // X.PFB
    public final void LIZ() {
        this.LIZ = false;
        C64176PGq c64176PGq = this.LIZLLL;
        c64176PGq.LJFF++;
        c64176PGq.LJI(PFB.LIZIZ, false);
        C64176PGq c64176PGq2 = this.LIZLLL;
        c64176PGq2.LJIILJJIL = c64176PGq2.LJIILL;
        c64176PGq2.LJIILL = "no message running";
        c64176PGq2.LJIJJ = false;
    }

    @Override // X.PFB
    public final boolean LIZJ() {
        return C64102PDu.LIZ(128);
    }

    public C64175PGp(C64176PGq c64176PGq) {
        this.LIZLLL = c64176PGq;
    }

    @Override // X.PFB
    public final void LIZIZ(String str) {
        this.LIZLLL.LJIJJ = true;
        this.LIZLLL.LJIILL = str;
        this.LIZ = true;
        this.LIZLLL.LJI(PFB.LIZIZ, true);
    }
}
