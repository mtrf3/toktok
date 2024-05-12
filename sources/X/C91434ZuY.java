package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* renamed from: X.ZuY, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91434ZuY implements InterfaceC91227ZrD {
    @Override // X.InterfaceC91227ZrD
    public final void pullAppToForeground() {
        boolean z = C84763XOl.LJIIJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pullAppToForeground: isAppBackground(");
        LIZ.append(z);
        LIZ.append(')');
        X1D.LIZIZ(LIZ);
        if (z) {
            Context LIZIZ = EF7.LIZIZ();
            Object LLILL = C16880lQ.LLILL(LIZIZ, "activity");
            o.LJII(LLILL, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager activityManager = (ActivityManager) LLILL;
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null) {
                activityManager.moveTaskToFront(topActivity.getTaskId(), 0);
                return;
            }
            Intent launchIntentForPackage = LIZIZ.getPackageManager().getLaunchIntentForPackage(LIZIZ.getPackageName());
            if (launchIntentForPackage == null) {
                return;
            }
            C16880lQ.LIZJ(LIZIZ, launchIntentForPackage);
        }
    }

    @Override // X.InterfaceC91227ZrD
    public final boolean LIZ() {
        return ActivityStack.isAppBackGround();
    }
}
