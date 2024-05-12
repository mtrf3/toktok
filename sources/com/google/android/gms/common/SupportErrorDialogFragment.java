package com.google.android.gms.common;

import X.QH7;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes12.dex */
public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog LJLIL;
    public DialogInterface.OnCancelListener LJLILLLLZI;
    public Dialog LJLJI;

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.LJLILLLLZI;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.LJLIL;
        if (dialog == null) {
            this.mShowsDialog = false;
            if (this.LJLJI == null) {
                Context context = getContext();
                QH7.LJIIIIZZ(context);
                this.LJLJI = new AlertDialog.Builder(context).create();
            }
            return this.LJLJI;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
