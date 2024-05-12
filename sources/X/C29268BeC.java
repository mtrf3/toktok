package X;

import com.bytedance.android.livesdkapi.host.IHostHybrid;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.BeC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29268BeC extends AbstractC38127Exn<Object, JSONObject> {
    @Override // X.AbstractC38127Exn
    public final JSONObject invoke(Object obj, C38131Exr c38131Exr) {
        JSONObject jSONObject = new JSONObject();
        C65124PhA.LIZLLL().getClass();
        java.util.Map LIZIZ = C65124PhA.LIZIZ();
        for (String str : LIZIZ.keySet()) {
            String str2 = (String) LIZIZ.get(str);
            if (!C38354F3m.LJ(str) && !C38354F3m.LJ(str2)) {
                jSONObject.put(str, str2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        java.util.Map<String, String> Vg0 = ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).Vg0("");
        if (Vg0 != null) {
            for (Map.Entry<String, String> entry : Vg0.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("tt_token", jSONObject2);
        return jSONObject;
    }
}
