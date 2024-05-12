package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Pul, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65967Pul extends C08Z {
    @Override // X.C08Z
    public final void onFragmentDestroyed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentDestroyed(fm, f);
        ViewOnAttachStateChangeListenerC65968Pum LIZIZ = C65966Puk.LIZIZ(f);
        if (LIZIZ != null && ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            o.LJ("local_test", EF7.LJIILIIL);
            ViewOnAttachStateChangeListenerC65968Pum viewOnAttachStateChangeListenerC65968Pum = LIZIZ.LJLJJLL;
            if (viewOnAttachStateChangeListenerC65968Pum != null) {
                C65777Prh.LIZ(viewOnAttachStateChangeListenerC65968Pum.LJLJJL).remove(LIZIZ);
            }
            LIZIZ.LIZ(false);
            LIZIZ.LJLJJLL = null;
        }
        if (ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            ((ConcurrentHashMap) ViewOnAttachStateChangeListenerC65968Pum.LJLJL).remove(Integer.valueOf(f.hashCode()));
        }
    }

    @Override // X.C08Z
    public final void onFragmentDetached(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentDetached(fm, f);
        ViewOnAttachStateChangeListenerC65968Pum LIZIZ = C65966Puk.LIZIZ(f);
        if (LIZIZ != null && ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            o.LJ("local_test", EF7.LJIILIIL);
            ViewOnAttachStateChangeListenerC65968Pum viewOnAttachStateChangeListenerC65968Pum = LIZIZ.LJLJJLL;
            if (viewOnAttachStateChangeListenerC65968Pum != null) {
                C65777Prh.LIZ(viewOnAttachStateChangeListenerC65968Pum.LJLJJL).remove(LIZIZ);
            }
            LIZIZ.LIZ(false);
            LIZIZ.LJLJJLL = null;
        }
        if (ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            ((ConcurrentHashMap) ViewOnAttachStateChangeListenerC65968Pum.LJLJL).remove(Integer.valueOf(f.hashCode()));
        }
    }

    @Override // X.C08Z
    public final void onFragmentPaused(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentPaused(fm, f);
        ViewOnAttachStateChangeListenerC65968Pum LIZIZ = C65966Puk.LIZIZ(f);
        if (LIZIZ != null && ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            o.LJ("local_test", EF7.LJIILIIL);
            LIZIZ.LIZIZ(false);
        }
    }

    @Override // X.C08Z
    public final void onFragmentResumed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentResumed(fm, f);
        ViewOnAttachStateChangeListenerC65968Pum LIZIZ = C65966Puk.LIZIZ(f);
        if (LIZIZ != null && ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            o.LJ("local_test", EF7.LJIILIIL);
            LIZIZ.LIZIZ(true);
        }
    }

    @Override // X.C08Z
    public final void onFragmentStarted(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentStarted(fm, f);
        C65960Pue.LIZIZ(f, true, false);
        ViewOnAttachStateChangeListenerC65968Pum LIZIZ = C65966Puk.LIZIZ(f);
        if (LIZIZ != null && ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            o.LJ("local_test", EF7.LJIILIIL);
            LIZIZ.LIZIZ(true);
        }
    }

    @Override // X.C08Z
    public final void onFragmentStopped(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentStopped(fm, f);
        C65960Pue.LIZIZ(f, false, false);
        ViewOnAttachStateChangeListenerC65968Pum LIZIZ = C65966Puk.LIZIZ(f);
        if (LIZIZ != null && ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            o.LJ("local_test", EF7.LJIILIIL);
            LIZIZ.LIZIZ(false);
        }
    }

    @Override // X.C08Z
    public final void onFragmentAttached(FragmentManager fm, Fragment f, Context context) {
        Fragment parentFragment;
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(context, "context");
        super.onFragmentAttached(fm, f, context);
        if (ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            ((ConcurrentHashMap) ViewOnAttachStateChangeListenerC65968Pum.LJLJL).put(Integer.valueOf(f.hashCode()), new ViewOnAttachStateChangeListenerC65968Pum(f));
        }
        ViewOnAttachStateChangeListenerC65968Pum LIZIZ = C65966Puk.LIZIZ(f);
        if (LIZIZ != null && ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            o.LJ("local_test", EF7.LJIILIIL);
            Fragment fragment = LIZIZ.LJLIL.get();
            if (fragment != null && (parentFragment = fragment.getParentFragment()) != null) {
                ViewOnAttachStateChangeListenerC65968Pum viewOnAttachStateChangeListenerC65968Pum = (ViewOnAttachStateChangeListenerC65968Pum) ((ConcurrentHashMap) ViewOnAttachStateChangeListenerC65968Pum.LJLJL).get(Integer.valueOf(parentFragment.hashCode()));
                if (viewOnAttachStateChangeListenerC65968Pum != null) {
                    LIZIZ.LJLJJLL = viewOnAttachStateChangeListenerC65968Pum;
                    ((HashSet) viewOnAttachStateChangeListenerC65968Pum.LJLJJL).add(LIZIZ);
                }
            }
            LIZIZ.LIZ(true);
        }
    }

    @Override // X.C08Z
    public final void onFragmentCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        C65960Pue.LIZIZ(f, true, false);
    }

    @Override // X.C08Z
    public final void onFragmentViewCreated(FragmentManager fm, Fragment f, View v, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(v, "v");
        super.onFragmentViewCreated(fm, f, v, bundle);
        ViewOnAttachStateChangeListenerC65968Pum LIZIZ = C65966Puk.LIZIZ(f);
        if (LIZIZ != null && ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            o.LJ("local_test", EF7.LJIILIIL);
            v.addOnAttachStateChangeListener(LIZIZ);
        }
    }
}
