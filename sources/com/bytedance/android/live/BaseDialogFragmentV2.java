package com.bytedance.android.live;

import X.AbstractC025808g;
import X.AnonymousClass149;
import X.C0NB;
import X.C10A;
import X.C1B3;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class BaseDialogFragmentV2 extends LiveThemeAwareDialogFragment {
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        AnonymousClass149.LIZ.LJ(getDialog());
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (getFragmentManager() == null) {
            C0NB.LIZIZ("BaseDialogFragmentV2", "dismiss:${this} not associate with a fragment manager");
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (getFragmentManager() == null) {
            C0NB.LIZIZ("BaseDialogFragmentV2", "dismissAllowingStateLoss:${this} not associate with a fragment manager");
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        View decorView;
        super.onStart();
        AnonymousClass149.LIZ.LIZ(getDialog());
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final int show(AbstractC025808g abstractC025808g, String str) {
        if (!AnonymousClass149.LIZ.LIZLLL()) {
            Boolean bool = Boolean.FALSE;
            vl(bool, "mDismissed");
            vl(Boolean.TRUE, "mShownByMe");
            abstractC025808g.LJIIIIZZ(0, 1, this, str);
            vl(bool, "mViewDestroyed");
            int LJIILL = ((C1B3) abstractC025808g).LJIILL(true);
            vl(Integer.valueOf(LJIILL), "mBackStackId");
            return LJIILL;
        }
        return -1;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void showNow(FragmentManager fragmentManager, String str) {
        if (!AnonymousClass149.LIZ.LIZLLL()) {
            vl(Boolean.FALSE, "mDismissed");
            vl(Boolean.TRUE, "mShownByMe");
            fragmentManager.getClass();
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJIIIIZZ(0, 1, this, str);
            try {
                c1b3.LJII();
            } catch (Throwable unused) {
                c1b3.LJI();
            }
        }
    }

    public final void vl(Object obj, String str) {
        try {
            Field declaredField = BaseDialogFragmentV2.class.getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(this, obj);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        if (!AnonymousClass149.LIZ.LIZLLL()) {
            vl(Boolean.FALSE, "mDismissed");
            vl(Boolean.TRUE, "mShownByMe");
            fragmentManager.getClass();
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJIIIIZZ(0, 1, this, str);
            c1b3.LJI();
        }
    }
}
