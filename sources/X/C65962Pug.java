package X;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.Pug, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65962Pug extends AbstractC64406PPm {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C65960Pue.LIZ(activity, false);
    }

    @Override // X.AbstractC64406PPm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C65960Pue.LJ(activity);
        C65960Pue.LIZ(activity, true);
        String name = activity.getClass().getName();
        if (!o.LJ(name, C65960Pue.LJII)) {
            C65960Pue.LJII = name;
            C65964Pui<String> c65964Pui = C65960Pue.LJIIIIZZ;
            if (c65964Pui != null) {
                c65964Pui.offer(name);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        C65960Pue.LJ(activity);
        C65960Pue.LIZ(activity, true);
    }
}
