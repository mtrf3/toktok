package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C62712d9;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcomOutProductPipeInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    static {
        o.LJIIIIZZ(UriProtector.parse("aweme://echybrid"), "parse(ECRouteConst.EC_HYBRID_ROUTE)");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String queryParameter;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null && (queryParameter = UriProtector.getQueryParameter(uri, "url")) != null && o.LJ("1", UriProtector.getQueryParameter(UriProtector.parse(queryParameter), "outer_ecom_product"))) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        Uri uri;
        IECommerceAnchorService LJJJJI = ECommerceAnchorService.LJJJJI();
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str = UriProtector.getQueryParameter(uri, "url");
        } else {
            str = null;
        }
        LJJJJI.LJIJ(context, str);
        return false;
    }
}
