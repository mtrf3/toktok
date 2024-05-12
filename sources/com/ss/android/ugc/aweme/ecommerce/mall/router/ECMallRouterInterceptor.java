package com.ss.android.ugc.aweme.ecommerce.mall.router;

import X.C27739Aud;
import X.C45804HyK;
import X.C53286Kvi;
import X.C62712d9;
import X.OSZ;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ECMallRouterInterceptor implements IInterceptor {
    public static volatile boolean LJLIL;
    public static volatile boolean LJLILLLLZI;
    public static Map<String, ? extends Object> LJLJI;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    public static String LIZ(Uri uri) {
        String str;
        Uri.Builder LJJJJZ;
        if (!C53286Kvi.LIZIZ()) {
            str = "mall";
        } else {
            str = "homepage_mall";
        }
        if (UriProtector.getQueryParameter(uri, "enter_from") != null) {
            LJJJJZ = C45804HyK.LJJJJZ(uri, new OSZ("enter_from", str));
        } else {
            HashMap<String, Object> LIZJ = C27739Aud.LIZJ(uri, "trackParams");
            if (LIZJ == null) {
                LIZJ = new HashMap<>();
            }
            LIZJ.put("enter_from", str);
            LJJJJZ = C45804HyK.LJJJJZ(uri, new OSZ("trackParams", C27739Aud.LJI(LIZJ)));
        }
        return String.valueOf(LJJJJZ.appendQueryParameter("mask_page_name", "mall"));
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        return o.LJ(str, "ec");
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x02d4, code lost:
    
        if (r0 != null) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.content.Context r33, com.bytedance.router.RouteIntent r34) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.router.ECMallRouterInterceptor.LIZIZ(android.content.Context, com.bytedance.router.RouteIntent):void");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getPath();
        } else {
            str = null;
        }
        if (o.LJ(str, "/mall")) {
            LIZIZ(context, routeIntent);
            return true;
        }
        if (o.LJ(str, "/fashion_mall") && ECommerceMallService.x3().v1()) {
            LIZIZ(context, routeIntent);
            return true;
        }
        return false;
    }
}
