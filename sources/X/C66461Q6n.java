package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.Q6n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66461Q6n {
    public static final java.util.Map<String, C66461Q6n> LIZIZ = new HashMap();
    public final SharedPreferences LIZ;

    public static C66461Q6n LIZLLL() {
        return LJ("safe_mode_config_sp");
    }

    public C66461Q6n(String str) {
        this.LIZ = F9J.LIZIZ(C66460Q6m.LIZIZ().LJ, 0, str);
    }

    public static C66461Q6n LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "safe_mode_config_sp";
        }
        java.util.Map<String, C66461Q6n> map = LIZIZ;
        C66461Q6n c66461Q6n = (C66461Q6n) ((HashMap) map).get(str);
        if (c66461Q6n == null) {
            synchronized (C66461Q6n.class) {
                c66461Q6n = (C66461Q6n) ((HashMap) map).get(str);
                if (c66461Q6n == null) {
                    c66461Q6n = new C66461Q6n(str);
                    ((HashMap) map).put(str, c66461Q6n);
                }
            }
        }
        return c66461Q6n;
    }

    public final int LIZ(int i, String str) {
        return this.LIZ.getInt(str, i);
    }

    public final long LIZIZ(long j, String str) {
        return this.LIZ.getLong(str, j);
    }

    public final String LIZJ(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }

    public final void LJFF(int i, String str) {
        this.LIZ.edit().putInt(str, i).apply();
    }

    public final void LJI(long j, String str) {
        this.LIZ.edit().putLong(str, j).apply();
    }

    public final void LJII(String str, String str2) {
        this.LIZ.edit().putString(str, str2).apply();
    }
}
