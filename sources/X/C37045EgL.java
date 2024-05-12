package X;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.EgL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37045EgL extends C59862NeU {
    public C37045EgL() {
        super(3);
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        C76800UCe c76800UCe;
        if (webView == null) {
            c76800UCe = null;
        } else {
            try {
                webView.setTag(R.id.ni4, EnumC37038EgE.PAGE_LOADING);
                c76800UCe = C76800UCe.LIZ;
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(c76800UCe);
        super.onLoadResource(webView, str);
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C76800UCe c76800UCe;
        if (webView == null) {
            c76800UCe = null;
        } else {
            try {
                webView.setTag(R.id.ni4, EnumC37038EgE.PAGE_FINISHED);
                c76800UCe = C76800UCe.LIZ;
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(c76800UCe);
        super.onPageFinished(webView, str);
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C76800UCe c76800UCe;
        if (webView == null) {
            c76800UCe = null;
        } else {
            try {
                webView.setTag(R.id.ni4, EnumC37038EgE.PAGE_REDIRECT);
                c76800UCe = C76800UCe.LIZ;
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(c76800UCe);
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C76800UCe c76800UCe;
        if (webView == null) {
            c76800UCe = null;
        } else {
            try {
                webView.setTag(R.id.ni4, EnumC37038EgE.PAGE_REDIRECT);
                c76800UCe = C76800UCe.LIZ;
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(c76800UCe);
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C76800UCe c76800UCe;
        if (webView == null) {
            c76800UCe = null;
        } else {
            try {
                webView.setTag(R.id.ni4, EnumC37038EgE.PAGE_START);
                c76800UCe = C76800UCe.LIZ;
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(c76800UCe);
        super.onPageStarted(webView, str, bitmap);
    }
}
