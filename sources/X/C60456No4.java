package X;

import android.webkit.WebSettings;
import com.bytedance.lynx.hybrid.webkit.GlobalProps;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.No4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60456No4 {
    public static void LIZ(WebKitView webKitView, java.util.Map map) {
        String jSONObject;
        if (map == null || map.isEmpty() || (jSONObject = new JSONObject(map).toString()) == null) {
            return;
        }
        Object tag = webKitView.getTag(R.id.e8o);
        if (tag == null) {
            GlobalProps globalProps = new GlobalProps();
            globalProps.LIZ = jSONObject;
            globalProps.LIZIZ = map;
            WebSettings settings = webKitView.getSettings();
            o.LJFF(settings, "webView.settings");
            settings.setJavaScriptEnabled(true);
            webKitView.addJavascriptInterface(globalProps, "__globalprops");
            webKitView.setTag(R.id.e8o, globalProps);
            C39048FUe.LIZIZ.LIZ("injectGlobalProps:successfully set", EnumC39866Fkk.D, "webkit");
            return;
        }
        if (!(tag instanceof GlobalProps)) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("injectGlobalProps:type mismatch, current type is ");
            LIZ.append(tag.getClass());
            c39048FUe.LIZ(X1D.LIZIZ(LIZ), EnumC39866Fkk.E, "webkit");
            return;
        }
        C39048FUe.LIZIZ.LIZ("injectGlobalProps:already set", EnumC39866Fkk.D, "webkit");
        GlobalProps globalProps2 = (GlobalProps) tag;
        globalProps2.LIZ = jSONObject;
        globalProps2.LIZIZ = map;
    }
}
