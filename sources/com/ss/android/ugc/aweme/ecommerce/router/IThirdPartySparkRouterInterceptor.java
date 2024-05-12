package com.ss.android.ugc.aweme.ecommerce.router;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.RouteIntent;

/* loaded from: classes7.dex */
public interface IThirdPartySparkRouterInterceptor {
    void handleSparkContext(SparkContext sparkContext, String str);

    boolean matchInterceptRules(RouteIntent routeIntent);

    boolean matchInterceptRules(String str);
}
