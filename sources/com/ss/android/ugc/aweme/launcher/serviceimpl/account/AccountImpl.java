package com.ss.android.ugc.aweme.launcher.serviceimpl.account;

import X.C09900aA;
import X.C1DJ;
import X.C35154Dqw;
import X.C36922EeM;
import X.C38653FEz;
import X.C58725N2z;
import X.C66952QPk;
import X.C66953QPl;
import X.C67125QWb;
import X.C67128QWe;
import X.C68736QyK;
import X.C68737QyL;
import X.C84763XOl;
import X.FX7;
import X.FZD;
import X.J9O;
import com.ss.android.ugc.aweme.launcher.service.account.IAccountApi;
import com.ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AccountImpl implements IAccountApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final String LJFF() {
        return "mobile";
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final boolean LIZ() {
        C68736QyK c68736QyK = C68736QyK.LIZLLL;
        c68736QyK.getClass();
        c68736QyK.LIZIZ(C58725N2z.LIZ);
        C68737QyL[] c68737QyLArr = c68736QyK.LIZIZ;
        for (C68737QyL c68737QyL : c68737QyLArr) {
            if (c68737QyL.LIZJ) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final J9O LJ() {
        return new I18nLoginActivityComponent();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (com.bytedance.ies.abmock.SettingsManager.LIZ("http_cookie_error", true) != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getSessionId() {
        /*
            r9 = this;
            java.lang.String r8 = ""
            r7 = 1
            java.lang.String r2 = com.ss.android.common.util.NetworkUtils.getShareCookieHost()     // Catch: java.lang.IllegalArgumentException -> L35
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L16
            java.lang.String r0 = "http_cookie_error"
            r1.getClass()     // Catch: java.lang.Exception -> L16
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r7)     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L24
        L16:
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch: java.lang.IllegalArgumentException -> L35
            java.lang.String r1 = r2.toLowerCase(r0)     // Catch: java.lang.IllegalArgumentException -> L35
            java.lang.String r0 = "https"
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.IllegalArgumentException -> L35
            if (r0 == 0) goto L2d
        L24:
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.IllegalArgumentException -> L35
            java.lang.String r1 = X.FXJ.LIZ(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L35
            goto L36
        L2d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L35
            java.lang.String r0 = "Cookie url must be https"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L35
            throw r1     // Catch: java.lang.IllegalArgumentException -> L35
        L35:
            r1 = r8
        L36:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L3e
            r8 = 0
        L3d:
            return r8
        L3e:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L3d
            java.lang.String r0 = ";"
            java.lang.String[] r6 = r1.split(r0)
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L4d:
            if (r3 >= r5) goto L3d
            r1 = r6[r3]
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L5a
        L57:
            int r3 = r3 + 1
            goto L4d
        L5a:
            java.lang.String r0 = "="
            java.lang.String[] r2 = r1.split(r0)
            int r1 = r2.length
            r0 = 2
            if (r1 < r0) goto L57
            r0 = r2[r4]
            java.lang.String r1 = r0.trim()
            java.lang.String r0 = "sessionid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L57
            r8 = r2[r7]
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.launcher.serviceimpl.account.AccountImpl.getSessionId():java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LIZLLL() {
        boolean z;
        boolean z2;
        boolean z3;
        if (FZD.LIZ() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C36922EeM.LIZLLL(4, "ws", "connectWsFromRedPointTask return cause experiment");
            return;
        }
        if (C1DJ.LJLILLLLZI) {
            C1DJ.LJLILLLLZI = false;
            C36922EeM.LIZLLL(4, "ws", "connectWsFromRedPointTask return cause isFirstConnectWsFromRedPointTask");
            return;
        }
        if (FZD.LIZ() == 2 || FZD.LIZ() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_background", C84763XOl.LJIIJJI);
        jSONObject.put("experiment_group", FZD.LIZ());
        if (FZD.LIZ() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            C1DJ.LJI("onresume_connect_force", z2);
            C09900aA.LJIIJJI("aweme_long_connection_on_resume", 1, jSONObject);
            return;
        }
        if (C35154Dqw.LIZ()) {
            if (!(!C67128QWe.LIZIZ.isConnected())) {
                C09900aA.LJIIJJI("aweme_long_connection_on_resume", 0, jSONObject);
                return;
            }
        } else {
            C67125QWb.LJLL.getClass();
        }
        C1DJ.LJI("onresume_connect_when_need", z2);
        C09900aA.LJIIJJI("aweme_long_connection_on_resume", 1, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final boolean LIZIZ(String str) {
        return C68736QyK.LIZLLL.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LJII(Collection<String> collection) {
        if (C66952QPk.LIZ) {
            FX7 fx7 = C66953QPl.LJZL.LJLJJLL;
            if (fx7 != null && ((ArrayList) collection).size() > 0) {
                ((CopyOnWriteArraySet) fx7.LIZIZ).addAll(collection);
                return;
            }
            return;
        }
        Set<String> set = C66952QPk.LIZJ;
        if (set == null) {
            return;
        }
        set.addAll(collection);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LJIIIIZZ(String str, boolean z) {
        C1DJ.LJI(str, z);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LJI(String str, String str2, String str3) {
        C38653FEz.LIZ = str;
    }
}
