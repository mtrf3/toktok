package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Esr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37821Esr {
    public final C37817Esn LIZ = new C37817Esn();
    public final C37797EsT LIZIZ = new C37797EsT();
    public final C37822Ess LIZJ = new C37822Ess();

    public final void LIZ(int i, WebView webView, String msg) {
        o.LJIIIZ(msg, "msg");
        this.LIZ.LIZIZ = false;
        C37822Ess c37822Ess = this.LIZJ;
        c37822Ess.getClass();
        c37822Ess.LIZIZ = msg;
        this.LIZJ.LIZ = i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("res_loader_info", C47135Ieh.LJ("res_loader_name", "webview_intercept", "res_loader_version", "1.0"));
        jSONObject.put("res_info", C37820Esq.LIZIZ(this));
        jSONObject.put("res_load_error", C37820Esq.LIZ(this));
        if (this.LIZ.LIZLLL) {
            VMI.LJ.LJIIZILJ(webView, "res_loader_error_template", jSONObject);
        } else {
            VMI.LJ.LJIIZILJ(webView, "res_loader_error", jSONObject);
        }
    }
}
