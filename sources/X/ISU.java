package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ISU implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C46982IcE.LJFF().execute(new Runnable() { // from class: X.IST
            @Override // java.lang.Runnable
            public final void run() {
                ISV.LIZJ();
                ISZ isz = (ISZ) ISV.LIZIZ();
                for (String str : isz.LJ.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        isz.LIZIZ.addLast(str);
                    }
                }
                ISW.LIZJ();
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Object value = IZ8.K0.getValue();
        o.LJIIIIZZ(value, "<get-enableSaveWhenActivityStopped>(...)");
        if (!((Boolean) value).booleanValue()) {
            C46982IcE.LJFF().execute(new ISX());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object value = IZ8.K0.getValue();
        o.LJIIIIZZ(value, "<get-enableSaveWhenActivityStopped>(...)");
        if (((Boolean) value).booleanValue()) {
            C46982IcE.LJFF().execute(new ISX());
        }
    }
}
