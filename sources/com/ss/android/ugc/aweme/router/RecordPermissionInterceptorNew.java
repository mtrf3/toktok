package com.ss.android.ugc.aweme.router;

import X.C268713r;
import X.C62712d9;
import X.C86393XvR;
import X.HG3;
import X.HPV;
import X.RBX;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordPermissionInterceptorNew implements IInterceptor {
    public final String LJLIL = "openShoot";

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        Uri uri2;
        StringBuilder LIZ = X1D.LIZ();
        String str2 = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            str = uri2.getHost();
        } else {
            str = null;
        }
        LIZ.append(str);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str2 = uri.getPath();
        }
        LIZ.append(str2);
        return o.LJ(X1D.LIZIZ(LIZ), this.LJLIL);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        String str;
        C86393XvR LJJIJIL;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null && (context instanceof Activity)) {
            if (o.LJ(UriProtector.getQueryParameter(uri, "gd_label"), "live_encourage")) {
                Keva repo = Keva.getRepo("keva_repo_live_encourage_page");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("shown");
                if (!C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, false)) {
                    ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
                    if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
                        str = LJJIJIL.LJZI();
                    } else {
                        str = null;
                    }
                    SmartRouter.buildRoute(context, str).open();
                    Keva repo2 = Keva.getRepo("keva_repo_live_encourage_page");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("shown");
                    LIZ2.append(((RBX) HG3.LJIILL()).getCurUser().getUid());
                    repo2.storeBoolean(X1D.LIZIZ(LIZ2), true);
                }
            }
            Uri uri2 = routeIntent.getUri();
            o.LJIIIIZZ(uri2, "routeIntent.uri");
            HPV.LIZ((Activity) context, uri2);
        }
        return true;
    }
}
