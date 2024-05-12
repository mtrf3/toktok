package com.ss.android.ugc.aweme.dsp.subscribe.schema;

import X.C62712d9;
import X.X1D;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MusicLoadingInterceptor implements IInterceptor {
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
        return o.LJ(X1D.LIZIZ(LIZ), "music/ttm/subscribe/loading");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r14 != null) goto L12;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r13, com.bytedance.router.RouteIntent r14) {
        /*
            r12 = this;
            if (r13 == 0) goto L8
            android.app.Activity r2 = X.C45804HyK.LJIJJ(r13)
            if (r2 != 0) goto Lc
        L8:
            android.app.Activity r2 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
        Lc:
            r3 = 1
            if (r2 == 0) goto L4d
            if (r14 == 0) goto L49
            android.content.Intent r0 = r14.getExtra()
            if (r0 == 0) goto L62
            android.os.Bundle r1 = X.C16880lQ.LLJJIJI(r0)
        L1b:
            android.net.Uri r0 = r14.getUri()
            if (r0 == 0) goto L49
            X.MGJ r8 = new X.MGJ
            r8.<init>(r0, r2, r1)
            X.0Dg r4 = new X.0Dg
            r0 = 2
            r4.<init>(r0)
            r2 = 0
            java.lang.Object[] r9 = new java.lang.Object[r2]
            X.Pk0 r11 = new X.Pk0
            java.lang.String r1 = "()V"
            java.lang.String r0 = "4393822078147139802"
            r11.<init>(r2, r1, r0)
            r5 = 300000(0x493e0, float:4.2039E-40)
            java.lang.String r6 = "com/ss/android/ugc/aweme/dsp/subscribe/MusicDspLoadingDialog"
            java.lang.String r7 = "show"
            java.lang.String r10 = "void"
            X.Ff9 r0 = r4.LIZJ(r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L5e
        L49:
            boolean r0 = X.MG0.LIZIZ
            if (r0 == 0) goto L4e
        L4d:
            return r3
        L4e:
            X.MG0.LIZIZ = r3
            X.Ol8 r0 = X.MG0.LJ
            java.lang.Object r1 = r0.getValue()
            X.MGL r1 = (X.MGL) r1
            java.lang.String r0 = "music_subscription_success_event"
            X.C72818Shy.LIZLLL(r0, r1)
            goto L4d
        L5e:
            r8.show()
            goto L49
        L62:
            r1 = 0
            if (r14 == 0) goto L49
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.subscribe.schema.MusicLoadingInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
