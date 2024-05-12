package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.2uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73762uy {
    public static JSONObject LIZ(JSONObject jSONObject) {
        String str;
        String str2 = null;
        if (jSONObject != null) {
            str = jSONObject.optString("key");
            str2 = jSONObject.optString(WM7.SCENE_SERVICE);
        } else {
            str = null;
        }
        if (o.LJ(str2, "cart_cache")) {
            String LIZ = C64752gR.LIZ();
            if (LIZ != null) {
                return C65232Piu.LIZJ("result", LIZ);
            }
        } else {
            String LIZ2 = C71284RyK.LIZ(str2, str);
            if (LIZ2 != null) {
                return C65232Piu.LIZJ("result", LIZ2);
            }
        }
        return new JSONObject();
    }
}
