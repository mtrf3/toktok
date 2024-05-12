package X;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: X.06O, reason: invalid class name */
/* loaded from: classes.dex */
public class C06O {
    public static void LIZ(Activity activity) {
        activity.finishAfterTransition();
    }

    public static void LIZIZ(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void LJ(Activity activity) {
        activity.startPostponedEnterTransition();
    }

    public static void LIZJ(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback);
    }

    public static void LIZLLL(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback);
    }
}
