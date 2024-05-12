package X;

/* renamed from: X.PGg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64166PGg {
    public String LIZ;
    public C64166PGg LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public final /* synthetic */ C64162PGc LJII;

    public C64166PGg(C64162PGc c64162PGc) {
        this.LJII = c64162PGc;
    }

    public final void LIZ(long j, C65548Po0<C64167PGh> c65548Po0, C65548Po0<C64167PGh> c65548Po02) {
        int i;
        long j2 = this.LIZJ + j;
        this.LIZJ = j2;
        int i2 = this.LJ + 1;
        this.LJ = i2;
        C64166PGg c64166PGg = this.LIZIZ;
        if (c64166PGg != null && i2 == (i = this.LIZLLL)) {
            if (this.LJI) {
                c64166PGg.LJI = true;
            }
            C64162PGc c64162PGc = this.LJII;
            if (j2 >= c64162PGc.LJIIIZ.LIZJ && !this.LJI) {
                if (j2 >= 0 && j2 <= 17179869184L) {
                    c65548Po02.LIZ(new C64167PGh(c64162PGc, this.LIZ, j2, i));
                }
                this.LIZIZ.LJI = true;
            }
            this.LIZIZ.LIZ(this.LIZJ, c65548Po0, c65548Po02);
            if (this.LJFF) {
                C64162PGc c64162PGc2 = this.LJII;
                long j3 = this.LIZJ;
                c64162PGc2.getClass();
                if (j3 >= 104857600 && j3 <= 17179869184L) {
                    C64162PGc c64162PGc3 = this.LJII;
                    String str = this.LIZ;
                    long j4 = this.LIZJ;
                    int i3 = this.LIZLLL;
                    c65548Po0.LIZ(new C64168PGi(c64162PGc3, str, j4, i3, i3));
                }
            }
        }
    }
}
