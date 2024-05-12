package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X1K implements Application.ActivityLifecycleCallbacks {
    public static final List<X1L> LJLILLLLZI;
    public static final X1K LJLJI = new X1K();
    public static final X1I LJLIL = new X1I();

    static {
        ArrayList arrayList = new ArrayList();
        LJLILLLLZI = arrayList;
        arrayList.add(new X1J());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator it = ((ArrayList) LJLILLLLZI).iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator it = ((ArrayList) LJLILLLLZI).iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator it = ((ArrayList) LJLILLLLZI).iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator it = ((ArrayList) LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((X1L) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator it = ((ArrayList) LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((X1L) it.next()).onActivityStopped(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIJ(activity, "activity");
        Iterator it = ((ArrayList) LJLILLLLZI).iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIJ(activity, "activity");
        o.LJIIJ(outState, "outState");
        Iterator it = ((ArrayList) LJLILLLLZI).iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }
}
