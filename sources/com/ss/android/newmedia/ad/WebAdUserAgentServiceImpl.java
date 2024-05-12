package com.ss.android.newmedia.ad;

import X.C35261Dsf;
import X.C58096Mr6;
import X.C84763XOl;
import X.FLE;
import X.FPF;
import X.NJX;
import android.app.Activity;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.ad.preload.interfaces.IWebAdUserAgentService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class WebAdUserAgentServiceImpl implements IWebAdUserAgentService {
    public static IWebAdUserAgentService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IWebAdUserAgentService.class, false);
        if (LIZ != null) {
            return (IWebAdUserAgentService) LIZ;
        }
        if (C58096Mr6.LJJJJLL == null) {
            synchronized (IWebAdUserAgentService.class) {
                if (C58096Mr6.LJJJJLL == null) {
                    C58096Mr6.LJJJJLL = new WebAdUserAgentServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJJJLL;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.interfaces.IWebAdUserAgentService
    public final Map<String, String> LIZ(WebView webView, String url, boolean z) {
        String userAgent;
        o.LJIIIZ(url, "url");
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (LJIIIIZZ == null) {
            userAgent = FLE.LIZ("other");
        } else {
            userAgent = FPF.LIZIZ(LJIIIIZZ, webView);
        }
        o.LJIIIZ(userAgent, "userAgent");
        if (C35261Dsf.LIZ() && z) {
            userAgent = ujb.o.LJJJJZ(userAgent, "wv", "", false);
        }
        linkedHashMap.put("User-Agent", userAgent);
        NJX.LIZ(url, linkedHashMap);
        return linkedHashMap;
    }
}
