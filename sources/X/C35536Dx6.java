package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewInjectScriptSettingsBean;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.WebapiReport;

/* renamed from: X.Dx6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35536Dx6 extends AbstractC65781Prl implements InterfaceC65784Pro<WebapiReport> {
    public static final C35536Dx6 LJLIL = new C35536Dx6();

    public C35536Dx6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final WebapiReport invoke() {
        WebapiReport webapiReport;
        WebViewInjectScriptSettingsBean webViewInjectScriptSettingsBean = (WebViewInjectScriptSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("webview_inject_script", WebViewInjectScriptSettingsBean.class, C35537Dx7.LIZIZ);
        if (webViewInjectScriptSettingsBean == null || (webapiReport = webViewInjectScriptSettingsBean.webapiReport) == null) {
            return new WebapiReport(false, null, 3, null);
        }
        return webapiReport;
    }
}
