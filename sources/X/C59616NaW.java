package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;

/* renamed from: X.NaW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59616NaW extends WebView implements InterfaceC16600ky {
    public static final String TAG = C16880lQ.LJLLJ(C59616NaW.class);
    public boolean canTouch;
    public long lastCickTime;
    public C16610kz mChildHelper;
    public int mLastY;
    public int mNestedOffsetY;
    public int[] mScrollConsumed;
    public int[] mScrollOffset;
    public long startClickTime;
    public int timeInterval;

    private String fileterUrl(String str) {
        return str;
    }

    private void initNestedScrolling() {
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mChildHelper = new C16610kz(this);
        setNestedScrollingEnabled(false);
    }

    public int getTimeInterval() {
        int i = this.timeInterval;
        if (i > 0) {
            return i;
        }
        return LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.mChildHelper.LJIIIZ(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.LIZLLL;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.mChildHelper.LJIIL(0);
    }

    @Override // android.webkit.WebView, X.NZR
    public boolean canGoBack() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebView, X.NZR
    public boolean canGoForward() {
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

    @Override // android.webkit.WebView, X.NZR
    public String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean hasClickInTimeInterval() {
        if (System.currentTimeMillis() - this.lastCickTime < getTimeInterval()) {
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebView
    public void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, X.NZR
    public void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, X.NZR
    public void goBack() {
        try {
            super.goBack();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, X.NZR
    public void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, X.NZR
    public void reload() {
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, X.NZR
    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public C59616NaW(Context context) {
        super(context);
        this.timeInterval = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.canTouch = true;
        initNestedScrolling();
    }

    private boolean isHttpUrl(String str) {
        if (C38354F3m.LJ(str)) {
            return false;
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return false;
        }
        return true;
    }

    @Override // android.webkit.WebView
    public boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, X.NZR
    public void loadUrl(String str) {
        try {
            fileterUrl(str);
            super.loadUrl(str);
        } catch (Exception unused) {
        }
    }

    public boolean nestedTouch(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mNestedOffsetY = 0;
        }
        int y = (int) motionEvent.getY();
        motionEvent.offsetLocation(0.0f, this.mNestedOffsetY);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3 && actionMasked != 5) {
                        return false;
                    }
                } else {
                    int i = this.mLastY - y;
                    if (dispatchNestedPreScroll(0, i, this.mScrollConsumed, this.mScrollOffset)) {
                        i -= this.mScrollConsumed[1];
                        this.mNestedOffsetY += this.mScrollOffset[1];
                    }
                    int scrollY = getScrollY();
                    this.mLastY = y - this.mScrollOffset[1];
                    int max = Math.max(0, scrollY + i) - scrollY;
                    if (dispatchNestedScroll(0, max, 0, i - max, this.mScrollOffset)) {
                        int i2 = this.mLastY;
                        int i3 = this.mScrollOffset[1];
                        this.mLastY = i2 - i3;
                        this.mNestedOffsetY += i3;
                    }
                    return super.onTouchEvent(motionEvent);
                }
            }
            stopNestedScroll();
            return super.onTouchEvent(motionEvent);
        }
        this.mLastY = y;
        startNestedScroll(2);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.canTouch) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.startClickTime < 100) {
                    this.lastCickTime = System.currentTimeMillis();
                }
            } else {
                this.startClickTime = System.currentTimeMillis();
            }
            try {
                return nestedTouch(motionEvent);
            } catch (Throwable unused) {
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

    public void setCanTouch(boolean z) {
        this.canTouch = z;
    }

    @Override // android.webkit.WebView, X.NZR
    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.mChildHelper.LJIIJ(z);
    }

    @Override // android.webkit.WebView
    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public void setTimeInterval(int i) {
        this.timeInterval = i;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            super.setWebViewClient(webViewClient);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.mChildHelper.LJIIJJI(i, 0);
    }

    public C59616NaW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.timeInterval = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.canTouch = true;
        initNestedScrolling();
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mChildHelper.LIZIZ(f, f2);
    }

    @Override // android.webkit.WebView, X.NZR
    public void loadUrl(String str, java.util.Map<String, String> map) {
        try {
            fileterUrl(str);
            super.loadUrl(str, map);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        try {
            fileterUrl(str);
            super.postUrl(str, bArr);
        } catch (Exception unused) {
        }
    }

    public C59616NaW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.timeInterval = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.canTouch = true;
        initNestedScrolling();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mChildHelper.LIZ(f, f2, z);
    }

    @Override // android.webkit.WebView
    public void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.mChildHelper.LIZLLL(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mChildHelper.LJFF(i, i2, i3, i4, iArr);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
