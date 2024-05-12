package com.ss.ugc.android.editor.base.view;

import X.ActivityC45651qj;
import X.AnonymousClass025;
import X.C134855Qz;
import X.C16880lQ;
import X.C28289B8j;
import X.C5CU;
import X.DialogInterfaceC39771hF;
import Y.ACListenerS27S0100000_7;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class WaitingDialog extends DialogFragment {
    public C5CU LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        o.LJIIIIZZ(attributes, "window.attributes");
        attributes.width = C134855Qz.LIZ(104.0f);
        attributes.height = C134855Qz.LIZ(88.0f);
        window.setAttributes(attributes);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onCancel(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            AnonymousClass025 anonymousClass025 = new AnonymousClass025(mo49getActivity);
            LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
            o.LJIIIIZZ(layoutInflater, "requireActivity().layoutInflater");
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c97, layoutInflater, null);
            C16880lQ.LJIILLIIL((ImageView) LLLZIIL.findViewById(R.id.iap), new ACListenerS27S0100000_7(this, 78));
            this.LJLIL = (C5CU) LLLZIIL.findViewById(R.id.l39);
            LLLZIIL.findViewById(R.id.ib4);
            C5CU c5cu = this.LJLIL;
            if (c5cu != null) {
                c5cu.setProgress(0);
            }
            anonymousClass025.LIZ.LJIJ = LLLZIIL;
            DialogInterfaceC39771hF LIZ = anonymousClass025.LIZ();
            LIZ.setCanceledOnTouchOutside(false);
            Window window = LIZ.getWindow();
            if (window != null) {
                C28289B8j.LIZIZ(0, window);
            }
            LIZ.requestWindowFeature(1);
            return LIZ;
        }
        throw new IllegalStateException("Activity cannot be null");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
    }
}
