package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: X.EbB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36725EbB implements Application.ActivityLifecycleCallbacks {
    public static boolean LJLJI;
    public Field LJLIL;
    public Field LJLILLLLZI;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void LIZ(Application application) {
        Field field;
        try {
            if (EWE.LIZ()) {
                try {
                    field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mAttachInfo");
                    field.setAccessible(true);
                } catch (Throwable unused) {
                    field = null;
                }
            } else {
                field = EWF.LIZ(View.class, "mAttachInfo");
            }
            this.LJLIL = field;
            if (field != null) {
                field.setAccessible(true);
                application.registerActivityLifecycleCallbacks(this);
                F8X.LIZ();
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        F8X.LIZ();
        if (this.LJLIL == null) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            decorView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC36726EbC(this, decorView));
        } catch (Throwable unused) {
        }
    }
}
