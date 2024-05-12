package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HT7 extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "challenge_detail";
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "challenge");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        int i;
        String queryParameter;
        String queryParameter2;
        Integer LJJIL;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        String queryParameter3 = UriProtector.getQueryParameter(uri, "is_commerce");
        String queryParameter4 = UriProtector.getQueryParameter(uri, "show_tab");
        boolean z2 = false;
        if (queryParameter4 != null && (LJJIL = C38350F3i.LJJIL(queryParameter4)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        int i2 = i - 1;
        String queryParameter5 = UriProtector.getQueryParameter(uri, "enter_from");
        String queryParameter6 = UriProtector.getQueryParameter(uri, "extra_challenge_from");
        if (TextUtils.equals(queryParameter3, "1") || ujb.o.LJJJJIZL("true", queryParameter3, true)) {
            CommerceChallengeServiceImpl.LIZIZ().LJIL(UriProtector.getQueryParameter(uri, "id"));
        }
        String queryParameter7 = UriProtector.getQueryParameter(uri, "group");
        if (!TextUtils.isEmpty(path) && ujb.o.LJJJLIIL(path, "/detail/", false)) {
            z2 = true;
        }
        if (o.LJ(CardStruct.IStatusCode.DEFAULT, queryParameter7) || z2) {
            if (!z2 ? (queryParameter = UriProtector.getQueryParameter(uri, "id")) == null : (queryParameter = uri.getLastPathSegment()) == null) {
                queryParameter = "";
            }
            CommerceChallengeServiceImpl.LIZIZ().LJIIIZ(uri, queryParameter);
            SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//challenge/detail");
            if (z2) {
                queryParameter2 = uri.getLastPathSegment();
            } else {
                queryParameter2 = UriProtector.getQueryParameter(uri, "id");
            }
            buildRoute.withParam("id", queryParameter2);
            buildRoute.withParam("from_token", fromTokenType);
            buildRoute.withParam("show_tab_index", i2);
            buildRoute.withParam("enter_from", queryParameter5);
            buildRoute.withParam("extra_challenge_from", queryParameter6);
            try {
                CastLongProtector.parseLong(queryParameter);
            } catch (NumberFormatException unused) {
                buildRoute.withParam("extra_challenge_is_hashtag", true);
            }
            M62.LIZIZ.LIZIZ(uri, "challenge_detail", z);
            return buildRoute.buildIntent();
        }
        return null;
    }
}
