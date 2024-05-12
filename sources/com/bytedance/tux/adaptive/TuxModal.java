package com.bytedance.tux.adaptive;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C226588us;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.DialogC80745VmX;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TuxModal extends AppCompatDialogFragment {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final boolean LJLIL = true;
    public final boolean LJLILLLLZI = true;
    public final boolean LJLJI = true;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "if (t != null) ContextTh… t) else requireContext()");
        return new DialogC80745VmX(requireContext, this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C226588us c226588us;
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        Dialog dialog = getDialog();
        C29S c29s = null;
        if (dialog != null) {
            c226588us = (C226588us) dialog.findViewById(R.id.gl5);
        } else {
            c226588us = null;
        }
        if (c226588us != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            c226588us.LIZ(childFragmentManager);
        }
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return onCreateView;
    }
}
