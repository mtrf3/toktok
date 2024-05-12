package com.ss.android.ugc.aweme.router;

import X.C2YJ;
import X.C39061g6;
import X.C61200O0e;
import X.C62712d9;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedbackSubmitInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        Uri uri2;
        String str2 = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            str = uri2.getHost();
        } else {
            str = null;
        }
        if (!o.LJ(str, "feedback_input")) {
            if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
                str2 = uri.getHost();
            }
            if (!o.LJ(str2, "i18n_feedback_input")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        try {
            C39061g6 c39061g6 = new C39061g6(C2YJ.LIZIZ.LIZ.getFeedbackConf().getFeHelp());
            if (routeIntent == null) {
                str = null;
            } else {
                str = routeIntent.getOriginUrl();
            }
            Uri parse = UriProtector.parse(str);
            for (String str2 : UriProtector.getQueryParameterNames(parse)) {
                c39061g6.LIZIZ(str2, UriProtector.getQueryParameter(parse, str2));
            }
            C61200O0e.LIZLLL().LJII(c39061g6.LIZJ());
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
