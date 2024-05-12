package X;

import android.content.Intent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementPage;
import kotlin.jvm.internal.o;

/* renamed from: X.NdL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59791NdL extends WebViewClient {
    public final /* synthetic */ AgreementPage LIZ;

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    public C59791NdL(AgreementPage agreementPage) {
        this.LIZ = agreementPage;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.onPageFinished(view, url);
        View view2 = this.LIZ.LJLJJL;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String url) {
        String str;
        if (!C59312NPo.LJFF(webView, url)) {
            o.LJIIIZ(url, "url");
            android.net.Uri parse = UriProtector.parse(url);
            String scheme = parse.getScheme();
            if (scheme != null) {
                str = AnonymousClass028.LIZJ("getDefault()", scheme, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (o.LJ("market", str)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.addFlags(268435456);
                C16880lQ.LIZJ(webView.getContext(), intent);
            } else {
                return super.shouldOverrideUrlLoading(webView, url);
            }
        }
        return true;
    }
}
