package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.sandbox.api.webview.WebViewHookSettingsBean;

/* loaded from: classes7.dex */
public final class FCB extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final FCB LJLIL = new FCB();

    public FCB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        WebViewHookSettingsBean webViewHookSettingsBean = (WebViewHookSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("ttp_webview_ttnet", WebViewHookSettingsBean.class, FC2.LIZIZ);
        if (webViewHookSettingsBean != null) {
            i = webViewHookSettingsBean.policy;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
