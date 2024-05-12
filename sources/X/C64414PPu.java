package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.PPu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64414PPu extends C08Z {
    @Override // X.C08Z
    public final void onFragmentDestroyed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentDestroyed(fm, f);
        }
    }

    @Override // X.C08Z
    public final void onFragmentDetached(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentDetached(fm, f);
        }
    }

    @Override // X.C08Z
    public final void onFragmentPaused(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentPaused(fm, f);
        }
    }

    @Override // X.C08Z
    public final void onFragmentResumed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentResumed(fm, f);
        }
    }

    @Override // X.C08Z
    public final void onFragmentStarted(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentStarted(fm, f);
        }
    }

    @Override // X.C08Z
    public final void onFragmentStopped(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentStopped(fm, f);
        }
    }

    @Override // X.C08Z
    public final void onFragmentViewDestroyed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentViewDestroyed(fm, f);
        }
    }

    @Override // X.C08Z
    public final void onFragmentActivityCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentActivityCreated(fm, f, bundle);
        }
    }

    @Override // X.C08Z
    public final void onFragmentAttached(FragmentManager fm, Fragment f, Context context) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(context, "context");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentAttached(fm, f, context);
        }
    }

    @Override // X.C08Z
    public final void onFragmentCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentCreated(fm, f, bundle);
        }
    }

    @Override // X.C08Z
    public final void onFragmentPreAttached(FragmentManager fm, Fragment f, Context context) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(context, "context");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentPreAttached(fm, f, context);
        }
    }

    @Override // X.C08Z
    public final void onFragmentPreCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentPreCreated(fm, f, bundle);
        }
    }

    @Override // X.C08Z
    public final void onFragmentSaveInstanceState(FragmentManager fm, Fragment f, Bundle outState) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(outState, "outState");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentSaveInstanceState(fm, f, outState);
        }
    }

    @Override // X.C08Z
    public final void onFragmentViewCreated(FragmentManager fm, Fragment f, View v, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(v, "v");
        java.util.Set<C08Z> fragmentCallbacks = C64402PPi.LIZJ;
        o.LJIIIIZZ(fragmentCallbacks, "fragmentCallbacks");
        Iterator<C08Z> it = fragmentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentViewCreated(fm, f, v, bundle);
        }
    }
}
