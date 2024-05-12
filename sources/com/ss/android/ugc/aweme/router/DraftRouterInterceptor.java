package com.ss.android.ugc.aweme.router;

import X.C16880lQ;
import X.C62712d9;
import X.EF7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        return o.LJ(str, "draft_box");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Context context2;
        Class<? extends Activity> draftBoxActivity = AVExternalServiceImpl.LIZ().classnameService().getDraftBoxActivity();
        if (context instanceof Activity) {
            C16880lQ.LIZIZ((Activity) context, new Intent(context, draftBoxActivity));
            return true;
        }
        if (context == null) {
            context2 = EF7.LIZIZ();
        } else {
            context2 = context;
        }
        Intent intent = new Intent(context, draftBoxActivity);
        intent.addFlags(268435456);
        C16880lQ.LIZJ(context2, intent);
        return true;
    }
}
