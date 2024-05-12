package X;

import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.Fkc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39858Fkc extends C38518F9u {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final boolean LJLJJL;

    public String applyAppendCommonParamsUrl(String url) {
        o.LJIIJ(url, "url");
        return url;
    }

    public boolean applyCommonShouldOverrideUrl(WebView webView, String str) {
        return false;
    }

    public String applyGlobalLoadUrl(String url) {
        o.LJIIJ(url, "url");
        return url;
    }

    public void applyGlobalSettings(WebSettings settings, WebView webView) {
        o.LJIIJ(settings, "settings");
        o.LJIIJ(webView, "webView");
    }

    public InterfaceC60703Ns3 getWebViewNavigationServiceProtocol() {
        return null;
    }

    public final String getAppId() {
        return this.LJLILLLLZI;
    }

    public final String getAppVersion() {
        return this.LJLJI;
    }

    public final String getDid() {
        return this.LJLJJI;
    }

    public final String getRegion() {
        return this.LJLIL;
    }

    public final boolean isDebug() {
        return this.LJLJJL;
    }

    public C39858Fkc(String region, String appId, String appVersion, String did, boolean z) {
        o.LJIIJ(region, "region");
        o.LJIIJ(appId, "appId");
        o.LJIIJ(appVersion, "appVersion");
        o.LJIIJ(did, "did");
        this.LJLIL = region;
        this.LJLILLLLZI = appId;
        this.LJLJI = appVersion;
        this.LJLJJI = did;
        this.LJLJJL = z;
    }
}
