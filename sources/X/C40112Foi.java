package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import ujb.o;

/* renamed from: X.Foi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40112Foi extends AbstractC62652d3 {
    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        boolean z = true;
        if (str == null || o.LJJJJJL(str)) {
            return false;
        }
        try {
            Integer LJJIL = C38350F3i.LJJIL(ED3.LJ(UriProtector.parse(str), "delay_load_mall_tab"));
            if (LJJIL != null) {
                if (LJJIL.intValue() != 0) {
                    return z;
                }
            }
            z = false;
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        return matchInterceptRules(str);
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String url) {
        Integer LJJIL;
        kotlin.jvm.internal.o.LJIIIZ(sparkContext, "sparkContext");
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        int i = 0;
        try {
            android.net.Uri parse = UriProtector.parse(sparkContext.url);
            Integer LJJIL2 = C38350F3i.LJJIL(ED3.LJ(parse, "delay_load_mall_tab"));
            if (LJJIL2 != null && LJJIL2.intValue() != 0) {
                String authority = parse.getAuthority();
                if (authority != null && o.LJJJJ(authority, "_popup", false)) {
                    sparkContext.LJJIJIIJIL(new CN9());
                } else {
                    sparkContext.LJJIJIIJI(new C40113Foj());
                }
            }
        } catch (Throwable unused) {
        }
        sparkContext.sendEventListener = C38582FCg.LJLIL;
        try {
            LJJIL = C38350F3i.LJJIL(ED3.LJ(UriProtector.parse(sparkContext.url), "after_landing_draw"));
        } catch (Throwable unused2) {
        }
        if (LJJIL != null) {
            i = LJJIL.intValue();
            if (i <= 0) {
                return;
            }
            sparkContext.LJJ(new C40111Foh(i));
        }
    }
}
