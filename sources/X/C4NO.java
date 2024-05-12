package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4NO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NO {
    public static void LIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        Integer LJI = C79045V0n.LJI(R.attr.cl, activity);
        if (LJI != null) {
            activity.getWindow().setStatusBarColor(LJI.intValue());
        }
        C27740Aue.LJII(activity);
    }
}
