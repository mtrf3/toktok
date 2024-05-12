package com.ss.android.ugc.aweme.external.router;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C45804HyK;
import X.C62712d9;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OpenTextEditInterceptor implements IInterceptor {
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
        return o.LJ(str, "openTextEdit");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (routeIntent == null || context == null || C45804HyK.LJJIFFI(context) == null) {
            return false;
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            IOpenTextNextService openTextNextService = AVExternalServiceImpl.LIZ().openTextNextService();
            Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(routeIntent.getExtra(), "fake_bundle");
            if (LJJLIIIIJ == null) {
                LJJLIIIIJ = new Bundle();
            }
            openTextNextService.textCanvasGoNext(LJJIFFI, LJJLIIIIJ);
            return true;
        }
        return true;
    }
}
