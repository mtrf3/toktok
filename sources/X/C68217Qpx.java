package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.Qpx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68217Qpx implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C68074Qne LJLIL;

    public C68217Qpx(C68074Qne c68074Qne) {
        this.LJLIL = c68074Qne;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.LJLIL.LIZIZ(new C68222Qq2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.LJLIL.LIZIZ(new C68220Qq0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.LJLIL.LIZIZ(new C68219Qpz(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.LJLIL.LIZIZ(new C68218Qpy(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.LJLIL.LIZIZ(new C68221Qq1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.LJLIL.LIZIZ(new C68212Qps(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC68193QpZ binderC68193QpZ = new BinderC68193QpZ();
        this.LJLIL.LIZIZ(new C68216Qpw(this, activity, binderC68193QpZ));
        Bundle LLJI = binderC68193QpZ.LLJI(50L);
        if (LLJI != null) {
            bundle.putAll(LLJI);
        }
    }
}
