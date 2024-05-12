package org.greenrobot.eventbus.util;

import X.ActivityC45651qj;
import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes3.dex */
public class ErrorDialogFragments$Support extends DialogFragment implements DialogInterface.OnClickListener {
    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Bundle arguments = getArguments();
        AlertDialog.Builder builder = new AlertDialog.Builder(mo49getActivity);
        builder.setTitle(arguments.getString("de.greenrobot.eventbus.errordialog.title"));
        builder.setMessage(arguments.getString("de.greenrobot.eventbus.errordialog.message"));
        builder.setPositiveButton(R.string.ok, this);
        return builder.create();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (getArguments().getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false) && mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }
}
