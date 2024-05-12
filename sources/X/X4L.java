package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public class X4L implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ X4M LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public X4L(X4M x4m) {
        this.LJLIL = x4m;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.LJLIL.getClass();
        X4M x4m = this.LJLIL;
        if (x4m.LIZJ == 0 && activity != null) {
            x4m.LIZJ = activity.hashCode();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i;
        Object[] objArr;
        X4M x4m = this.LJLIL;
        int i2 = x4m.LIZJ;
        if (activity != null) {
            i = activity.hashCode();
        } else {
            i = i2;
        }
        x4m.LIZJ = i;
        if (i2 == 0) {
            X4M x4m2 = this.LJLIL;
            x4m2.LIZLLL = 1;
            synchronized (x4m2.LIZIZ) {
                if (((ArrayList) x4m2.LIZIZ).size() > 0) {
                    objArr = ((ArrayList) x4m2.LIZIZ).toArray();
                } else {
                    objArr = null;
                }
            }
            if (objArr != null) {
                for (Object obj : objArr) {
                    ((X4N) obj).onAppForeground();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i;
        Object[] objArr;
        X4M x4m = this.LJLIL;
        new WeakReference(activity);
        x4m.getClass();
        X4M x4m2 = this.LJLIL;
        int i2 = x4m2.LIZJ;
        if (activity != null) {
            i = activity.hashCode();
        } else {
            i = i2;
        }
        x4m2.LIZJ = i;
        this.LJLIL.getClass();
        if (i2 == 0) {
            X4M x4m3 = this.LJLIL;
            x4m3.LIZLLL = 1;
            synchronized (x4m3.LIZIZ) {
                if (((ArrayList) x4m3.LIZIZ).size() > 0) {
                    objArr = ((ArrayList) x4m3.LIZIZ).toArray();
                } else {
                    objArr = null;
                }
            }
            if (objArr != null) {
                for (Object obj : objArr) {
                    ((X4N) obj).onAppForeground();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object[] objArr;
        if (activity != null) {
            int hashCode = activity.hashCode();
            X4M x4m = this.LJLIL;
            if (hashCode == x4m.LIZJ) {
                x4m.LIZJ = 0;
                x4m.LIZLLL = 0;
                synchronized (x4m.LIZIZ) {
                    if (((ArrayList) x4m.LIZIZ).size() > 0) {
                        objArr = ((ArrayList) x4m.LIZIZ).toArray();
                    } else {
                        objArr = null;
                    }
                }
                if (objArr != null) {
                    for (Object obj : objArr) {
                        ((X4N) obj).onAppBackground();
                    }
                }
            }
        }
        this.LJLIL.getClass();
    }
}
