package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.sandbox.api.webview.WebViewHookSettingsBean;

/* loaded from: classes7.dex */
public final class FCA extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FCA LJLIL = new FCA();

    public FCA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        WebViewHookSettingsBean webViewHookSettingsBean = (WebViewHookSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("ttp_webview_ttnet", WebViewHookSettingsBean.class, FC2.LIZIZ);
        if (webViewHookSettingsBean != null) {
            z = webViewHookSettingsBean.redirect_reload;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
