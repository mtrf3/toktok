package com.bytedance.router.monitor;

import X.ActivityC45651qj;
import X.C08Z;
import X.C16880lQ;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.monitor.Constants;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MonitorActivityLifecycleListener implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity p0, Bundle p1) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        Intent intent = activity.getIntent();
        if (intent != null) {
            try {
                RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
                String name = activity.getClass().getName();
                Constants.Companion companion = Constants.Companion;
                routerMonitor.reportPageJump(name, intent.getBooleanExtra(companion.getKEY_ROUTER_JUMP_MARK(), false), C16880lQ.LLJJIJIIJIL(intent, companion.getKEY_CATEGORY_ROUTE_HOST_PATH()));
            } catch (Exception unused) {
            }
        }
        if (activity instanceof ActivityC45651qj) {
            ((ActivityC45651qj) activity).getSupportFragmentManager().LJJLIL(new C08Z() { // from class: com.bytedance.router.monitor.MonitorActivityLifecycleListener$onActivityCreated$2
                @Override // X.C08Z
                public void onFragmentCreated(FragmentManager fm, Fragment f, Bundle bundle2) {
                    o.LJIIIZ(fm, "fm");
                    o.LJIIIZ(f, "f");
                    super.onFragmentCreated(fm, f, bundle2);
                    try {
                        RouterMonitor routerMonitor2 = RouterMonitor.INSTANCE;
                        String name2 = f.getClass().getName();
                        Intent intent2 = ((ActivityC45651qj) activity).getIntent();
                        Constants.Companion companion2 = Constants.Companion;
                        routerMonitor2.reportPageJump(name2, intent2.getBooleanExtra(companion2.getKEY_ROUTER_JUMP_MARK(), false), C16880lQ.LLJJIJIIJIL(((ActivityC45651qj) activity).getIntent(), companion2.getKEY_CATEGORY_ROUTE_HOST_PATH()));
                    } catch (Exception unused2) {
                    }
                }
            }, true);
        }
    }
}
