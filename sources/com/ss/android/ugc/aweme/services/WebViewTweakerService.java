package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.C59832Ne0;
import android.content.Context;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.framework.services.IWebViewTweaker;

/* loaded from: classes11.dex */
public final class WebViewTweakerService implements IWebViewTweaker {
    public static IWebViewTweaker createIWebViewTweakerbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IWebViewTweaker.class, z);
        if (LIZ != null) {
            return (IWebViewTweaker) LIZ;
        }
        if (C58096Mr6.g6 == null) {
            synchronized (IWebViewTweaker.class) {
                if (C58096Mr6.g6 == null) {
                    C58096Mr6.g6 = new WebViewTweakerService();
                }
            }
        }
        return C58096Mr6.g6;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IWebViewTweaker
    public void clearWebviewOnDestroy(WebView webView) {
        C59832Ne0.LIZ(webView);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IWebViewTweaker
    public void tweakPauseIfFinishing(Context context, WebView webView) {
        C59832Ne0.LIZIZ(context, webView);
    }
}
