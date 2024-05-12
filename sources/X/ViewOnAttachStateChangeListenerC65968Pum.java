package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Pum, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ViewOnAttachStateChangeListenerC65968Pum implements View.OnAttachStateChangeListener {
    public static final java.util.Map<Integer, ViewOnAttachStateChangeListenerC65968Pum> LJLJL = new ConcurrentHashMap();
    public static final List<String> LJLJLJ = new ArrayList();
    public static boolean LJLJLLL = C65970Puo.LIZ().enable;
    public final WeakReference<Fragment> LJLIL;
    public final String LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final java.util.Set<ViewOnAttachStateChangeListenerC65968Pum> LJLJJL;
    public ViewOnAttachStateChangeListenerC65968Pum LJLJJLL;

    public ViewOnAttachStateChangeListenerC65968Pum(Fragment fragment) {
        String str;
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = new WeakReference<>(fragment);
        StringBuilder LIZ = X1D.LIZ();
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            str = mo49getActivity.getClass().getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append('@');
        LIZ.append(fragment.getClass().getName());
        this.LJLILLLLZI = X1D.LIZIZ(LIZ);
        this.LJLJJL = new HashSet();
    }

    public final void LIZ(boolean z) {
        boolean z2;
        Boolean bool;
        Boolean bool2;
        boolean z3;
        boolean z4;
        if (!LJLJLLL || z == this.LJLJJI) {
            return;
        }
        ViewOnAttachStateChangeListenerC65968Pum viewOnAttachStateChangeListenerC65968Pum = this.LJLJJLL;
        if (viewOnAttachStateChangeListenerC65968Pum == null) {
            z2 = this.LJLJI;
        } else {
            z2 = viewOnAttachStateChangeListenerC65968Pum.LJLJJI;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        Fragment fragment = this.LJLIL.get();
        String str = null;
        if (fragment != null) {
            bool = Boolean.valueOf(fragment.isVisible());
        } else {
            bool = null;
        }
        Fragment fragment2 = this.LJLIL.get();
        if (fragment2 != null) {
            bool2 = Boolean.valueOf(fragment2.getUserVisibleHint());
        } else {
            bool2 = null;
        }
        if (valueOf != null) {
            z3 = valueOf.booleanValue();
        } else {
            z3 = false;
        }
        if (z3 && bool != null && bool.booleanValue() && bool2 != null && bool2.booleanValue()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (o.LJ("local_test", EF7.LJIILIIL)) {
            o.LJIIIIZZ(C16880lQ.LLLZ("==> checkVisibility = %s  ( parent = %s, super = %s, hint = %s )", Arrays.copyOf(new Object[]{Boolean.valueOf(z4), valueOf, bool, bool2}, 4)), "format(format, *args)");
        }
        if (z4 != this.LJLJJI) {
            this.LJLJJI = z4;
            if (LJLJLLL) {
                if (o.LJ("local_test", EF7.LJIILIIL)) {
                    C07670Rv.LIZLLL("==> onFragmentVisibilityChanged = ", z4);
                }
                if (z4) {
                    Fragment fragment3 = this.LJLIL.get();
                    if (fragment3 != null) {
                        C65966Puk.LIZ(fragment3);
                    }
                } else {
                    Fragment fragment4 = this.LJLIL.get();
                    if (fragment4 != null && LJLJLLL) {
                        List<String> list = LJLJLJ;
                        synchronized (list) {
                            StringBuilder LIZ = X1D.LIZ();
                            ActivityC45651qj mo49getActivity = fragment4.mo49getActivity();
                            if (mo49getActivity != null) {
                                str = mo49getActivity.getClass().getName();
                            }
                            LIZ.append(str);
                            LIZ.append('@');
                            LIZ.append(fragment4.getClass().getName());
                            ((ArrayList) list).remove(X1D.LIZIZ(LIZ));
                        }
                    }
                }
                if (!((HashSet) this.LJLJJL).isEmpty()) {
                    Iterator it = ((HashSet) this.LJLJJL).iterator();
                    while (it.hasNext()) {
                        ViewOnAttachStateChangeListenerC65968Pum viewOnAttachStateChangeListenerC65968Pum2 = (ViewOnAttachStateChangeListenerC65968Pum) it.next();
                        viewOnAttachStateChangeListenerC65968Pum2.getClass();
                        if (LJLJLLL) {
                            if (o.LJ("local_test", EF7.LJIILIIL)) {
                                C07670Rv.LIZLLL("onActivityVisibilityChanged ", z4);
                            }
                            viewOnAttachStateChangeListenerC65968Pum2.LIZ(z4);
                        }
                    }
                }
            }
        }
    }

    public final void LIZIZ(boolean z) {
        if (LJLJLLL) {
            this.LJLJI = z;
            if (o.LJ("local_test", EF7.LJIILIIL)) {
                C07670Rv.LIZLLL("onActivityVisibilityChanged ", z);
            }
            LIZ(z);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        if (LJLJLLL) {
            o.LJ("local_test", EF7.LJIILIIL);
            LIZ(true);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        if (LJLJLLL) {
            o.LJ("local_test", EF7.LJIILIIL);
            v.removeOnAttachStateChangeListener(this);
            LIZ(false);
        }
    }
}
