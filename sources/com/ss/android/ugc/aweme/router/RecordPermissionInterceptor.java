package com.ss.android.ugc.aweme.router;

import X.C62712d9;
import X.HUX;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordPermissionInterceptor implements IInterceptor {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        String str2;
        String str3;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        StringBuilder LIZ = X1D.LIZ();
        String str4 = null;
        if (routeIntent != null && (uri4 = routeIntent.getUri()) != null) {
            str = uri4.getHost();
        } else {
            str = null;
        }
        LIZ.append(str);
        if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
            str2 = uri3.getPath();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        if (!o.LJ(X1D.LIZIZ(LIZ), "studio/task/create")) {
            StringBuilder LIZ2 = X1D.LIZ();
            if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
                str3 = uri2.getHost();
            } else {
                str3 = null;
            }
            LIZ2.append(str3);
            if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
                str4 = uri.getPath();
            }
            LIZ2.append(str4);
            if (!o.LJ(X1D.LIZIZ(LIZ2), "studio/create")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        o.LJIIIZ(routeIntent, "routeIntent");
        AVExternalServiceImpl.LIZ().asyncService("RecordPermissionInterceptor", new HUX(context, AVExternalServiceImpl.LIZ().classnameService().getVideoRecordPermissionActivityClass(), this, routeIntent));
        return true;
    }
}
