package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.P0t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63763P0t implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static List LIZ() {
        ArrayList arrayList = new ArrayList(ActivityStack.nonWeakAppBackgroundListeners);
        Iterator<InterfaceC63764P0u> it = ActivityStack.sAppBackgroundListeners.iterator();
        while (it.hasNext()) {
            InterfaceC63764P0u next = it.next();
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (ActivityStack.class) {
            ActivityStack.sActivityStack.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        synchronized (ActivityStack.class) {
            if (ActivityStack.sAppBackGround) {
                ActivityStack.sAppBackGround = false;
                Iterator it = ((ArrayList) LIZ()).iterator();
                while (it.hasNext()) {
                    ((InterfaceC63764P0u) it.next()).onAppForeground();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        synchronized (ActivityStack.class) {
            ActivityStack.sStartedActivities.LJIIZILJ(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        synchronized (ActivityStack.class) {
            ActivityStack.sStartedActivities.LJIJ(activity);
            if (!ActivityStack.sAppBackGround && ActivityStack.sStartedActivities.isEmpty()) {
                ActivityStack.sAppBackGround = true;
                Iterator it = ((ArrayList) LIZ()).iterator();
                while (it.hasNext()) {
                    ((InterfaceC63764P0u) it.next()).onAppBackground();
                }
                ArrayList arrayList = new ArrayList(ActivityStack.nonWeakAppBackgroundMobListeners);
                Iterator<JEX> it2 = ActivityStack.sAppBackgroundMobListeners.iterator();
                while (it2.hasNext()) {
                    JEX next = it2.next();
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((JEX) it3.next()).onAppBackground(activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        synchronized (ActivityStack.class) {
            ActivityStack.sActivityStack.remove(activity);
            ActivityStack.sActivityStack.add(activity);
        }
        AppLog.onActivityCreate(activity);
    }
}
