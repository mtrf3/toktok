package com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate;

import X.AbstractC62652d3;
import X.C62712d9;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SmartCheckInterceptor extends AbstractC62652d3 implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        ISmartCheckIntegrate LIZJ = SmartCheckIntegrateImpl.LIZJ();
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        return LIZJ.LIZIZ(str);
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String url) {
        o.LJIIIZ(sparkContext, "sparkContext");
        o.LJIIIZ(url, "url");
        super.handleSparkContext(sparkContext, url);
        SmartCheckIntegrateImpl.LIZJ().LIZ(url, true);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        ISmartCheckIntegrate LIZJ = SmartCheckIntegrateImpl.LIZJ();
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        LIZJ.LIZ(str, false);
        return false;
    }
}
