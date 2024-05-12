package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C62712d9;
import X.C774332d;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public final class EcomSparkH5AdaptInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || !o.LJ(UriProtector.getQueryParameter(uri, "use_spark"), "1") || o.LJ(UriProtector.getQueryParameter(uri, "business_from"), "ecom")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String queryParameter;
        if (routeIntent == null) {
            return false;
        }
        for (String str : s.LJLJJI(C774332d.LIZ, new char[]{','}, false, 6)) {
            if (str.length() > 0 && (queryParameter = UriProtector.getQueryParameter(routeIntent.getUri(), "url")) != null && s.LJJJLZIJ(queryParameter, str, false)) {
                Uri uri = routeIntent.getUri();
                Uri.Builder builder = new Uri.Builder();
                builder.scheme(uri.getScheme()).encodedAuthority(uri.getAuthority()).encodedPath(uri.getPath());
                Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                o.LJIIIIZZ(queryParameterNames, "uri.queryParameterNames");
                for (String str2 : queryParameterNames) {
                    builder.appendQueryParameter(str2, UriProtector.getQueryParameter(uri, str2));
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ecom");
                LIZ.append(",crossPlatform");
                builder.appendQueryParameter("target_handler", X1D.LIZIZ(LIZ));
                builder.appendQueryParameter("business_from", "ecom");
                routeIntent.setUrl(builder.build().toString());
                return false;
            }
        }
        return false;
    }
}
