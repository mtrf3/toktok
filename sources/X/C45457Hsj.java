package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Hsj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45457Hsj extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "collection");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        if (o.LJ(CardStruct.IStatusCode.DEFAULT, UriProtector.getQueryParameter(uri, "group"))) {
            SmartRoute buildRoute = SmartRouter.buildRoute(activity, "aweme://music/category/");
            buildRoute.withParam("mc_id", UriProtector.getQueryParameter(uri, "id"));
            buildRoute.withParam("title_name", UriProtector.getQueryParameter(uri, "collection_name"));
            buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            return buildRoute.buildIntent();
        }
        return null;
    }
}
