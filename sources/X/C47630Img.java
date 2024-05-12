package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONObject;

/* renamed from: X.Img, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47630Img {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        try {
            if (jSONObject.has("sdk_key_PushSDK")) {
                jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "sdk_key_PushSDK");
            } else {
                jSONObject2 = new JSONObject();
            }
            if (jSONObject2.has("un_duplicate_message_settings")) {
                jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "un_duplicate_message_settings");
            } else {
                jSONObject3 = new JSONObject();
            }
            jSONObject3.put("max_cache_time_in_hour", 72);
            jSONObject2.put("un_duplicate_message_settings", jSONObject3);
            jSONObject.put("sdk_key_PushSDK", jSONObject2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateMaxCacheTime4LocalNotify() - New Settings: ");
        LIZ2.append(jSONObject);
        C47629Imf.LIZJ("tiktok-push-setting", X1D.LIZIZ(LIZ2));
    }
}
