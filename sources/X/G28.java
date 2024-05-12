package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G28 implements InterfaceC86124Xr6 {
    public static final G28 LIZ = new G28();
    public static InterfaceC88472Yns<? super Activity, C76800UCe> LIZIZ;
    public static InterfaceC88472Yns<? super Context, ? extends Context> LIZJ;

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
    public final Context attachPreBaseContext(Context context) {
        if (context == null) {
            return context;
        }
        InterfaceC88472Yns<? super Context, ? extends Context> interfaceC88472Yns = LIZJ;
        if (interfaceC88472Yns != null) {
            return interfaceC88472Yns.invoke(context);
        }
        return null;
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityDestroyed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC86124Xr6
    public final void onActivityPaused(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        C78855Ux9.LJLILLLLZI = G28.class;
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
        o.LJIIIZ(activity, "activity");
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
        InterfaceC88472Yns<? super Activity, C76800UCe> interfaceC88472Yns = LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(activity);
        }
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
    public final void onConfigurationChanged(ActivityC86117Xqz activityC86117Xqz, Configuration configuration) {
        G12.LIZLLL(activityC86117Xqz, configuration);
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
