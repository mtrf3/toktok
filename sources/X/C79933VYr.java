package X;

/* renamed from: X.VYr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79933VYr implements InterfaceC79769VSj {
    public final /* synthetic */ C79929VYn LIZ;

    public C79933VYr(C79929VYn c79929VYn) {
        this.LIZ = c79929VYn;
    }

    @Override // X.InterfaceC79769VSj
    public final void LIZ(int i) {
        int i2;
        int i3;
        int currentItem = this.LIZ.LIZJ.getCurrentItem();
        C79929VYn c79929VYn = this.LIZ;
        int i4 = c79929VYn.LJ;
        int i5 = i + i4;
        c79929VYn.LJIIJ = i5;
        int i6 = c79929VYn.LJFF;
        if (i4 == i6) {
            i2 = c79929VYn.LJI;
            i3 = c79929VYn.LJII;
        } else {
            if (i5 == i4) {
                i2 = c79929VYn.LJI;
            } else if (i5 == i6) {
                i3 = c79929VYn.LJII;
                i2 = 1;
            } else {
                i2 = 1;
            }
            i3 = 12;
        }
        c79929VYn.LIZJ.setAdapter(new VZ1(i2, i3));
        int LIZ = this.LIZ.LIZJ.getAdapter().LIZ() - 1;
        if (currentItem > LIZ) {
            this.LIZ.LIZJ.setCurrentIndex(LIZ);
            currentItem = LIZ;
        }
        int i7 = i2 + currentItem;
        C79929VYn c79929VYn2 = this.LIZ;
        c79929VYn2.LJIIJJI = i7;
        c79929VYn2.LIZJ(i5, i7, c79929VYn2.LJIIL, false);
        this.LIZ.getClass();
    }
}
