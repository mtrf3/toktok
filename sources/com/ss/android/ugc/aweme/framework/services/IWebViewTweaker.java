package com.ss.android.ugc.aweme.framework.services;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes11.dex */
public interface IWebViewTweaker {
    void clearWebviewOnDestroy(WebView webView);

    void tweakPauseIfFinishing(Context context, WebView webView);
}
