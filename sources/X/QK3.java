package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes12.dex */
public final class QK3 implements Application.ActivityLifecycleCallbacks, InterfaceC66823QKl {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC66825QKn LJLJJI;

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
        int i = this.LJLIL - 1;
        this.LJLIL = i;
        if (i <= 0) {
            this.LJLILLLLZI = false;
            if (i < 0) {
                this.LJLIL = 0;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.LJLIL < 0) {
            this.LJLIL = 0;
        }
        int i = this.LJLIL;
        if (i == 0) {
            this.LJLILLLLZI = true;
        }
        this.LJLIL = i + 1;
        this.LJLJI = true;
        InterfaceC66825QKn interfaceC66825QKn = this.LJLJJI;
        if (interfaceC66825QKn != null) {
            QKV qkv = (QKV) interfaceC66825QKn;
            C66792QJg c66792QJg = qkv.LIZIZ;
            ((QK3) c66792QJg.LJLJJI).LJLJJI = null;
            JFV.LIZLLL(qkv.LIZ, c66792QJg.LJLIL.LIZ());
        }
    }
}
