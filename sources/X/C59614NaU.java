package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.NaU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59614NaU extends OM1 implements InterfaceC38148Ey8 {
    public InterfaceC60279NlD LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public int LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public boolean LJLLI;
    public InterfaceC59635Nap LJLLILLLL;
    public InterfaceC59634Nao LJLLJ;
    public String LJLLL;

    public C59614NaU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // X.OM1, android.webkit.WebView
    public final boolean canGoBack() {
        try {
            return super.canGoBack() && C59312NPo.LIZIZ(this);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void setWebOverScrollByListener(InterfaceC59636Naq interfaceC59636Naq) {
    }

    public final boolean LJLLL() {
        InterfaceC59634Nao interfaceC59634Nao = this.LJLLJ;
        if (interfaceC59634Nao != null) {
            try {
                return interfaceC59634Nao.LIZIZ();
            } catch (FCQ unused) {
            }
        }
        if (System.currentTimeMillis() - this.LJLL < getTimeInterval()) {
            return true;
        }
        return false;
    }

    @Override // X.OM1, android.webkit.WebView
    public final void destroy() {
        try {
            InterfaceC60279NlD interfaceC60279NlD = this.LJLJJL;
            if (interfaceC60279NlD != null) {
                interfaceC60279NlD.LJIIL(this);
            }
            super.destroy();
        } catch (Throwable unused) {
        }
    }

    public final int getTimeInterval() {
        int i = this.LJLJLJ;
        if (i > 0) {
            return i;
        }
        return this.LJLJL;
    }

    @Override // X.OM1, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        try {
            InterfaceC60279NlD interfaceC60279NlD = this.LJLJJL;
            if (interfaceC60279NlD != null) {
                interfaceC60279NlD.LJI(this);
            }
            super.onAttachedToWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final void reload() {
        try {
            InterfaceC60279NlD interfaceC60279NlD = this.LJLJJL;
            if (interfaceC60279NlD != null) {
                interfaceC60279NlD.LJIILIIL(this);
            }
            super.reload();
        } catch (Exception unused) {
        }
    }

    public final boolean LJLLLL() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        o.LJFF(copyBackForwardList, "copyBackForwardList()");
        if (copyBackForwardList.getCurrentIndex() >= 2) {
            return true;
        }
        return false;
    }

    @Override // X.OM1, android.webkit.WebView
    public final boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebView
    public int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    @Override // android.webkit.WebView
    public String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.webkit.WebView
    public int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    @Override // android.webkit.WebView
    public String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final void goBack() {
        if (C59312NPo.LJ(this)) {
            return;
        }
        try {
            InterfaceC60279NlD interfaceC60279NlD = this.LJLJJL;
            if (interfaceC60279NlD != null) {
                interfaceC60279NlD.LJ(this);
            }
            super.goBack();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public final void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public final void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    public final InterfaceC60279NlD getMonitorHelper() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC38148Ey8
    public String getSafeUrl() {
        return this.LJLLL;
    }

    @Override // X.OM1, android.webkit.WebView
    public final void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public C59614NaU(Context context) {
        this(context, null, 6, 0);
        if (C52300Kfo.LIZ()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                C16880lQ.LLZL(settings, userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        InterfaceC59634Nao interfaceC59634Nao = this.LJLLJ;
        if (interfaceC59634Nao != null) {
            try {
                return interfaceC59634Nao.LIZ(super.canScrollVertically(i));
            } catch (FCQ unused) {
            }
        }
        return super.canScrollVertically(i);
    }

    @Override // android.webkit.WebView
    public final void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final void loadUrl(String url) {
        String LIZLLL = C59312NPo.LIZ.LIZLLL(this, url);
        if (!TextUtils.isEmpty(LIZLLL)) {
            url = LIZLLL;
        }
        o.LJIIJ(url, "url");
        try {
            InterfaceC60279NlD interfaceC60279NlD = this.LJLJJL;
            if (interfaceC60279NlD != null) {
                interfaceC60279NlD.LIZLLL(this, url);
            }
            super.loadUrl(url);
        } catch (Exception unused) {
        }
    }

    @Override // X.OM1, android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIJ(event, "event");
        InterfaceC59634Nao interfaceC59634Nao = this.LJLLJ;
        if (interfaceC59634Nao != null) {
            try {
                interfaceC59634Nao.LJIIIIZZ(event);
                return true;
            } catch (FCQ unused) {
            }
        }
        if (this.LJLLI) {
            int action = event.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.LJLJLLL < this.LJLJJLL) {
                    this.LJLL = System.currentTimeMillis();
                }
            } else {
                this.LJLJLLL = System.currentTimeMillis();
            }
            try {
                return super.onTouchEvent(event);
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public void setBackgroundColor(int i) {
        try {
            super.setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    public final void setCanTouch(boolean z) {
        this.LJLLI = z;
    }

    @Override // X.OM1, android.webkit.WebView
    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public final void setMonitorHelper(InterfaceC60279NlD interfaceC60279NlD) {
        this.LJLJJL = interfaceC60279NlD;
    }

    @Override // android.webkit.WebView
    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    public final void setPageStartUrl(String str) {
        this.LJLLL = str;
    }

    public final void setTimeInterval(int i) {
        this.LJLJLJ = i;
    }

    @Override // X.OM1, X.C60640Nr2, android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public final void setWebScrollListener(InterfaceC59635Nap interfaceC59635Nap) {
        this.LJLLILLLL = interfaceC59635Nap;
    }

    @Override // X.OM1, X.C60640Nr2, android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            super.setWebViewClient(webViewClient);
        } catch (Exception unused) {
        }
    }

    public final void setWebViewEventDelegate(InterfaceC59634Nao delegate) {
        o.LJIIJ(delegate, "delegate");
        this.LJLLJ = delegate;
    }

    @Override // X.OM1, android.webkit.WebView
    public final void loadUrl(String url, java.util.Map additionalHttpHeaders) {
        String LIZLLL = C59312NPo.LIZ.LIZLLL(this, url);
        if (!TextUtils.isEmpty(LIZLLL)) {
            url = LIZLLL;
        }
        o.LJIIJ(url, "url");
        o.LJIIJ(additionalHttpHeaders, "additionalHttpHeaders");
        try {
            InterfaceC60279NlD interfaceC60279NlD = this.LJLJJL;
            if (interfaceC60279NlD != null) {
                interfaceC60279NlD.LIZLLL(this, url);
            }
            super.loadUrl(url, additionalHttpHeaders);
        } catch (Exception unused) {
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final void postUrl(String url, byte[] postData) {
        o.LJIIJ(url, "url");
        o.LJIIJ(postData, "postData");
        try {
            super.postUrl(url, postData);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59614NaU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIJ(context, "context");
        C16880lQ.LJLLJ(C59614NaU.class);
        this.LJLJJLL = 100;
        this.LJLJL = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.LJLJLJ = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.LJLLI = true;
        if (C52300Kfo.LIZ()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                C16880lQ.LLZL(settings, userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final void loadData(String data, String str, String str2) {
        o.LJIIJ(data, "data");
        try {
            super.loadData(data, str, str2);
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ C59614NaU(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // X.OM1, android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC59635Nap interfaceC59635Nap = this.LJLLILLLL;
        if (interfaceC59635Nap != null) {
            interfaceC59635Nap.onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // X.OM1, android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String data, String str2, String str3, String str4) {
        o.LJIIJ(data, "data");
        try {
            super.loadDataWithBaseURL(str, data, str2, str3, str4);
        } catch (Exception unused) {
        }
    }

    @Override // X.OM1, android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
