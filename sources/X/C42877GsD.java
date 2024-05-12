package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.GsD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42877GsD extends AbstractC65781Prl implements InterfaceC88472Yns<JSONObject, CharSequence> {
    public static final C42877GsD LJLIL = new C42877GsD();

    public C42877GsD() {
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
