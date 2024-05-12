package com.ss.android.ugc.aweme.compliance.business.policynotice;

import X.HG3;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;

/* loaded from: classes5.dex */
public final class LogoutCurrentUserRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        HG3.LJIIIIZZ().logout("router_action", "user_logout");
        return Boolean.TRUE;
    }
}
