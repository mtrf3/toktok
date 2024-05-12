package com.ss.android.ugc.tiktok.seclink.impl;

import X.C141335gf;
import X.C16880lQ;
import X.C19N;
import X.C36600EYa;
import X.C36849EdB;
import X.C37020Efw;
import X.C37050EgQ;
import X.C37051EgR;
import X.C37057EgX;
import X.C38083Ex5;
import X.C3C5;
import X.C47261Igj;
import X.C73040SlY;
import X.E8M;
import X.EF7;
import X.EJ6;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC37077Egr;
import X.InterfaceC37276Ek4;
import X.ViewOnAttachStateChangeListenerC37049EgP;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.tiktok.seclink.impl.settings.SecLinkLocalConfig;
import com.ss.android.ugc.tiktok.seclink.impl.settings.SecLinkSwitchSettings;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SecLinkManager {
    public static final Map<View, InterfaceC37077Egr> LIZ = new ConcurrentHashMap();

    /* loaded from: classes7.dex */
    public interface SecLinkDataApi {
        @E8M
        InterfaceC37276Ek4<String> executePost(@InterfaceC195747mE String str, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list);
    }

    static {
        Object LIZ2;
        SecLinkLocalConfig secLinkLocalConfig;
        Context LIZIZ = EF7.LIZIZ();
        String valueOf = String.valueOf(EF7.LJIIIZ);
        ISettingService LIZ3 = SettingServiceImpl.LIZ();
        o.LJIIIIZZ(LIZ3, "get().getService<ISettin…ttingService::class.java)");
        String language = LIZ3.getLanguage(LIZ3.getCurrentI18nItem(EF7.LIZIZ()).getLocale());
        if (!TextUtils.isEmpty(valueOf)) {
            String str = "https://www.tiktok.com/link//";
            if (!TextUtils.isEmpty("https://www.tiktok.com/link//")) {
                C73040SlY.LJLJI = C16880lQ.LLLLL(LIZIZ);
                C37050EgQ c37050EgQ = new C37050EgQ();
                C73040SlY.LJLJJI = c37050EgQ;
                c37050EgQ.LIZ = valueOf;
                c37050EgQ.LIZIZ = language;
                if (!TextUtils.isEmpty("https://www.tiktok.com/link//")) {
                    str = "https://www.tiktok.com/link/";
                }
                c37050EgQ.LIZJ = str;
                C73040SlY.LJLJJL = true;
                if (!C19N.LJ("disable_jsballowlist_exportedto_seclinkallowlist", true)) {
                    LIZ(C38083Ex5.LIZIZ(Collections.singletonList("host"), false));
                }
                if (SecLinkSwitchSettings.LIZ().enable) {
                    C73040SlY.LJLJJI.LJ = SecLinkSwitchSettings.LIZ().timeout;
                    try {
                        SettingsManager LIZLLL = SettingsManager.LIZLLL();
                        secLinkLocalConfig = C37051EgR.LIZ;
                        SecLinkLocalConfig secLinkLocalConfig2 = (SecLinkLocalConfig) LIZLLL.LJIIIIZZ("seclink_white_list_config", SecLinkLocalConfig.class, secLinkLocalConfig);
                        if (secLinkLocalConfig2 != null) {
                            secLinkLocalConfig = secLinkLocalConfig2;
                        }
                    } catch (Throwable unused) {
                        secLinkLocalConfig = C37051EgR.LIZ;
                    }
                    LIZ(secLinkLocalConfig.whiteList);
                } else {
                    try {
                        SettingsManager.LIZLLL().getClass();
                        LIZ2 = (String[]) SettingsManager.LJII("share_h5_url_allowlist", String[].class);
                        C3C5.m7constructorimpl(LIZ2);
                    } catch (Throwable th) {
                        LIZ2 = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ2);
                    }
                    if (C3C5.m12isFailureimpl(LIZ2)) {
                        LIZ2 = null;
                    }
                    String[] strArr = (String[]) LIZ2;
                    if (strArr != null && strArr.length != 0) {
                        LIZ(C47261Igj.LJJIJIIJI(Arrays.copyOf(strArr, strArr.length)));
                    }
                }
                C36849EdB.LIZJ = new C36600EYa();
                return;
            }
            throw new RuntimeException("host can not be empty.");
        }
        throw new RuntimeException("aid can not be empty.");
    }

    public static void LIZ(List list) {
        C37050EgQ c37050EgQ = C73040SlY.LJLJJI;
        if (c37050EgQ.LIZLLL == null) {
            c37050EgQ.LIZLLL = new ArrayList();
        }
        ((ArrayList) c37050EgQ.LIZLLL).addAll(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (android.text.TextUtils.equals("https", r7.getScheme()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ad, code lost:
    
        if (r2 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r8, java.lang.String r9) {
        /*
            X.Eh5 r0 = X.C37090Eh4.LIZ
            com.ss.android.ugc.aweme.local_test.LocalTestApi r0 = r0.LIZ
            r6 = 0
            r5 = 1
            if (r0 == 0) goto Lbc
            boolean r0 = r0.seclinkEnable()
            if (r0 != r5) goto Lbc
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L1a
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L1b
        L1a:
            return r8
        L1b:
            X.EgQ r0 = X.C73040SlY.LJLJJI
            if (r0 != 0) goto L20
            return r8
        L20:
            boolean r0 = X.C37054EgU.LJ(r8)
            if (r0 == 0) goto L27
            return r8
        L27:
            android.net.Uri r7 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)
            java.lang.String r4 = r7.getHost()
            X.EgQ r0 = X.C73040SlY.LJLJJI
            java.util.List<java.lang.String> r1 = r0.LIZLLL
            if (r1 == 0) goto L85
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L85
            java.util.Iterator r3 = r1.iterator()
        L43:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "whiteUrl"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L5b
            goto L43
        L5b:
            boolean r0 = android.text.TextUtils.equals(r4, r2)
            if (r0 != 0) goto L79
            if (r4 == 0) goto L43
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r0 = 46
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            boolean r0 = ujb.o.LJJJJ(r4, r0, r6)
            if (r0 != r5) goto L43
        L79:
            java.lang.String r1 = "https"
            java.lang.String r0 = r7.getScheme()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L1a
        L85:
            r0 = -1
            java.lang.String r8 = X.C37054EgU.LIZ(r0, r8, r9)
            boolean r0 = X.C37054EgU.LJ(r8)
            if (r0 == 0) goto L1a
            X.EAp r2 = X.C35992EAq.LIZ(r7)
            java.lang.String r3 = ""
            if (r2 == 0) goto Laf
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r2.LIZ
            r1.append(r0)
            java.lang.String r0 = r2.LIZIZ
            if (r0 != 0) goto La6
            r0 = r3
        La6:
            r1.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            if (r2 != 0) goto Lb0
        Laf:
            r2 = r3
        Lb0:
            X.Eg0 r1 = new X.Eg0
            r0 = 10002(0x2712, float:1.4016E-41)
            r1.<init>(r0, r2, r3)
            X.C37023Efz.LIZ(r1)
            goto L1a
        Lbc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.seclink.impl.SecLinkManager.LIZIZ(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void LIZJ(WebView webView, String str) {
        o.LJIIIZ(webView, "webView");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        webView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC37049EgP());
        C37057EgX c37057EgX = new C37057EgX(webView, str);
        c37057EgX.LJI = C37020Efw.LIZ;
        c37057EgX.LJII();
        webView.setTag(R.id.ni2, str);
        ((ConcurrentHashMap) LIZ).put(webView, c37057EgX);
    }
}
