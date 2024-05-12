package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FQY {
    public static ActivityC45651qj LIZ() {
        Activity[] activityStack = ActivityStack.getActivityStack();
        try {
            o.LJIIIIZZ(activityStack, "activityStack");
            for (Activity activity : activityStack) {
                if (activity instanceof MainActivity) {
                    return (ActivityC45651qj) activity;
                }
            }
            return null;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            C3C5.m10exceptionOrNullimpl(LIZ);
            return null;
        }
    }
}
