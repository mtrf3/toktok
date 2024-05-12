package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IUV implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ IZF LJLIL;

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

    public IUV(IZF izf) {
        this.LJLIL = izf;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        Object value = IZ8.LLIIJI.getValue();
        o.LJIIIIZZ(value, "<get-EnableSyncBrightBetweenDiffActivity>(...)");
        if (!((Boolean) value).booleanValue()) {
            return;
        }
        IZF izf = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resume activity hashcode = ");
        LIZ.append(activity.hashCode());
        X1D.LIZIZ(LIZ);
        izf.getClass();
        IZF.LIZ();
        if (this.LJLIL.LJIILIIL == -1.0f) {
            return;
        }
        Window window = activity.getWindow();
        IZF izf2 = this.LJLIL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("resume activity set screenBrightness = ");
        LIZ2.append(this.LJLIL.LJIILIIL);
        X1D.LIZIZ(LIZ2);
        izf2.getClass();
        IZF.LIZ();
        window.getAttributes().screenBrightness = this.LJLIL.LJIILIIL;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.LJLIL.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        Object value = IZ8.LLIIJI.getValue();
        o.LJIIIIZZ(value, "<get-EnableSyncBrightBetweenDiffActivity>(...)");
        if (!((Boolean) value).booleanValue()) {
            return;
        }
        IZF izf = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create activity hashcode = ");
        LIZ.append(activity.hashCode());
        X1D.LIZIZ(LIZ);
        izf.getClass();
        IZF.LIZ();
        if (this.LJLIL.LJIILIIL == -1.0f) {
            return;
        }
        Window window = activity.getWindow();
        IZF izf2 = this.LJLIL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("create activity set screenBrightness = ");
        LIZ2.append(this.LJLIL.LJIILIIL);
        X1D.LIZIZ(LIZ2);
        izf2.getClass();
        IZF.LIZ();
        window.getAttributes().screenBrightness = this.LJLIL.LJIILIIL;
    }
}
