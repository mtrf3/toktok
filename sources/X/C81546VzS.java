package X;

/* renamed from: X.VzS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81546VzS implements GHB {
    public final /* synthetic */ C81544VzQ LJLIL;

    public C81546VzS(C81544VzQ c81544VzQ) {
        this.LJLIL = c81544VzQ;
    }

    @Override // X.GHB
    public final boolean onBackPressed() {
        C81544VzQ c81544VzQ = this.LJLIL;
        C81400Vx6 c81400Vx6 = c81544VzQ.LLD;
        if (c81400Vx6 != null) {
            c81400Vx6.LIZLLL();
        }
        c81544VzQ.LLJILJILJ().show(false);
        C78923UyF.LJIILLIIL(c81544VzQ).LLJJL(c81544VzQ.LLFF);
        return true;
    }
}
