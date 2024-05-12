package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomSparkReportConfig;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2uG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73322uG extends AbstractC62652d3 {
    public static final C73322uG LJLIL = new C73322uG();
    public static String LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(String url) {
        C3C4 LIZ;
        String str;
        String str2;
        Object LIZ2;
        Object LIZ3;
        Object LIZ4;
        Object LIZ5;
        o.LJIIIZ(url, "url");
        if (LJLILLLLZI != null) {
            try {
                EcomSparkReportConfig.LIZ.getClass();
                java.util.Map<String, EcomSparkReportConfig.EcomSparkReportConfigModel> map = EcomSparkReportConfig.LIZLLL;
                EcomSparkReportConfig.EcomSparkReportConfigModel ecomSparkReportConfigModel = (EcomSparkReportConfig.EcomSparkReportConfigModel) ((LinkedHashMap) map).get(LJLILLLLZI);
                LIZ = null;
                if (ecomSparkReportConfigModel != null) {
                    str = ecomSparkReportConfigModel.getPageName();
                } else {
                    str = 0;
                }
                EcomSparkReportConfig.EcomSparkReportConfigModel ecomSparkReportConfigModel2 = (EcomSparkReportConfig.EcomSparkReportConfigModel) ((LinkedHashMap) map).get(LJLILLLLZI);
                if (ecomSparkReportConfigModel2 != null) {
                    str2 = ecomSparkReportConfigModel2.getSubPageName();
                } else {
                    str2 = null;
                }
                android.net.Uri uri = UriProtector.parse(url);
                try {
                    LIZ2 = C27739Aud.LIZJ(uri, "trackParams");
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th) {
                    LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (C3C5.m12isFailureimpl(LIZ2)) {
                    LIZ2 = null;
                }
                HashMap hashMap = (HashMap) LIZ2;
                try {
                    LIZ3 = UriProtector.getQueryParameter(uri, "previous_page");
                    C3C5.m7constructorimpl(LIZ3);
                } catch (Throwable th2) {
                    LIZ3 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ3);
                }
                if (C3C5.m12isFailureimpl(LIZ3)) {
                    LIZ3 = null;
                }
                Object obj = (String) LIZ3;
                if (obj == null) {
                    if (hashMap != null) {
                        obj = hashMap.get("previous_page");
                    } else {
                        obj = null;
                    }
                }
                try {
                    LIZ4 = UriProtector.getQueryParameter(uri, "entrance_form");
                    C3C5.m7constructorimpl(LIZ4);
                } catch (Throwable th3) {
                    LIZ4 = C141335gf.LIZ(th3);
                    C3C5.m7constructorimpl(LIZ4);
                }
                if (C3C5.m12isFailureimpl(LIZ4)) {
                    LIZ4 = null;
                }
                Object obj2 = (String) LIZ4;
                if (obj2 == null) {
                    if (hashMap != null) {
                        obj2 = hashMap.get("entrance_form");
                    } else {
                        obj2 = null;
                    }
                }
                try {
                    LIZ5 = UriProtector.getQueryParameter(uri, "enter_from_info");
                    C3C5.m7constructorimpl(LIZ5);
                } catch (Throwable th4) {
                    LIZ5 = C141335gf.LIZ(th4);
                    C3C5.m7constructorimpl(LIZ5);
                }
                if (C3C5.m12isFailureimpl(LIZ5)) {
                    LIZ5 = null;
                }
                Object obj3 = (String) LIZ5;
                if (obj3 == null) {
                    if (hashMap == null) {
                        obj3 = null;
                    } else {
                        obj3 = hashMap.get("enter_from_info");
                    }
                }
                HashMap hashMap2 = new HashMap();
                if (obj != null) {
                    hashMap2.put("previous_page", obj);
                }
                if (obj2 != null) {
                    hashMap2.put("entrance_form", obj2);
                }
                if (obj3 != null) {
                    hashMap2.put("enter_from_info", obj3);
                }
                o.LJIIIIZZ(uri, "uri");
                String LJIJJLI = C78939UyV.LJIJJLI(uri, "is_self");
                if (LJIJJLI != null) {
                    hashMap2.put("is_self", LJIJJLI);
                }
                if (str != 0) {
                    C73332uH.LIZ(PageNodeMonitorService.LJIIIZ(), str, hashMap2, null, str2, 4);
                    LIZ = str;
                }
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th5) {
                LIZ = C141335gf.LIZ(th5);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
            }
        }
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        if (str == null) {
            return false;
        }
        String LJJIIJ = C30591Hz.LJJIIJ(str);
        EcomSparkReportConfig.LIZ.getClass();
        Iterator it = ((LinkedHashMap) EcomSparkReportConfig.LIZLLL).entrySet().iterator();
        while (it.hasNext()) {
            EcomSparkReportConfig.EcomSparkReportConfigModel ecomSparkReportConfigModel = (EcomSparkReportConfig.EcomSparkReportConfigModel) ((Map.Entry) it.next()).getValue();
            if (s.LJJJLZIJ(LJJIIJ, ecomSparkReportConfigModel.getChannel(), false)) {
                if (C78685UuP.LJJJZ(ecomSparkReportConfigModel.getSubParam()) && C78685UuP.LJJJZ(ecomSparkReportConfigModel.getSubValue())) {
                    String queryParameter = UriProtector.getQueryParameter(C17N.LJJJJIZL(str), ecomSparkReportConfigModel.getSubParam());
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    if (s.LJJJLZIJ(queryParameter, ecomSparkReportConfigModel.getSubValue(), false)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(ecomSparkReportConfigModel.getChannel());
                        LIZ.append('_');
                        LIZ.append(ecomSparkReportConfigModel.getSubParam());
                        LIZ.append('_');
                        LIZ.append(ecomSparkReportConfigModel.getSubValue());
                        LJLILLLLZI = X1D.LIZIZ(LIZ);
                        return true;
                    }
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(ecomSparkReportConfigModel.getChannel());
                    LIZ2.append('_');
                    LIZ2.append(ecomSparkReportConfigModel.getSubParam());
                    LIZ2.append('_');
                    LIZ2.append(ecomSparkReportConfigModel.getSubValue());
                    LJLILLLLZI = X1D.LIZIZ(LIZ2);
                    return true;
                }
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
        if (sparkContext.usePreload) {
            return;
        }
        LIZ(url);
    }
}
