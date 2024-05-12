package com.ss.android.ugc.tiktok.security;

import X.C37163EiF;
import X.C39489Fef;
import android.webkit.WebView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public interface IClientSecurityService {
    boolean LIZ(String str);

    boolean LIZIZ(String str);

    boolean LIZJ(String str);

    boolean LIZLLL(String str);

    boolean LJ(WebView webView, String str, String str2, String str3);

    boolean LJFF(C37163EiF c37163EiF);

    void LJI(Runnable runnable, Executor executor);

    void LJII();

    ExecutorService LJIIIIZZ(ExecutorService executorService);

    void LJIIIZ(C39489Fef c39489Fef);

    void LJIIJ();

    void LJIIJJI(C39489Fef c39489Fef);

    <T> T LJIIL(Class<T> cls);

    void init();
}
