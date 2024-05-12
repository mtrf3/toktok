package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3SingleViewSetting;
import org.json.JSONObject;

/* renamed from: X.TpJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75821TpJ extends AbstractC65781Prl implements InterfaceC88472Yns<Object, JSONObject> {
    public static final C75821TpJ LJLIL = new C75821TpJ();

    public C75821TpJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JSONObject invoke(Object obj) {
        JSONObject jSONObject = new JSONObject();
        String LIZJ = U4C.LIZJ();
        if (LIZJ == null) {
            LIZJ = "";
        }
        jSONObject.put("guest_ab_params", LIZJ);
        jSONObject.put("live_ab_label", LiveAbLabelSetting.INSTANCE.getValue());
        jSONObject.put("single_view_opt", MultiGuestV3SingleViewSetting.INSTANCE.getValue());
        return jSONObject;
    }
}
