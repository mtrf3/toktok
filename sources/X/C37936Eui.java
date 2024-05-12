package X;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Eui, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37936Eui {
    public static final HashMap<String, Object> LJII = new HashMap<>();
    public String LIZ;
    public String LIZIZ;
    public Integer LIZJ;
    public String LIZLLL;
    public View LJ;
    public final HashMap<String, Object> LJFF = new HashMap<>();
    public final Integer[] LJI = {-1, -2, -3, -5, -1000, -1128, -2000, -2001, -10, -11};

    public final void LIZIZ(C37936Eui c37936Eui) {
        if (!ORY.LJJIJIIJIL(this.LIZJ, this.LJI)) {
            return;
        }
        if (ORZ.LJLJJI(this.LIZ, C37905EuD.LJIILL)) {
            return;
        }
        LIZ(c37936Eui, "jsb_sdk_error_event", 0);
    }

    public final void LIZ(C37936Eui c37936Eui, String str, int i) {
        HashMap<String, Object> hashMap;
        View view = this.LJ;
        C79605VMb c79605VMb = new C79605VMb(str);
        c79605VMb.LIZIZ = "jsb_sdk_error_bid";
        c79605VMb.LIZ = this.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jsb_method_name", this.LIZ);
        jSONObject.put("jsb_url", this.LIZIZ);
        jSONObject.put("jsb_error_code", this.LIZJ);
        jSONObject.put("jsb_bridge_sdk", this.LIZLLL);
        for (Map.Entry<String, Object> entry : this.LJFF.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue().toString());
        }
        for (Map.Entry<String, Object> entry2 : LJII.entrySet()) {
            jSONObject.put(entry2.getKey(), entry2.getValue().toString());
        }
        if (c37936Eui != null && (hashMap = c37936Eui.LJFF) != null) {
            for (Map.Entry<String, Object> entry3 : hashMap.entrySet()) {
                jSONObject.put(entry3.getKey(), entry3.getValue().toString());
            }
        }
        jSONObject.put("jsb_sdk_error_all_message", jSONObject.toString());
        c79605VMb.LIZLLL = jSONObject;
        c79605VMb.LIZIZ(i);
        C37088Eh2.LIZ(view, c79605VMb.LIZ());
    }
}
