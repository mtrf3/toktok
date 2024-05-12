package X;

import com.bytedance.router.RouteIntent;
import java.util.List;
import ujb.o;

/* renamed from: X.Foz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40129Foz extends AbstractC62652d3 {
    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final List<InterfaceC60850NuQ> provideSparkInterceptActivityCallbacks() {
        return C47261Igj.LJJIJ(new C59904NfA());
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent == null || (url = routeIntent.getUrl()) == null) {
            return false;
        }
        return o.LJJJLIIL(url, "aweme://echybrid/intercept_back", false);
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        if (str == null) {
            return false;
        }
        return o.LJJJLIIL(str, "aweme://echybrid/intercept_back", false);
    }
}
