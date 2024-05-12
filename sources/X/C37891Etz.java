package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Etz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37891Etz extends AbstractC37890Ety {
    public final /* synthetic */ String LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37891Etz(String str) {
        super(0);
        this.LIZIZ = str;
    }

    @Override // X.F2U, X.F48
    public final String LJ(android.net.Uri uri, WebView webView) {
        o.LJIIIZ(webView, "webView");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.LIZIZ);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply { put(\"id\", id) }.toString()");
        return jSONObject2;
    }
}
