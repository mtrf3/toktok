package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G26 implements InterfaceC86124Xr6 {
    public static final G26 LIZ = new G26();

    @Override // X.InterfaceC86124Xr6
    public final Context attachPreBaseContext(Context context) {
        return context;
    }

    @Override // X.InterfaceC86124Xr6
    public final void finish() {
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityReenter(int i, Intent intent) {
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC86124Xr6
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityDestroyed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPaused(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostDestroyed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostPaused(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostResumed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostStarted(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostStopped(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPreDestroyed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPrePaused(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPreResumed(ActivityC86117Xqz activity) {
        Activity activity2;
        o.LJIIIZ(activity, "activity");
        WeakReference<Activity> weakReference = C53946LFe.LIZ;
        if (weakReference != null && (activity2 = weakReference.get()) != null && activity.hashCode() == activity2.hashCode()) {
            return;
        }
        C53946LFe.LIZ = new WeakReference<>(activity);
        C53946LFe.LIZIZ = activity.hashCode();
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPreStarted(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPreStopped(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityResumed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityStarted(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityStopped(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onPreRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onSupportContentChanged(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void attachBaseContext(Context context, Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPostSaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle) {
        G12.LIZ(activityC86117Xqz, bundle);
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPreCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        C53946LFe.LIZ = new WeakReference<>(activity);
        C53946LFe.LIZIZ = activity.hashCode();
        LFH.LIZIZ.LIZ().LIZ(activity);
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPreSaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle) {
        G12.LIZIZ(activityC86117Xqz, bundle);
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivitySaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle) {
        G12.LIZJ(activityC86117Xqz, bundle);
    }

    @Override // X.InterfaceC86124Xr6
    public final void onConfigurationChanged(ActivityC86117Xqz activity, Configuration newConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(newConfig, "newConfig");
        C53946LFe.LIZ(activity, null);
        LFH.LIZIZ.LIZ().onConfigurationChanged(activity, newConfig);
        Iterator it = ((ArrayList) C9XU.LIZ).iterator();
        while (it.hasNext()) {
            C9NF c9nf = (C9NF) it.next();
            G27 g27 = c9nf.LIZIZ.get();
            if (g27 == null) {
                it.remove();
            } else if (c9nf.LIZ == activity.hashCode() || c9nf.LIZ < 0) {
                try {
                    g27.onConfigurationChanged(activity, newConfig);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // X.InterfaceC86124Xr6
    public final void onWindowFocusChanged(ActivityC86117Xqz activity, boolean z) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void setContentView(Activity activity, int i) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void setContentView(Activity activity, View view) {
        o.LJIIIZ(activity, "activity");
    }
}
