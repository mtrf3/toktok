package X;

import com.bytedance.ies.abmock.SettingsManager;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EHA extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final EHA LJLIL = new EHA();

    public EHA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        JSONObject optJSONObject;
        JSONObject jSONObject = (JSONObject) SettingsManager.LIZLLL().LJIIIIZZ("ecom_user_act_config", JSONObject.class, null);
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("search_action")) != null) {
            i = optJSONObject.optInt("size");
        } else {
            i = 30;
        }
        return Integer.valueOf(i);
    }
}
