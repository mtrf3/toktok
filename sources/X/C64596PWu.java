package X;

import okhttp3.Request;

/* renamed from: X.PWu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64596PWu implements InterfaceC48121Iub {
    public static boolean LIZ(String str) {
        if ("Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static C64598PWw LIZJ(C64598PWw c64598PWw) {
        if (c64598PWw != null && c64598PWw.LJLJL != null) {
            C64597PWv c64597PWv = new C64597PWv(c64598PWw);
            c64597PWv.LJI = null;
            return c64597PWv.LIZ();
        }
        return c64598PWw;
    }

    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        System.currentTimeMillis();
        PW8 pw8 = (PW8) pxz;
        Request request = pw8.LJFF;
        PX7 px7 = new PX7(request, null);
        if (request != null && request.cacheControl().LJIIIZ) {
            px7 = new PX7(null, null);
        }
        Request request2 = px7.LIZ;
        C64598PWw c64598PWw = px7.LIZIZ;
        if (request2 == null && c64598PWw == null) {
            C64597PWv c64597PWv = new C64597PWv();
            c64597PWv.LIZ = pw8.LJFF;
            c64597PWv.LIZIZ = EnumC64572PVw.HTTP_1_1;
            c64597PWv.LIZJ = 504;
            c64597PWv.LIZLLL = "Unsatisfiable Request (only-if-cached)";
            c64597PWv.LJI = PVA.LIZJ;
            c64597PWv.LJIIJ = -1L;
            c64597PWv.LJIIJJI = System.currentTimeMillis();
            return c64597PWv.LIZ();
        }
        if (request2 == null) {
            c64598PWw.getClass();
            C64597PWv c64597PWv2 = new C64597PWv(c64598PWw);
            C64598PWw LIZJ = LIZJ(c64598PWw);
            if (LIZJ != null) {
                C64597PWv.LIZIZ("cacheResponse", LIZJ);
            }
            c64597PWv2.LJIIIIZZ = LIZJ;
            return c64597PWv2.LIZ();
        }
        C64598PWw LIZ = ((PW8) pxz).LIZ(request2);
        if (c64598PWw != null) {
            if (LIZ.LJLJI == 304) {
                C64597PWv c64597PWv3 = new C64597PWv(c64598PWw);
                C64606PXe c64606PXe = c64598PWw.LJLJJLL;
                C64606PXe c64606PXe2 = LIZ.LJLJJLL;
                C64605PXd c64605PXd = new C64605PXd();
                int length = c64606PXe.LIZ.length / 2;
                for (int i = 0; i < length; i++) {
                    String LJ = c64606PXe.LJ(i);
                    String LJIIJ = c64606PXe.LJIIJ(i);
                    if ((!"Warning".equalsIgnoreCase(LJ) || !LJIIJ.startsWith("1")) && (LIZ(LJ) || !LIZIZ(LJ) || c64606PXe2.LIZLLL(LJ) == null)) {
                        AbstractC64554PVe.LIZ.getClass();
                        c64605PXd.LIZIZ(LJ, LJIIJ);
                    }
                }
                int length2 = c64606PXe2.LIZ.length / 2;
                for (int i2 = 0; i2 < length2; i2++) {
                    String LJ2 = c64606PXe2.LJ(i2);
                    if (!LIZ(LJ2) && LIZIZ(LJ2)) {
                        C64586PWk c64586PWk = AbstractC64554PVe.LIZ;
                        String LJIIJ2 = c64606PXe2.LJIIJ(i2);
                        c64586PWk.getClass();
                        c64605PXd.LIZIZ(LJ2, LJIIJ2);
                    }
                }
                c64597PWv3.LJFF = new C64606PXe(c64605PXd).LJI();
                c64597PWv3.LJIIJ = LIZ.LJLLI;
                c64597PWv3.LJIIJJI = LIZ.LJLLILLLL;
                C64598PWw LIZJ2 = LIZJ(c64598PWw);
                if (LIZJ2 != null) {
                    C64597PWv.LIZIZ("cacheResponse", LIZJ2);
                }
                c64597PWv3.LJIIIIZZ = LIZJ2;
                C64598PWw LIZJ3 = LIZJ(LIZ);
                if (LIZJ3 != null) {
                    C64597PWv.LIZIZ("networkResponse", LIZJ3);
                }
                c64597PWv3.LJII = LIZJ3;
                c64597PWv3.LIZ();
                LIZ.LJLJL.close();
                throw null;
            }
            PVA.LJ(c64598PWw.LJLJL);
        }
        LIZ.getClass();
        C64597PWv c64597PWv4 = new C64597PWv(LIZ);
        C64598PWw LIZJ4 = LIZJ(c64598PWw);
        if (LIZJ4 != null) {
            C64597PWv.LIZIZ("cacheResponse", LIZJ4);
        }
        c64597PWv4.LJIIIIZZ = LIZJ4;
        C64598PWw LIZJ5 = LIZJ(LIZ);
        if (LIZJ5 != null) {
            C64597PWv.LIZIZ("networkResponse", LIZJ5);
        }
        c64597PWv4.LJII = LIZJ5;
        return c64597PWv4.LIZ();
    }
}
