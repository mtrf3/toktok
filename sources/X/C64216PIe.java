package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.PIe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64216PIe implements Application.ActivityLifecycleCallbacks, PG9 {
    public final ArrayList<InterfaceC64219PIh> LJLIL = new ArrayList<>();
    public WeakReference<Activity> LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public volatile boolean LJLJJL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // X.PG9
    public final String LIZLLL() {
        Activity activity;
        WeakReference<Activity> weakReference = this.LJLILLLLZI;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return "";
        }
        return C16880lQ.LJLLILLLL(activity.getClass());
    }

    public final Object[] LJ() {
        Object[] objArr;
        synchronized (this.LJLIL) {
            if (this.LJLIL.size() > 0) {
                objArr = this.LJLIL.toArray();
            } else {
                objArr = null;
            }
        }
        if (objArr == null) {
            return new Object[0];
        }
        return objArr;
    }

    public C64216PIe() {
        Application application = C78248UnM.LJLJJI;
        application.unregisterActivityLifecycleCallbacks(this);
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // X.PG9
    public final boolean isForeground() {
        return this.LJLJJL;
    }

    @Override // X.PG9
    public final void LIZ(InterfaceC64219PIh interfaceC64219PIh) {
        if (interfaceC64219PIh == null) {
            return;
        }
        synchronized (this.LJLIL) {
            this.LJLIL.add(interfaceC64219PIh);
        }
    }

    @Override // X.PG9
    public final void LIZJ(PG8 pg8) {
        if (pg8 == null) {
            return;
        }
        synchronized (this.LJLIL) {
            this.LJLIL.remove(pg8);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        for (Object obj : LJ()) {
            ((InterfaceC64219PIh) obj).LJ();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.LJLILLLLZI = new WeakReference<>(activity);
        for (Object obj : LJ()) {
            ((InterfaceC64219PIh) obj).LIZJ();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        for (Object obj : LJ()) {
            ((InterfaceC64219PIh) obj).LIZLLL();
        }
        if (this.LJLJI) {
            this.LJLJI = false;
            return;
        }
        int i = this.LJLJJI + 1;
        this.LJLJJI = i;
        if (i == 1) {
            this.LJLJJL = true;
            for (Object obj2 : LJ()) {
                ((InterfaceC64219PIh) obj2).LIZIZ();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.LJLJI = true;
            return;
        }
        int i = this.LJLJJI - 1;
        this.LJLJJI = i;
        if (i == 0) {
            this.LJLJJL = false;
            for (Object obj : LJ()) {
                ((InterfaceC64219PIh) obj).onBackground();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        for (Object obj : LJ()) {
            ((InterfaceC64219PIh) obj).LIZ();
        }
    }
}
