package com.ss.android.ugc.aweme.dsp.subscribe.schema;

import X.C62712d9;
import X.X1D;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MusicBrandIconSchemaInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        String path;
        Uri uri2;
        StringBuilder LIZ = X1D.LIZ();
        String str2 = "";
        if (routeIntent == null || (uri2 = routeIntent.getUri()) == null || (str = uri2.getHost()) == null) {
            str = "";
        }
        LIZ.append(str);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null && (path = uri.getPath()) != null) {
            str2 = path;
        }
        LIZ.append(str2);
        return o.LJ(X1D.LIZIZ(LIZ), "music/ttm/detail/popup");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r5 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r1 = r9.getUri();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, "upsell_reason");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        if (r3 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r2 = r2.getSupportFragmentManager();
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "activity.supportFragmentManager");
        com.ss.android.ugc.aweme.music.service.MusicDetailService.LJIJJ().LJIJ(r2, r3, r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0048, code lost:
    
        if (r9 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0037, code lost:
    
        if (r9 != null) goto L23;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r8, com.bytedance.router.RouteIntent r9) {
        /*
            r7 = this;
            r3 = 0
            if (r8 == 0) goto L6a
            X.1qj r2 = X.C45804HyK.LJJIFFI(r8)
            if (r2 == 0) goto L6a
            if (r9 == 0) goto L6e
            android.content.Intent r0 = r9.getExtra()
            if (r0 == 0) goto L6e
            android.os.Bundle r1 = X.C16880lQ.LLJJIJI(r0)
            if (r1 == 0) goto L6e
            java.lang.String r0 = "music_info"
            java.lang.Object r1 = X.C16880lQ.LLJJIII(r1, r0)
        L1d:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.music.model.MusicInfo
            if (r0 == 0) goto L24
            r3 = r1
            com.ss.android.ugc.aweme.music.model.MusicInfo r3 = (com.ss.android.ugc.aweme.music.model.MusicInfo) r3
        L24:
            java.lang.String r6 = ""
            if (r9 == 0) goto L36
            android.net.Uri r1 = r9.getUri()
            if (r1 == 0) goto L36
            java.lang.String r0 = "enter_from"
            java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)
            if (r4 != 0) goto L39
        L36:
            r4 = r6
            if (r9 == 0) goto L47
        L39:
            android.net.Uri r1 = r9.getUri()
            if (r1 == 0) goto L47
            java.lang.String r0 = "enter_method"
            java.lang.String r5 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)
            if (r5 != 0) goto L4a
        L47:
            r5 = r6
            if (r9 == 0) goto L58
        L4a:
            android.net.Uri r1 = r9.getUri()
            if (r1 == 0) goto L58
            java.lang.String r0 = "upsell_reason"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)
            if (r0 != 0) goto L6c
        L58:
            if (r3 == 0) goto L6a
            androidx.fragment.app.FragmentManager r2 = r2.getSupportFragmentManager()
            java.lang.String r0 = "activity.supportFragmentManager"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            com.ss.android.ugc.aweme.music.service.IMusicDetailService r1 = com.ss.android.ugc.aweme.music.service.MusicDetailService.LJIJJ()
            r1.LJIJ(r2, r3, r4, r5, r6)
        L6a:
            r0 = 1
            return r0
        L6c:
            r6 = r0
            goto L58
        L6e:
            r1 = r3
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.subscribe.schema.MusicBrandIconSchemaInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
