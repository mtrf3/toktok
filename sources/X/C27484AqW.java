package X;

import Y.ARunnableS0S0204000_3;
import Y.ARunnableS40S0100000_4;
import Y.IDLListenerS7S0300000_4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import ujb.o;

/* renamed from: X.AqW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27484AqW {
    public static final String LIZ(String str) {
        return o.LJJJJZ(o.LJJJJZ(str, "\n", "", false), "\t", " ", false);
    }

    public static final void LIZJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C38995FSd.LIZJ().execute(new ARunnableS40S0100000_4((InterfaceC65784Pro) interfaceC65784Pro, 151));
    }

    public static final void LJ(InterfaceC65784Pro<C76800UCe> action) {
        kotlin.jvm.internal.o.LJIIIZ(action, "action");
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            action.invoke();
        } else {
            C1DH.LJJIJIIJI(new ARunnableS40S0100000_4((InterfaceC65784Pro) action, 151));
        }
    }

    public static final boolean LJFF(LifecycleOwner lifecycleOwner) {
        Fragment fragment;
        Boolean bool = null;
        if ((lifecycleOwner instanceof Fragment) && (fragment = (Fragment) lifecycleOwner) != null) {
            bool = Boolean.valueOf(fragment.isHidden());
        }
        if (kotlin.jvm.internal.o.LJ(bool, Boolean.TRUE)) {
            return false;
        }
        return lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    public static final <T> C5H3<T> LJIIIIZZ(InterfaceC65784Pro<? extends T> init) {
        kotlin.jvm.internal.o.LJIIIZ(init, "init");
        return C221108m2.LIZ(EnumC221088m0.NONE, init);
    }

    public static final void LIZIZ(View view, InterfaceC88472Yns<? super View, Boolean> interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(view, "<this>");
        if (C16330kX.LIZJ(view) && !view.isLayoutRequested()) {
            interfaceC88472Yns.invoke(view);
        } else {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS7S0300000_4(interfaceC88472Yns, view, viewTreeObserver, 3));
        }
    }

    public static final void LJI(View view, Integer num, Integer num2) {
        int i;
        int i2;
        int i3;
        kotlin.jvm.internal.o.LJIIIZ(view, "<this>");
        if (view.getLayoutParams() == null) {
            int i4 = -2;
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = -2;
            }
            if (num2 != null) {
                i4 = num2.intValue();
            }
            view.setLayoutParams(new ViewGroup.LayoutParams(i3, i4));
            return;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = view.getLayoutParams().width;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = view.getLayoutParams().height;
        }
        if (view.getLayoutParams().width == i && view.getLayoutParams().height == i2) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static /* synthetic */ void LJII(View view, Integer num, Integer num2, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        LJI(view, num, num2);
    }

    public static final void LIZLLL(TuxIconView tuxIconView, int i, int i2, int i3, int i4) {
        View view;
        if (tuxIconView == null) {
            return;
        }
        Object parent = tuxIconView.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            view.post(new ARunnableS0S0204000_3(tuxIconView, i, i2, i3, i4, view, 2));
        }
    }
}
