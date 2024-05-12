package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.business.proxy.ReportBusinessProxy;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class NZ7 implements NZX {
    public final /* synthetic */ MixActivityContainer LJLIL;

    public NZ7(MixActivityContainer mixActivityContainer) {
        this.LJLIL = mixActivityContainer;
    }

    @Override // X.NZX
    public final void LIZ(WebView webView, String str) {
        this.LJLIL.getClass();
    }

    @Override // X.NZX
    public final void onPageCommitVisible(WebView webView, String str) {
        this.LJLIL.getClass();
    }

    @Override // X.NZX
    public final void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            MixActivityContainer mixActivityContainer = this.LJLIL;
            C59309NPl c59309NPl = mixActivityContainer.LJLILLLLZI.LIZJ;
            if (c59309NPl.LJIJ) {
                if (!c59309NPl.LJIILL) {
                    mixActivityContainer.LJIJJLI();
                    return;
                } else {
                    mixActivityContainer.LL.setVisibility(0);
                    this.LJLIL.LLF.setVisibility(0);
                }
            }
        }
        this.LJLIL.getClass();
    }

    @Override // X.NZX
    public final void LJIIL(WebView webView, String str, Bitmap bitmap) {
        WebBackForwardList copyBackForwardList;
        this.LJLIL.getClass();
        int i = 1;
        if (!TextUtils.isEmpty(this.LJLIL.LJLILLLLZI.LIZ.LJIILJJIL)) {
            ReportBusinessProxy reportBusinessProxy = (ReportBusinessProxy) this.LJLIL.LJLJJL.LIZ(ReportBusinessProxy.class);
            if (reportBusinessProxy.LJFF.longValue() == -1) {
                reportBusinessProxy.LJFF = Long.valueOf(System.currentTimeMillis());
            }
            MixActivityContainer mixActivityContainer = this.LJLIL;
            int i2 = mixActivityContainer.LJLILLLLZI.LIZ.LJIILL;
            if (i2 > 0) {
                NZR LJJ = mixActivityContainer.LJJ();
                if (LJJ != null && (copyBackForwardList = LJJ.copyBackForwardList()) != null) {
                    i = 1 + copyBackForwardList.getCurrentIndex();
                }
                if (i <= i2) {
                    ((ImageView) this.LJLIL.LL.LIZ(R.id.ixa)).setVisibility(0);
                } else {
                    ((ImageView) this.LJLIL.LL.LIZ(R.id.ixa)).setVisibility(8);
                }
            }
        }
        if (this.LJLIL.LJJIII() && this.LJLIL.LJLJJI && !TextUtils.equals(str, "about:blank")) {
            this.LJLIL.LJLJJI = false;
            webView.clearHistory();
        }
        MixActivityContainer mixActivityContainer2 = this.LJLIL;
        mixActivityContainer2.LLD.LJIIJ(mixActivityContainer2.LJLILLLLZI, false);
        if (NWB.LIZIZ(this.LJLIL.LJLILLLLZI) && this.LJLIL.LLD.getVisibility() != 0) {
            this.LJLIL.LLD.setVisibility(0);
            this.LJLIL.LLD.LJIIIZ();
        }
        MixActivityContainer mixActivityContainer3 = this.LJLIL;
        mixActivityContainer3.LLD.setGoBackEnable(mixActivityContainer3.LJLJJLL.canGoBack());
        MixActivityContainer mixActivityContainer4 = this.LJLIL;
        mixActivityContainer4.LLD.setGoForwardEnable(mixActivityContainer4.LJLJJLL.canGoForward());
    }

    @Override // X.NZX
    public final void LJIILIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.LJLIL.getClass();
    }

    @Override // X.NZX
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.LJLIL.getClass();
    }

    @Override // X.NZX
    public final void LJFF(WebView webView, int i, String str, String str2) {
        MixActivityContainer mixActivityContainer = this.LJLIL;
        C59309NPl c59309NPl = mixActivityContainer.LJLILLLLZI.LIZJ;
        if (c59309NPl.LJIJ) {
            if (!c59309NPl.LJIILL) {
                mixActivityContainer.LJIJJLI();
                return;
            } else {
                mixActivityContainer.LL.setVisibility(0);
                this.LJLIL.LLF.setVisibility(0);
            }
        }
        this.LJLIL.getClass();
    }

    @Override // X.NZX
    public final boolean LJIILJJIL(WebView webView, String str, WebResourceRequest webResourceRequest, boolean z) {
        this.LJLIL.getClass();
        return false;
    }
}
