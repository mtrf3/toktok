package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import java.lang.reflect.Field;

/* renamed from: X.Fix, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39755Fix implements Application.ActivityLifecycleCallbacks {
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
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        String[] strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("horae_pause_settings", String[].class, null);
        if (strArr != null) {
            String name = activity.getClass().getName();
            for (String str : strArr) {
                if (TextUtils.equals(str, name)) {
                    RunnableC39754Fiw LIZIZ = RunnableC39754Fiw.LIZIZ();
                    if (!LIZIZ.LJLJI) {
                        return;
                    }
                    LIZIZ.LJLJI = false;
                    LIZIZ.LJLILLLLZI.getLooper().quitSafely();
                    C39756Fiy c39756Fiy = C39756Fiy.LJLJJI;
                    if (!c39756Fiy.LJLJI) {
                        return;
                    }
                    c39756Fiy.LJLJI = false;
                    Handler handler = (Handler) EWB.LIZJ();
                    Field LJIIL = C78934UyQ.LJIIL(Handler.class, "mCallback");
                    if (LJIIL == null) {
                        return;
                    }
                    LJIIL.setAccessible(true);
                    LJIIL.set(handler, c39756Fiy.LJLILLLLZI);
                    return;
                }
                try {
                } catch (Throwable unused) {
                    return;
                }
                return;
            }
            RunnableC39754Fiw LIZIZ2 = RunnableC39754Fiw.LIZIZ();
            Application application = LIZIZ2.LJLIL;
            if (application == null) {
                return;
            }
            LIZIZ2.LIZJ(application, LIZIZ2.LJLJJLL, LIZIZ2.LJLJJL, LIZIZ2.LJLJL);
        }
    }
}
