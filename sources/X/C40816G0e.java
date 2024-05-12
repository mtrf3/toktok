package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.G0e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40816G0e implements InterfaceC86124Xr6 {
    public final /* synthetic */ G0Z LIZ;

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
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public C40816G0e(G0Z g0z) {
        this.LIZ = g0z;
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

    @Override // X.InterfaceC86124Xr6
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 123) {
            this.LIZ.LIZLLL();
            ActivityC86117Xqz.Companion.getClass();
            C71426S1m.LIZIZ(this);
        }
    }
}
