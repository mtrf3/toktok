package X;

import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import java.util.Iterator;

/* renamed from: X.Ndm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59818Ndm implements InterfaceC59820Ndo {
    public final /* synthetic */ SingleWebChromeClient LIZ;

    @Override // X.InterfaceC59820Ndo
    public final void LIZ() {
        Iterator<InterfaceC59820Ndo> it = this.LIZ.LJ.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    public C59818Ndm(SingleWebChromeClient singleWebChromeClient) {
        this.LIZ = singleWebChromeClient;
    }

    @Override // X.InterfaceC59820Ndo
    public final void LJ(PermissionRequest permissionRequest) {
        Iterator<InterfaceC59820Ndo> it = this.LIZ.LJ.iterator();
        while (it.hasNext()) {
            it.next().LJ(permissionRequest);
        }
    }

    @Override // X.InterfaceC59820Ndo
    public final void LIZIZ(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<InterfaceC59820Ndo> it = this.LIZ.LJ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(view, customViewCallback);
        }
    }

    @Override // X.InterfaceC59820Ndo
    public final void LIZJ(WebView webView, int i) {
        Iterator<InterfaceC59820Ndo> it = this.LIZ.LJ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(webView, i);
        }
    }

    @Override // X.InterfaceC59820Ndo
    public final void LIZLLL(WebView webView, String str) {
        Iterator<InterfaceC59820Ndo> it = this.LIZ.LJ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(webView, str);
        }
    }
}
