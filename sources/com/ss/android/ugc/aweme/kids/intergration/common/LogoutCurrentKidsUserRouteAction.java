package com.ss.android.ugc.aweme.kids.intergration.common;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;

/* loaded from: classes5.dex */
public final class LogoutCurrentKidsUserRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        KidsAccountServiceImpl.LJIIIIZZ().logout("router_action", "user_logout");
        return Boolean.TRUE;
    }
}
