package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class COQ extends COP<WebView> {
    public static final COQ LIZIZ = new COQ();

    public COQ() {
        super("webview");
    }

    @Override // X.COU
    public final void LIZ(View view, String str, JSONObject jSONObject) {
        VMI vmi = VMI.LJ;
        JSONObject jSONObject2 = new JSONObject();
        ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).le();
        jSONObject2.put("virtual_aid", "99999");
        vmi.LJIILLIIL((WebView) view, null, str, jSONObject, null, null, jSONObject2);
    }
}
