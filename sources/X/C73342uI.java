package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomSparkLruInjectConfig;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomSparkSubInterceptorProvider;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomSparkChannelInterceptorService;
import com.ss.android.ugc.aweme.impl.OptimizerHelperServiceImpl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2uI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73342uI extends AbstractC62652d3 {
    public static final C73342uI LJLIL = new C73342uI();
    public static final java.util.Map<String, String> LJLILLLLZI = new LinkedHashMap();
    public static final List<InterfaceC73352uJ> LJLJI;

    static {
        IEcomSparkChannelInterceptorService iEcomSparkChannelInterceptorService;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(new E9B(), new InterfaceC73352uJ() { // from class: X.2uR
            @Override // X.InterfaceC73352uJ
            public final boolean LIZ(String str) {
                return true;
            }

            @Override // X.InterfaceC73352uJ
            public final void LIZIZ(SparkContext sparkContext, String url, String str) {
                o.LJIIIZ(sparkContext, "sparkContext");
                o.LJIIIZ(url, "url");
                try {
                    String str2 = sparkContext.defaultParams.get("jato_boost_ms");
                    if (str2 != null) {
                        Long valueOf = Long.valueOf(CastLongProtector.parseLong(str2));
                        if (valueOf != null) {
                            OptimizerHelperServiceImpl.LJIIIZ().LJIIIIZZ(valueOf.longValue(), 2, 8, 4, 1);
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                }
            }
        }, new InterfaceC73352uJ() { // from class: X.2d4
            public final C62822Ol8 LIZ = C221108m2.LIZIZ(C60012Xd.LJLIL);

            @Override // X.InterfaceC73352uJ
            public final boolean LIZ(String str) {
                return ((java.util.Map) this.LIZ.getValue()).keySet().contains(str);
            }

            @Override // X.InterfaceC73352uJ
            public final void LIZIZ(SparkContext sparkContext, String url, String str) {
                String obj;
                o.LJIIIZ(sparkContext, "sparkContext");
                o.LJIIIZ(url, "url");
                EcomSparkLruInjectConfig.EcomSparkLruInjectModel ecomSparkLruInjectModel = (EcomSparkLruInjectConfig.EcomSparkLruInjectModel) ((java.util.Map) this.LIZ.getValue()).get(str);
                if (ecomSparkLruInjectModel != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (EcomSparkLruInjectConfig.EcomSparkLruInjectCache ecomSparkLruInjectCache : ecomSparkLruInjectModel.getCache()) {
                        if (!C78685UuP.LJJJZ(ecomSparkLruInjectCache.getSubChannel()) || s.LJJJLZIJ(url, ecomSparkLruInjectCache.getSubChannel(), false)) {
                            String scene = ecomSparkLruInjectCache.getScene();
                            String key = ecomSparkLruInjectCache.getKey();
                            if (key == null || o.LJ(key, "user_id")) {
                                obj = C71284RyK.LIZJ;
                            } else {
                                Object queryParameter = UriProtector.getQueryParameter(C17N.LJJJJIZL(url), key);
                                if ((queryParameter == null && (queryParameter = sparkContext.extraRuntimeInfo.get((Object) key)) == null) || (obj = queryParameter.toString()) == null) {
                                    obj = C71284RyK.LIZJ;
                                }
                            }
                            String LIZ = C71284RyK.LIZ(scene, obj);
                            if (LIZ != null) {
                                linkedHashMap.put(ecomSparkLruInjectCache.getScene(), LIZ);
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("scene: ");
                                LIZ2.append(ecomSparkLruInjectCache.getScene());
                                String LIZIZ = X1D.LIZIZ(LIZ2);
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("key: ");
                                LIZ3.append(ecomSparkLruInjectCache.getKey());
                                linkedHashMap2.put(LIZIZ, X1D.LIZIZ(LIZ3));
                            }
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        sparkContext.LJJ(new C39925Flh(linkedHashMap));
                    }
                    sparkContext.LJJIIZ(linkedHashMap2, "lru_with_template_data");
                }
            }
        }, new InterfaceC73352uJ() { // from class: X.2uO
            @Override // X.InterfaceC73352uJ
            public final boolean LIZ(String str) {
                return true;
            }

            @Override // X.InterfaceC73352uJ
            public final void LIZIZ(SparkContext sparkContext, String url, String str) {
                o.LJIIIZ(sparkContext, "sparkContext");
                o.LJIIIZ(url, "url");
                if (sparkContext.extraRuntimeInfo.get((Object) "use_gec_image") == null) {
                    return;
                }
                sparkContext.LJJIFFI(1, "enable_lynx_builder_opt");
                sparkContext.LJJ(new C58594Mz8(str));
            }
        });
        Object LIZ = C58096Mr6.LIZ(IEcomSparkChannelInterceptorService.class, false);
        if (LIZ != null) {
            iEcomSparkChannelInterceptorService = (IEcomSparkChannelInterceptorService) LIZ;
        } else {
            if (C58096Mr6.O == null) {
                synchronized (IEcomSparkChannelInterceptorService.class) {
                    if (C58096Mr6.O == null) {
                        C58096Mr6.O = new EcomSparkSubInterceptorProvider();
                    }
                }
            }
            iEcomSparkChannelInterceptorService = C58096Mr6.O;
        }
        LJLJI = ORZ.LLIIIZ(iEcomSparkChannelInterceptorService.LIZ(), LJJIJIIJI);
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        if (str == null) {
            return false;
        }
        String LJJIIJ = C30591Hz.LJJIIJ(str);
        if (LJLILLLLZI.containsKey(LJJIIJ)) {
            return true;
        }
        for (String str2 : C62702d8.LIZ) {
            if (s.LJJJLZIJ(LJJIIJ, str2, false)) {
                LJLILLLLZI.put(LJJIIJ, str2);
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

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String url) {
        o.LJIIIZ(sparkContext, "sparkContext");
        o.LJIIIZ(url, "url");
        String str = (String) ((LinkedHashMap) LJLILLLLZI).get(C30591Hz.LJJIIJ(url));
        if (str == null) {
            return;
        }
        for (InterfaceC73352uJ interfaceC73352uJ : LJLJI) {
            if (interfaceC73352uJ.LIZ(str)) {
                interfaceC73352uJ.LIZIZ(sparkContext, url, str);
            }
        }
    }
}
