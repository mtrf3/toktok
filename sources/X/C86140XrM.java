package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.IDqS439S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XrM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86140XrM implements Application.ActivityLifecycleCallbacks {
    public final CopyOnWriteArrayList<InterfaceC86124Xr6> LJLIL = new CopyOnWriteArrayList<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LIZ(this, activity, false, null, C86138XrK.LJLIL, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LIZ(this, activity, false, null, C86139XrL.LJLIL, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LIZ(this, activity, false, null, C86141XrN.LJLIL, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LIZ(this, activity, false, null, C86142XrO.LJLIL, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LIZ(this, activity, false, null, C86143XrP.LJLIL, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        LIZ(this, activity, false, null, new IDqS439S0100000_15(bundle, 10), 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
        LIZ(this, activity, false, null, new IDqS439S0100000_15(outState, 11), 6);
    }

    public static Object LIZ(C86140XrM c86140XrM, Activity activity, boolean z, Object obj, InterfaceC88473Ynt interfaceC88473Ynt, int i) {
        ActivityC86117Xqz activityC86117Xqz;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        c86140XrM.getClass();
        if ((activity instanceof ActivityC86117Xqz) && (activityC86117Xqz = (ActivityC86117Xqz) activity) != null) {
            Iterator<InterfaceC86124Xr6> it = c86140XrM.LJLIL.iterator();
            while (it.hasNext()) {
                InterfaceC86124Xr6 cb = it.next();
                o.LJIIIIZZ(cb, "cb");
                obj = interfaceC88473Ynt.invoke(cb, activityC86117Xqz, obj);
            }
            if (z) {
                Iterator<G48> it2 = ((ActivityC86117Xqz) activity).getProcessors$foundation_release().iterator();
                while (it2.hasNext()) {
                    obj = interfaceC88473Ynt.invoke(it2.next(), activityC86117Xqz, obj);
                }
            }
            List<G46> list = activityC86117Xqz.innerProcessors;
            if (list != null) {
                Iterator<G46> it3 = list.iterator();
                while (it3.hasNext()) {
                    obj = interfaceC88473Ynt.invoke(it3.next(), activityC86117Xqz, obj);
                }
            }
        }
        return obj;
    }
}
