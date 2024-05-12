package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C16880lQ;
import X.C76800UCe;
import X.HG3;
import X.M5X;
import X.M62;
import X.OSZ;
import X.RBX;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.IPreLoginHandleService;
import com.ss.android.ugc.aweme.account.PreLoginHandleService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ImFansAction extends AbstractC54341LUj<C76800UCe> {
    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        Uri parse = UriProtector.parse(outerUrl);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(parse.getHost());
        LIZ.append(parse.getPath());
        return new OSZ<>(X1D.LIZIZ(LIZ), originalQueryMap);
    }

    @Override // X.AbstractC54344LUm
    public boolean doRealOpen(Context context, String routePrefix, HashMap<String, Object> params, ArrayList<Integer> arrayList) {
        boolean z;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(routePrefix, "routePrefix");
        o.LJIIIZ(params, "params");
        Uri parse = UriProtector.parse(routePrefix);
        String queryParameter = UriProtector.getQueryParameter(parse, "multi_account_push_uid");
        Object queryParameter2 = UriProtector.getQueryParameter(parse, "is_from_notification");
        if (queryParameter2 != null) {
            z = ((Boolean) queryParameter2).booleanValue();
        } else {
            z = false;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
        intent.putExtra("from_where", 0);
        String queryParameter3 = UriProtector.getQueryParameter(parse, "label");
        M62.LIZIZ.LIZIZ(parse, queryParameter3, z);
        if (TextUtils.equals(queryParameter3, "check_profile")) {
            intent.putExtra("push", true);
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        IPreLoginHandleService LIZIZ = PreLoginHandleService.LIZIZ();
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            LIZIZ.LIZ((Activity) context, intent, queryParameter);
            return false;
        }
        C16880lQ.LIZJ(context, intent);
        return true;
    }
}
