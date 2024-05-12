package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7db, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190397db {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, java.util.Map map) {
        Object LIZ2;
        Object opt;
        if (str != null) {
            map.put("track_info", str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String key = keys.next();
                    if (C78685UuP.LJJJZ(key) && (opt = jSONObject.opt(key)) != null) {
                        o.LJIIIIZZ(key, "key");
                    }
                }
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            C3C5.m6boximpl(LIZ2);
        }
    }

    public static void LIZIZ(String str, String str2, String str3) {
        if (str != null) {
            LinkedHashMap LIZIZ = JF1.LIZIZ("poi_id", str, "enter_from", str2);
            LIZIZ.put("enter_method", str3);
            FMX.LJIIL("show_favourite_poi_toast", LIZIZ);
        }
    }
}
