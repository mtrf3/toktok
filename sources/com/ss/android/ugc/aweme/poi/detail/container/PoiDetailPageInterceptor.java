package com.ss.android.ugc.aweme.poi.detail.container;

import X.C62712d9;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import ujb.s;

/* loaded from: classes4.dex */
public final class PoiDetailPageInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String uri2;
        Uri uri3;
        String uri4;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null && (uri2 = uri.toString()) != null && s.LJJJLZIJ(uri2, "aweme://poi/detail", false) && (uri3 = routeIntent.getUri()) != null && (uri4 = uri3.toString()) != null && !s.LJJJLZIJ(uri4, "aweme://poi/new_detail", false)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x005d, code lost:
    
        if (r43 != null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013e  */
    /* JADX WARN: Type inference failed for: r3v25, types: [T, com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData] */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r42, com.bytedance.router.RouteIntent r43) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.PoiDetailPageInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
