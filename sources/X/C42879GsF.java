package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.GsF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42879GsF extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, CharSequence> {
    public static final C42879GsF LJLIL = new C42879GsF();

    public C42879GsF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(JSONObject jSONObject) {
        JSONObject it = jSONObject;
        o.LJIIIZ(it, "it");
        String optString = it.optString("third_id");
        o.LJIIIIZZ(optString, "it.optString(\"third_id\")");
        return optString;
    }
}
