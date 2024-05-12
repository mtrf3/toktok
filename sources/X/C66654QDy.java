package X;

import java.util.Date;

/* renamed from: X.QDy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66654QDy extends QE1 {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final long LJIIL;
    public final boolean LJIILIIL;
    public final Long LJIILJJIL;
    public final Long LJIILL;
    public final Long LJIILLIIL;
    public final Long LJIIZILJ;
    public final String LJIJ;
    public final Long LJIJI;
    public final Long LJIJJ;
    public final String LJIJJLI;
    public final String LJIL;
    public final long LJJ;

    @Override // X.QE1
    public final Date LIZ() {
        return LIZIZ(this.LIZ);
    }

    public static Date LIZIZ(long j) {
        if (j != -1) {
            return new Date(j);
        }
        return null;
    }

    public C66654QDy(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, long j16, String str, long j17, long j18, String str2, String str3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
        this.LJFF = j6;
        this.LJI = j7;
        this.LJII = j8;
        this.LJIIIIZZ = j9;
        this.LJIIIZ = j10;
        this.LJIIJ = j11;
        this.LJIIJJI = j12;
        this.LJIIL = j13;
        this.LJIILIIL = z;
        this.LJIILLIIL = Long.valueOf(j14);
        this.LJIIZILJ = Long.valueOf(j15);
        this.LJJ = j16;
        this.LJIJ = str;
        this.LJIJI = Long.valueOf(j17);
        this.LJIJJ = Long.valueOf(j18);
        if (j12 != -1 && j9 != -1) {
            this.LJIILJJIL = Long.valueOf(j12 - j9);
        } else {
            this.LJIILJJIL = null;
        }
        if (j != -1 && j13 != -1) {
            this.LJIILL = Long.valueOf(j13 - j);
        } else {
            this.LJIILL = null;
        }
        this.LJIJJLI = str2;
        this.LJIL = str3;
    }
}
