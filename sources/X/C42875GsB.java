package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.GsB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42875GsB extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, CharSequence> {
    public static final C42875GsB LJLIL = new C42875GsB();

    public C42875GsB() {
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
