package X;

import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.hybrid.AllowHtmlVideoSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.CNy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31242CNy extends O17 {
    public final C31240CNw LJFF;

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31242CNy(C31240CNw liveWebComponent) {
        super(liveWebComponent.LJLIL);
        o.LJIIIZ(liveWebComponent, "liveWebComponent");
        this.LJFF = liveWebComponent;
        AllowHtmlVideoSetting.INSTANCE.getValue();
    }

    @Override // X.CO9, android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        VMI.LJ.LIZJ(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String message, int i, String str) {
        o.LJIIIZ(message, "message");
        if (C0NB.LIZJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(message);
            LIZ.append(" -- line ");
            LIZ.append(i);
            C0NB.LIZIZ("LiveWebChromeClient", X1D.LIZIZ(LIZ));
        }
    }
}
