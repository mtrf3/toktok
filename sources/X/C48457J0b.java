package X;

import android.content.SharedPreferences;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.google.gson.Gson;
import java.util.HashMap;

/* renamed from: X.J0b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48457J0b {
    public static final java.util.Map<String, java.util.Map<String, Object>> LIZ = new HashMap();
    public static final Gson LIZIZ = C09650Zl.LIZIZ;

    public static SharedPreferences LIZ(String str) {
        return F9J.LIZIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context(), 0, str);
    }

    public static <T> T LIZIZ(C48458J0c<T> c48458J0c) {
        if (c48458J0c == null) {
            return null;
        }
        Class<T> cls = c48458J0c.LJI;
        if (cls == Boolean.class) {
            String str = c48458J0c.LJ;
            return (T) Boolean.valueOf(LIZ(str).getBoolean(c48458J0c.LIZJ, ((Boolean) c48458J0c.LJFF).booleanValue()));
        }
        if (cls == Integer.class || cls == Short.class) {
            String str2 = c48458J0c.LJ;
            return (T) Integer.valueOf(LIZ(str2).getInt(c48458J0c.LIZJ, ((Integer) c48458J0c.LJFF).intValue()));
        }
        if (cls == Float.class) {
            String str3 = c48458J0c.LJ;
            return (T) Float.valueOf(LIZ(str3).getFloat(c48458J0c.LIZJ, ((Float) c48458J0c.LJFF).floatValue()));
        }
        if (cls == Long.class) {
            String str4 = c48458J0c.LJ;
            return (T) Long.valueOf(LIZ(str4).getLong(c48458J0c.LIZJ, ((Long) c48458J0c.LJFF).longValue()));
        }
        if (cls == Double.class) {
            String str5 = c48458J0c.LJ;
            String str6 = c48458J0c.LIZJ;
            double doubleValue = ((Double) c48458J0c.LJFF).doubleValue();
            try {
                doubleValue = CastDoubleProtector.parseDouble(LIZ(str5).getString(str6, String.valueOf(doubleValue)));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            return (T) Double.valueOf(doubleValue);
        }
        if (cls == String.class) {
            String str7 = c48458J0c.LJ;
            return (T) LIZ(str7).getString(c48458J0c.LIZJ, (String) c48458J0c.LJFF);
        }
        String str8 = c48458J0c.LJ;
        String str9 = c48458J0c.LIZJ;
        T t = c48458J0c.LJFF;
        HashMap hashMap = (HashMap) LIZ;
        java.util.Map map = (java.util.Map) hashMap.get(str8);
        if (map == null) {
            map = new HashMap();
            hashMap.put(str8, map);
        }
        try {
            if (map.containsKey(str9)) {
                return (T) map.get(str9);
            }
            T t2 = (T) LIZIZ.LJI(LIZ(str8).getString(str9, ""), cls);
            if (t2 == null) {
                map.remove(str9);
                return t;
            }
            map.put(str9, t2);
            return t2;
        } catch (Exception unused) {
            map.remove(str9);
            return t;
        }
    }
}
