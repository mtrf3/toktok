package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.PPp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64409PPp {
    public static final java.util.Set<Application.ActivityLifecycleCallbacks> LIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static C68222m2 LIZIZ;

    public static void LIZIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C68222m2 c68222m2 = new C68222m2(activity, Lifecycle.Event.ON_DESTROY);
        if (o.LJ(c68222m2, LIZIZ)) {
            return;
        }
        LIZIZ = c68222m2;
        java.util.Set<Application.ActivityLifecycleCallbacks> callbacks = LIZ;
        o.LJIIIIZZ(callbacks, "callbacks");
        Iterator<Application.ActivityLifecycleCallbacks> it = callbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityDestroyed(activity);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    public static void LIZJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C68222m2 c68222m2 = new C68222m2(activity, Lifecycle.Event.ON_PAUSE);
        if (o.LJ(c68222m2, LIZIZ)) {
            return;
        }
        LIZIZ = c68222m2;
        java.util.Set<Application.ActivityLifecycleCallbacks> callbacks = LIZ;
        o.LJIIIIZZ(callbacks, "callbacks");
        Iterator<Application.ActivityLifecycleCallbacks> it = callbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityPaused(activity);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    public static void LIZLLL(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C68222m2 c68222m2 = new C68222m2(activity, Lifecycle.Event.ON_RESUME);
        if (o.LJ(c68222m2, LIZIZ)) {
            return;
        }
        LIZIZ = c68222m2;
        java.util.Set<Application.ActivityLifecycleCallbacks> callbacks = LIZ;
        o.LJIIIIZZ(callbacks, "callbacks");
        Iterator<Application.ActivityLifecycleCallbacks> it = callbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityResumed(activity);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    public static void LJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C68222m2 c68222m2 = new C68222m2(activity, Lifecycle.Event.ON_START);
        if (o.LJ(c68222m2, LIZIZ)) {
            return;
        }
        LIZIZ = c68222m2;
        java.util.Set<Application.ActivityLifecycleCallbacks> callbacks = LIZ;
        o.LJIIIIZZ(callbacks, "callbacks");
        Iterator<Application.ActivityLifecycleCallbacks> it = callbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityStarted(activity);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    public static void LJFF(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C68222m2 c68222m2 = new C68222m2(activity, Lifecycle.Event.ON_STOP);
        if (o.LJ(c68222m2, LIZIZ)) {
            return;
        }
        LIZIZ = c68222m2;
        java.util.Set<Application.ActivityLifecycleCallbacks> callbacks = LIZ;
        o.LJIIIIZZ(callbacks, "callbacks");
        Iterator<Application.ActivityLifecycleCallbacks> it = callbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityStopped(activity);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    public static void LJI(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (activityLifecycleCallbacks != null) {
            LIZ.add(activityLifecycleCallbacks);
        }
    }

    public static void LIZ(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        C68222m2 c68222m2 = new C68222m2(activity, Lifecycle.Event.ON_CREATE);
        if (o.LJ(c68222m2, LIZIZ)) {
            return;
        }
        LIZIZ = c68222m2;
        java.util.Set<Application.ActivityLifecycleCallbacks> callbacks = LIZ;
        o.LJIIIIZZ(callbacks, "callbacks");
        Iterator<Application.ActivityLifecycleCallbacks> it = callbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityCreated(activity, bundle);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }
}
