package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.GsC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42876GsC extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, CharSequence> {
    public static final C42876GsC LJLIL = new C42876GsC();

    public C42876GsC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(JSONObject jSONObject) {
        JSONObject it = jSONObject;
        o.LJIIIZ(it, "it");
        String optString = it.optString("title");
        o.LJIIIIZZ(optString, "it.optString(\"title\")");
        return optString;
    }
}
