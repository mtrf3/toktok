package X;

import android.text.TextUtils;
import defpackage.i0;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.It5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48027It5 {
    public static volatile long LIZ = 5000;
    public static volatile boolean LIZIZ;
    public static InterfaceC48026It4 LJ;
    public static final java.util.Map<String, Integer> LIZJ = new HashMap();
    public static java.util.Map<String, Integer> LIZLLL = new HashMap();
    public static final java.util.Map<String, C48028It6> LJFF = new HashMap();

    public static void LIZJ() {
        if (!LIZIZ) {
            return;
        }
        java.util.Map<String, C48028It6> map = LJFF;
        if (((HashMap) map).size() > 0) {
            for (C48028It6 c48028It6 : ((HashMap) map).values()) {
                c48028It6.LJFF = 2;
                c48028It6.LJII = 2;
                c48028It6.LJI = System.currentTimeMillis() - c48028It6.LJ;
                LJI(c48028It6);
            }
            ((HashMap) LJFF).clear();
        }
    }

    public static void LJFF(C48028It6 c48028It6) {
        String str;
        String str2;
        if (!LIZIZ) {
            return;
        }
        LJI(c48028It6);
        if (TextUtils.isEmpty(c48028It6.LIZIZ)) {
            str = c48028It6.LIZ;
        } else {
            str = c48028It6.LIZIZ;
        }
        HashMap hashMap = (HashMap) LJFF;
        hashMap.remove(str);
        if (hashMap.size() > 0) {
            for (C48028It6 c48028It62 : hashMap.values()) {
                if (System.currentTimeMillis() - c48028It62.LJ > LIZ) {
                    c48028It62.LJFF = 3;
                    c48028It62.LJI = System.currentTimeMillis() - c48028It62.LJ;
                    LJI(c48028It6);
                    if (TextUtils.isEmpty(c48028It62.LIZIZ)) {
                        str2 = c48028It62.LIZ;
                    } else {
                        str2 = c48028It62.LIZIZ;
                    }
                    ((HashMap) LJFF).remove(str2);
                }
            }
        }
    }

    public static void LJI(C48028It6 c48028It6) {
        if (LJ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(WM7.SCENE_SERVICE, c48028It6.LIZ);
                jSONObject.put("sub_scene", c48028It6.LIZIZ);
                jSONObject.put("duration", c48028It6.LJI);
                jSONObject.put("status", c48028It6.LJFF);
                jSONObject.put("is_first", c48028It6.LIZJ);
                int i = c48028It6.LIZLLL;
                if (i >= 0) {
                    jSONObject.put("pull_type", i);
                }
                int i2 = c48028It6.LJII;
                if (i2 >= 0) {
                    jSONObject.put("reason", i2);
                }
                if (c48028It6.LJIIIIZZ >= 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", c48028It6.LJIIIIZZ);
                    jSONObject.put("net_info", jSONObject2);
                }
                JSONObject jSONObject3 = c48028It6.LJIIIZ;
                if (jSONObject3 != null) {
                    jSONObject.put("scene_info", jSONObject3);
                }
                LJ.LIZ(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean LIZ(String str, String str2) {
        String LJFF2 = i0.LJFF(str, str2);
        Integer num = LIZLLL.get(LJFF2);
        if (num == null || num.intValue() <= 0) {
            return true;
        }
        HashMap hashMap = (HashMap) LIZJ;
        Integer num2 = (Integer) hashMap.get(LJFF2);
        if (num2 == null) {
            num2 = 0;
        }
        Integer valueOf = Integer.valueOf(num2.intValue() + 1);
        hashMap.put(LJFF2, valueOf);
        if (valueOf.intValue() <= num.intValue()) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(String str, String str2) {
        if (!LIZIZ) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        C48028It6 c48028It6 = (C48028It6) ((HashMap) LJFF).get(str);
        if (c48028It6 == null) {
            return;
        }
        c48028It6.LJFF = 2;
        c48028It6.LJI = System.currentTimeMillis() - c48028It6.LJ;
        c48028It6.LJII = 1;
        c48028It6.LJIIIZ = null;
        LJFF(c48028It6);
    }

    public static void LJ(String str, String str2) {
        if (!LIZIZ) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        C48028It6 c48028It6 = (C48028It6) ((HashMap) LJFF).get(str);
        if (c48028It6 == null) {
            return;
        }
        c48028It6.LJFF = 0;
        c48028It6.LJI = System.currentTimeMillis() - c48028It6.LJ;
        c48028It6.LJIIIZ = null;
        LJFF(c48028It6);
    }

    public static void LJIIIIZZ(String str, String str2) {
        String str3;
        if (!LIZIZ || !LIZ(str, str2)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str3 = str;
        } else {
            str3 = str2;
        }
        HashMap hashMap = (HashMap) LJFF;
        if (hashMap.get(str3) == null) {
            C48028It6 c48028It6 = new C48028It6();
            c48028It6.LIZ = str;
            c48028It6.LIZIZ = str2;
            c48028It6.LJ = System.currentTimeMillis();
            hashMap.put(str3, c48028It6);
        }
    }

    public static void LIZIZ(int i, String str, String str2) {
        if (!LIZIZ) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        C48028It6 c48028It6 = (C48028It6) ((HashMap) LJFF).get(str);
        if (c48028It6 == null) {
            return;
        }
        c48028It6.LJI = System.currentTimeMillis() - c48028It6.LJ;
        c48028It6.LJFF = 1;
        c48028It6.LJII = 1;
        c48028It6.LJIIIIZZ = i;
        c48028It6.LJIIIZ = null;
        LJFF(c48028It6);
    }

    public static void LJII(int i, String str, String str2) {
        String str3;
        if (!LIZIZ || !LIZ(str, str2)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str3 = str;
        } else {
            str3 = str2;
        }
        HashMap hashMap = (HashMap) LJFF;
        if (hashMap.get(str3) == null) {
            C48028It6 c48028It6 = new C48028It6();
            c48028It6.LIZ = str;
            c48028It6.LIZIZ = str2;
            c48028It6.LIZLLL = -1;
            c48028It6.LIZJ = i;
            c48028It6.LJ = System.currentTimeMillis();
            hashMap.put(str3, c48028It6);
        }
    }
}
