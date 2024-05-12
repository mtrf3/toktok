package X;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.QYv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ComponentCallbacks2C67197QYv implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final ComponentCallbacks2C67197QYv LJLJJL = new ComponentCallbacks2C67197QYv();
    public final AtomicBoolean LJLIL = new AtomicBoolean();
    public final AtomicBoolean LJLILLLLZI = new AtomicBoolean();
    public final ArrayList<QZ6> LJLJI = new ArrayList<>();
    public boolean LJLJJI = false;

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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public static void LIZJ(Application application) {
        ComponentCallbacks2C67197QYv componentCallbacks2C67197QYv = LJLJJL;
        synchronized (componentCallbacks2C67197QYv) {
            if (!componentCallbacks2C67197QYv.LJLJJI) {
                application.registerActivityLifecycleCallbacks(componentCallbacks2C67197QYv);
                application.registerComponentCallbacks(componentCallbacks2C67197QYv);
                componentCallbacks2C67197QYv.LJLJJI = true;
            }
        }
    }

    public final void LIZ(QZ6 qz6) {
        synchronized (LJLJJL) {
            this.LJLJI.add(qz6);
        }
    }

    public final void LIZLLL(boolean z) {
        synchronized (LJLJJL) {
            Iterator<QZ6> it = this.LJLJI.iterator();
            while (it.hasNext()) {
                it.next().LIZ(z);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.LJLIL.compareAndSet(true, false);
        this.LJLILLLLZI.set(true);
        if (compareAndSet) {
            LIZLLL(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.LJLIL.compareAndSet(false, true)) {
            this.LJLILLLLZI.set(true);
            LIZLLL(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.LJLIL.compareAndSet(true, false);
        this.LJLILLLLZI.set(true);
        if (compareAndSet) {
            LIZLLL(false);
        }
    }
}
