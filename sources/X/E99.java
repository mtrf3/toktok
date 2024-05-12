package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.ECommerceThirdPartyHybridServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.IECommerceThirdPartyHybridService;
import com.ss.android.ugc.aweme.ecommerce.router.IThirdPartySparkRouterInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E99 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SparkContext sparkContext, String str) {
        IECommerceThirdPartyHybridService iECommerceThirdPartyHybridService;
        o.LJIIIZ(sparkContext, "sparkContext");
        String str2 = sparkContext.url;
        android.net.Uri uri = UriProtector.parse(str2);
        o.LJIIIIZZ(uri, "uri");
        String uri2 = E98.LIZ(uri, "aweme").toString();
        o.LJIIIIZZ(uri2, "convert(uri, \"aweme\").toString()");
        sparkContext.LJJIJLIJ(uri2);
        Object LIZ2 = C58096Mr6.LIZ(IECommerceThirdPartyHybridService.class, false);
        if (LIZ2 != null) {
            iECommerceThirdPartyHybridService = (IECommerceThirdPartyHybridService) LIZ2;
        } else {
            if (C58096Mr6.E == null) {
                synchronized (IECommerceThirdPartyHybridService.class) {
                    if (C58096Mr6.E == null) {
                        C58096Mr6.E = new ECommerceThirdPartyHybridServiceImpl();
                    }
                }
            }
            iECommerceThirdPartyHybridService = C58096Mr6.E;
        }
        for (IThirdPartySparkRouterInterceptor iThirdPartySparkRouterInterceptor : iECommerceThirdPartyHybridService.LIZ(str2)) {
            if (iThirdPartySparkRouterInterceptor.matchInterceptRules(str2)) {
                iThirdPartySparkRouterInterceptor.handleSparkContext(sparkContext, str2);
            }
        }
    }
}
