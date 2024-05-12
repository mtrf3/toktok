package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.twitter.sdk.android.core.Session;

/* renamed from: X.Pjc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65276Pjc implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ AbstractC65280Pjg LJLIL;

    public C65276Pjc(C65275Pjb c65275Pjb) {
        this.LJLIL = c65275Pjb;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.LJLIL.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.LJLIL.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.LJLIL.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        boolean z;
        boolean z2;
        C65277Pjd c65277Pjd = ((C65275Pjb) this.LJLIL).LIZ;
        Session LIZIZ = ((C65264PjQ) c65277Pjd.LIZJ).LIZIZ();
        c65277Pjd.LIZIZ.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (LIZIZ != null) {
            C65278Pje c65278Pje = c65277Pjd.LIZ;
            synchronized (c65278Pje) {
                long j = c65278Pje.LIZIZ;
                if (currentTimeMillis - j > 21600000) {
                    z = true;
                } else {
                    z = false;
                }
                c65278Pje.LIZJ.setTimeInMillis(currentTimeMillis);
                int i = c65278Pje.LIZJ.get(6);
                int i2 = c65278Pje.LIZJ.get(1);
                c65278Pje.LIZJ.setTimeInMillis(j);
                int i3 = c65278Pje.LIZJ.get(6);
                int i4 = c65278Pje.LIZJ.get(1);
                if (i == i3 && i2 == i4) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!c65278Pje.LIZ && (z || z2)) {
                    c65278Pje.LIZ = true;
                    c65277Pjd.LIZLLL.submit(new Q8V(11, c65277Pjd));
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.LJLIL.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.LJLIL.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.LJLIL.getClass();
    }
}
