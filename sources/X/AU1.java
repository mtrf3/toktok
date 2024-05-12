package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AU1 {
    public static Aweme LIZ() {
        Activity activity;
        Activity[] activities = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activities, "activities");
        int length = activities.length;
        int i = 0;
        while (true) {
            if (i < length) {
                activity = activities[i];
                if (activity instanceof InterfaceC55058LjC) {
                    break;
                }
                i++;
            } else {
                activity = null;
                break;
            }
        }
        if (!(activity instanceof ActivityC45651qj)) {
            return null;
        }
        return LNH.LIZIZ((ActivityC45651qj) activity);
    }
}
