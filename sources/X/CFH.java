package X;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CFH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, boolean z) {
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        if (z) {
            i = 3;
        } else {
            i = 4;
        }
        C05630Jz.LIZ(i, "play_status", jSONObject);
        if (str == null) {
            str = "unkown";
        }
        C05630Jz.LJI(jSONObject, "channel", str);
        if (str2 == null) {
            str2 = "unkown";
        }
        C05630Jz.LJI(jSONObject, "videoname", str2);
        C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
        C0K2.LJI("ttlive_barrage_player_status_event", jSONObject, jSONObject2, jSONObject4);
    }
}
