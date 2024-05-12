package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C62712d9;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public final class EcomCartLynxNetInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String queryParameter;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (queryParameter = UriProtector.getQueryParameter(uri, "url")) == null || !s.LJJJLZIJ(queryParameter, "fe_tiktok_ecommerce_shop_cart", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        if (uri == null) {
            return false;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(uri.getScheme()).encodedAuthority(uri.getAuthority()).encodedPath(uri.getPath());
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        o.LJIIIIZZ(queryParameterNames, "uri.queryParameterNames");
        for (String str : queryParameterNames) {
            builder.appendQueryParameter(str, UriProtector.getQueryParameter(uri, str));
        }
        builder.appendQueryParameter("use_lynx_net_ability", "1");
        routeIntent.setUrl(builder.build().toString());
        return false;
    }
}
