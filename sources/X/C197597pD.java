package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7pD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197597pD extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public static final C197597pD LJLIL = new C197597pD();

    public C197597pD() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        JSONObject sendEventTrackingAsync = jSONObject;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("action_type", "click_discard");
        return C76800UCe.LIZ;
    }
}
