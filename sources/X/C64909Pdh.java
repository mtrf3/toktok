package X;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* renamed from: X.Pdh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64909Pdh implements InterfaceC64917Pdp, InterfaceC64900PdY {
    public static final C64909Pdh LIZ = new C64909Pdh();

    @Override // X.InterfaceC64917Pdp
    public final void LIZLLL(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
    }

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    @Override // X.InterfaceC64900PdY
    public final void LIZ(C64901PdZ<?> c64901PdZ, C37826Esw c37826Esw) {
        C64910Pdi c64910Pdi;
        Object LIZ2 = C64904Pdc.LIZ(this, c37826Esw);
        if (!(LIZ2 instanceof C64907Pdf)) {
            LIZ2 = null;
        }
        C64907Pdf c64907Pdf = (C64907Pdf) LIZ2;
        if (c64907Pdf != null && (c64910Pdi = C64854Pco.LIZ) != null) {
            C64797Pbt<?> LIZ3 = c64901PdZ.LIZ();
            String LIZJ = c64910Pdi.LIZJ(c64907Pdf);
            if (o.LJ(LIZJ, c64910Pdi.LIZIZ)) {
                return;
            }
            if (o.LJ(LIZJ, c64910Pdi.LIZJ)) {
                c64910Pdi.LJ(c64907Pdf, LIZ3);
            } else {
                c64910Pdi.LJ(c64907Pdf, LIZ3);
                c64910Pdi.LIZ(LIZJ);
            }
        }
    }

    @Override // X.InterfaceC64917Pdp
    public final C64797Pbt<?> LIZIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        C64910Pdi c64910Pdi;
        java.util.Map<String, Object> map;
        java.util.Map<String, Object> map2;
        java.util.Map<String, Object> map3;
        if ((o.LJ("GET", c64907Pdf.LIZLLL.LIZ) || C78939UyV.LJJIJLIJ(c64907Pdf)) && (c64910Pdi = C64854Pco.LIZ) != null) {
            try {
                if ((o.LJ("GET", c64907Pdf.LIZLLL.LIZ) || C78939UyV.LJJIJLIJ(c64907Pdf)) && C78966Uyw.LJJJ(c64907Pdf, 1)) {
                    C64738Paw c64738Paw = c37826Esw.LIZIZ;
                    if (c64738Paw != null && (map3 = c64738Paw.LJJJLL) != null) {
                        ((HashMap) map3).put("biz_cache_enable", 1);
                    }
                    C64797Pbt<?> LJIIJ = LJIIJ(c64910Pdi, c64907Pdf, c37826Esw);
                    if (LJIIJ != null) {
                        C64738Paw c64738Paw2 = c37826Esw.LIZIZ;
                        if (c64738Paw2 != null && (map2 = c64738Paw2.LJJJLL) != null) {
                            ((HashMap) map2).put("biz_cache_type", 1);
                        }
                    } else {
                        C64738Paw c64738Paw3 = c37826Esw.LIZIZ;
                        if (c64738Paw3 != null && (map = c64738Paw3.LJJJLL) != null) {
                            ((HashMap) map).put("biz_cache_type", 0);
                        }
                    }
                    return LJIIJ;
                }
                return null;
            } catch (Exception unused) {
                c64910Pdi.LIZ(c64910Pdi.LIZJ(c64907Pdf));
                return null;
            }
        }
        return null;
    }

    public final C64797Pbt<?> LJIIJ(C64910Pdi c64910Pdi, C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        boolean z;
        C64797Pbt<?> c64797Pbt = null;
        if (C78966Uyw.LJJJ(c64907Pdf, 8)) {
            C64904Pdc.LIZJ(this, c37826Esw, c64907Pdf);
            return null;
        }
        String LIZJ = c64910Pdi.LIZJ(c64907Pdf);
        if (!o.LJ(LIZJ, c64910Pdi.LIZIZ)) {
            if (o.LJ(LIZJ, c64910Pdi.LIZJ)) {
                c64797Pbt = c64910Pdi.LIZLLL(c64907Pdf);
            } else {
                C64914Pdm c64914Pdm = c64910Pdi.LIZ.get(LIZJ);
                if (c64914Pdm != null) {
                    ReentrantLock reentrantLock = c64914Pdm.LIZ;
                    reentrantLock.lock();
                    try {
                        try {
                            z = c64914Pdm.LIZIZ.await(5000L, TimeUnit.MILLISECONDS);
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                            z = false;
                        }
                        if (!z) {
                            c64910Pdi.LIZ.remove(LIZJ);
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                c64797Pbt = c64910Pdi.LIZLLL(c64907Pdf);
                if (c64797Pbt == null) {
                    c64910Pdi.LIZ.put(LIZJ, new C64914Pdm());
                }
            }
        }
        if (C78966Uyw.LJJJ(c64907Pdf, 4)) {
            return c64797Pbt;
        }
        if (c64797Pbt == null) {
            C64904Pdc.LIZJ(this, c37826Esw, c64907Pdf);
        }
        return c64797Pbt;
    }
}
