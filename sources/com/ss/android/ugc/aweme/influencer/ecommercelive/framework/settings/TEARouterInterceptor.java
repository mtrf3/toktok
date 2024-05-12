package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings;

import X.C05600Jw;
import X.C113554cx;
import X.C30591Hz;
import X.C47261Igj;
import X.C51029K0z;
import X.C62712d9;
import X.C78857UxB;
import X.C78939UyV;
import X.C79605VMb;
import X.OJD;
import X.OSZ;
import X.X1D;
import android.net.Uri;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.TEAH5GlobalInterceptorConfig;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.TEARouterInterceptorConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class TEARouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    public static boolean LIZ(Uri uri) {
        TEAH5GlobalInterceptorConfig.TEAH5GlobalInterceptorConfigModel tEAH5GlobalInterceptorConfigModel;
        List<String> list;
        if (o.LJ(C30591Hz.LJIIJJI(uri, "disable_tea_h5global_intercept"), "1")) {
            return false;
        }
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            tEAH5GlobalInterceptorConfigModel = TEAH5GlobalInterceptorConfig.LIZ;
            TEAH5GlobalInterceptorConfig.TEAH5GlobalInterceptorConfigModel tEAH5GlobalInterceptorConfigModel2 = (TEAH5GlobalInterceptorConfig.TEAH5GlobalInterceptorConfigModel) LIZLLL.LJIIIIZZ("ec_affiliate_creator_route_h5global_interceptor_config", TEAH5GlobalInterceptorConfig.TEAH5GlobalInterceptorConfigModel.class, tEAH5GlobalInterceptorConfigModel);
            if (tEAH5GlobalInterceptorConfigModel2 != null) {
                tEAH5GlobalInterceptorConfigModel = tEAH5GlobalInterceptorConfigModel2;
            }
        } catch (Throwable unused) {
            tEAH5GlobalInterceptorConfigModel = TEAH5GlobalInterceptorConfig.LIZ;
        }
        if (tEAH5GlobalInterceptorConfigModel.enable && (list = tEAH5GlobalInterceptorConfigModel.interceptSchema) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (LIZJ(it.next(), uri.toString())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZLLL(Uri uri) {
        TEARouterInterceptorConfig.TEARouterInterceptorConfigModel tEARouterInterceptorConfigModel;
        List<String> list;
        if (o.LJ(C30591Hz.LJIIJJI(uri, "disable_tea_intercept"), "1")) {
            return false;
        }
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            tEARouterInterceptorConfigModel = TEARouterInterceptorConfig.LIZ;
            TEARouterInterceptorConfig.TEARouterInterceptorConfigModel tEARouterInterceptorConfigModel2 = (TEARouterInterceptorConfig.TEARouterInterceptorConfigModel) LIZLLL.LJIIIIZZ("ec_affiliate_creator_route_interceptor_config", TEARouterInterceptorConfig.TEARouterInterceptorConfigModel.class, tEARouterInterceptorConfigModel);
            if (tEARouterInterceptorConfigModel2 != null) {
                tEARouterInterceptorConfigModel = tEARouterInterceptorConfigModel2;
            }
        } catch (Throwable unused) {
            tEARouterInterceptorConfigModel = TEARouterInterceptorConfig.LIZ;
        }
        if (tEARouterInterceptorConfigModel.enable && (list = tEARouterInterceptorConfigModel.interceptSchema) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (LIZJ(it.next(), uri.toString())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Uri LJFF(Uri uri) {
        TEAH5GlobalInterceptorConfig.TEAH5GlobalInterceptorConfigModel tEAH5GlobalInterceptorConfigModel;
        Uri uri2;
        String str;
        String str2;
        if (!LIZ(uri)) {
            return uri;
        }
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            tEAH5GlobalInterceptorConfigModel = TEAH5GlobalInterceptorConfig.LIZ;
            TEAH5GlobalInterceptorConfig.TEAH5GlobalInterceptorConfigModel tEAH5GlobalInterceptorConfigModel2 = (TEAH5GlobalInterceptorConfig.TEAH5GlobalInterceptorConfigModel) LIZLLL.LJIIIIZZ("ec_affiliate_creator_route_h5global_interceptor_config", TEAH5GlobalInterceptorConfig.TEAH5GlobalInterceptorConfigModel.class, tEAH5GlobalInterceptorConfigModel);
            if (tEAH5GlobalInterceptorConfigModel2 != null) {
                tEAH5GlobalInterceptorConfigModel = tEAH5GlobalInterceptorConfigModel2;
            }
        } catch (Throwable unused) {
            tEAH5GlobalInterceptorConfigModel = TEAH5GlobalInterceptorConfig.LIZ;
        }
        List<TEAH5GlobalInterceptorConfig.Interceptor> list = tEAH5GlobalInterceptorConfigModel.interceptors;
        TEAH5GlobalInterceptorConfig.Interceptor interceptor = null;
        if (list != null) {
            Iterator<TEAH5GlobalInterceptorConfig.Interceptor> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TEAH5GlobalInterceptorConfig.Interceptor next = it.next();
                if (LJ(uri, next)) {
                    interceptor = next;
                    break;
                }
            }
            interceptor = interceptor;
        }
        Uri LJIILL = C30591Hz.LJIILL(uri);
        if (LJIILL == null) {
            LJIILL = Uri.EMPTY;
        }
        String path = LJIILL.getPath();
        String str3 = "";
        if (path == null) {
            path = "";
        }
        if (interceptor != null) {
            List<TEAH5GlobalInterceptorConfig.Rule> list2 = interceptor.replaceRule;
            if (list2 != null) {
                str2 = path;
                for (TEAH5GlobalInterceptorConfig.Rule rule : list2) {
                    str2 = new OJD(rule.origin).replace(str2, rule.value);
                }
            } else {
                str2 = path;
            }
            StringBuilder LIZ = X1D.LIZ();
            String str4 = interceptor.prefixRule;
            if (str4 == null) {
                str4 = "";
            }
            LIZ.append(str4);
            LIZ.append(str2);
            String str5 = interceptor.suffixRule;
            if (str5 != null) {
                str3 = str5;
            }
            LIZ.append(str3);
            str = X1D.LIZIZ(LIZ);
            Uri.Builder buildUpon = LJIILL.buildUpon();
            if (C78857UxB.LJJJIL(interceptor.replaceHost)) {
                buildUpon.authority(interceptor.replaceHost);
            }
            uri2 = C78939UyV.LJJJJJ(uri, C47261Igj.LJJIJ("url")).buildUpon().appendQueryParameter("url", buildUpon.path(str).build().toString()).build();
            o.LJIIIIZZ(uri2, "currentSchema.removeQuer…erUri.toString()).build()");
        } else {
            uri2 = uri;
            str = path;
        }
        String str6 = "1";
        C30591Hz.LJI(uri2, C51029K0z.LJJIIZI(new OSZ("disable_tea_h5global_intercept", "1")));
        OSZ[] oszArr = new OSZ[3];
        if (interceptor == null) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ("redirect_status", str6);
        oszArr[1] = new OSZ("cur_schema", uri.toString());
        oszArr[2] = new OSZ("from_path", path);
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (interceptor != null) {
            LJJLIIIIJ.put("interceptor_name", interceptor.name);
            LJJLIIIIJ.put("redirect_schema", uri2);
            LJJLIIIIJ.put("to_path", str);
        }
        LJII(uri, "rd_tea_h5_intercept", LJJLIIIIJ);
        return uri2;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        if (uri == null || uri.isOpaque()) {
            return false;
        }
        if (!LIZLLL(uri) && !LIZ(uri)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Uri uri, List list) {
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof TEARouterInterceptorConfig.Status) {
                    TEARouterInterceptorConfig.Status status = (TEARouterInterceptorConfig.Status) obj;
                    if (!LIZJ(status.value, C30591Hz.LJIIJJI(uri, status.key))) {
                        return false;
                    }
                }
                if (obj instanceof TEAH5GlobalInterceptorConfig.Param) {
                    TEAH5GlobalInterceptorConfig.Param param = (TEAH5GlobalInterceptorConfig.Param) obj;
                    if (!LIZJ(param.value, C30591Hz.LJIIJJI(uri, param.key))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return true;
    }

    public static boolean LIZJ(String str, String str2) {
        if (str == null || str2 == null || o.LJ(str, "") || o.LJ(str2, "")) {
            return false;
        }
        return new OJD(str).containsMatchIn(str2);
    }

    public static boolean LJ(Uri uri, Object obj) {
        TEAH5GlobalInterceptorConfig.Interceptor interceptor;
        TEAH5GlobalInterceptorConfig.InterceptSchema interceptSchema;
        List<String> list;
        String str;
        TEARouterInterceptorConfig.InterceptSchema interceptSchema2;
        List<String> list2;
        String str2;
        List<TEARouterInterceptorConfig.LynxPath> list3;
        if (obj instanceof TEARouterInterceptorConfig.Interceptor) {
            TEARouterInterceptorConfig.Interceptor interceptor2 = (TEARouterInterceptorConfig.Interceptor) obj;
            if (interceptor2.interceptSchema == null) {
                return false;
            }
            if (C30591Hz.LJIJI(uri)) {
                TEARouterInterceptorConfig.InterceptSchema interceptSchema3 = interceptor2.interceptSchema;
                if (interceptSchema3 != null && (list3 = interceptSchema3.lynxPath) != null) {
                    for (TEARouterInterceptorConfig.LynxPath lynxPath : list3) {
                        if (LIZJ(lynxPath.channel, UriProtector.getQueryParameter(uri, "channel")) && LIZJ(lynxPath.bundle, UriProtector.getQueryParameter(uri, "bundle")) && LIZIZ(uri, interceptor2.params)) {
                            return true;
                        }
                    }
                }
            } else if (C30591Hz.LJIJ(uri) && (interceptSchema2 = interceptor2.interceptSchema) != null && (list2 = interceptSchema2.h5Path) != null) {
                for (String str3 : list2) {
                    Uri LJIILL = C30591Hz.LJIILL(uri);
                    if (LJIILL != null) {
                        str2 = LJIILL.getPath();
                    } else {
                        str2 = null;
                    }
                    if (LIZJ(str3, str2) && LIZIZ(uri, interceptor2.params)) {
                        return true;
                    }
                }
            }
        }
        if ((obj instanceof TEAH5GlobalInterceptorConfig.Interceptor) && (interceptSchema = (interceptor = (TEAH5GlobalInterceptorConfig.Interceptor) obj).interceptSchema) != null && (list = interceptSchema.h5Path) != null) {
            for (String str4 : list) {
                Uri LJIILL2 = C30591Hz.LJIILL(uri);
                if (LJIILL2 != null) {
                    str = LJIILL2.getPath();
                } else {
                    str = null;
                }
                if (LIZJ(str4, str) && LIZIZ(uri, interceptor.params)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ea, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0094, code lost:
    
        if (r10 != null) goto L44;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, android.view.ViewGroup] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r14, com.bytedance.router.RouteIntent r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.TEARouterInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    public static String LJI(List list, Uri uri, m mVar) {
        String str;
        Object obj;
        Uri redirectSchema;
        boolean z;
        Map LJJJLIIL;
        String str2;
        String str3;
        String str4;
        Iterator it = list.iterator();
        loop0: while (true) {
            str = "";
            if (it.hasNext()) {
                obj = it.next();
                List<TEARouterInterceptorConfig.Status> list2 = ((TEARouterInterceptorConfig.Interceptor) obj).status;
                if (list2 == null) {
                    break;
                }
                for (TEARouterInterceptorConfig.Status status : list2) {
                    String str5 = status.value;
                    j LJJIJ = mVar.LJJIJ(status.key);
                    if (LJJIJ == null || (str4 = LJJIJ.toString()) == null) {
                        str4 = "";
                    }
                    if (!LIZJ(str5, str4)) {
                        break;
                    }
                }
                break loop0;
            }
            obj = null;
            break;
        }
        TEARouterInterceptorConfig.Interceptor interceptor = (TEARouterInterceptorConfig.Interceptor) obj;
        if (interceptor == null) {
            redirectSchema = uri;
        } else {
            String str6 = interceptor.redirectSchema;
            if (str6 == null || str6.length() == 0) {
                redirectSchema = uri;
            } else {
                redirectSchema = UriProtector.parse(interceptor.redirectSchema);
            }
            List<String> list3 = interceptor.moveParams;
            if (list3 == null || list3.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                o.LJIIIZ(uri, "<this>");
                Uri LJIILL = C30591Hz.LJIILL(uri);
                if (LJIILL != null) {
                    LJJJLIIL = C30591Hz.LJJI(LJIILL);
                } else {
                    LJJJLIIL = C113554cx.LJJJLIIL();
                }
                linkedHashMap.putAll(LJJJLIIL);
                linkedHashMap.putAll(C30591Hz.LJJI(uri));
                o.LJIIIIZZ(redirectSchema, "redirectSchema");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (interceptor.moveParams.contains(entry.getKey())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                redirectSchema = C30591Hz.LJI(redirectSchema, linkedHashMap2);
            }
            List<String> list4 = interceptor.removeParams;
            if (list4 != null && !list4.isEmpty()) {
                o.LJIIIIZZ(redirectSchema, "redirectSchema");
                redirectSchema = C30591Hz.LJJIFFI(redirectSchema, interceptor.removeParams);
            }
            o.LJIIIIZZ(redirectSchema, "redirectSchema");
        }
        Uri LJI = C30591Hz.LJI(C30591Hz.LJJIFFI(redirectSchema, C47261Igj.LJJIJ("need_tea_intercept")), C113554cx.LJJL(new OSZ("disable_tea_intercept", "1"), new OSZ("tea_init_time", String.valueOf(System.currentTimeMillis()))));
        if (interceptor != null || o.LJ(C30591Hz.LJIIJJI(uri, "need_tea_intercept"), "1")) {
            OSZ[] oszArr = new OSZ[5];
            if (interceptor != null) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[0] = new OSZ("redirect_status", str2);
            oszArr[1] = new OSZ("is_native", "1");
            if (interceptor != null && (str3 = interceptor.name) != null) {
                str = str3;
            }
            oszArr[2] = new OSZ("interceptor_name", str);
            oszArr[3] = new OSZ("cur_schema", uri.toString());
            oszArr[4] = new OSZ("redirect_schema", LJI);
            Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
            LJJLIIIIJ.putAll(C30591Hz.LJJ(uri));
            LJJLIIIIJ.putAll(C05600Jw.LIZLLL(mVar));
            LJII(uri, "rd_tea_intercept", LJJLIIIIJ);
        }
        Map LJJLIIIIJ2 = C113554cx.LJJLIIIIJ(new OSZ("status", "start"));
        LJJLIIIIJ2.putAll(C30591Hz.LJJ(LJI));
        LJII(LJI, "rd_tea_open", LJJLIIIIJ2);
        String uri2 = LJI.toString();
        o.LJIIIIZZ(uri2, "redirectSchema.toString()");
        return uri2;
    }

    public static void LJII(Uri uri, String str, Map map) {
        String str2;
        HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
        C79605VMb c79605VMb = new C79605VMb(str);
        if (C30591Hz.LJIJI(uri)) {
            str2 = "tiktok_ecom_affiliate";
        } else {
            str2 = "ecom_tiktok_h5";
        }
        c79605VMb.LIZIZ = str2;
        c79605VMb.LIZIZ(0);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            jSONObject.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        c79605VMb.LIZLLL = jSONObject;
        hybridMultiMonitor.customReport(c79605VMb.LIZ());
    }
}
