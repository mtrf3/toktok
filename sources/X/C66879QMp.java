package X;

import Y.ARunnableS47S0100000_11;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;

/* renamed from: X.QMp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66879QMp implements Application.ActivityLifecycleCallbacks {
    public static final WeakHandler LJLJJI = new WeakHandler(C16880lQ.LLJJJJ(), new C66880QMq());
    public boolean LJLIL;
    public InterfaceC66881QMr LJLILLLLZI;
    public final ARunnableS47S0100000_11 LJLJI = new ARunnableS47S0100000_11(this, 19);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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
    public final void onActivityPaused(Activity activity) {
        if (this.LJLIL) {
            LJLJJI.postDelayed(this.LJLJI, 3000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (!this.LJLIL) {
            this.LJLIL = true;
            InterfaceC66881QMr interfaceC66881QMr = this.LJLILLLLZI;
            if (interfaceC66881QMr != null) {
                interfaceC66881QMr.LIZIZ();
            }
        }
        Logger.debug();
        LJLJJI.removeCallbacks(this.LJLJI);
    }
}
