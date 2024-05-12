package com.ss.android.ugc.aweme.nows.service;

import X.C16880lQ;
import X.MWW;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.service.INowDailyPushService;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public final class NowDailyPushService implements INowDailyPushService {
    @Override // com.ss.android.ugc.aweme.service.INowDailyPushService
    public final String LIZJ() {
        if (!MWW.LIZ()) {
            return "//now/feed";
        }
        return "//studio/tiktoknow";
    }

    @Override // com.ss.android.ugc.aweme.service.INowDailyPushService
    public final boolean LIZ(String url) {
        o.LJIIIZ(url, "url");
        return s.LJJJLZIJ(url, "is_now_daily_push", false);
    }

    @Override // com.ss.android.ugc.aweme.service.INowDailyPushService
    public final void LIZIZ(Context context, Intent intent, String str) {
        o.LJIIIZ(context, "context");
        Uri parse = UriProtector.parse(str);
        o.LJIIIIZZ(parse, "parse(url)");
        Uri.Builder buildUpon = UriProtector.parse(LIZJ()).buildUpon();
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
        if (queryParameterNames != null) {
            for (String str2 : queryParameterNames) {
                if (!o.LJ(str2, "is_now_daily_push")) {
                    buildUpon.appendQueryParameter(str2, UriProtector.getQueryParameter(parse, str2));
                }
            }
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, buildUpon.build().toString());
        buildRoute.withParam(C16880lQ.LLJJIJI(intent));
        buildRoute.open();
    }
}
