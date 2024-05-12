package com.ss.android.ugc.aweme.ecommerce.fashionmall.router;

import X.C00F;
import X.C16880lQ;
import X.C53380KxE;
import X.C55900Lwm;
import X.C56045Lz7;
import X.C62712d9;
import X.C76542zS;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.app.AwemeApplicationServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ECMallRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        return o.LJ(str, "ec");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2;
        String str3;
        String str4;
        SmartRoute smartRoute;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10 = null;
        if (routeIntent != null) {
            str = routeIntent.getPath();
        } else {
            str = null;
        }
        if (!o.LJ(str, "/fashion_mall") || !C53380KxE.LIZ()) {
            return false;
        }
        Intent extra = routeIntent.getExtra();
        if (extra != null) {
            str2 = C16880lQ.LLJJIJIIJIL(extra, "deeplink_type");
        } else {
            str2 = null;
        }
        Intent extra2 = routeIntent.getExtra();
        if (extra2 != null) {
            str3 = C16880lQ.LLJJIJIIJIL(extra2, "top_product_id");
        } else {
            str3 = null;
        }
        Intent extra3 = routeIntent.getExtra();
        if (extra3 != null) {
            str4 = C16880lQ.LLJJIJIIJIL(extra3, "previous_page");
        } else {
            str4 = null;
        }
        String originUrl = routeIntent.getOriginUrl();
        boolean isAppHot = AwemeApplicationServiceImpl.LIZ().isAppHot();
        if (ECommerceMallService.x3().LLLIIL()) {
            smartRoute = SmartRouter.buildRoute(context, "//main");
            smartRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FASHION_MALL");
            str7 = "1";
            str6 = "";
            str5 = CardStruct.IStatusCode.DEFAULT;
        } else {
            if (!isAppHot) {
                smartRoute = SmartRouter.buildRoute(context, "//main");
            } else {
                smartRoute = null;
            }
            str5 = "-1";
            str6 = "get tab info failed";
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        if (smartRoute != null) {
            smartRoute.withParam("extra_deeplink_schema", originUrl);
            if (str4 == null || ujb.o.LJJJJJL(str4)) {
                str9 = "unknown";
            } else if (str2 == null || ujb.o.LJJJJJL(str2)) {
                str9 = str4;
            } else {
                str9 = C00F.LIZIZ(str4, '_', str2);
            }
            smartRoute.withParam("extra_non_click_open_from", str9);
            smartRoute.withParam("extra_product_id", str3);
            smartRoute.addFlags(67108864);
            smartRoute.open();
        }
        Intent extra4 = routeIntent.getExtra();
        if (extra4 != null) {
            str8 = C16880lQ.LLJJIJIIJIL(extra4, "creative_id");
        } else {
            str8 = null;
        }
        Intent extra5 = routeIntent.getExtra();
        if (extra5 != null) {
            str10 = C16880lQ.LLJJIJIIJIL(extra5, "campaign_id");
        }
        C56045Lz7.LIZ.getClass();
        C76542zS.LIZJ("rd_tiktokec_mall_home_route", new C55900Lwm(str7, str2, str3, str6, str5, str4, originUrl, str8, str10));
        return true;
    }
}
