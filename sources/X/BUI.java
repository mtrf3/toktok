package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BUI extends AbstractC38127Exn<JSONObject, Object> {
    @Override // X.AbstractC38127Exn
    public final Object invoke(JSONObject jSONObject, C38131Exr context) {
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        int i = 0;
        int optInt = params.optInt("default_panel", 0);
        String optString = params.optString("show_entrance", "");
        String autoFillText = params.optString("auto_fill_text", "");
        JSONObject optJSONObject = params.optJSONObject("track_info");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        if (optInt != 0) {
            if (optInt != 1) {
                if (optInt != 2) {
                    if (optString == null || ujb.o.LJJJJJL(optString)) {
                        optString = "subscription_benefits_to_do";
                    }
                } else {
                    if (optString == null || ujb.o.LJJJJJL(optString)) {
                        optString = "benefits_emote_icon";
                    }
                    i = 4;
                }
            } else {
                if (optString == null || ujb.o.LJJJJJL(optString)) {
                    optString = "benefits_comment_icon";
                }
                i = 6;
            }
        } else {
            if (optString == null || ujb.o.LJJJJJL(optString)) {
                optString = "benefits_comment_icon";
            }
            o.LJIIIIZZ(autoFillText, "autoFillText");
            if (autoFillText.length() > 0) {
                i = 3;
            }
        }
        if (o.LJ(optString, "fans_club_task")) {
            C73943T0h.LIZ().LIZIZ(new C28671BNb());
        }
        C73943T0h.LIZ().LIZIZ(new C30926CBu(i, autoFillText, optString, optJSONObject));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        return jSONObject2;
    }
}
