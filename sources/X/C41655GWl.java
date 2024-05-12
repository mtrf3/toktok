package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.GWl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41655GWl implements GXQ {
    @Override // X.GXQ
    public final boolean LIZ(String eventName, java.util.Map<String, String> map) {
        String str;
        o.LJIIIZ(eventName, "eventName");
        if (ujb.o.LJJJLIIL(eventName, "tool_performance_", false)) {
            String str2 = null;
            if (map != null) {
                str = map.get("tool_performance_");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str) && map != null) {
                String str3 = C41653GWj.LIZ.LIZIZ;
                if (str3 == null) {
                    str3 = "no_creationId";
                }
                map.put("creation_id", str3);
            }
            if (map != null) {
                str2 = map.get("shoot_way");
            }
            if (TextUtils.isEmpty(str2) && map != null) {
                String str4 = C41653GWj.LIZ.LIZ;
                if (str4 == null) {
                    str4 = "no_shootWay";
                }
                map.put("shoot_way", str4);
            }
        }
        return false;
    }

    @Override // X.GXQ
    public final boolean LIZIZ(String eventName, JSONObject jSONObject) {
        String str;
        o.LJIIIZ(eventName, "eventName");
        if (ujb.o.LJJJLIIL(eventName, "tool_performance_", false)) {
            String str2 = null;
            if (jSONObject != null) {
                str = jSONObject.optString("creation_id", "");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str) && jSONObject != null) {
                String str3 = C41653GWj.LIZ.LIZIZ;
                if (str3 == null) {
                    str3 = "no_creationId";
                }
                jSONObject.put("creation_id", str3);
            }
            if (jSONObject != null) {
                str2 = jSONObject.optString("shoot_way", "");
            }
            if (TextUtils.isEmpty(str2) && jSONObject != null) {
                String str4 = C41653GWj.LIZ.LIZ;
                if (str4 == null) {
                    str4 = "no_shootWay";
                }
                jSONObject.put("shoot_way", str4);
            }
        }
        return false;
    }
}
