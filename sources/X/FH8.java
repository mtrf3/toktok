package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class FH8 {
    public static volatile m LIZ;

    public static void LJIIIIZZ(m mVar) {
        Iterator<String> it = mVar.LIZJ().LJJIZ().iterator();
        java.util.Map<String, ConfigItem> map = KUZ.LIZ;
        while (it.hasNext()) {
            String next = it.next();
            if (map != null && ((HashMap) map).containsKey(next)) {
                it.remove();
            }
        }
        FH3 fh3 = FH3.LIZLLL;
        synchronized (fh3) {
            try {
                fh3.LIZ.LIZIZ("key_unregistered_config", "{}");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static void LIZ(m mVar, String str) {
        boolean z;
        try {
            p LJJIJL = mVar.LJJIJL(str);
            if (LJJIJL != null) {
                if (LJJIJL.LJLIL instanceof Number) {
                    FHE fhe = FHE.LIZLLL;
                    if (LJJIJL.LJIILJJIL() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fhe.LJIIJJI(str, z);
                } else {
                    FHE.LIZLLL.LJIIJJI(str, LJJIJL.LJFF());
                }
            } else {
                FHE.LIZLLL.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LIZIZ(m mVar, String str) {
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if (LJJIJ != null) {
                FHE.LIZLLL.LJIIL(str, LJJIJ.toString());
            } else if (mVar.LJJIJLIJ(str)) {
                FHE.LIZLLL.LJIIL(str, null);
            } else {
                FHE.LIZLLL.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LIZJ(m mVar, String str) {
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if (LJJIJ != null) {
                FHE fhe = FHE.LIZLLL;
                fhe.LJIIIZ().LJ(str, LJJIJ.LJIIIZ());
            } else {
                FHE.LIZLLL.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LIZLLL(m mVar, String str) {
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if (LJJIJ != null) {
                FHE fhe = FHE.LIZLLL;
                fhe.LJIIIZ().LJII(str, LJJIJ.LJIIJ());
            } else {
                FHE.LIZLLL.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LJ(m mVar, String str) {
        int i;
        try {
            p LJJIJL = mVar.LJJIJL(str);
            if (LJJIJL != null) {
                if (LJJIJL.LJLIL instanceof Boolean) {
                    FHE fhe = FHE.LIZLLL;
                    if (LJJIJL.LJFF()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    fhe.LJIIIZ().LIZLLL(str, i);
                } else {
                    FHE fhe2 = FHE.LIZLLL;
                    fhe2.LJIIIZ().LIZLLL(str, LJJIJL.LJIILJJIL());
                }
            } else {
                FHE.LIZLLL.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LJFF(m mVar, String str) {
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if (LJJIJ != null) {
                FHE fhe = FHE.LIZLLL;
                fhe.LJIIIZ().LIZJ(str, LJJIJ.LJIJJLI());
            } else {
                FHE.LIZLLL.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LJI(m mVar, String str) {
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if (LJJIJ != null) {
                FHE fhe = FHE.LIZLLL;
                fhe.LJIIIZ().LJIIIZ(str, (String[]) fhe.LJIIJ().LIZJ(LJJIJ, String[].class));
            } else if (mVar.LJJIJLIJ(str)) {
                FHE.LIZLLL.LJIIIZ().LJIIIZ(str, null);
            } else {
                FHE.LIZLLL.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LJII(m mVar, String str) {
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if (LJJIJ != null) {
                FHE.LIZLLL.LJIIL(str, LJJIJ.LJJIFFI());
            } else if (mVar.LJJIJLIJ(str)) {
                FHE.LIZLLL.LJIIL(str, null);
            } else {
                FHE.LIZLLL.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }
}
