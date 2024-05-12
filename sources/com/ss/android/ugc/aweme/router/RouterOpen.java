package com.ss.android.ugc.aweme.router;

import X.C16880lQ;
import X.C38957FQr;
import X.C38959FQt;
import X.C40144FpE;
import X.C62712d9;
import X.FBJ;
import X.FBP;
import X.FBS;
import X.InterfaceC39467FeJ;
import X.OSJ;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.pumbaa.hybrid.rasp.RaspServiceImpl;
import com.bytedance.pumbaa.hybrid.rasp.api.IRaspService;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.AqS30S0100100_6;
import kotlin.jvm.internal.AqS36S0100100_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class RouterOpen implements InterfaceC39467FeJ, IInterceptor {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // X.InterfaceC39467FeJ
    public final String LIZ(String str) {
        if (!TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("aweme://webview/?url=");
            LIZ.append(Uri.encode(str));
            str = X1D.LIZIZ(LIZ);
        }
        IRaspService LJIIIIZZ = RaspServiceImpl.LJIIIIZZ();
        if ((LJIIIIZZ != null && LJIIIIZZ.LJI(str, "router").booleanValue()) || LiveOuterService.LJJJLL().LJJIIJ().LIZIZ(null, str).booleanValue()) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ea, code lost:
    
        if (X.TMC.LJJIJIL(r4) != false) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ed A[RETURN] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r15) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.router.RouterOpen.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle bundle;
        if (this.LJLIL) {
            this.LJLIL = false;
            if (routeIntent.getExtra() != null) {
                C16880lQ.LLJJIJI(routeIntent.getExtra());
            }
            C38957FQr LJJIIJ = LiveOuterService.LJJJLL().LJJIIJ();
            Uri uri = routeIntent.getUri();
            LJJIIJ.getClass();
            if (C38959FQt.LIZ(uri, context)) {
                return true;
            }
        }
        String str = null;
        Bundle bundle2 = null;
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            if (routeIntent.getExtra() != null) {
                bundle2 = C16880lQ.LLJJIJI(routeIntent.getExtra());
            }
            BulletService.LIZ().open(context, routeIntent.getUrl(), bundle2);
            return true;
        }
        if (this.LJLJI) {
            this.LJLJI = false;
            if (routeIntent.getExtra() != null) {
                bundle = C16880lQ.LLJJIJI(routeIntent.getExtra());
            } else {
                bundle = null;
            }
            if (routeIntent.getData() != null && bundle != null) {
                bundle.putString("url", routeIntent.getData().toString());
            }
            if (this.LJLJJLL) {
                str = "webcast";
            } else if (this.LJLJJL) {
                str = "crossPlatform";
            }
            C40144FpE.LIZIZ.LIZLLL(context, routeIntent.getUrl(), str, bundle);
            return true;
        }
        if (!this.LJLJJI) {
            return false;
        }
        this.LJLJJI = false;
        String shortLink = routeIntent.getUrl();
        o.LJIIJ(context, "context");
        o.LJIIJ(shortLink, "shortLink");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tech", "client_short_link");
        long currentTimeMillis = System.currentTimeMillis();
        OSJ LIZ = FBP.LIZ(shortLink);
        String str2 = (String) LIZ.getFirst();
        jSONObject.put("result", str2).put("pageGroupKey", LIZ.getSecond()).put("pageNameKey", LIZ.getThird());
        FBS fbs = FBJ.LIZ;
        if (fbs != null) {
            fbs.LIZ(context, str2, new AqS36S0100100_6(jSONObject, currentTimeMillis, 1), new AqS30S0100100_6(jSONObject, currentTimeMillis, 1));
            return true;
        }
        o.LJIJI("hostDepend");
        throw null;
    }
}
