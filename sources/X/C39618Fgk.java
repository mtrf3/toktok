package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.Fgk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39618Fgk {
    public static java.util.Map<String, Object> LIZ;

    public static String LIZ() {
        Object obj;
        LIZIZ();
        if (((HashMap) LIZ).containsKey("release_build")) {
            obj = ((HashMap) LIZ).get("release_build");
            return String.valueOf(obj);
        }
        obj = null;
        return String.valueOf(obj);
    }

    public static void LIZIZ() {
        Context context = PK0.LIZ;
        if (LIZ == null) {
            LIZ = new HashMap();
            try {
                Properties properties = new Properties();
                properties.load(context.getAssets().open("slardar.properties"));
                for (Map.Entry entry : properties.entrySet()) {
                    LIZ.put(String.valueOf(entry.getKey()), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }
}
