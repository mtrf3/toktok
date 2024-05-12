package X;

import com.bytedance.ies.abmock.SettingsManager;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EHB extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final EHB LJLIL = new EHB();

    public EHB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        JSONObject optJSONObject;
        JSONObject jSONObject = (JSONObject) SettingsManager.LIZLLL().LJIIIIZZ("ecom_user_act_config", JSONObject.class, null);
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("video_view_action")) != null) {
            i = optJSONObject.optInt("size");
        } else {
            i = 30;
        }
        return Integer.valueOf(i);
    }
}
