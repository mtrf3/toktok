package X;

import android.app.Activity;
import com.ss.android.common.applog.AppLog;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class FJT implements InterfaceC39329Fc5, InterfaceC40105Fob {
    public static final FJT LIZ = new FJT();

    @Override // X.InterfaceC39329Fc5
    public final void LIZ() {
    }

    @Override // X.InterfaceC40105Fob
    public final void onActivityPaused(Activity activity) {
        if (activity == null || !FMR.LIZ.LIZIZ.get()) {
            return;
        }
        AppLog.onPause(activity);
    }

    @Override // X.InterfaceC40105Fob
    public final void onActivityResumed(Activity activity) {
        if (activity != null) {
            if (!FJ4.LIZ) {
                FJ4.LIZIZ = new WeakReference<>(activity);
            } else {
                if (!FMR.LIZ.LIZIZ.get()) {
                    return;
                }
                AppLog.onResume(activity);
            }
        }
    }
}
