package X;

import defpackage.i0;

/* renamed from: X.QGl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66719QGl implements InterfaceC66732QGy {
    public final C66723QGp LIZ;
    public final C67649Qgn<AbstractC66729QGv> LIZIZ;

    @Override // X.InterfaceC66732QGy
    public final boolean LIZ(Exception exc) {
        this.LIZIZ.LIZJ(exc);
        return true;
    }

    @Override // X.InterfaceC66732QGy
    public final boolean LIZIZ(C66720QGm c66720QGm) {
        if (c66720QGm.LJFF() != EnumC66725QGr.REGISTERED || this.LIZ.LIZ(c66720QGm)) {
            return false;
        }
        C67649Qgn<AbstractC66729QGv> c67649Qgn = this.LIZIZ;
        C66727QGt c66727QGt = new C66727QGt();
        String str = c66720QGm.LIZLLL;
        if (str != null) {
            c66727QGt.LIZ = str;
            c66727QGt.LIZIZ = Long.valueOf(c66720QGm.LJFF);
            c66727QGt.LIZJ = Long.valueOf(c66720QGm.LJI);
            String str2 = "";
            if (c66727QGt.LIZ == null) {
                str2 = i0.LJFF("", " token");
            }
            if (c66727QGt.LIZIZ == null) {
                str2 = i0.LJFF(str2, " tokenExpirationTimestamp");
            }
            if (c66727QGt.LIZJ == null) {
                str2 = i0.LJFF(str2, " tokenCreationTimestamp");
            }
            if (str2.isEmpty()) {
                c67649Qgn.LIZIZ(new C66728QGu(c66727QGt.LIZ, c66727QGt.LIZIZ.longValue(), c66727QGt.LIZJ.longValue()));
                return true;
            }
            throw new IllegalStateException(i0.LJFF("Missing required properties:", str2));
        }
        throw new NullPointerException("Null token");
    }

    public C66719QGl(C66723QGp c66723QGp, C67649Qgn<AbstractC66729QGv> c67649Qgn) {
        this.LIZ = c66723QGp;
        this.LIZIZ = c67649Qgn;
    }
}
