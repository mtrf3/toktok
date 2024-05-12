package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.google.gson.s;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Flb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39919Flb extends AbstractC62652d3 {
    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent != null && (url = routeIntent.getUrl()) != null && UriProtector.getQueryParameter(C17N.LJJJJIZL(url), "lru_cache_init") != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        if (str != null && UriProtector.getQueryParameter(C17N.LJJJJIZL(str), "lru_cache_init") != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String url) {
        String LIZ;
        o.LJIIIZ(sparkContext, "sparkContext");
        o.LJIIIZ(url, "url");
        List<java.util.Map> list = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), UriProtector.getQueryParameter(C17N.LJJJJIZL(url), "lru_cache_init"), C65330PkU.LIZJ(C65352Pkq.LJII(List.class, C65340Pke.LIZ(C65352Pkq.LJIIIIZZ(java.util.Map.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(String.class)))))));
            if (!(fromJson instanceof List)) {
                fromJson = null;
            }
            list = (List) fromJson;
        } catch (s unused) {
        }
        if (list == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.util.Map map : list) {
            String str = (String) map.get(WM7.SCENE_SERVICE);
            if (str != null && (LIZ = C71284RyK.LIZ(str, (String) map.get("key"))) != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("lru_");
                LIZ2.append(str);
                linkedHashMap.put(X1D.LIZIZ(LIZ2), LIZ);
            }
        }
        if (!linkedHashMap.isEmpty()) {
            sparkContext.LJJ(new C39921Fld(linkedHashMap));
        }
    }
}
