package com.ss.android.ugc.aweme.commercialize.utils;

import X.NOE;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.route.IRouteAction;

/* loaded from: classes7.dex */
public final class GPOpenRouter implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "package_name");
        if (queryParameter == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(NOE.LJJIIZ(context, queryParameter, null));
    }
}
