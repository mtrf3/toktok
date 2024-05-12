package X;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.PQt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64439PQt extends EG4 {
    @Override // X.EG4, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C64441PQv.LIZ.LIZIZ(activity, false);
    }

    @Override // X.EG4, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (o.LJ("com.ss.android.ugc.aweme.main.MainActivity", activity.getClass().getName()) && ((Boolean) C64443PQx.LIZLLL.getValue()).booleanValue()) {
            if (C40010Fn4.LIZJ().LJ()) {
                C64441PQv.LIZ.LIZJ(activity);
            } else {
                C64441PQv.LIZ.LIZIZ(activity, true);
            }
        }
    }

    @Override // X.EG4, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        C64441PQv.LIZ.LIZJ(activity);
    }
}
