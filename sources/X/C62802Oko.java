package X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.n_project.opensdk_tt.ui.WebAuthActivity;
import ujb.o;

/* renamed from: X.Oko, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62802Oko extends WebViewClient {
    public final /* synthetic */ WebAuthActivity LIZ;

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    public C62802Oko(String str, WebAuthActivity webAuthActivity) {
        this.LIZ = webAuthActivity;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InterfaceC62810Okw interfaceC62810Okw;
        Integer LJJIL;
        Integer LJJIL2;
        if (C59312NPo.LJFF(webView, str)) {
            return true;
        }
        if (str != null && o.LJJJLIIL(str, "https://www.lemon8-app.com/h5/feoffline/tiktok/account-creator-result", false)) {
            try {
                android.net.Uri parse = UriProtector.parse(str);
                String queryParameter = UriProtector.getQueryParameter(parse, "result");
                UriProtector.getQueryParameter(parse, "user_id");
                String queryParameter2 = UriProtector.getQueryParameter(parse, "new_user");
                if (queryParameter2 != null && (LJJIL = C38350F3i.LJJIL(queryParameter2)) != null) {
                    LJJIL.intValue();
                }
                String queryParameter3 = UriProtector.getQueryParameter(parse, "err_code");
                if (queryParameter3 == null) {
                    LJJIL2 = null;
                } else {
                    LJJIL2 = C38350F3i.LJJIL(queryParameter3);
                }
                UriProtector.getQueryParameter(parse, "err_msg");
                String queryParameter4 = UriProtector.getQueryParameter(parse, "toast_msg");
                InterfaceC62809Okv interfaceC62809Okv = C62634Oi6.LIZIZ;
                if (interfaceC62809Okv != null) {
                    boolean LJ = kotlin.jvm.internal.o.LJ(queryParameter, "success");
                    if (LJJIL2 != null) {
                        LJJIL2.intValue();
                    }
                    interfaceC62809Okv.LIZ(LJ, queryParameter4);
                }
                C62634Oi6.LIZIZ = null;
                this.LIZ.finish();
            } catch (Exception e) {
                UVX uvx = C62634Oi6.LIZ;
                if (uvx != null && (interfaceC62810Okw = (InterfaceC62810Okw) uvx.LJLJI) != null) {
                    interfaceC62810Okw.LIZJ();
                }
                InterfaceC62809Okv interfaceC62809Okv2 = C62634Oi6.LIZIZ;
                if (interfaceC62809Okv2 != null) {
                    C62806Oks.LIZ(interfaceC62809Okv2, null, 20107, e.getMessage(), this.LIZ.LLFII(), 14);
                }
                C62634Oi6.LIZIZ = null;
                this.LIZ.finish();
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
