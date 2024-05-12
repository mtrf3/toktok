package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Chx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32049Chx {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str;
        if (jSONObject3 != null) {
            str = jSONObject3.optString("event_name");
        } else {
            str = null;
        }
        C188727au c188727au = new C188727au();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                if (o.LJ(next, "trigger")) {
                    c188727au.LJI("trigger_v2", jSONObject.optString(next));
                } else {
                    c188727au.LJI(next, jSONObject.optString(next));
                }
            }
        }
        if (jSONObject2 != null) {
            Iterator<String> keys2 = jSONObject2.keys();
            o.LJIIIIZZ(keys2, "keys()");
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (o.LJ(next2, "trigger")) {
                    c188727au.LJ(jSONObject2.optLong(next2), "trigger_v2");
                } else {
                    c188727au.LJ(jSONObject2.optLong(next2), next2);
                }
            }
        }
        FMX.LJIIL(str, c188727au.LIZ);
    }
}
