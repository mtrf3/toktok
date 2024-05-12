package X;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PiZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65211PiZ {
    public final void LIZ(int i, String str, java.util.Map map) {
        if (C65212Pia.LIZ == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (C65212Pia.LIZ == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", C30443Bx9.LIZ());
            jSONObject2.put("extra", jSONObject);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
            C0NB.LJ("LiveOuterSlardarMonitor", e2.getMessage());
        }
        C65212Pia.LIZ.monitorStatusRate(str, i, jSONObject2);
    }
}
