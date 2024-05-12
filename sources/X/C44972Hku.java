package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hku, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44972Hku extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, C76800UCe> {
    public static final C44972Hku LJLIL = new C44972Hku();

    public C44972Hku() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JSONObject jSONObject) {
        JSONObject json = jSONObject;
        o.LJIIIZ(json, "$this$json");
        json.put("use_effect", 0);
        return C76800UCe.LIZ;
    }
}
