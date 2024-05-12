package X;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.NnH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60407NnH {
    public final WeakReference<Context> LIZ;
    public boolean LIZIZ = true;

    public C60407NnH(Context context) {
        this.LIZ = new WeakReference<>(context);
    }

    public final void LIZ(WebView webView) {
        WebSettings settings;
        if (webView == null || this.LIZ.get() == null || (settings = webView.getSettings()) == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception unused) {
        }
        try {
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
        } catch (Throwable unused2) {
        }
        settings.setTextZoom(100);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        SettingsManager.LIZLLL().getClass();
        settings.setAllowFileAccess(SettingsManager.LIZ("allow_file_access", true));
        settings.setBlockNetworkImage(false);
        if (!this.LIZIZ) {
            try {
                webView.setLayerType(1, null);
            } catch (Throwable unused3) {
            }
        }
        try {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        } catch (Throwable unused4) {
        }
        webView.setLongClickable(true);
        webView.setOnLongClickListener(new ViewOnLongClickListenerC60440Nno(this));
        Context context = webView.getContext();
        o.LJIIIIZZ(context, "webview.context");
        String LIZIZ = FPF.LIZIZ(context, webView);
        if (!C38354F3m.LJ(LIZIZ)) {
            C16880lQ.LLZL(webView.getSettings(), LIZIZ);
        }
        WebSettings settings2 = webView.getSettings();
        if (settings2 != null) {
            try {
                settings2.setMixedContentMode(0);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        try {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
