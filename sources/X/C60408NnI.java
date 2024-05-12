package X;

import Y.IDCListenerS298S0100000_5;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveDisableWebviewFileUriMtSetting;
import java.lang.ref.WeakReference;

/* renamed from: X.NnI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60408NnI {
    public final WeakReference<Context> LIZ;
    public boolean LIZIZ = true;

    public C60408NnI(Context context) {
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
            C0NB.LJIIL("SSWebSettings", "setJavaScriptEnabled failed");
        }
        try {
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
        } catch (Throwable unused2) {
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        if (!LiveDisableWebviewFileUriMtSetting.INSTANCE.getValue()) {
            settings.setAllowFileAccess(true);
        } else {
            settings.setAllowFileAccess(false);
        }
        settings.setBlockNetworkImage(false);
        if (!this.LIZIZ) {
            try {
                webView.setLayerType(1, null);
            } catch (Throwable unused3) {
            }
        }
        settings.setTextZoom(100);
        try {
            settings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable unused4) {
        }
        webView.setLongClickable(true);
        webView.setOnLongClickListener(new IDCListenerS298S0100000_5(this, 7));
        try {
            settings.setMixedContentMode(2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
