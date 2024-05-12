package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Glf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42471Glf implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C42470Gle LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public C42471Glf(C42470Gle c42470Gle) {
        this.LJLIL = c42470Gle;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C42470Gle.LJFF.remove(activity);
        C42470Gle c42470Gle = this.LJLIL;
        int i = c42470Gle.LIZLLL - 1;
        c42470Gle.LIZLLL = i;
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) c42470Gle.LIZ).iterator();
            while (it.hasNext()) {
                ((InterfaceC42472Glg) it.next()).LIZ();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C42470Gle c42470Gle = this.LJLIL;
        c42470Gle.LIZJ++;
        c42470Gle.LIZJ();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        r1.LIZJ--;
        this.LJLIL.LIZJ();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        LinkedList<Activity> linkedList = C42470Gle.LJFF;
        linkedList.remove(activity);
        linkedList.add(activity);
        this.LJLIL.LIZLLL++;
    }
}
