package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.sandbox.api.webview.UrlRules;
import com.ss.android.ugc.aweme.compliance.sandbox.api.webview.WebViewHookSettingsBean;

/* loaded from: classes7.dex */
public final class FC6 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FC6 LJLIL = new FC6();

    public FC6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        UrlRules urlRules;
        WebViewHookSettingsBean webViewHookSettingsBean = (WebViewHookSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("ttp_webview_ttnet", WebViewHookSettingsBean.class, FC2.LIZIZ);
        if (webViewHookSettingsBean != null && (urlRules = webViewHookSettingsBean.url) != null) {
            z = urlRules.forcePlanB;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
