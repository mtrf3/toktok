package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import com.android.billingclient.api.ProxyBillingActivity;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;

/* renamed from: X.UoQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78314UoQ implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C78315UoR LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
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

    public C78314UoQ(C78315UoR c78315UoR) {
        this.LJLIL = c78315UoR;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity.getClass() == ProxyBillingActivity.class) {
            C78306UoI c78306UoI = this.LJLIL.LIZ;
            c78306UoI.getClass();
            c78306UoI.LIZJ = SystemClock.uptimeMillis();
            if (((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LIZJ > 0) {
                this.LJLIL.LJIIIIZZ = Message.obtain();
                C78315UoR c78315UoR = this.LJLIL;
                Message message = c78315UoR.LJIIIIZZ;
                message.what = 1435;
                message.obj = c78315UoR.LJII;
                C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sendMessageDelayed with obj:");
                LIZ.append(this.LJLIL.LJIIIIZZ.obj);
                X1D.LIZIZ(LIZ);
                LJ.getClass();
                C78315UoR c78315UoR2 = this.LJLIL;
                c78315UoR2.LJIIIZ.LJFF.sendMessageDelayed(c78315UoR2.LJIIIIZZ, ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LIZJ);
            }
            RestoreOrderService.getIns(this.LJLIL.LJIIIZ.LJ).onGooglePanelDismiss(this.LJLIL.LJI);
            this.LJLIL.LJIIJJI();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity.getClass() == ProxyBillingActivity.class) {
            C78306UoI c78306UoI = this.LJLIL.LIZ;
            c78306UoI.getClass();
            c78306UoI.LIZIZ = SystemClock.uptimeMillis();
            this.LJLIL.LJ = true;
        }
    }
}
