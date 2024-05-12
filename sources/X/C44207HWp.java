package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.HWp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44207HWp extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "music_detail";
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        if (SC5.LIZIZ(str, "host", str2, "path", str, "music") || o.LJ(str, "song")) {
            return true;
        }
        return false;
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        if (o.LJ(host, "song")) {
            SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//music/detail");
            buildRoute.withParam("id", UriProtector.getQueryParameter(uri, "trackId"));
            Intent buildIntent = buildRoute.buildIntent();
            M62.LIZIZ.LIZIZ(uri, "music_detail", z);
            return buildIntent;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "group");
        boolean z2 = false;
        if (!TextUtils.isEmpty(path) && ujb.o.LJJJLIIL(path, "/detail/", false)) {
            z2 = true;
        }
        String str = null;
        if (!o.LJ(CardStruct.IStatusCode.DEFAULT, queryParameter) && !z2) {
            return null;
        }
        Intent buildIntent2 = SmartRouter.buildRoute(activity, "//music/detail").buildIntent();
        String queryParameter2 = UriProtector.getQueryParameter(uri, "id");
        if (TextUtils.isEmpty(queryParameter2)) {
            queryParameter2 = uri.getLastPathSegment();
        }
        if (!o.LJ("detail", queryParameter2) && !o.LJ(CardStruct.IStatusCode.DEFAULT, queryParameter2)) {
            str = queryParameter2;
        }
        buildIntent2.putExtra("id", str);
        buildIntent2.putExtra("from_token", fromTokenType);
        buildIntent2.putExtra("partnerName", UriProtector.getQueryParameter(uri, "partnerName"));
        buildIntent2.putExtra("partnerMusicId", UriProtector.getQueryParameter(uri, "partnerMusicId"));
        buildIntent2.putExtra("extra_music_from", UriProtector.getQueryParameter(uri, "enter_from"));
        M62.LIZIZ.LIZIZ(uri, "music_detail", z);
        return buildIntent2;
    }
}
