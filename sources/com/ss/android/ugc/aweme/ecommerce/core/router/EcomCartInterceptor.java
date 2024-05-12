package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C113554cx;
import X.C27739Aud;
import X.C47261Igj;
import X.C62712d9;
import X.C774032a;
import X.FFL;
import X.OSZ;
import X.WM7;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EComCartFirstScreenOptPreciseConfig;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public final class EcomCartInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String queryParameter;
        FFL LJIIIZ = FFL.LJIIIZ();
        EComCartFirstScreenOptPreciseConfig eComCartFirstScreenOptPreciseConfig = C774032a.LIZ;
        LJIIIZ.getClass();
        EComCartFirstScreenOptPreciseConfig eComCartFirstScreenOptPreciseConfig2 = (EComCartFirstScreenOptPreciseConfig) FFL.LJIJ(true, "ecom_cart_first_screen_optimize_precise_setting", 31744, EComCartFirstScreenOptPreciseConfig.class, eComCartFirstScreenOptPreciseConfig);
        if (eComCartFirstScreenOptPreciseConfig2 == null) {
            eComCartFirstScreenOptPreciseConfig2 = eComCartFirstScreenOptPreciseConfig;
        }
        if (!eComCartFirstScreenOptPreciseConfig2.enable) {
            return false;
        }
        FFL.LJIIIZ().getClass();
        EComCartFirstScreenOptPreciseConfig eComCartFirstScreenOptPreciseConfig3 = (EComCartFirstScreenOptPreciseConfig) FFL.LJIJ(true, "ecom_cart_first_screen_optimize_precise_setting", 31744, EComCartFirstScreenOptPreciseConfig.class, eComCartFirstScreenOptPreciseConfig);
        if (eComCartFirstScreenOptPreciseConfig3 != null) {
            eComCartFirstScreenOptPreciseConfig = eComCartFirstScreenOptPreciseConfig3;
        }
        String str = eComCartFirstScreenOptPreciseConfig.channel;
        if (str != null && str.length() != 0 && routeIntent != null && (uri = routeIntent.getUri()) != null && (queryParameter = UriProtector.getQueryParameter(uri, "url")) != null && s.LJJJLZIJ(queryParameter, str, false)) {
            return true;
        }
        return false;
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
        Uri uri2 = routeIntent.getUri();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(uri2.getScheme()).encodedAuthority(uri2.getAuthority()).encodedPath(uri2.getPath());
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri2);
        o.LJIIIIZZ(queryParameterNames, "uri.queryParameterNames");
        for (String str : queryParameterNames) {
            builder.appendQueryParameter(str, UriProtector.getQueryParameter(uri2, str));
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cart_cache_");
        LIZ.append(createIUserServicebyMonsterPlugin.getCurrentUserID());
        builder.appendQueryParameter("lru_cache_init", C27739Aud.LJI(C47261Igj.LJJIJ(C113554cx.LJJL(new OSZ(WM7.SCENE_SERVICE, "cart_cache"), new OSZ("key", X1D.LIZIZ(LIZ))))));
        builder.appendQueryParameter("target_handler", "ecom,webcast");
        builder.appendQueryParameter("business_from", "ecom");
        routeIntent.setUrl(builder.build().toString());
        return false;
    }
}
