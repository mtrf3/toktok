package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.06r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C021706r {
    public static Intent LIZ(Activity activity) {
        return activity.getParentActivityIntent();
    }

    public static boolean LIZIZ(Activity activity, Intent intent) {
        return activity.navigateUpTo(intent);
    }

    public static boolean LIZJ(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
