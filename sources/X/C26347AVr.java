package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* renamed from: X.AVr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26347AVr {
    public static /* synthetic */ void LIZIZ(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle) {
        LIZ(activity, str, z, f, i, i2, i3, i4, i5, z2, bundle, true);
    }

    public static void LIZ(Activity activity, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(originalUrl, "originalUrl");
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//profile/crop");
        buildRoute.withParam("original_url", originalUrl);
        buildRoute.withParam("is_oval", z);
        buildRoute.withParam("rect_ratio", f);
        buildRoute.withParam("rect_margin", i);
        buildRoute.withParam("extra_min_width", i3);
        buildRoute.withParam("extra_min_height", i4);
        buildRoute.withParam("extra_source_type", i5);
        buildRoute.withParam("extra_need_update_avatar", z2);
        buildRoute.withParam("extra_upload_avatar", z3);
        buildRoute.withParam(bundle);
        buildRoute.open(i2);
    }
}
