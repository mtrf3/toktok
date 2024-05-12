package X;

import android.R;
import android.os.Build;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BTI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ActivityC45651qj activityC45651qj, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            activityC45651qj.getWindow().clearFlags(67108864);
            activityC45651qj.getWindow().addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            activityC45651qj.getWindow().setStatusBarColor(i);
            View findViewById = activityC45651qj.getWindow().findViewById(R.id.content);
            o.LJIIIIZZ(findViewById, "activity.window.findViewById(android.R.id.content)");
            findViewById.setForeground(null);
            return;
        }
        activityC45651qj.getWindow().setStatusBarColor(i);
    }
}
