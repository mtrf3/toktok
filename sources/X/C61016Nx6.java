package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.Nx6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61016Nx6 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C61018Nx8 LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public C61016Nx6(C61018Nx8 c61018Nx8) {
        this.LJLIL = c61018Nx8;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity instanceof InterfaceC55379LoN) {
            C61018Nx8 c61018Nx8 = this.LJLIL;
            c61018Nx8.LJFF--;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity != null) {
            ORS.LJJLIL(new AqS167S0100000_1(activity, 354), C2YY.LIZ);
        }
        this.LJLIL.getClass();
        C61018Nx8 c61018Nx8 = this.LJLIL;
        System.currentTimeMillis();
        c61018Nx8.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity != null) {
            LinkedList<WeakReference<Activity>> linkedList = C2YY.LIZ;
            ORS.LJJLIL(new AqS167S0100000_1(activity, 354), linkedList);
            linkedList.addFirst(new WeakReference<>(activity));
        }
        this.LJLIL.getClass();
        new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C61018Nx8 c61018Nx8 = this.LJLIL;
        int i = c61018Nx8.LIZ + 1;
        c61018Nx8.LIZ = i;
        if (i == 1) {
            c61018Nx8.LIZIZ = false;
            M59 m59 = this.LJLIL.LIZLLL;
            if (m59 != null) {
                m59.onAppEnterForeground();
            }
            if (this.LJLIL.LJ != null) {
                o.LJIIIZ(activity, "activity");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C61018Nx8 c61018Nx8 = this.LJLIL;
        int i = c61018Nx8.LIZ - 1;
        c61018Nx8.LIZ = i;
        if (i == 0) {
            c61018Nx8.LIZIZ = true;
            this.LJLIL.LIZJ = System.currentTimeMillis();
            M59 m59 = this.LJLIL.LIZLLL;
            if (m59 != null) {
                m59.onAppEnterBackGround();
            }
            if (this.LJLIL.LJ != null) {
                o.LJIIIZ(activity, "activity");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof InterfaceC55379LoN) {
            this.LJLIL.LJFF++;
        }
    }
}
