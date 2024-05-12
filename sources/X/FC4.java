package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.sandbox.api.webview.UrlRules;
import com.ss.android.ugc.aweme.compliance.sandbox.api.webview.WebViewHookSettingsBean;
import java.util.List;

/* loaded from: classes7.dex */
public final class FC4 extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final FC4 LJLIL = new FC4();

    public FC4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        UrlRules urlRules;
        List<String> list;
        WebViewHookSettingsBean webViewHookSettingsBean = (WebViewHookSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("ttp_webview_ttnet", WebViewHookSettingsBean.class, FC2.LIZIZ);
        if (webViewHookSettingsBean == null || (urlRules = webViewHookSettingsBean.url) == null || (list = urlRules.includes) == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }
}
