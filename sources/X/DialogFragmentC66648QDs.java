package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.QDs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class DialogFragmentC66648QDs extends DialogFragment {
    public Dialog LJLIL;
    public DialogInterface.OnCancelListener LJLILLLLZI;
    public Dialog LJLJI;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.LJLILLLLZI;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.LJLIL;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.LJLJI == null) {
                Activity activity = getActivity();
                QH7.LJIIIIZZ(activity);
                this.LJLJI = new AlertDialog.Builder(activity).create();
            }
            return this.LJLJI;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
