package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196187mw extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public static final C196187mw LJLIL = new C196187mw();

    public C196187mw() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        JSONObject sendEventTracking = jSONObject;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        sendEventTracking.put("enter_from", C196157mt.LIZ);
        return C76800UCe.LIZ;
    }
}
