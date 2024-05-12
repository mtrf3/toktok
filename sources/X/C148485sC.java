package X;

/* renamed from: X.5sC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C148485sC extends WI1 {
    public final int LJIIIZ;
    public VLL LJIIJ;
    public final C6MP LJIIJJI;

    @Override // X.WI1
    public WI0 LIZJ() {
        return new WI0(this.LJIIJ, this.LJIIIZ, false, 4);
    }

    public C148485sC() {
        int i;
        VLL vll;
        if (C148495sD.LIZ()) {
            i = -40;
        } else {
            i = 180;
        }
        this.LJIIIZ = i;
        if (C148495sD.LIZ()) {
            vll = VLL.FIXED;
        } else {
            vll = VLL.SLIDE;
        }
        this.LJIIJ = vll;
        this.LJIIJJI = C6MP.PRIVACY_SETTING;
    }

    @Override // X.WI1
    public final int LJFF() {
        return C1535460w.LIZ();
    }

    @Override // X.WI1
    public final int LJII() {
        return C1535460w.LIZIZ();
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIJJI;
    }
}
