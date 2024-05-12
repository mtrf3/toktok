package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* renamed from: X.4nG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119944nG {
    public static final String LIZ() {
        StringBuilder sb = new StringBuilder();
        Activity[] activityStack = ActivityStack.getActivityStack();
        int min = Math.min(activityStack.length, 10);
        for (int i = 0; i < min; i++) {
            if (i > 0) {
                sb.append("\n");
            }
            sb.append(C16880lQ.LJLLILLLL(activityStack[i].getClass()));
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }
}
