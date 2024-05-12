package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.lang.ref.WeakReference;

/* renamed from: X.7Om, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185167Om {
    public static C185157Ol LIZ;
    public static WeakReference<ActivityC45651qj> LIZIZ;

    public static int LIZIZ() {
        return ((Number) C185177On.LIZ.getValue()).intValue();
    }

    public static void LIZ(ActivityC45651qj activityC45651qj, C185157Ol c185157Ol, String str) {
        SmartRoute buildRoute = SmartRouter.buildRoute(activityC45651qj, "//now/caption_edit");
        buildRoute.withParam("enter_from", str);
        buildRoute.open();
        LIZ = c185157Ol;
        LIZIZ = new WeakReference<>(activityC45651qj);
    }
}
