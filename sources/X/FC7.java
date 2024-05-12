package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.sandbox.api.webview.WebViewHookSettingsBean;

/* loaded from: classes7.dex */
public final class FC7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FC7 LJLIL = new FC7();

    public FC7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        WebViewHookSettingsBean webViewHookSettingsBean = (WebViewHookSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("ttp_webview_ttnet", WebViewHookSettingsBean.class, FC2.LIZIZ);
        if (webViewHookSettingsBean != null) {
            z = webViewHookSettingsBean.enable;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
