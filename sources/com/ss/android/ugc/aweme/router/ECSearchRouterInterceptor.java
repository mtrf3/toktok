package com.ss.android.ugc.aweme.router;

import X.C16880lQ;
import X.C62712d9;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.vision.EComPhotoSearchServiceImpl;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ECSearchRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r4.getPath(), "/photo") == false) goto L9;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L52
            java.lang.String r1 = r4.getHost()
        L7:
            java.lang.String r0 = "search"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L4f
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "/photo"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L4b
        L1b:
            java.lang.String r2 = r4.getHost()
        L1f:
            java.lang.String r0 = "ec"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L4d
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "/search"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L4b
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "/search/middle"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L4b
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "/search_popup"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L4d
        L4b:
            r0 = 1
        L4c:
            return r0
        L4d:
            r0 = 0
            goto L4c
        L4f:
            if (r4 == 0) goto L1f
            goto L1b
        L52:
            r1 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.router.ECSearchRouterInterceptor.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String path;
        Bundle bundle;
        Bundle LLJJIJI;
        Set<String> set = null;
        if (routeIntent == null || (path = routeIntent.getPath()) == null) {
            return false;
        }
        switch (path.hashCode()) {
            case -2143336809:
                if (!path.equals("/search")) {
                    return false;
                }
                break;
            case -650957811:
                if (!path.equals("/search/middle")) {
                    return false;
                }
                break;
            case -444953340:
                if (!path.equals("/search_popup")) {
                    return false;
                }
                break;
            case 1452213091:
                if (!path.equals("/photo")) {
                    return false;
                }
                if (context != null) {
                    EComPhotoSearchServiceImpl.LJFF().LIZLLL(context, routeIntent.getExtra());
                }
                return true;
            default:
                return false;
        }
        new Bundle().putParcelable("uri", routeIntent.getUri());
        if (routeIntent.getUri() == null || context == null) {
            return false;
        }
        Uri uri = routeIntent.getUri();
        Intent extra = routeIntent.getExtra();
        if (extra != null) {
            bundle = C16880lQ.LLJJIJI(extra);
        } else {
            bundle = null;
        }
        Intent extra2 = routeIntent.getExtra();
        if (extra2 != null && (LLJJIJI = C16880lQ.LLJJIJI(extra2)) != null) {
            set = LLJJIJI.keySet();
        }
        if (bundle != null && set != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            for (String str : set) {
                Object LLJJIII = C16880lQ.LLJJIII(bundle, str);
                if (LLJJIII == null) {
                    LLJJIII = "";
                }
                buildUpon.appendQueryParameter(str, String.valueOf(LLJJIII));
            }
            uri = buildUpon.build();
        }
        IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
        o.LJIIIIZZ(uri, "uri");
        LJJJJZI.LJJJJIZL(context, uri, routeIntent.getAnimationBundle(), routeIntent);
        return true;
    }
}
