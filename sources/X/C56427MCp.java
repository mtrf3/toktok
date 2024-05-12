package X;

/* renamed from: X.MCp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56427MCp extends C1CZ {
    public final /* synthetic */ C56426MCo LJLIL;

    public C56427MCp(C56426MCo c56426MCo) {
        this.LJLIL = c56426MCo;
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            C56426MCo c56426MCo = this.LJLIL;
            c56426MCo.LJFF = -1;
            c56426MCo.LIZIZ = 0;
        }
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        C56426MCo c56426MCo = this.LJLIL;
        if (c56426MCo.LJFF == -1) {
            c56426MCo.LJFF = c56426MCo.LIZ.getCurrentItem();
        }
        int i3 = 1;
        if (Math.abs(f - 0.0f) < 1.0E-6f) {
            return;
        }
        C56426MCo c56426MCo2 = this.LJLIL;
        if (c56426MCo2.LJFF > i) {
            i3 = 2;
        }
        c56426MCo2.LIZIZ = i3;
    }
}
