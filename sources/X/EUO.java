package X;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.utils.PreventServerSideCrashes;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public class EUO implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        PreventServerSideCrashes.LJLIL = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        PreventServerSideCrashes.LJLIL = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        PreventServerSideCrashes.LJLIL = activity;
        if (activity == null || TextUtils.isEmpty("mStartedActivity")) {
            return;
        }
        for (Class<?> cls = activity.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            Field LIZ = C36361EOv.LIZ(cls, "mStartedActivity");
            if (LIZ != null) {
                try {
                    LIZ.setAccessible(true);
                    LIZ.set(activity, Boolean.TRUE);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        C56662Kg.LIZ().LIZJ("method_hook_ams_duration", false);
        PreventServerSideCrashes.LJLIL = activity;
        PreventServerSideCrashes.LJ();
        Field field = PreventServerSideCrashes.LJLJJI;
        if (field != null) {
            try {
                field.set(PreventServerSideCrashes.LJLJJL, PreventServerSideCrashes.LJLJJLL);
                PreventServerSideCrashes.LJLJJI = null;
                PreventServerSideCrashes.LJLJJL = null;
                PreventServerSideCrashes.LJLJJLL = null;
            } catch (IllegalAccessException unused) {
            }
        }
        C56662Kg.LIZ().LJFF("method_hook_ams_duration", false);
    }
}
