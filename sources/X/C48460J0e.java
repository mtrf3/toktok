package X;

import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.HashMap;

/* renamed from: X.J0e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48460J0e {
    public static SharedPreferences LIZ;
    public static final java.util.Map<String, Object> LIZIZ = new HashMap();
    public static final Gson LIZJ = C09650Zl.LIZIZ;

    public static SharedPreferences LIZ() {
        if (LIZ == null) {
            LIZ = F9J.LIZIZ(C78598Ut0.LJIIJ(), 4, "live_sdk_core");
        }
        return LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void LIZIZ(C48458J0c c48458J0c, T t) {
        if (c48458J0c == null) {
            return;
        }
        if (t == 0) {
            ((HashMap) LIZIZ).remove(c48458J0c.LIZJ);
            LIZ().edit().remove(c48458J0c.LIZJ).apply();
            return;
        }
        ((HashMap) LIZIZ).put(c48458J0c.LIZJ, t);
        Class<T> cls = c48458J0c.LJI;
        if (cls == Boolean.class) {
            LIZ().edit().putBoolean(c48458J0c.LIZJ, ((Boolean) t).booleanValue()).apply();
            return;
        }
        if (cls == Integer.class) {
            LIZ().edit().putInt(c48458J0c.LIZJ, ((Integer) t).intValue()).apply();
            return;
        }
        if (cls == Float.class) {
            LIZ().edit().putFloat(c48458J0c.LIZJ, ((Float) t).floatValue()).apply();
            return;
        }
        if (cls == Long.class) {
            LIZ().edit().putLong(c48458J0c.LIZJ, ((Long) t).longValue()).apply();
            return;
        }
        if (cls == Double.class) {
            LIZ().edit().putString(c48458J0c.LIZJ, t.toString()).apply();
        } else if (cls == String.class) {
            LIZ().edit().putString(c48458J0c.LIZJ, (String) t).apply();
        } else {
            LIZ().edit().putString(c48458J0c.LIZJ, GsonProtectorUtils.toJson(LIZJ, t)).apply();
        }
    }
}
