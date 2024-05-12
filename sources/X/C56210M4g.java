package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.M4g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56210M4g extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "helper_center");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//helper_center");
        buildRoute.withParam("URL_FIELD", "https://support.tiktok.com");
        buildRoute.withParam("FIELD_TITLE", activity.getString(R.string.geu));
        buildRoute.withParam("FIELD_SHOW_AGREE_BUTTON", false);
        return buildRoute.buildIntent();
    }
}
