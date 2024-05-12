package X;

/* renamed from: X.PVd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64553PVd {
    public final C64606PXe LIZ;
    public final PVP LIZIZ;

    public C64553PVd(C64606PXe c64606PXe, PVP pvp) {
        this.LIZ = c64606PXe;
        this.LIZIZ = pvp;
    }

    public static C64553PVd LIZ(C64606PXe c64606PXe, PVP pvp) {
        if (pvp != null) {
            if (c64606PXe != null) {
                if (c64606PXe.LIZLLL("Content-Type") == null) {
                    if (c64606PXe.LIZLLL("Content-Length") != null) {
                        throw new IllegalArgumentException("Unexpected header: Content-Length");
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
            }
            return new C64553PVd(c64606PXe, pvp);
        }
        throw new NullPointerException("body == null");
    }

    public static C64553PVd LIZIZ(String str, String str2, PVP pvp) {
        if (str != null) {
            StringBuilder sb = new StringBuilder("form-data; name=");
            C64551PVb.LJFF(str, sb);
            if (str2 != null) {
                sb.append("; filename=");
                C64551PVb.LJFF(str2, sb);
            }
            C64605PXd c64605PXd = new C64605PXd();
            String sb2 = sb.toString();
            C64606PXe.LIZIZ("Content-Disposition");
            c64605PXd.LIZIZ("Content-Disposition", sb2);
            return LIZ(new C64606PXe(c64605PXd), pvp);
        }
        throw new NullPointerException("name == null");
    }
}
