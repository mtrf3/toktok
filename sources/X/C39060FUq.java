package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.FUq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39060FUq implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIJ(activity, "activity");
        o.LJIIJ(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIJ(activity, "activity");
        synchronized (this) {
            ArrayList<String> remove = HandlerC39055FUl.LIZJ.remove(Integer.valueOf(activity.hashCode()));
            if (remove != null) {
                Iterator<String> it = remove.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    HandlerC39055FUl.LJIIIIZZ.getClass();
                    HandlerC39055FUl.LIZLLL(activity, next);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIJ(activity, "activity");
        HandlerC39055FUl.LIZJ.put(Integer.valueOf(activity.hashCode()), new ArrayList<>());
    }
}
