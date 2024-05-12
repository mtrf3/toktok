package X;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.HXn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44231HXn {
    public static final Bundle LIZ(Activity activity, C82622Wbi diContainer) {
        Bundle bundle;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(activity, "activity");
        WM7 wm7 = (WM7) diContainer.LJIIIIZZ(null, AbstractC42651GoZ.class);
        if (wm7 == null || (bundle = wm7.mArguments) == null) {
            return C16880lQ.LLJJIJI(activity.getIntent());
        }
        return bundle;
    }
}
