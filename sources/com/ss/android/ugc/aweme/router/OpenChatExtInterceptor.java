package com.ss.android.ugc.aweme.router;

import X.C62712d9;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.commercialize.im.OpenChatExt;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class OpenChatExtInterceptor implements IInterceptor {
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
        return o.LJ("chatting/message", X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str = null;
        if (context instanceof Activity) {
            OpenChatExt openChatExt = OpenChatExt.LJLIL;
            Activity activity = (Activity) context;
            if (routeIntent != null) {
                str = routeIntent.getUrl();
            }
            openChatExt.LIZ(activity, str);
            return true;
        }
        OpenChatExt openChatExt2 = OpenChatExt.LJLIL;
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        }
        openChatExt2.open(str);
        return true;
    }
}
