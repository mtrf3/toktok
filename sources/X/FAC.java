package X;

import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;

/* loaded from: classes7.dex */
public class FAC implements Application.ActivityLifecycleCallbacks {
    public final IDRunnableS6S0101000 LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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
    public final void onActivityStopped(Activity activity) {
    }

    public FAC(MainLooperOptService mainLooperOptService) {
        this.LJLIL = new IDRunnableS6S0101000(4, mainLooperOptService, 26);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (C34710Djm.LJIIIIZZ() && activity.getComponentName().getClassName().equals("DeepLinkActivityV2")) {
            MainLooperOptService.LLFII.removeCallbacks(this.LJLIL);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (C34710Djm.LJIIIIZZ() && activity.getComponentName().getClassName().equals("DeepLinkActivityV2")) {
            MainLooperOptService.LJII();
            MainLooperOptService.LLFII.postAtFrontOfQueue(this.LJLIL);
        }
    }
}
