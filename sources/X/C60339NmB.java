package X;

import android.webkit.WebSettings;
import com.bytedance.ies.bullet.service.webkit.GlobalProps;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NmB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60339NmB {
    public String LIZ;
    public final C60337Nm9 LIZIZ;

    public C60339NmB(C60337Nm9 webKitService) {
        o.LJIIJ(webKitService, "webKitService");
        this.LIZIZ = webKitService;
    }

    public final void LIZ(C59614NaU webView) {
        o.LJIIJ(webView, "webView");
        if (this.LIZ == null) {
            return;
        }
        Object tag = webView.getTag(R.id.fdw);
        if (tag == null) {
            GlobalProps globalProps = new GlobalProps();
            globalProps.LIZ = this.LIZ;
            WebSettings settings = webView.getSettings();
            o.LJFF(settings, "webView.settings");
            settings.setJavaScriptEnabled(true);
            webView.addJavascriptInterface(globalProps, "__globalprops");
            webView.setTag(R.id.fdw, globalProps);
            this.LIZIZ.printLog("injectGlobalProps:successfully set", EnumC39958FmE.D, "webkit");
            return;
        }
        if (!(tag instanceof GlobalProps)) {
            C60337Nm9 c60337Nm9 = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("injectGlobalProps:type mismatch, current type is ");
            LIZ.append(tag.getClass());
            c60337Nm9.printLog(X1D.LIZIZ(LIZ), EnumC39958FmE.E, "webkit");
            return;
        }
        this.LIZIZ.printLog("injectGlobalProps:already set", EnumC39958FmE.D, "webkit");
        ((GlobalProps) tag).LIZ = this.LIZ;
    }

    public final void LIZIZ(java.util.Map<String, ? extends Object> globalProps) {
        o.LJIIJ(globalProps, "globalProps");
        if (globalProps.isEmpty()) {
            this.LIZ = null;
        } else {
            this.LIZ = new JSONObject(globalProps).toString();
        }
    }
}
