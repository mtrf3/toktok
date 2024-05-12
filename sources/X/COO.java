package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEnableWebviewGlobalpropsSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class COO extends C59586Na2 implements InterfaceC30895CAp {
    public COV LJLILLLLZI;
    public final java.util.Map<String, Boolean> LJLJI = new HashMap();

    public COO(COV cov) {
        this.LJLILLLLZI = cov;
    }

    @Override // X.C59586Na2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        COV cov = this.LJLILLLLZI;
        if (cov != null) {
            cov.LIZ(webView, str);
        }
        ((HashMap) this.LJLJI).clear();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse LIZJ = COY.LIZIZ().LIZJ(webView, str);
        if (LIZJ != null) {
            ((HashMap) this.LJLJI).put(str, Boolean.TRUE);
            COR.LIZ(webView, str, true);
            return LIZJ;
        }
        ((HashMap) this.LJLJI).put(str, Boolean.FALSE);
        COR.LIZ(webView, str, false);
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // X.C59589Na5, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String lowerCase;
        if (super.shouldOverrideUrlLoading(webView, str)) {
            return true;
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            if (parse.getScheme() == null) {
                lowerCase = "";
            } else {
                lowerCase = parse.getScheme().toLowerCase();
            }
            if (!TextUtils.isEmpty(lowerCase) && !"about".equals(lowerCase) && !lowerCase.equals("https") && !lowerCase.equals("http")) {
                return ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(webView.getContext(), str);
            }
            return false;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("view url ");
            LIZ.append(str);
            LIZ.append(" exception: ");
            LIZ.append(e);
            C0NB.LJIIL("TAG", X1D.LIZIZ(LIZ));
            return false;
        }
    }

    @Override // X.C59586Na2, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView instanceof C61182Nzm) {
            ((C61182Nzm) webView).setPageStartUrl(str);
        }
        super.onPageStarted(webView, str, bitmap);
        if (webView != null && LiveEnableWebviewGlobalpropsSetting.INSTANCE.getValue() && C31947CgJ.LJ(str)) {
            webView.evaluateJavascript(C16880lQ.LLLZ("(function(){var __globalProps=%s;window.__globalProps=__globalProps;})();", new Object[]{C29264Be8.LIZ(webView.getContext(), str, CardStruct.IStatusCode.DEFAULT, Boolean.TRUE.equals(((HashMap) this.LJLJI).get(str)))}), null);
        }
    }

    @Override // X.C59586Na2, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        COV cov = this.LJLILLLLZI;
        if (cov != null) {
            cov.LIZIZ(webView, str, str2);
        }
    }
}
