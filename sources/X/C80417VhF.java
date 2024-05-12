package X;

/* renamed from: X.VhF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80417VhF {
    public UCH LIZ;
    public UCH LIZIZ;
    public UCH LIZJ;
    public UCH LIZLLL;
    public InterfaceC80336Vfw LJ;
    public InterfaceC80336Vfw LJFF;
    public InterfaceC80336Vfw LJI;
    public InterfaceC80336Vfw LJII;
    public final C80434VhW LJIIIIZZ;
    public final C80434VhW LJIIIZ;
    public final C80434VhW LJIIJ;
    public final C80434VhW LJIIJJI;

    public final C80416VhE LIZ() {
        return new C80416VhE(this);
    }

    public C80417VhF() {
        this.LIZ = new V1D();
        this.LIZIZ = new V1D();
        this.LIZJ = new V1D();
        this.LIZLLL = new V1D();
        this.LJ = new C80323Vfj(0.0f);
        this.LJFF = new C80323Vfj(0.0f);
        this.LJI = new C80323Vfj(0.0f);
        this.LJII = new C80323Vfj(0.0f);
        this.LJIIIIZZ = new C80434VhW();
        this.LJIIIZ = new C80434VhW();
        this.LJIIJ = new C80434VhW();
        this.LJIIJJI = new C80434VhW();
    }

    public C80417VhF(C80416VhE c80416VhE) {
        this.LIZ = new V1D();
        this.LIZIZ = new V1D();
        this.LIZJ = new V1D();
        this.LIZLLL = new V1D();
        this.LJ = new C80323Vfj(0.0f);
        this.LJFF = new C80323Vfj(0.0f);
        this.LJI = new C80323Vfj(0.0f);
        this.LJII = new C80323Vfj(0.0f);
        this.LJIIIIZZ = new C80434VhW();
        this.LJIIIZ = new C80434VhW();
        this.LJIIJ = new C80434VhW();
        this.LJIIJJI = new C80434VhW();
        this.LIZ = c80416VhE.LIZ;
        this.LIZIZ = c80416VhE.LIZIZ;
        this.LIZJ = c80416VhE.LIZJ;
        this.LIZLLL = c80416VhE.LIZLLL;
        this.LJ = c80416VhE.LJ;
        this.LJFF = c80416VhE.LJFF;
        this.LJI = c80416VhE.LJI;
        this.LJII = c80416VhE.LJII;
        this.LJIIIIZZ = c80416VhE.LJIIIIZZ;
        this.LJIIIZ = c80416VhE.LJIIIZ;
        this.LJIIJ = c80416VhE.LJIIJ;
        this.LJIIJJI = c80416VhE.LJIIJJI;
    }

    public static float LIZIZ(UCH uch) {
        if (uch instanceof V1D) {
            return ((V1D) uch).LJLJL;
        }
        if (uch instanceof V1C) {
            return ((V1C) uch).LJLJL;
        }
        return -1.0f;
    }
}
