package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.EEr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36097EEr implements Application.ActivityLifecycleCallbacks {
    public int LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        int i = this.LJLIL + 1;
        this.LJLIL = i;
        if (i == 1) {
            EEW.LIZ.getClass();
            C36093EEn c36093EEn = C36093EEn.LIZ;
            EnumC36103EEx triggerType = EnumC36103EEx.TASK_APP_BACKGROUND;
            c36093EEn.getClass();
            o.LJIIIZ(triggerType, "triggerType");
            InterfaceC36091EEl interfaceC36091EEl = C36093EEn.LJIILJJIL.get(triggerType);
            if (interfaceC36091EEl != null) {
                interfaceC36091EEl.LIZIZ();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        int i = this.LJLIL - 1;
        this.LJLIL = i;
        if (i == 0) {
            EEW.LIZ.getClass();
            C36093EEn c36093EEn = C36093EEn.LIZ;
            EnumC36103EEx triggerType = EnumC36103EEx.TASK_APP_BACKGROUND;
            c36093EEn.getClass();
            o.LJIIIZ(triggerType, "triggerType");
            InterfaceC36091EEl interfaceC36091EEl = C36093EEn.LJIILJJIL.get(triggerType);
            if (interfaceC36091EEl != null) {
                interfaceC36091EEl.LIZ();
            }
        }
    }
}
