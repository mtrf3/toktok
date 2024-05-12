package com.ss.android.ugc.aweme.web.intercept.forest;

import X.C38995FSd;
import X.C61295O3v;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.NJH;
import Y.ARunnableS14S0400000_10;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.forest.model.Request;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdLandPageForestFetcher extends ResourceFetcher {
    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdLandPageForestFetcher(Forest forest) {
        super(forest);
        o.LJIIIZ(forest, "forest");
    }

    private final WebResourceResponse fetchOfflineResource(Request request) {
        WebResourceRequest webResourceRequest;
        NJH adInterceptor = getAdInterceptor(request);
        if (adInterceptor == null) {
            return null;
        }
        Object webResourceRequest2 = request.getWebResourceRequest();
        if (webResourceRequest2 instanceof WebResourceRequest) {
            webResourceRequest = (WebResourceRequest) webResourceRequest2;
        } else {
            webResourceRequest = null;
        }
        return adInterceptor.LIZIZ(null, webResourceRequest);
    }

    private final NJH getAdInterceptor(Request request) {
        Object obj = request.getCustomParams().get("interceptor");
        if (obj instanceof NJH) {
            return (NJH) obj;
        }
        return null;
    }

    private final WebResourceResponse fetchOnlineResource(WebView webView, Request request) {
        NJH adInterceptor = getAdInterceptor(request);
        WebResourceRequest webResourceRequest = null;
        if (adInterceptor == null) {
            return null;
        }
        Object webResourceRequest2 = request.getWebResourceRequest();
        if (webResourceRequest2 instanceof WebResourceRequest) {
            webResourceRequest = (WebResourceRequest) webResourceRequest2;
        }
        return adInterceptor.LJII(webView, webResourceRequest);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C61295O3v fetchResource(com.bytedance.forest.model.Request r6, X.C61295O3v r7) {
        /*
            r5 = this;
            java.util.Map r1 = r6.getCustomParams()
            java.lang.String r0 = "rl_container_uuid"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            r3 = 0
            if (r0 == 0) goto L13
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L15
        L13:
            java.lang.String r1 = ""
        L15:
            X.Ch9 r0 = X.C31999Ch9.LIZJ
            r0.getClass()
            X.Nsz r0 = X.C31999Ch9.LIZIZ(r1)
            if (r0 == 0) goto L83
            android.view.View r4 = r0.LIZJ()
        L24:
            boolean r0 = r4 instanceof android.webkit.WebView
            if (r0 == 0) goto L81
            android.webkit.WebView r4 = (android.webkit.WebView) r4
        L2a:
            boolean r0 = r6.getOnlyLocal()
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L64
            r7.LLFF = r2
            android.webkit.WebResourceResponse r0 = r5.fetchOfflineResource(r6)
        L38:
            if (r0 == 0) goto L62
        L3a:
            r7.LJZL = r2
            if (r0 == 0) goto L61
            java.lang.String r1 = "commerce_web"
            r7.LLD = r1
            X.O4h r2 = new X.O4h
            r2.<init>(r0)
            java.lang.String r1 = r0.getEncoding()
            r7.LJLLJ = r1
            java.lang.String r1 = r0.getMimeType()
            r7.LJLL = r1
            java.util.Map r0 = r0.getResponseHeaders()
            r7.LJLJJL = r0
            X.O4O r0 = new X.O4O
            r0.<init>(r2, r3)
            r7.X(r0)
        L61:
            return r7
        L62:
            r2 = 0
            goto L3a
        L64:
            boolean r0 = r6.getOnlyOnline()
            if (r0 == 0) goto L71
            r7.LLFF = r1
            android.webkit.WebResourceResponse r0 = r5.fetchOnlineResource(r4, r6)
            goto L38
        L71:
            android.webkit.WebResourceResponse r0 = r5.fetchOfflineResource(r6)
            if (r0 != 0) goto L7e
            android.webkit.WebResourceResponse r0 = r5.fetchOnlineResource(r4, r6)
            r7.LLFF = r1
            goto L38
        L7e:
            r7.LLFF = r2
            goto L3a
        L81:
            r4 = r3
            goto L2a
        L83:
            r4 = r3
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.intercept.forest.AdLandPageForestFetcher.fetchResource(com.bytedance.forest.model.Request, X.O3v):X.O3v");
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(Request request, C61295O3v response) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(response, "response");
        fetchResource(request, response);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(Request request, C61295O3v response, InterfaceC88472Yns<? super C61295O3v, C76800UCe> callback) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(response, "response");
        o.LJIIIZ(callback, "callback");
        C38995FSd.LIZIZ().execute(new ARunnableS14S0400000_10(this, response, callback, request, 4));
    }
}
