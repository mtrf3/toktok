package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckInterceptor;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2d3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC62652d3 implements ISparkRouterInterceptor {
    @Override // com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public void handleSparkContext(SparkContext sparkContext, String url) {
        o.LJIIIZ(sparkContext, "sparkContext");
        o.LJIIIZ(url, "url");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public boolean matchInterceptRules(String str) {
        return this instanceof SmartCheckInterceptor;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public List<InterfaceC60850NuQ> provideSparkInterceptActivityCallbacks() {
        return C61878OQg.INSTANCE;
    }
}
