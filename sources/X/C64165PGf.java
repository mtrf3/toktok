package X;

import android.text.TextUtils;

/* renamed from: X.PGf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64165PGf {
    public String LIZ;
    public C64165PGf LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public long LJI;
    public boolean LJII;
    public final /* synthetic */ C64160PGa LJIIIIZZ;

    public C64165PGf(C64160PGa c64160PGa) {
        this.LJIIIIZZ = c64160PGa;
    }

    public final void LIZ(long j) {
        int i;
        long j2 = this.LIZJ + j;
        this.LIZJ = j2;
        int i2 = this.LJ + 1;
        this.LJ = i2;
        C64165PGf c64165PGf = this.LIZIZ;
        if (c64165PGf != null && i2 == (i = this.LIZLLL)) {
            if (this.LJII) {
                c64165PGf.LJII = true;
            }
            C64160PGa c64160PGa = this.LJIIIIZZ;
            if (j2 >= c64160PGa.LJLL && !this.LJII) {
                String str = this.LIZ;
                c64160PGa.getClass();
                if (j2 <= 17179869184L) {
                    if (c64160PGa.LLFII == null) {
                        c64160PGa.LLFII = new C65548Po0<>(c64160PGa.LJLLI);
                    }
                    c64160PGa.LLFII.LIZ(new C64169PGj(i, j2, str));
                }
                this.LIZIZ.LJII = true;
            }
            this.LIZIZ.LIZ(this.LIZJ);
            if (this.LJFF) {
                this.LJIIIIZZ.LJIILL(this.LIZLLL, this.LIZJ, this.LJI, this.LIZ);
            }
            if (TextUtils.equals(this.LIZ, C64160PGa.LLI)) {
                this.LJIIIIZZ.LJLLLL = this.LIZJ;
                return;
            }
            if (TextUtils.equals(this.LIZ, C64160PGa.LLIFFJFJJ)) {
                this.LJIIIIZZ.LJLLLLLL = this.LIZJ;
            } else if (TextUtils.equals(this.LIZ, this.LJIIIIZZ.LJLLJ)) {
                this.LJIIIIZZ.LJLZ = this.LIZJ;
            } else {
                if (!TextUtils.equals(this.LIZ, this.LJIIIIZZ.LJLLL)) {
                    return;
                }
                this.LJIIIIZZ.LJZ = this.LIZJ;
            }
        }
    }
}
