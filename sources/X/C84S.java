package X;

import android.text.TextUtils;
import defpackage.a1;
import java.util.HashMap;

/* renamed from: X.84S, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84S {
    public static final HashMap<String, Boolean> LIZ = new HashMap<>();

    static {
        new HashMap();
        new HashMap();
        new HashMap();
    }

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty("aweme_app") || TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }

    public static String LIZJ(String str) {
        return a1.LJ("aweme_app", "-", str);
    }

    public static boolean LIZIZ(String str, boolean z) {
        if (LIZ(str)) {
            return z;
        }
        String LIZJ = LIZJ(str);
        HashMap<String, Boolean> hashMap = LIZ;
        if (hashMap.containsKey(LIZJ)) {
            return hashMap.get(LIZJ).booleanValue();
        }
        return F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme_app").getBoolean(str, z);
    }

    public static void LIZLLL(String str, boolean z) {
        F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme_app").edit().putBoolean(str, z).apply();
        LIZ.put(LIZJ(str), Boolean.valueOf(z));
    }
}
