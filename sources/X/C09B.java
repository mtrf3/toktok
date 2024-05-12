package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.09B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C09B {
    public final CopyOnWriteArrayList<C09A> LIZ = new CopyOnWriteArrayList<>();
    public final FragmentManager LIZIZ;

    public C09B(FragmentManager fragmentManager) {
        this.LIZIZ = fragmentManager;
    }

    public final void LIZLLL(Fragment fragment, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LIZLLL(fragment, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentDestroyed(this.LIZIZ, fragment);
            }
        }
    }

    public final void LJ(Fragment fragment, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LJ(fragment, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentDetached(this.LIZIZ, fragment);
            }
        }
    }

    public final void LJFF(Fragment fragment, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LJFF(fragment, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentPaused(this.LIZIZ, fragment);
            }
        }
    }

    public final void LJIIIIZZ(Fragment fragment, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LJIIIIZZ(fragment, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentResumed(this.LIZIZ, fragment);
            }
        }
    }

    public final void LJIIJ(Fragment fragment, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LJIIJ(fragment, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentStarted(this.LIZIZ, fragment);
            }
        }
    }

    public final void LJIIJJI(Fragment fragment, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LJIIJJI(fragment, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentStopped(this.LIZIZ, fragment);
            }
        }
    }

    public final void LJIILIIL(Fragment fragment, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LJIILIIL(fragment, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentViewDestroyed(this.LIZIZ, fragment);
            }
        }
    }

    public final void LIZ(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LIZ(fragment, bundle, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentActivityCreated(this.LIZIZ, fragment, bundle);
            }
        }
    }

    public final void LIZIZ(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LIZIZ(fragment, context, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentAttached(this.LIZIZ, fragment, context);
            }
        }
    }

    public final void LIZJ(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LIZJ(fragment, bundle, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentCreated(this.LIZIZ, fragment, bundle);
            }
        }
    }

    public final void LJI(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LJI(fragment, context, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentPreAttached(this.LIZIZ, fragment, context);
            }
        }
    }

    public final void LJII(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LJII(fragment, bundle, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentPreCreated(this.LIZIZ, fragment, bundle);
            }
        }
    }

    public final void LJIIIZ(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LJIIIZ(fragment, bundle, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentSaveInstanceState(this.LIZIZ, fragment, bundle);
            }
        }
    }

    public final void LJIIL(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.LIZIZ.mParent;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().mLifecycleCallbacksDispatcher.LJIIL(fragment, view, bundle, true);
        }
        Iterator<C09A> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09A next = it.next();
            if (!z || next.LIZIZ) {
                next.LIZ.onFragmentViewCreated(this.LIZIZ, fragment, view, bundle);
            }
        }
    }
}
