package com.bytedance.android.live.design.app;

import X.AbstractC025808g;
import X.AnonymousClass149;
import X.C10A;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment;

/* loaded from: classes.dex */
public class LiveControllableDialogFragment extends LiveThemeAwareDialogFragment {
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        AnonymousClass149.LIZ.LJ(getDialog());
        super.onDestroyView();
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
            return super.show(abstractC025808g, str);
        }
        return -1;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void showNow(FragmentManager fragmentManager, String str) {
        if (!AnonymousClass149.LIZ.LIZLLL()) {
            super.showNow(fragmentManager, str);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        if (!AnonymousClass149.LIZ.LIZLLL()) {
            super.show(fragmentManager, str);
        }
    }
}
