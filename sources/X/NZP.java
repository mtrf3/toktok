package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class NZP implements InterfaceC59561NZd, NZX {
    public final Activity LJLIL;
    public final C59314NPq LJLILLLLZI;
    public final View LJLJI;
    public NZC LJLJJI;
    public final C59484NWe LJLJJL;

    @Override // X.NZX
    public final void LIZ(WebView webView, String str) {
    }

    @Override // X.NZX
    public final void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    @Override // X.NZX
    public final void LJFF(WebView webView, int i, String str, String str2) {
    }

    @Override // X.InterfaceC59561NZd
    public final NZX LJII() {
        return this;
    }

    @Override // X.InterfaceC59561NZd
    public final void LJIIIZ() {
    }

    @Override // X.NZX
    public final void LJIIL(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // X.NZX
    public final void LJIILIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // X.NZX
    public final boolean LJIILJJIL(WebView webView, String str, WebResourceRequest webResourceRequest, boolean z) {
        return false;
    }

    @Override // X.InterfaceC59561NZd
    public final void LJIILL(CharSequence charSequence, boolean z) {
    }

    @Override // X.InterfaceC59561NZd
    public final void LJIILLIIL() {
    }

    @Override // X.F10
    public final void LJIIZILJ(String str) {
    }

    @Override // X.InterfaceC59561NZd
    public final String getTitle() {
        return null;
    }

    @Override // X.NZX
    public final void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // X.NZX
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public final NZC LJIJ() {
        NZC nzc = this.LJLJJI;
        if (nzc != null) {
            return nzc;
        }
        o.LJIJI("mCrossPlatformWebView");
        throw null;
    }

    @Override // X.InterfaceC59488NWi
    public final boolean LJIIJ() {
        return LJIJ().LJIIJ();
    }

    @Override // X.InterfaceC59561NZd
    public final NZC LJIIJJI() {
        return LJIJ();
    }

    @Override // X.InterfaceC59488NWi
    public final void refresh() {
        LJIJ().refresh();
    }

    @Override // X.InterfaceC59488NWi
    public final Context getContext() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC59488NWi
    public final NTL getCrossPlatformBusiness() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC59488NWi
    public final C59314NPq getCrossPlatformParams() {
        return this.LJLILLLLZI;
    }

    public NZP(Activity activity, C59314NPq c59314NPq) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = c59314NPq;
        this.LJLJI = null;
        this.LJLJJL = new C59484NWe(this);
    }
}
