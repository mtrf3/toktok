package com.zhihu.matisse.internal.ui.widget;

import X.AnonymousClass025;
import Y.IDCListenerS79S0000000_7;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class IncapableDialog extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("extra_title");
        String string2 = getArguments().getString("extra_message");
        AnonymousClass025 anonymousClass025 = new AnonymousClass025(mo49getActivity());
        if (!TextUtils.isEmpty(string)) {
            anonymousClass025.LIZ.LIZLLL = string;
        }
        if (!TextUtils.isEmpty(string2)) {
            anonymousClass025.LIZ.LJFF = string2;
        }
        anonymousClass025.LIZLLL(R.string.i0t, new IDCListenerS79S0000000_7(1));
        return anonymousClass025.LIZ();
    }

    public static IncapableDialog vl(String str, String str2) {
        IncapableDialog incapableDialog = new IncapableDialog();
        Bundle bundle = new Bundle();
        bundle.putString("extra_title", str);
        bundle.putString("extra_message", str2);
        incapableDialog.setArguments(bundle);
        return incapableDialog;
    }
}
