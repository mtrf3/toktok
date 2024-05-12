package X;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.hybrid.base.NavigationConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fec, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39486Fec extends C59862NeU {
    public C39486Fec() {
        super(7);
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        List<InterfaceC39487Fed> list;
        try {
            NavigationConfig navigationConfig = C39488Fee.LIZIZ;
            if (navigationConfig != null && navigationConfig.enable && (list = C39488Fee.LIZJ) != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    WebResourceResponse LIZ = ((InterfaceC39487Fed) it.next()).LIZ(webView, webResourceRequest);
                    if (LIZ != null) {
                        return LIZ;
                    }
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object LIZ;
        List<InterfaceC39487Fed> list;
        android.net.Uri uri;
        try {
            NavigationConfig navigationConfig = C39488Fee.LIZIZ;
            if (navigationConfig != null && navigationConfig.enable && (list = C39488Fee.LIZJ) != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    InterfaceC39487Fed interfaceC39487Fed = (InterfaceC39487Fed) it.next();
                    if (webResourceRequest != null) {
                        uri = webResourceRequest.getUrl();
                    } else {
                        uri = null;
                    }
                    interfaceC39487Fed.LIZJ(uri, webView);
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("shouldOverrideUrlLoading -> error occur. ");
            LIZ2.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
            X1D.LIZIZ(LIZ2);
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Object LIZ;
        android.net.Uri parse;
        List<InterfaceC39487Fed> list;
        try {
            NavigationConfig navigationConfig = C39488Fee.LIZIZ;
            if (navigationConfig != null && navigationConfig.enable && (parse = UriProtector.parse(str)) != null && (list = C39488Fee.LIZJ) != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((InterfaceC39487Fed) it.next()).LIZJ(parse, webView);
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("error occur while parse url. ");
            LIZ2.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
            X1D.LIZIZ(LIZ2);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Object LIZ;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        List<InterfaceC39487Fed> list;
        try {
            NavigationConfig navigationConfig = C39488Fee.LIZIZ;
            if (navigationConfig != null && navigationConfig.enable) {
                if (webView != null) {
                    webView.setTag(R.id.ni0, str);
                }
                NavigationConfig navigationConfig2 = C39488Fee.LIZIZ;
                if (navigationConfig2 != null && (interfaceC65784Pro = navigationConfig2.LJLIL) != null && interfaceC65784Pro.invoke().booleanValue() && (list = C39488Fee.LIZJ) != null) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC39487Fed) it.next()).LIZIZ(webView, str, "H5");
                    }
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPageStarted -> error occur. ");
            LIZ2.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
            X1D.LIZIZ(LIZ2);
        }
        super.onPageStarted(webView, str, bitmap);
    }
}
