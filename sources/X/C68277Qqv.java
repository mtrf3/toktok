package X;

/* renamed from: X.Qqv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68277Qqv {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final Long LJII;
    public final Long LJIIIIZZ;
    public final Long LJIIIZ;
    public final Boolean LJIIJ;

    public final C68277Qqv LIZIZ(long j, long j2) {
        return new C68277Qqv(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, j, Long.valueOf(j2), this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ);
    }

    public final C68277Qqv LIZ(Long l, Long l2, Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null && !bool2.booleanValue()) {
            bool2 = null;
        }
        return new C68277Qqv(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, l, l2, bool2);
    }

    public C68277Qqv(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        QH7.LJI(str);
        QH7.LJI(str2);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        QH7.LIZIZ(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        QH7.LIZIZ(z2);
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        QH7.LIZIZ(z3);
        QH7.LIZIZ(j5 >= 0);
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = j5;
        this.LJII = l;
        this.LJIIIIZZ = l2;
        this.LJIIIZ = l3;
        this.LJIIJ = bool;
    }
}
