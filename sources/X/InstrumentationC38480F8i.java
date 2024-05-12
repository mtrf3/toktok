package X;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: X.F8i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class InstrumentationC38480F8i extends Instrumentation {
    public final Instrumentation LIZ;

    public InstrumentationC38480F8i(Instrumentation instrumentation) {
        this.LIZ = instrumentation;
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnDestroy(Activity activity) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            instrumentation.callActivityOnDestroy(activity);
        } else {
            super.callActivityOnDestroy(activity);
        }
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPause(Activity activity) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            instrumentation.callActivityOnPause(activity);
        } else {
            super.callActivityOnPause(activity);
        }
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestart(Activity activity) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            instrumentation.callActivityOnRestart(activity);
        } else {
            super.callActivityOnRestart(activity);
        }
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnResume(Activity activity) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            instrumentation.callActivityOnResume(activity);
        } else {
            super.callActivityOnResume(activity);
        }
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnStart(Activity activity) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            instrumentation.callActivityOnStart(activity);
        } else {
            super.callActivityOnStart(activity);
        }
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnStop(Activity activity) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            instrumentation.callActivityOnStop(activity);
        } else {
            super.callActivityOnStop(activity);
        }
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnUserLeaving(Activity activity) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            instrumentation.callActivityOnUserLeaving(activity);
        } else {
            super.callActivityOnUserLeaving(activity);
        }
    }

    @Override // android.app.Instrumentation
    public final void callApplicationOnCreate(Application application) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            instrumentation.callApplicationOnCreate(application);
        } else {
            super.callApplicationOnCreate(application);
        }
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        try {
            Field field = C38482F8k.LIZ;
            if (field != null && !(((Context) field.get(activity)) instanceof C38481F8j)) {
                field.set(activity, new C38481F8j(activity.getBaseContext()));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            instrumentation.callActivityOnCreate(activity, bundle);
        } else {
            super.callActivityOnCreate(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnNewIntent(Activity activity, Intent intent) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            instrumentation.callActivityOnNewIntent(activity, intent);
        } else {
            super.callActivityOnNewIntent(activity, intent);
        }
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            instrumentation.callActivityOnRestoreInstanceState(activity, bundle);
        } else {
            super.callActivityOnRestoreInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            instrumentation.callActivityOnSaveInstanceState(activity, bundle);
        } else {
            super.callActivityOnSaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public final boolean onException(Object obj, Throwable th) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            return instrumentation.onException(obj, th);
        }
        return super.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation == null) {
            return super.newActivity(classLoader, str, intent);
        }
        return instrumentation.newActivity(classLoader, str, intent);
    }

    @Override // android.app.Instrumentation
    public final Application newApplication(ClassLoader classLoader, String str, Context context) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            return instrumentation.newApplication(classLoader, str, context);
        }
        return super.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        Instrumentation instrumentation = this.LIZ;
        if (instrumentation != null) {
            return instrumentation.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        }
        return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }
}
