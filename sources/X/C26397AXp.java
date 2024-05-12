package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* renamed from: X.AXp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26397AXp {
    public static ActivityC45651qj LIZ() {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity instanceof ActivityC45651qj) {
            return (ActivityC45651qj) topActivity;
        }
        return null;
    }
}
