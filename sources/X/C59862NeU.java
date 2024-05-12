package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.NeU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59862NeU extends WebViewClient implements Cloneable {
    public static final AtomicInteger LJLJJI = new AtomicInteger(0);
    public static final List<C59862NeU>[] LJLJJL = new List[10];
    public static final WeakHashMap<WebViewClient, java.util.Map<Integer, WeakReference<C59862NeU>>> LJLJJLL = new WeakHashMap<>();
    public static final WebViewClient LJLJL = new WebViewClient();
    public final int LJLIL;
    public int LJLILLLLZI;
    public WebViewClient LJLJI;

    public C59862NeU() {
        this.LJLJI = LJLJL;
        this.LJLILLLLZI = LJLJJI.getAndIncrement();
        this.LJLIL = -1;
    }

    public final Object clone() {
        try {
            C59862NeU c59862NeU = (C59862NeU) super.clone();
            c59862NeU.LJLILLLLZI = this.LJLILLLLZI;
            return c59862NeU;
        } catch (Exception unused) {
            throw new RuntimeException("WebViewClientExt clone error");
        }
    }

    public C59862NeU(int i) {
        this.LJLJI = LJLJL;
        this.LJLILLLLZI = LJLJJI.getAndIncrement();
        this.LJLIL = i;
        if (i > 2 && i <= 9) {
        } else {
            throw new RuntimeException("WebViewClientExt priorityRegion out of bounds!");
        }
    }

    public static C59862NeU LIZIZ(C59862NeU c59862NeU) {
        boolean z;
        int i = c59862NeU.LJLIL;
        if (i < 0) {
            i = 2;
            z = true;
        } else {
            z = false;
        }
        while (true) {
            List<C59862NeU>[] listArr = LJLJJL;
            if (i < listArr.length) {
                List<C59862NeU> list = listArr[i];
                if (list != null) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C59862NeU c59862NeU2 = (C59862NeU) ListProtector.get(list, i2);
                        if (c59862NeU2 != null) {
                            if (z) {
                                return LIZ(c59862NeU2, c59862NeU);
                            }
                            if (c59862NeU2.LJLILLLLZI != c59862NeU.LJLILLLLZI) {
                                continue;
                            } else {
                                int i3 = i2 + 1;
                                if (i3 < list.size()) {
                                    C59862NeU c59862NeU3 = (C59862NeU) ListProtector.get(list, i3);
                                    if (c59862NeU3 != null) {
                                        return LIZ(c59862NeU3, c59862NeU);
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public static C59862NeU LIZ(C59862NeU c59862NeU, C59862NeU c59862NeU2) {
        C59862NeU c59862NeU3;
        WeakHashMap<WebViewClient, java.util.Map<Integer, WeakReference<C59862NeU>>> weakHashMap = LJLJJLL;
        java.util.Map<Integer, WeakReference<C59862NeU>> map = weakHashMap.get(c59862NeU2.LJLJI);
        if (map == null) {
            map = new HashMap<>();
            weakHashMap.put(c59862NeU2.LJLJI, map);
        }
        WeakReference<C59862NeU> weakReference = map.get(Integer.valueOf(c59862NeU.LJLILLLLZI));
        if (weakReference == null || (c59862NeU3 = weakReference.get()) == null) {
            try {
                c59862NeU3 = (C59862NeU) super.clone();
                c59862NeU3.LJLILLLLZI = c59862NeU.LJLILLLLZI;
                WebViewClient webViewClient = c59862NeU2.LJLJI;
                if (webViewClient == null) {
                    c59862NeU3.LJLJI = LJLJL;
                } else {
                    c59862NeU3.LJLJI = webViewClient;
                }
                map.put(Integer.valueOf(c59862NeU.LJLILLLLZI), new WeakReference<>(c59862NeU3));
            } catch (Exception unused) {
                throw new RuntimeException("WebViewClientExt clone error");
            }
        }
        return c59862NeU3;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onLoadResource(webView, str);
        } else {
            this.LJLJI.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onPageCommitVisible(webView, str);
        } else {
            this.LJLJI.onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onPageFinished(webView, str);
        } else {
            this.LJLJI.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            this.LJLJI.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onRenderProcessGone(webView, renderProcessGoneDetail);
            C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
            return true;
        }
        this.LJLJI.onRenderProcessGone(webView, renderProcessGoneDetail);
        C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            this.LJLJI.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.shouldInterceptRequest(webView, webResourceRequest);
        }
        return this.LJLJI.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.shouldOverrideKeyEvent(webView, keyEvent);
        }
        return this.LJLJI.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (C59312NPo.LJFF(webView, str)) {
            return true;
        }
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.shouldOverrideUrlLoading(webView, str);
        }
        return this.LJLJI.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.shouldInterceptRequest(webView, str);
        }
        return this.LJLJI.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return this.LJLJI.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.doUpdateVisitedHistory(webView, str, z);
        } else {
            this.LJLJI.doUpdateVisitedHistory(webView, str, z);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onFormResubmission(webView, message, message2);
        } else {
            this.LJLJI.onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onPageStarted(webView, str, bitmap);
        } else {
            this.LJLJI.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            this.LJLJI.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            this.LJLJI.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            this.LJLJI.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onScaleChanged(webView, f, f2);
        } else {
            this.LJLJI.onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onTooManyRedirects(webView, message, message2);
        } else {
            this.LJLJI.onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onReceivedError(webView, i, str, str2);
        } else {
            this.LJLJI.onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            this.LJLJI.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            this.LJLJI.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        C59862NeU LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        } else {
            this.LJLJI.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        }
    }
}
