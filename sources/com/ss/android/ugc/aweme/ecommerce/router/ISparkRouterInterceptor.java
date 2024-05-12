package com.ss.android.ugc.aweme.ecommerce.router;

import X.InterfaceC60850NuQ;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.RouteIntent;
import java.util.List;

/* loaded from: classes7.dex */
public interface ISparkRouterInterceptor {
    void handleSparkContext(SparkContext sparkContext, String str);

    boolean matchInterceptRules(RouteIntent routeIntent);

    boolean matchInterceptRules(String str);

    List<InterfaceC60850NuQ> provideSparkInterceptActivityCallbacks();
}
