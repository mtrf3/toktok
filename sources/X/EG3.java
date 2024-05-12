package X;

import Y.ARunnableS13S0000000_6;
import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class EG3 extends EG4 {
    public final /* synthetic */ AtomicBoolean LJLIL;

    public EG3(AtomicBoolean atomicBoolean) {
        this.LJLIL = atomicBoolean;
    }

    @Override // X.EG4, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.LJLIL.get()) {
            this.LJLIL.set(false);
            FAJ.LIZLLL(C16880lQ.LLIIIJ(), new ARunnableS13S0000000_6(21));
        }
    }
}
