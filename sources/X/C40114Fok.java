package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.RouteIntent;
import ujb.o;

/* renamed from: X.Fok, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40114Fok extends E9A {
    @Override // com.ss.android.ugc.aweme.ecommerce.router.IThirdPartySparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent == null || (url = routeIntent.getUrl()) == null) {
            return false;
        }
        return o.LJJJLIIL(url, "aweme://echybrid/intercept_back", false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.IThirdPartySparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        if (str == null) {
            return false;
        }
        return o.LJJJLIIL(str, "aweme://echybrid/intercept_back", false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.IThirdPartySparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String url) {
        kotlin.jvm.internal.o.LJIIIZ(sparkContext, "sparkContext");
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        sparkContext.LJJIJIIJI(new C59905NfB());
    }
}
