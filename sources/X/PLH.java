package X;

import com.bytedance.crash.CrashType;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PLH {
    public final JSONObject LIZ;

    public PLH(CrashType crashType, JSONObject jSONObject) {
        if (crashType == CrashType.LAUNCH) {
            this.LIZ = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
        } else {
            this.LIZ = jSONObject;
        }
        jSONObject.optJSONObject("header");
    }
}
