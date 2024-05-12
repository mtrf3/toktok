package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.AbstractC62652d3;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C221108m2;
import X.C38943FQd;
import X.C3C5;
import X.C61520OCm;
import X.C62712d9;
import X.C62822Ol8;
import X.C70657RoD;
import X.C780334l;
import X.C78613UtF;
import X.C78983UzD;
import X.EF7;
import X.FD7;
import X.FD8;
import X.FD9;
import X.FDA;
import X.O3U;
import X.ORZ;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.net.Uri;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.settings.EcomGeckoFrontUpdateModel;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EcomGeckoUpdateInterceptor extends AbstractC62652d3 implements IInterceptor {
    public static final EcomGeckoUpdateInterceptor LJLIL = new EcomGeckoUpdateInterceptor();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(FDA.LJLIL);
    public static final Set<String> LJLJI = new LinkedHashSet();
    public static final Set<String> LJLJJI = new LinkedHashSet();
    public static final Map<String, String> LJLJJL = new LinkedHashMap();

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    public static void LIZIZ(String str) {
        Object LIZ;
        String LIZ2;
        C61520OCm LJIILIIL;
        Set<String> set = LJLJI;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        try {
            LIZ2 = C38943FQd.LIZ();
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (LIZ2.length() == 0) {
            return;
        }
        File file = new File(C16880lQ.LLIIJLIL(EF7.LIZIZ()), "offlineX");
        String LIZIZ = C38943FQd.LIZIZ();
        LJLIL.getClass();
        EcomGeckoFrontUpdateModel ecomGeckoFrontUpdateModel = (EcomGeckoFrontUpdateModel) ((Map) LJLILLLLZI.getValue()).get(str);
        if (ecomGeckoFrontUpdateModel == null || (LJIILIIL = O3U.LJIILIIL()) == null) {
            return;
        }
        FD7 fd7 = new FD7(str, LIZ2, LIZIZ);
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setEnableDownloadAutoRetry(true);
        optionCheckUpdateParams.setChannelUpdatePriority(3);
        optionCheckUpdateParams.setListener(new FD8(fd7));
        LJLJJI.add(str);
        List LJLJJL2 = s.LJLJJL(ecomGeckoFrontUpdateModel.getUpdate(), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJLJJL2) {
            String str2 = (String) obj;
            Set<String> set2 = LJLJJI;
            if (!set2.contains(str2)) {
                if (C70657RoD.LJ(LIZ2, str2)) {
                    fd7.invoke(str2, "LocalNewestVersion", Boolean.TRUE, null);
                    set2.add(str2);
                } else {
                    arrayList.add(obj);
                }
            }
        }
        Set LLJJ = ORZ.LLJJ(arrayList);
        if (LLJJ.isEmpty()) {
            return;
        }
        LIZ = XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new FD9(ecomGeckoFrontUpdateModel, LLJJ, LIZ2, file, LJIILIIL, optionCheckUpdateParams, null), 2);
        C3C5.m7constructorimpl(LIZ);
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
        }
    }

    public final String LIZ(String str) {
        Uri LJJJJIZL = C17N.LJJJJIZL(str);
        String queryParameter = UriProtector.getQueryParameter(LJJJJIZL, "channel");
        if (queryParameter == null && (queryParameter = UriProtector.getQueryParameter(LJJJJIZL, "url")) == null && (queryParameter = UriProtector.getQueryParameter(LJJJJIZL, "surl")) == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJJJJIZL.getAuthority());
            LIZ.append(LJJJJIZL.getPath());
            queryParameter = X1D.LIZIZ(LIZ);
        }
        o.LJIIIIZZ(queryParameter, "url.safeToUri().let {\n  …ity}${it.path}\"\n        }");
        return queryParameter;
    }

    @Override // X.AbstractC62652d3, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        if (str == null) {
            return false;
        }
        C62822Ol8 c62822Ol8 = LJLILLLLZI;
        if (((Map) c62822Ol8.getValue()).isEmpty()) {
            return false;
        }
        if (((Map) c62822Ol8.getValue()).get("*") != null && !LJLJI.contains("*")) {
            LIZIZ("*");
        }
        String LIZ = LIZ(str);
        if (LJLJJL.containsKey(LIZ)) {
            return true;
        }
        for (String str2 : ((Map) c62822Ol8.getValue()).keySet()) {
            if (str2.length() > 0 && s.LJJJLZIJ(LIZ, str2, false)) {
                LJLJJL.put(LIZ, str2);
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
        String str = (String) ((LinkedHashMap) LJLJJL).get(LIZ(url));
        if (str != null) {
            LJLIL.getClass();
            LIZIZ(str);
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (routeIntent == null) {
            return false;
        }
        Map<String, String> map = LJLJJL;
        String url = routeIntent.getUrl();
        o.LJIIIIZZ(url, "routeIntent.url");
        String str = (String) ((LinkedHashMap) map).get(LIZ(url));
        if (str != null) {
            LJLIL.getClass();
            LIZIZ(str);
        }
        return false;
    }
}
