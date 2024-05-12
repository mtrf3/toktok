package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class GXT implements GXQ {
    @Override // X.GXQ
    public final boolean LIZ(String eventName, java.util.Map<String, String> map) {
        o.LJIIIZ(eventName, "eventName");
        boolean z = true;
        if (!o.LJ(eventName, "shoot") || map == null || !map.containsKey("is_ui_shoot")) {
            return false;
        }
        String str = null;
        if (1 == 0 || this == null) {
            return false;
        }
        if (map != null) {
            str = map.get("is_ui_shoot");
        }
        if (!o.LJ(str, "true") || map.containsKey("after_consumption")) {
            z = false;
        }
        return z;
    }

    @Override // X.GXQ
    public final boolean LIZIZ(String eventName, JSONObject jSONObject) {
        o.LJIIIZ(eventName, "eventName");
        boolean z = true;
        if (!o.LJ(eventName, "shoot") || jSONObject == null || !jSONObject.has("is_ui_shoot") || this == null) {
            return false;
        }
        if (jSONObject == null || !jSONObject.optBoolean("is_ui_shoot", false) || jSONObject.has("after_consumption")) {
            z = false;
        }
        return z;
    }
}
