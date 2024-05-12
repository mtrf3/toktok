package X;

/* renamed from: X.VYs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79934VYs implements InterfaceC79769VSj {
    public final /* synthetic */ C79929VYn LIZ;

    public C79934VYs(C79929VYn c79929VYn) {
        this.LIZ = c79929VYn;
    }

    @Override // X.InterfaceC79769VSj
    public final void LIZ(int i) {
        int i2;
        int i3;
        C79929VYn c79929VYn = this.LIZ;
        int i4 = c79929VYn.LJIIJ;
        int i5 = 1;
        if (i4 == c79929VYn.LJ) {
            i2 = c79929VYn.LJI;
        } else {
            i2 = 1;
        }
        int i6 = i2 + i;
        c79929VYn.LJIIJJI = i6;
        c79929VYn.LIZJ(i4, i6, c79929VYn.LJIIL, false);
        C79929VYn c79929VYn2 = this.LIZ;
        int i7 = c79929VYn2.LJ;
        int i8 = c79929VYn2.LJFF;
        if (i7 == i8 && c79929VYn2.LJI == c79929VYn2.LJII) {
            i5 = c79929VYn2.LJIIIIZZ;
            i3 = c79929VYn2.LJIIIZ;
        } else {
            if (i4 == i7 && i6 == c79929VYn2.LJI) {
                i5 = c79929VYn2.LJIIIIZZ;
            } else if (i4 == i8 && i6 == c79929VYn2.LJII) {
                i3 = c79929VYn2.LJIIIZ;
            }
            i3 = 31;
        }
        int LIZ = C79929VYn.LIZ(i4, i6, i3);
        C79929VYn c79929VYn3 = this.LIZ;
        c79929VYn3.LIZIZ(c79929VYn3.LIZLLL.getCurrentItem(), i5, LIZ, false);
        this.LIZ.getClass();
    }
}
