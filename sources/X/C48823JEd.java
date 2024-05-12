package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.o;

/* renamed from: X.JEd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48823JEd extends EG4 {
    @Override // X.EG4, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        try {
            if (J6Z.LIZ.contains(C16880lQ.LJLLJ(activity.getClass()))) {
                ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC48826JEg(true));
                viewTreeObserver.addOnDrawListener(new ViewTreeObserverOnPreDrawListenerC48826JEg(false));
            }
        } catch (Throwable unused) {
        }
    }
}
