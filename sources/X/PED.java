package X;

import com.bytedance.apm.core.ActivityLifeObserver;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PED {
    public static void LIZ(JSONObject jSONObject) {
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("crash_time", System.currentTimeMillis());
        jSONObject.put("is_main_process", C09970aH.LJIIIIZZ());
        jSONObject.put("process_name", C09970aH.LIZIZ());
        jSONObject.put("event_type", "battery_trace");
        jSONObject.put(WM7.SCENE_SERVICE, ActivityLifeObserver.getInstance().getTopActivityClassName());
    }
}
