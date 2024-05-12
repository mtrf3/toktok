package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* renamed from: X.RwN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71163RwN {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("room_id", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("name", str2);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("schema", str3);
            jSONObject.put("is_from_message", CardStruct.IStatusCode.DEFAULT);
            if (str4 != null) {
                jSONObject.put("effect_style", str4);
            }
            C48658J7u.LIZIZ("livesdk_tiktokec_short_touches_get", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static final void LIZIZ(int i, String str, boolean z, String str2, String str3) {
        String str4;
        String str5;
        try {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("room_id", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("name", str2);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("schema", str3);
            jSONObject.put("error_code", String.valueOf(i));
            if (i != 1) {
                if (i == 2) {
                    str4 = "name is null";
                } else {
                    str4 = "unknown";
                }
            } else {
                str4 = "schema is null";
            }
            jSONObject.put("error_msg", str4);
            if (z) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_from_message", str5);
            C48658J7u.LIZIZ("livesdk_tiktokec_short_touches_get_fail", jSONObject);
        } catch (Exception unused) {
        }
    }
}
