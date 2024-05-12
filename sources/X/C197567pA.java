package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7pA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197567pA extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public static final C197567pA LJLIL = new C197567pA();

    public C197567pA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        JSONObject sendEventTrackingAsync = jSONObject;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("action_type", "click_ok");
        return C76800UCe.LIZ;
    }
}
