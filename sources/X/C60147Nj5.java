package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Nj5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60147Nj5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C38049EwX c38049EwX, InterfaceC40516FvE interfaceC40516FvE, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_agreed", str);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "bc_music_alert_confirm");
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
        if (c38049EwX != null) {
            c38049EwX.LJIIIIZZ("notification", jSONObject);
        }
        if (interfaceC40516FvE != null) {
            interfaceC40516FvE.onEvent(new C60146Nj4(jSONObject));
        }
    }
}
