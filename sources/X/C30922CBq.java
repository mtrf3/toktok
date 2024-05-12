package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.SettingUtilANROptSetting;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.m;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CBq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30922CBq {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static JSONObject LIZJ;
    public static final java.util.Map<String, Object> LIZLLL = new ConcurrentHashMap();
    public static volatile boolean LJ = false;
    public static final Object LJFF = new Object();
    public static long LJI = 50;
    public static final Keva LJII;
    public static m LJIIIIZZ;
    public static boolean LJIIIZ;
    public static final C36701Ean LJIIJ;

    static {
        Keva repoSync = KevaImpl.getRepoSync("setting_from_server", 0);
        LJII = repoSync;
        LJIIIZ = false;
        LJIIJ = new C36701Ean(repoSync);
    }

    public static JSONObject LIZ() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        synchronized (LJFF) {
            try {
                if (LJ || (jSONObject2 = LIZJ) == null || jSONObject2.length() == 0) {
                    LIZJ = new JSONObject(LJII.getString("setting_key", ""));
                    ((ConcurrentHashMap) LIZLLL).clear();
                    LJI = LIZJ.optLong("live_setting_sample_rate", 50L);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("live_setting_sample_rate is: ");
                    LIZ2.append(LJI);
                    C0NB.LJIIIZ("Live-Settings", X1D.LIZIZ(LIZ2));
                    LJ = false;
                }
                jSONObject = LIZJ;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }
        return jSONObject;
    }

    public static Object LIZIZ(String str) {
        JSONObject LIZ2;
        if (SettingUtilANROptSetting.enableOpt()) {
            LIZ2 = LJIIJ.LIZIZ(str);
        } else {
            LIZ2 = LIZ();
        }
        Object opt = LIZ2.opt(str);
        if (opt != null) {
            return opt;
        }
        Object valueByKey = SettingsManager.INSTANCE.getValueByKey(str);
        if (!(valueByKey instanceof String)) {
            return valueByKey;
        }
        String str2 = (String) valueByKey;
        try {
            return new JSONObject(str2);
        } catch (JSONException unused) {
            return str2;
        }
    }

    public static <T> T LIZJ(String str, T t) {
        T t2;
        try {
            if (LIZIZ) {
                t2 = SettingsManager.INSTANCE.getMockValueByKey(str);
            } else {
                t2 = null;
            }
            java.util.Map<String, Object> map = LIZLLL;
            T t3 = (T) ((ConcurrentHashMap) map).get(str);
            if (t3 != null) {
                return t3;
            }
            if (t2 == null) {
                t2 = (T) LIZLLL(str, t, t.getClass());
            }
            if (t2 == null) {
                t2 = t;
            }
            ((ConcurrentHashMap) map).put(str, t2);
            return (T) t2;
        } catch (Exception e) {
            if (!LIZIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("SettingUtil#getValue exception:");
                LIZ2.append(e.getMessage());
                LIZ2.append(", setting: ");
                LIZ2.append(str);
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                HashMap hashMap = new HashMap();
                hashMap.put("exception", LIZIZ2);
                C0K2.LJII(0, "ttlive_settings_manager_monitor", hashMap);
                return t;
            }
            throw e;
        }
    }

    public static void LJFF(List list, m mVar) {
        if (LJIIIZ) {
            return;
        }
        if (mVar != null) {
            LJIIIIZZ = mVar;
        } else {
            mVar = LJIIIIZZ;
        }
        if (list.isEmpty()) {
            LJIIJ.LJ(list, mVar);
            return;
        }
        LJIIJ.LJ(list, mVar);
        ((ConcurrentHashMap) LIZLLL).clear();
        LJIIIIZZ = null;
        LJIIIZ = true;
    }

    public static Object LIZLLL(String str, Object obj, Type type) {
        if (SettingUtilANROptSetting.enableOpt()) {
            JSONObject LIZIZ2 = LJIIJ.LIZIZ(str);
            if (LIZIZ2.has(str)) {
                return LJ(LIZIZ2, str, type, obj);
            }
            if (type == Boolean.class) {
                return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValueWithoutCache(str, ((Boolean) obj).booleanValue()));
            }
            if (type == Integer.class || type == Short.class) {
                return Integer.valueOf(SettingsManager.INSTANCE.getIntValueWithoutCache(str, ((Integer) obj).intValue()));
            }
            if (type == Float.class) {
                return Float.valueOf(SettingsManager.INSTANCE.getFloatValueWithoutCache(str, ((Float) obj).floatValue()));
            }
            if (type == Long.class) {
                return Long.valueOf(SettingsManager.INSTANCE.getLongValueWithoutCache(str, ((Long) obj).longValue()));
            }
            if (type == Double.class) {
                return Double.valueOf(SettingsManager.INSTANCE.getDoubleValueWithoutCache(str, ((Double) obj).doubleValue()));
            }
            if (type == String.class) {
                return SettingsManager.INSTANCE.getStringValueWithoutCache(str, (String) obj);
            }
            String stringValueWithoutCache = SettingsManager.INSTANCE.getStringValueWithoutCache(str, null);
            if (stringValueWithoutCache == null) {
                return obj;
            }
            return GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, stringValueWithoutCache, type);
        }
        return LJ(LIZ(), str, type, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T LJ(JSONObject jSONObject, String str, Type type, T t) {
        if (type == Boolean.class) {
            return (T) Boolean.valueOf(jSONObject.optBoolean(str, ((Boolean) t).booleanValue()));
        }
        if (type == Integer.class || type == Short.class) {
            return (T) Integer.valueOf(jSONObject.optInt(str, ((Integer) t).intValue()));
        }
        if (type == Float.class) {
            return (T) Float.valueOf((float) jSONObject.optDouble(str, ((Float) t).floatValue()));
        }
        if (type == Long.class) {
            return (T) Long.valueOf(jSONObject.optLong(str, ((Long) t).longValue()));
        }
        if (type == Double.class) {
            return (T) Double.valueOf(jSONObject.optDouble(str, ((Double) t).doubleValue()));
        }
        if (type == String.class) {
            return (T) jSONObject.optString(str, (String) t);
        }
        return (T) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, jSONObject.optString(str), type);
    }
}
