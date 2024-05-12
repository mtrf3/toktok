package X;

import android.content.Context;
import android.content.res.Resources;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0j7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15450j7 {
    public static int LIZ(Context context) {
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static void LIZIZ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null || C15410j3.LIZJ(activityC45651qj)) {
            return;
        }
        activityC45651qj.getWindow().setFlags(1024, 1024);
        activityC45651qj.getWindow().setStatusBarColor(activityC45651qj.getResources().getColor(R.color.cz));
    }
}
