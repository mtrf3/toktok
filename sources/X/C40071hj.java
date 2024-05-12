package X;

/* renamed from: X.1hj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40071hj extends C1AD {
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public final AnonymousClass168 LJIIJJI = new AnonymousClass168();
    public AnonymousClass169 LJIIL = null;

    @Override // X.C1AD, X.InterfaceC018505l
    public final void LIZIZ() {
        for (int i = 0; i < this.LIZIZ; i++) {
            C018205i c018205i = this.LIZ[i];
            if (c018205i != null) {
                c018205i.mInVirtuaLayout = true;
            }
        }
    }

    public void LJ(int i, int i2, int i3, int i4) {
    }

    public final void LJFF(C018205i c018205i, EnumC018105h enumC018105h, int i, EnumC018105h enumC018105h2, int i2) {
        AnonymousClass169 anonymousClass169;
        C018205i c018205i2;
        while (true) {
            anonymousClass169 = this.LJIIL;
            if (anonymousClass169 != null || (c018205i2 = this.mParent) == null) {
                break;
            } else {
                this.LJIIL = ((C40061hi) c018205i2).LIZLLL;
            }
        }
        AnonymousClass168 anonymousClass168 = this.LJIIJJI;
        anonymousClass168.LIZ = enumC018105h;
        anonymousClass168.LIZIZ = enumC018105h2;
        anonymousClass168.LIZJ = i;
        anonymousClass168.LIZLLL = i2;
        ((C1AG) anonymousClass169).LIZIZ(c018205i, anonymousClass168);
        c018205i.setWidth(this.LJIIJJI.LJ);
        c018205i.setHeight(this.LJIIJJI.LJFF);
        AnonymousClass168 anonymousClass1682 = this.LJIIJJI;
        c018205i.hasBaseline = anonymousClass1682.LJII;
        c018205i.setBaselineDistance(anonymousClass1682.LJI);
    }
}
