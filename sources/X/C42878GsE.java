package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.GsE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42878GsE extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, CharSequence> {
    public static final C42878GsE LJLIL = new C42878GsE();

    public C42878GsE() {
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
