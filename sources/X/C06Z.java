package X;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.view.View;

/* renamed from: X.06Z, reason: invalid class name */
/* loaded from: classes.dex */
public class C06Z {
    public static ActivityOptions LIZ() {
        return ActivityOptions.makeBasic();
    }

    public static void LIZJ(ActivityOptions activityOptions, PendingIntent pendingIntent) {
        activityOptions.requestUsageTimeReport(pendingIntent);
    }

    public static ActivityOptions LIZIZ(View view, int i, int i2, int i3, int i4) {
        return ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4);
    }
}
