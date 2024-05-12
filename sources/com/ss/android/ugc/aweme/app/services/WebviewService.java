package com.ss.android.ugc.aweme.app.services;

import X.C0NY;
import X.C58096Mr6;
import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class WebviewService implements IWebViewService {
    public static IWebViewService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IWebViewService.class, false);
        if (LIZ != null) {
            return (IWebViewService) LIZ;
        }
        if (C58096Mr6.LLILLL == null) {
            synchronized (IWebViewService.class) {
                if (C58096Mr6.LLILLL == null) {
                    C58096Mr6.LLILLL = new WebviewService();
                }
            }
        }
        return C58096Mr6.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.app.services.IWebViewService
    public final void LIZ(Context context, String url, boolean z) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview/");
        if (!(context instanceof Activity)) {
            buildRoute.addFlags(268435456);
        }
        C0NY.LIZJ(buildRoute, "url", url, "hide_nav_bar", z);
    }
}
