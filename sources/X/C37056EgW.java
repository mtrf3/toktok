package X;

import android.content.SharedPreferences;
import defpackage.i0;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.EgW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37056EgW {
    public static long LIZJ;
    public static C37056EgW LIZLLL;
    public final java.util.Map<String, C37061Egb> LIZ = new ConcurrentHashMap();
    public final SharedPreferences LIZIZ;

    public static C37056EgW LIZ() {
        if (LIZLLL == null) {
            synchronized (C37056EgW.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C37056EgW();
                }
            }
        }
        return LIZLLL;
    }

    public C37056EgW() {
        SharedPreferences LIZIZ = F9J.LIZIZ(C73040SlY.LJLJI, 0, "sec_config");
        this.LIZIZ = LIZIZ;
        LIZJ = LIZIZ.getLong("valid_time", 900000L);
    }

    public final C37021Efx LIZIZ(String str) {
        if (LIZJ(str)) {
            C37061Egb c37061Egb = (C37061Egb) ((ConcurrentHashMap) this.LIZ).get(str);
            if (c37061Egb != null) {
                return c37061Egb.LIZIZ;
            }
            if (str.length() > 0) {
                C37061Egb c37061Egb2 = (C37061Egb) ((ConcurrentHashMap) this.LIZ).get(str.substring(0, str.length() - 1));
                if (c37061Egb2 != null) {
                    return c37061Egb2.LIZIZ;
                }
            }
            if (str.length() > 0) {
                C37061Egb c37061Egb3 = (C37061Egb) ((ConcurrentHashMap) this.LIZ).get(i0.LJFF(str, "/"));
                if (c37061Egb3 != null) {
                    return c37061Egb3.LIZIZ;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final boolean LIZJ(String str) {
        boolean z;
        boolean LIZLLL2 = LIZLLL(str);
        if (str.length() > 0) {
            z = LIZLLL(str.substring(0, str.length() - 1));
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("/");
        boolean LIZLLL3 = LIZLLL(X1D.LIZIZ(LIZ));
        if (LIZLLL2 || z || LIZLLL3) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL(String str) {
        C37061Egb c37061Egb = (C37061Egb) ((ConcurrentHashMap) this.LIZ).get(str);
        if (c37061Egb == null) {
            return false;
        }
        if (System.currentTimeMillis() - c37061Egb.LIZ > LIZJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UrlSecLinkCache url : ");
            LIZ.append(str);
            LIZ.append(" exceed the time limit.");
            X1D.LIZIZ(LIZ);
            ((ConcurrentHashMap) this.LIZ).remove(str);
            ((ConcurrentHashMap) this.LIZ).remove(i0.LJFF(str, "/"));
            return false;
        }
        return true;
    }
}
