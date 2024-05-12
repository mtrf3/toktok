package X;

import android.webkit.WebView;
import com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.AdSeperatedWebChromeClient;

/* renamed from: X.NaY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59618NaY extends AdSeperatedWebChromeClient {
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJIIIIZZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C59618NaY(C59612NaS c59612NaS, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        super(c59612NaS);
        this.LJIIIIZZ = interfaceC88472Yns;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.AdSeperatedWebChromeClient, android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        this.LJIIIIZZ.invoke(str);
    }
}
