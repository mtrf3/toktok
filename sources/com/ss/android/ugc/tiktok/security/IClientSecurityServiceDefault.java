package com.ss.android.ugc.tiktok.security;

import X.C37163EiF;
import X.C39489Fef;
import android.webkit.WebView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class IClientSecurityServiceDefault implements IClientSecurityService {
    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LIZ(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LIZIZ(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LIZJ(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LIZLLL(String url) {
        o.LJIIIZ(url, "url");
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LJ(WebView webView, String injectionKey, String injectTiming, String url) {
        o.LJIIIZ(injectionKey, "injectionKey");
        o.LJIIIZ(injectTiming, "injectTiming");
        o.LJIIIZ(webView, "webView");
        o.LJIIIZ(url, "url");
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LJFF(C37163EiF c37163EiF) {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJI(Runnable command, Executor executor) {
        o.LJIIIZ(command, "command");
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final ExecutorService LJIIIIZZ(ExecutorService executorService) {
        return executorService;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJIIIZ(C39489Fef c39489Fef) {
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJIIJ() {
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJIIJJI(C39489Fef c39489Fef) {
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final <T> T LJIIL(Class<T> cls) {
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void init() {
    }
}
