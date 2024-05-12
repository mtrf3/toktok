package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.AbstractC62652d3;
import X.C40127Fox;
import X.C40129Foz;
import X.C47261Igj;
import X.C61878OQg;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaService;
import com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class BusinessEComSparkRouterInterceptorsProvider implements IEComHybridSparkInterceptorService {
    public final List<ISparkRouterInterceptor> LIZ;

    public BusinessEComSparkRouterInterceptorsProvider() {
        List<ISparkRouterInterceptor> LIZ;
        List<ISparkRouterInterceptor> LJJIJIL = C47261Igj.LJJIJIL(new C40129Foz(), EcomGeckoUpdateInterceptor.LJLIL, new AbstractC62652d3() { // from class: X.2d5
            public final java.util.Map<String, String> LJLIL = new LinkedHashMap();

            @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
            public final void handleSparkContext(SparkContext sparkContext, String url) {
                o.LJIIIZ(sparkContext, "sparkContext");
                o.LJIIIZ(url, "url");
            }

            @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
            public final boolean matchInterceptRules(String str) {
                if (str == null) {
                    return false;
                }
                if (s.LJJJLZIJ(str, "enable_ec_debug=1", false)) {
                    return true;
                }
                android.net.Uri LJJJJIZL = C17N.LJJJJIZL(str);
                String queryParameter = UriProtector.getQueryParameter(LJJJJIZL, "channel");
                if (queryParameter != null || (queryParameter = UriProtector.getQueryParameter(LJJJJIZL, "url")) != null || (queryParameter = UriProtector.getQueryParameter(LJJJJIZL, "surl")) != null) {
                    str = queryParameter;
                }
                if (this.LJLIL.containsKey(str)) {
                    return true;
                }
                for (String str2 : C62692d7.LIZ) {
                    if (s.LJJJLZIJ(str, str2, false)) {
                        this.LJLIL.put(str, str2);
                        return true;
                    }
                }
                return false;
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
        });
        IEcSchemaService LIZJ = EcSchemaService.LIZJ();
        if (LIZJ != null && (LIZ = LIZJ.LIZ()) != null) {
            Iterator<ISparkRouterInterceptor> it = LIZ.iterator();
            while (it.hasNext()) {
                LJJIJIL.add(it.next());
            }
        }
        this.LIZ = LJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService
    public final List<ISparkRouterInterceptor> LIZ(String str) {
        C40127Fox.LIZ.getClass();
        if (C40127Fox.LIZ().enableSparkContainer || (str != null && s.LJJJLZIJ(str, "use_spark=1", true))) {
            return this.LIZ;
        }
        return C61878OQg.INSTANCE;
    }
}
