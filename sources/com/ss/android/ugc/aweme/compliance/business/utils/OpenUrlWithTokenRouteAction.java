package com.ss.android.ugc.aweme.compliance.business.utils;

import X.C16880lQ;
import X.C188727au;
import X.C26005AIn;
import X.C30591Hz;
import X.C78685UuP;
import X.FMX;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.AgeAppealService;
import java.net.URLDecoder;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public final class OpenUrlWithTokenRouteAction implements IRouteAction {
    public static final int $stable = 0;

    public final void openExternalBrowser(String str, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        if (context != null) {
            try {
                C16880lQ.LIZJ(context, intent);
            } catch (Exception e) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("exception", String.valueOf(e.getMessage()));
                FMX.LJIIL("open_url_with_token_error", c188727au.LIZ);
            }
        }
    }

    public final void openInternalBrowser(String str, Context context) {
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview");
        buildRoute.withParam(UriProtector.parse(str));
        buildRoute.open(17);
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String clientUrl = URLDecoder.decode(C30591Hz.LJIILIIL(str, "url"), "UTF-8");
        String LJIILIIL = C30591Hz.LJIILIIL(str, "enter_from");
        String LJIILIIL2 = C30591Hz.LJIILIIL(str, "in_app");
        String LJIILIIL3 = C30591Hz.LJIILIIL(str, "verify_ticket");
        String LJIILIIL4 = C30591Hz.LJIILIIL(str, "passport_domain");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LJIILIIL);
        c188727au.LJIIIZ("in_app", LJIILIIL2);
        FMX.LJIIL("open_url_with_token", c188727au.LIZ);
        if (C78685UuP.LJJJZ(LJIILIIL3)) {
            if (o.LJ(LJIILIIL2, "1")) {
                openInternalBrowser(C26005AIn.LIZ(clientUrl, LJIILIIL3, String.valueOf(1233), LJIILIIL4), context);
            } else {
                openExternalBrowser(C26005AIn.LIZ(clientUrl, LJIILIIL3, String.valueOf(1233), LJIILIIL4), context);
            }
            return Boolean.TRUE;
        }
        if (o.LJ(LJIILIIL2, "1")) {
            a.LIZ.getClass();
            AgeAppealService LIZ = a.LIZ();
            if (LIZ != null) {
                o.LJIIIIZZ(clientUrl, "clientUrl");
                LIZ.LIZ(clientUrl, new AqS135S0200000_4(this, context, 5));
            }
        } else {
            a.LIZ.getClass();
            AgeAppealService LIZ2 = a.LIZ();
            if (LIZ2 != null) {
                o.LJIIIIZZ(clientUrl, "clientUrl");
                LIZ2.LIZ(clientUrl, new AqS135S0200000_4(this, context, 6));
            }
        }
        return Boolean.TRUE;
    }
}
