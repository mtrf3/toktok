package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.sandbox.api.webview.WebViewHookSettingsBean;

/* loaded from: classes7.dex */
public final class FC8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FC8 LJLIL = new FC8();

    public FC8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        WebViewHookSettingsBean webViewHookSettingsBean = (WebViewHookSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("ttp_webview_ttnet", WebViewHookSettingsBean.class, FC2.LIZIZ);
        if (webViewHookSettingsBean != null) {
            z = webViewHookSettingsBean.enableFixPerfTimingData;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
