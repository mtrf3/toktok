package com.google.android.material.bottomsheet;

import X.OOS;
import X.OOU;
import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;

/* loaded from: classes11.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public boolean waitingForDismissAllowingStateLoss;

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (!tryDismissWithAnimation(false)) {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (!tryDismissWithAnimation(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private boolean tryDismissWithAnimation(boolean z) {
        Dialog dialog = getDialog();
        if (dialog instanceof OOS) {
            ((OOS) dialog).LJIJJLI().isHideable();
            return false;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new OOS(getContext(), getTheme());
    }

    private void dismissWithAnimation(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.waitingForDismissAllowingStateLoss = z;
        if (bottomSheetBehavior.getState() == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof OOS) {
            OOS oos = (OOS) getDialog();
            oos.LJLJI.removeBottomSheetCallback(oos.LJLJLJ);
        }
        bottomSheetBehavior.addBottomSheetCallback(new OOU(this));
        bottomSheetBehavior.setState(5);
    }
}
