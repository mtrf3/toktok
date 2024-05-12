package X;

import Y.ACListenerS27S0100000_7;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NZB implements NZX {
    public final /* synthetic */ NZA LJLIL;

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

    @Override // X.NZX
    public final void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // X.NZX
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public NZB(NZA nza) {
        this.LJLIL = nza;
    }

    @Override // X.NZX
    public final void LIZ(WebView webView, String str) {
        if (TextUtils.equals(this.LJLIL.LJLILLLLZI.LIZ.LJFF, "org_detail_page")) {
            NZA nza = this.LJLIL;
            String path = UriProtector.parse(nza.LJLILLLLZI.LIZ.LIZJ).getPath();
            NZC nzc = nza.LJLJJL;
            if (nzc != null) {
                if (TextUtils.equals(path, UriProtector.parse(nzc.getCurrentUrl()).getPath())) {
                    NZA nza2 = this.LJLIL;
                    if (!nza2.LJLJLJ) {
                        TuxTextView tuxTextView = nza2.LJLJLLL;
                        if (tuxTextView != null) {
                            tuxTextView.setVisibility(0);
                        }
                        TuxTextView tuxTextView2 = this.LJLIL.LJLJLLL;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setTuxFont(33);
                        }
                        NZA nza3 = this.LJLIL;
                        TuxTextView tuxTextView3 = nza3.LJLJLLL;
                        if (tuxTextView3 != null) {
                            C16880lQ.LJJJJI(tuxTextView3, new ACListenerS27S0100000_7(nza3, 129));
                        }
                        this.LJLIL.LJLJLJ = false;
                    }
                }
            } else {
                o.LJIJI("mCrossPlatformWebView");
                throw null;
            }
        }
        TuxTextView tuxTextView4 = this.LJLIL.LJLJLLL;
        if (tuxTextView4 != null) {
            tuxTextView4.setVisibility(8);
        }
        this.LJLIL.LJLJLJ = false;
    }

    @Override // X.NZX
    public final void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.LJLIL.LJLJLJ = true;
    }

    @Override // X.NZX
    public final void LJFF(WebView webView, int i, String str, String str2) {
        this.LJLIL.LJLJLJ = true;
    }
}
