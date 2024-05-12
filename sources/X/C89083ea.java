package X;

import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* renamed from: X.3ea, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89083ea {
    public static void LIZ(ActivityC45651qj context, Bundle bundle, Integer num) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(bundle, "bundle");
        if (num != null) {
            int intValue = num.intValue();
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//video/creation/tail");
            buildRoute.withParam(bundle);
            buildRoute.open(intValue);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        SmartRoute buildRoute2 = SmartRouter.buildRoute(context, "//video/creation/tail");
        buildRoute2.withParam(bundle);
        buildRoute2.open();
    }
}
