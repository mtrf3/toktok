package X;

import defpackage.i0;

/* renamed from: X.QGn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66721QGn extends QH0 {
    public String LIZ;
    public EnumC66725QGr LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public Long LJ;
    public Long LJFF;
    public String LJI;

    public final C66720QGm LIZ() {
        String str = "";
        if (this.LIZIZ == null) {
            str = i0.LJFF("", " registrationStatus");
        }
        if (this.LJ == null) {
            str = i0.LJFF(str, " expiresInSecs");
        }
        if (this.LJFF == null) {
            str = i0.LJFF(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new C66720QGm(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ.longValue(), this.LJFF.longValue(), this.LJI);
        }
        throw new IllegalStateException(i0.LJFF("Missing required properties:", str));
    }

    public C66721QGn() {
    }

    public C66721QGn(AbstractC66722QGo abstractC66722QGo) {
        this.LIZ = abstractC66722QGo.LIZJ();
        this.LIZIZ = abstractC66722QGo.LJFF();
        this.LIZJ = abstractC66722QGo.LIZ();
        this.LIZLLL = abstractC66722QGo.LJ();
        this.LJ = Long.valueOf(abstractC66722QGo.LIZIZ());
        this.LJFF = Long.valueOf(abstractC66722QGo.LJI());
        this.LJI = abstractC66722QGo.LIZLLL();
    }

    public final C66721QGn LIZIZ(EnumC66725QGr enumC66725QGr) {
        if (enumC66725QGr != null) {
            this.LIZIZ = enumC66725QGr;
            return this;
        }
        throw new NullPointerException("Null registrationStatus");
    }
}
