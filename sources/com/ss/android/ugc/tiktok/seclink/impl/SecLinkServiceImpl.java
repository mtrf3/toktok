package com.ss.android.ugc.tiktok.seclink.impl;

import X.C09900aA;
import X.C37054EgU;
import X.C58096Mr6;
import X.C59562Vk;
import X.C59614NaU;
import X.C59616NaW;
import X.InterfaceC37077Egr;
import X.OJD;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.tiktok.seclink.ISecLinkService;
import com.ss.android.ugc.tiktok.seclink.impl.settings.SecLinkConfig;
import com.ss.android.ugc.tiktok.seclink.impl.settings.SecLinkConfigItem;
import com.ss.android.ugc.tiktok.seclink.impl.settings.SecLinkSwitchSettings;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes7.dex */
public final class SecLinkServiceImpl implements ISecLinkService {
    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean LJI() {
        return true;
    }

    public static ISecLinkService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ISecLinkService.class, false);
        if (LIZ != null) {
            return (ISecLinkService) LIZ;
        }
        if (C58096Mr6.S8 == null) {
            synchronized (ISecLinkService.class) {
                if (C58096Mr6.S8 == null) {
                    C58096Mr6.S8 = new SecLinkServiceImpl();
                }
            }
        }
        return C58096Mr6.S8;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final void LJIIIZ() {
        SecLinkSwitchSettings.LIZ();
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LIZ("disable_jsballowlist_exportedto_seclinkallowlist", true);
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean LJ(WebView webView) {
        o.LJIIIZ(webView, "webView");
        InterfaceC37077Egr interfaceC37077Egr = (InterfaceC37077Egr) ((ConcurrentHashMap) SecLinkManager.LIZ).get(webView);
        if (interfaceC37077Egr != null) {
            return interfaceC37077Egr.LIZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean LJII(WebView webView) {
        o.LJIIIZ(webView, "webView");
        InterfaceC37077Egr interfaceC37077Egr = (InterfaceC37077Egr) ((ConcurrentHashMap) SecLinkManager.LIZ).get(webView);
        if (interfaceC37077Egr != null) {
            return interfaceC37077Egr.canGoBack();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1 == true) goto L6;
     */
    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL(android.webkit.WebView r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl.LIZLLL(android.webkit.WebView, java.lang.String):java.lang.String");
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final String LJFF(String str, String str2) {
        return SecLinkManager.LIZIZ(str, str2);
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final Boolean LJIIIIZZ(WebView webView, String str) {
        SecLinkConfig secLinkConfig;
        Boolean bool;
        boolean z;
        String str2;
        boolean z2;
        SecLinkConfigItem secLinkConfigItem;
        boolean z3;
        o.LJIIIZ(webView, "webView");
        if (str == null) {
            return Boolean.FALSE;
        }
        if (!C37054EgU.LIZJ(str, "http")) {
            return Boolean.FALSE;
        }
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            secLinkConfig = C59562Vk.LIZ;
            SecLinkConfig secLinkConfig2 = (SecLinkConfig) LIZLLL.LJIIIIZZ("seclink_config", SecLinkConfig.class, secLinkConfig);
            if (secLinkConfig2 != null) {
                secLinkConfig = secLinkConfig2;
            }
        } catch (Throwable unused) {
            secLinkConfig = C59562Vk.LIZ;
        }
        List<SecLinkConfigItem> list = secLinkConfig.blockList;
        boolean z4 = false;
        if (list != null) {
            Iterator<SecLinkConfigItem> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    secLinkConfigItem = it.next();
                    SecLinkConfigItem secLinkConfigItem2 = secLinkConfigItem;
                    int i = secLinkConfigItem2.type;
                    if (i == TypeEnum.START_WITH.getType()) {
                        z3 = ujb.o.LJJJLIIL(str, secLinkConfigItem2.pattern, false);
                    } else if (i == TypeEnum.CONTAINS.getType()) {
                        z3 = s.LJJJLZIJ(str, secLinkConfigItem2.pattern, false);
                    } else if (i == TypeEnum.REGEX_MATCHES.getType()) {
                        z3 = new OJD(secLinkConfigItem2.pattern).matches(str);
                    } else if (i == TypeEnum.REGEX_CONTAINS_MATCH_IN.getType()) {
                        z3 = new OJD(secLinkConfigItem2.pattern).containsMatchIn(str);
                    } else if (i == TypeEnum.EQUAL.getType()) {
                        z3 = o.LJ(secLinkConfigItem2.pattern, str);
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        break;
                    }
                } else {
                    secLinkConfigItem = null;
                    break;
                }
            }
            if (secLinkConfigItem != null) {
                SecLinkManager.LIZJ(webView, "common");
            }
        }
        InterfaceC37077Egr interfaceC37077Egr = (InterfaceC37077Egr) ((ConcurrentHashMap) SecLinkManager.LIZ).get(webView);
        if (interfaceC37077Egr != null) {
            String url = webView.getUrl();
            if (webView instanceof C59614NaU) {
                bool = Boolean.valueOf(((C59614NaU) webView).LJLLL());
            } else if (webView instanceof C59616NaW) {
                bool = Boolean.valueOf(((C59616NaW) webView).hasClickInTimeInterval());
            } else if (webView instanceof WebKitView) {
                bool = Boolean.valueOf(((WebKitView) webView).LJLLL());
            } else {
                bool = null;
            }
            SecLinkSwitchSettings.SeclinkSwitch LIZ = SecLinkSwitchSettings.LIZ();
            LIZ.getClass();
            if (url == null || url.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && LIZ.enable) {
                Iterator<String> it2 = LIZ.white_list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        str2 = it2.next();
                        String str3 = str2;
                        if (url != null && s.LJJJLZIJ(url, str3, false)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            break;
                        }
                    } else {
                        str2 = null;
                        break;
                    }
                }
                String str4 = str2;
                if (str4 == null || str4.length() == 0) {
                    z4 = true;
                }
            }
            if (z4 && o.LJ(bool, Boolean.FALSE)) {
                boolean LIZJ = interfaceC37077Egr.LIZJ(str);
                JSONObject jSONObject = new JSONObject();
                if (!(!C37054EgU.LIZJ(str, "http"))) {
                    try {
                        jSONObject.put("host", UriProtector.parse(str).getHost());
                        jSONObject.put("url", str);
                        if (url != null) {
                            jSONObject.put("origin_hos", UriProtector.parse(url).getHost());
                            jSONObject.put("origin_url", url);
                        }
                    } catch (Exception unused2) {
                    }
                    C09900aA.LJI("monitor_seclink_first_jump", jSONObject, null, null);
                }
                return Boolean.valueOf(LIZJ);
            }
            interfaceC37077Egr.LIZIZ(str);
        }
        return Boolean.FALSE;
    }
}
