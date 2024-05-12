package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.F0v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38285F0v extends C38280F0q implements InterfaceC38012Evw {
    public C38285F0v(WeakReference weakReference) {
        super(weakReference);
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        String string = JSONObjectProtectorUtils.getString(c38048EwW.LIZLLL, "type");
        if (TextUtils.equals("goods_order_share", string)) {
            return;
        }
        c38048EwW.LIZJ = "open";
        c38048EwW.LIZLLL.put("type", "openRecord");
        if (c38048EwW.LIZLLL.has("args")) {
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(c38048EwW.LIZLLL, "args");
            jSONObject2.put("recordOrigin", "jsBridge");
            if ("challenge".equals(string)) {
                jSONObject2.put("id", jSONObject2.get("challenge_id"));
                jSONObject2.put("recordParam", "challenge");
            } else if ("music".equals(string)) {
                jSONObject2.put("id", jSONObject2.get("music_id"));
                jSONObject2.put("recordParam", "music");
            } else if ("effect".equals(string)) {
                if (jSONObject2.has("effect_id")) {
                    jSONObject2.put("id", jSONObject2.get("effect_id"));
                }
                jSONObject2.put("recordParam", "sticker");
                if (jSONObject2.has("effect_meta_info")) {
                    jSONObject2.put("effect_meta_info", JSONObjectProtectorUtils.getJSONObject(jSONObject2, "effect_meta_info").toString());
                }
                if (jSONObject2.has("effect_image")) {
                    jSONObject2.put("effect_image", JSONObjectProtectorUtils.getJSONObject(jSONObject2, "effect_image").toString());
                }
            } else if ("donation".equals(string)) {
                jSONObject2.put("id", jSONObject2.get("charity_id"));
                jSONObject2.put("recordParam", "donation");
            } else if ("tcm".equals(string)) {
                jSONObject2.put("recordParam", "tcm");
                jSONObject2.put("star_atlas_object", JSONObjectProtectorUtils.getJSONObject(c38048EwW.LIZLLL, "args").toString());
            } else if ("duet".equals(string)) {
                jSONObject2.put("type", "use_duet");
            } else if ("stitch".equals(string)) {
                jSONObject2.put("type", "use_stitch");
            } else if ("comment".equals(string)) {
                jSONObject2.put("type", "use_comment");
            }
            jSONObject2.put("group", "1");
        }
        jSONObject.put("code", 1);
        LIZJ(c38048EwW.LIZLLL);
    }
}
