package com.ss.android.ugc.tiktok.security;

import X.C37034EgA;
import X.C37045EgL;
import X.C37158EiA;
import X.C37162EiE;
import X.C37163EiF;
import X.C37166EiI;
import X.C37201Eir;
import X.C38027EwB;
import X.C38028EwC;
import X.C38995FSd;
import X.C39489Fef;
import X.C58096Mr6;
import X.EXK;
import X.F4F;
import X.FSC;
import X.FSY;
import X.QZZ;
import X.X1D;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.tiktok.security.jsguard.JsInjectionBlackListSettings;
import com.ss.android.ugc.tiktok.security.jsguard.PnsThirdBypassPathSettings;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ujb.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class ClientSecurityServiceImpl implements IClientSecurityService {
    public C37162EiE LIZ;
    public volatile boolean LIZIZ;

    public static IClientSecurityService LJIILIIL() {
        Object LIZ = C58096Mr6.LIZ(IClientSecurityService.class, false);
        if (LIZ != null) {
            return (IClientSecurityService) LIZ;
        }
        if (C58096Mr6.T8 == null) {
            synchronized (IClientSecurityService.class) {
                if (C58096Mr6.T8 == null) {
                    C58096Mr6.T8 = new ClientSecurityServiceImpl();
                }
            }
        }
        return C58096Mr6.T8;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void init() {
        if (!this.LIZIZ) {
            EXK.LIZJ(new C37045EgL());
            FSY fsy = FSY.FIXED;
            C38027EwB LIZ = C38028EwC.LIZ(fsy);
            LIZ.LIZJ = 1;
            LIZ.LIZIZ = "hybrid_security_monitor_jsGuard";
            EXK.LIZLLL(new C37034EgA(C38995FSd.LIZ(LIZ.LIZ())));
            C38027EwB LIZ2 = C38028EwC.LIZ(fsy);
            LIZ2.LIZJ = 1;
            LIZ2.LIZIZ = "hybrid_security_monitor_csrf";
            C37162EiE c37162EiE = new C37162EiE(C38995FSd.LIZ(LIZ2.LIZ()));
            this.LIZ = c37162EiE;
            EXK.LIZJ(c37162EiE);
            this.LIZIZ = true;
        }
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJII() {
        C37166EiI.LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJIIJ() {
        C37166EiI.LIZIZ();
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LIZ(String str) {
        PnsThirdBypassPathSettings.PnsThirdBypassPathModel LIZ;
        List<String> list;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = UriProtector.parse(str);
        String host = parse.getHost();
        String str2 = "";
        if (host == null) {
            host = "";
        }
        String path = parse.getPath();
        if (path != null) {
            str2 = path;
        }
        String LJFF = i0.LJFF(host, str2);
        if (!C37201Eir.LIZIZ(str) || (LIZ = PnsThirdBypassPathSettings.LIZ()) == null || (list = LIZ.thirdInitialPage) == null) {
            return false;
        }
        for (String str3 : list) {
            if (s.LJJJLZIJ(str3, "/", false)) {
                if (o.LJJJLIIL(LJFF, str3, false)) {
                    return true;
                }
            } else {
                if (o.LJJJLIIL(str3, ".", false)) {
                    if (!o.LJJJJ(host, str3, false)) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append('.');
                        LIZ2.append(host);
                        if (kotlin.jvm.internal.o.LJ(str3, X1D.LIZIZ(LIZ2))) {
                        }
                    }
                    return true;
                }
                if (!kotlin.jvm.internal.o.LJ(str3, host)) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str3);
                    LIZ3.append('/');
                    if (kotlin.jvm.internal.o.LJ(X1D.LIZIZ(LIZ3), LJFF)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f6, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r13, X.X1D.LIZIZ(r1)) != false) goto L55;
     */
    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl.LIZIZ(java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LIZJ(String str) {
        List<String> list;
        PnsThirdBypassPathSettings.PnsThirdBypassPathModel LIZ;
        List<String> list2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = UriProtector.parse(str);
        String host = parse.getHost();
        String str2 = "";
        if (host == null) {
            host = "";
        }
        String path = parse.getPath();
        if (path != null) {
            str2 = path;
        }
        String LJFF = i0.LJFF(host, str2);
        if (!C37201Eir.LIZIZ(str) && (LIZ = PnsThirdBypassPathSettings.LIZ()) != null && (list2 = LIZ.firstJump) != null) {
            for (String str3 : list2) {
                if (o.LJJJLIIL(str3, "/", false) && o.LJJJLIIL(str2, str3, false)) {
                    break;
                }
            }
        }
        PnsThirdBypassPathSettings.PnsThirdBypassPathModel LIZ2 = PnsThirdBypassPathSettings.LIZ();
        if (LIZ2 == null || (list = LIZ2.firstJump) == null) {
            return false;
        }
        for (String str4 : list) {
            if (s.LJJJLZIJ(str4, "/", false)) {
                if (o.LJJJLIIL(LJFF, str4, false)) {
                    return true;
                }
            } else {
                if (o.LJJJLIIL(str4, ".", false)) {
                    if (!o.LJJJJ(host, str4, false)) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append('.');
                        LIZ3.append(host);
                        if (kotlin.jvm.internal.o.LJ(str4, X1D.LIZIZ(LIZ3))) {
                        }
                    }
                    return true;
                }
                if (kotlin.jvm.internal.o.LJ(str4, host)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LIZLLL(String url) {
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        return C37201Eir.LIZIZ(url);
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LJFF(C37163EiF c37163EiF) {
        C37162EiE c37162EiE = this.LIZ;
        if (c37162EiE != null && c37162EiE.LIZJ(c37163EiF)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final ExecutorService LJIIIIZZ(ExecutorService executorService) {
        return new FSC(executorService);
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJIIIZ(C39489Fef c39489Fef) {
        ((HashMap) C37158EiA.LIZ().LIZ).remove(C39489Fef.class);
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJIIJJI(C39489Fef c39489Fef) {
        ((HashMap) C37158EiA.LIZ().LIZ).put(C39489Fef.class, c39489Fef);
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final <T> T LJIIL(Class<T> cls) {
        return (T) ((HashMap) C37158EiA.LIZ().LIZ).get(cls);
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJI(Runnable command, Executor executor) {
        kotlin.jvm.internal.o.LJIIIZ(command, "command");
        C37158EiA.LIZIZ(command, executor);
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LJ(WebView webView, String injectionKey, String injectTiming, String url) {
        JsInjectionBlackListSettings.JsInjectionBlackListConfig jsInjectionBlackListConfig;
        boolean z;
        kotlin.jvm.internal.o.LJIIIZ(injectionKey, "injectionKey");
        kotlin.jvm.internal.o.LJIIIZ(injectTiming, "injectTiming");
        kotlin.jvm.internal.o.LJIIIZ(webView, "webView");
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            jsInjectionBlackListConfig = JsInjectionBlackListSettings.LIZ;
            JsInjectionBlackListSettings.JsInjectionBlackListConfig jsInjectionBlackListConfig2 = (JsInjectionBlackListSettings.JsInjectionBlackListConfig) LIZLLL.LJIIIIZZ("pns_js_injection_blacklist", JsInjectionBlackListSettings.JsInjectionBlackListConfig.class, jsInjectionBlackListConfig);
            if (jsInjectionBlackListConfig2 != null) {
                jsInjectionBlackListConfig = jsInjectionBlackListConfig2;
            }
        } catch (Throwable unused) {
            jsInjectionBlackListConfig = JsInjectionBlackListSettings.LIZ;
        }
        if (!jsInjectionBlackListConfig.enable) {
            return false;
        }
        String host = UriProtector.parse(url).getHost();
        for (String str : jsInjectionBlackListConfig.blackList) {
            if (host != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (o.LJJJJ(lowerCase, str, false)) {
                    z = true;
                    break;
                }
            }
            String lowerCase2 = QZZ.LIZIZ('.', host).toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (o.LJJJJ(lowerCase2, str, false)) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            webView.setTag(R.id.nhx, "");
            return true;
        }
        if (kotlin.jvm.internal.o.LJ(injectTiming, F4F.VERY_BEGINNING.getValue())) {
            return false;
        }
        webView.setTag(R.id.nhx, injectionKey);
        return false;
    }
}
