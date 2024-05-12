package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.UoK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78308UoK implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C78310UoM LJLIL;

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

    public C78308UoK(C78310UoM c78310UoM) {
        this.LJLIL = c78310UoM;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C78305UoH c78305UoH = this.LJLIL.LIZ;
        c78305UoH.getClass();
        c78305UoH.LJFF = SystemClock.uptimeMillis();
        C78273Unl.LJIIIZ().LJ().getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C78305UoH c78305UoH = this.LJLIL.LIZ;
        c78305UoH.getClass();
        c78305UoH.LJI = SystemClock.uptimeMillis();
        if (((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LIZJ > 0) {
            this.LJLIL.LIZJ = Message.obtain();
            C78310UoM c78310UoM = this.LJLIL;
            Message message = c78310UoM.LIZJ;
            message.what = 3514;
            message.obj = c78310UoM.LIZLLL;
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sendMessageDelayed with obj:");
            LIZ.append(this.LJLIL.LIZJ.obj);
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            C78310UoM c78310UoM2 = this.LJLIL;
            c78310UoM2.LJFF.LJ.sendMessageDelayed(c78310UoM2.LIZJ, ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LIZJ);
        }
        C78273Unl.LJIIIZ().LJ().getClass();
    }
}
