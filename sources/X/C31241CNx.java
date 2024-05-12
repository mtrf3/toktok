package X;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.android.livesdk.browser.fragment.FullWebDialogFragment;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;

/* renamed from: X.CNx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31241CNx extends O17 {
    public final /* synthetic */ TTLiveBrowserFragment LJFF;

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C31886CfK c31886CfK = this.LJFF.LLILZ;
        if (c31886CfK != null) {
            c31886CfK.getClass();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        TTLiveBrowserFragment tTLiveBrowserFragment = this.LJFF;
        if (tTLiveBrowserFragment.LJLZ == null) {
            tTLiveBrowserFragment.LJZ = null;
            return;
        }
        View view = tTLiveBrowserFragment.LJLLL;
        if (view != null && !tTLiveBrowserFragment.LLFII) {
            view.setVisibility(0);
        }
        this.LJFF.LJLLLLLL.setVisibility(8);
        TTLiveBrowserFragment tTLiveBrowserFragment2 = this.LJFF;
        CO1 co1 = tTLiveBrowserFragment2.LJLLLLLL;
        View view2 = tTLiveBrowserFragment2.LJLZ;
        if (C78996UzQ.LJJIIJZLJL(view2)) {
            C78996UzQ.LJI();
        }
        co1.removeView(view2);
        TTLiveBrowserFragment tTLiveBrowserFragment3 = this.LJFF;
        tTLiveBrowserFragment3.LJLZ = null;
        tTLiveBrowserFragment3.LJZ.onCustomViewHidden();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31241CNx(TTLiveBrowserFragment tTLiveBrowserFragment) {
        super(tTLiveBrowserFragment);
        this.LJFF = tTLiveBrowserFragment;
    }

    @Override // X.CO9, android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        VMI.LJ.LIZJ(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        TTLiveBrowserFragment tTLiveBrowserFragment = this.LJFF;
        if (tTLiveBrowserFragment.LLILII && tTLiveBrowserFragment.mo49getActivity() != null && !C38354F3m.LJ(str) && !TextUtils.equals("about:blank", str)) {
            TextView textView = this.LJFF.LJLLLL;
            if (textView != null) {
                textView.setText(str);
            }
            FullWebDialogFragment fullWebDialogFragment = this.LJFF.LJLLI;
            if (fullWebDialogFragment != null) {
                fullWebDialogFragment.LJLL = str;
                TextView textView2 = fullWebDialogFragment.LJLJJL;
                if (textView2 != null) {
                    textView2.setText(str);
                }
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        TTLiveBrowserFragment tTLiveBrowserFragment = this.LJFF;
        if (!tTLiveBrowserFragment.LLILLJJLI) {
            return;
        }
        if (tTLiveBrowserFragment.LJLZ != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        View view2 = tTLiveBrowserFragment.LJLLL;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TTLiveBrowserFragment tTLiveBrowserFragment2 = this.LJFF;
        tTLiveBrowserFragment2.LJZ = customViewCallback;
        tTLiveBrowserFragment2.LJLLLLLL.addView(view);
        TTLiveBrowserFragment tTLiveBrowserFragment3 = this.LJFF;
        tTLiveBrowserFragment3.LJLZ = view;
        tTLiveBrowserFragment3.LJLLLLLL.setVisibility(0);
        this.LJFF.LJLLLLLL.requestFocus();
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        if (C0NB.LIZJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" -- line ");
            LIZ.append(i);
            C0NB.LIZIZ("LiveBrowserFragment", X1D.LIZIZ(LIZ));
        }
    }
}
