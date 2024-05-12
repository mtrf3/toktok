package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C62712d9;
import X.C98593tv;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomLaunchChatInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        if (uri == null) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(routeIntent.getUri().getAuthority());
        LIZ.append(routeIntent.getUri().getPath());
        if (!o.LJ("chat/launchchat", X1D.LIZIZ(LIZ))) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String queryParameter;
        if (routeIntent == null || routeIntent.getUri() == null || (queryParameter = UriProtector.getQueryParameter(routeIntent.getUri(), "uid")) == null || queryParameter.length() == 0) {
            return false;
        }
        IMUser iMUser = new IMUser();
        Uri uri = routeIntent.getUri();
        iMUser.setUid(queryParameter);
        iMUser.setNickName(UriProtector.getQueryParameter(uri, "nickname"));
        iMUser.setSignature(UriProtector.getQueryParameter(uri, "alias"));
        iMUser.setFake(true);
        C98593tv c98593tv = new C98593tv(context, iMUser);
        String queryParameter2 = UriProtector.getQueryParameter(routeIntent.getUri(), "enter_from");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        c98593tv.setEnterFromForMob(queryParameter2);
        c98593tv.setKeepEnterFrom(true);
        String userId = c98593tv.getUserId();
        if (userId != null && userId.length() > 0) {
            IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LJFF(c98593tv);
        }
        return true;
    }
}
