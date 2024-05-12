package com.ss.android.ugc.tiktok.seclink;

import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ISecLinkServiceDefault implements ISecLinkService {
    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final String LIZLLL(WebView webView, String str) {
        o.LJIIIZ(webView, "webView");
        return str;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean LJ(WebView webView) {
        o.LJIIIZ(webView, "webView");
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final String LJFF(String str, String str2) {
        return str;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean LJI() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean LJII(WebView webView) {
        o.LJIIIZ(webView, "webView");
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final void LJIIIZ() {
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final Boolean LJIIIIZZ(WebView webView, String str) {
        o.LJIIIZ(webView, "webView");
        return Boolean.FALSE;
    }
}
