package com.ss.android.ugc.aweme.captionsheet;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.OOX;
import Y.ACListenerS23S0100000_3;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeCaptionDialogFragment extends AppCompatDialogFragment {
    public LandscapeCaptionPanelFragment LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        return new OOX(getContext());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        LinearLayout linearLayout = new LinearLayout(getContext(), null);
        linearLayout.setGravity(8388613);
        linearLayout.setId(R.id.dm7);
        C16880lQ.LJIIZILJ(linearLayout, new ACListenerS23S0100000_3(this, 14));
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LandscapeCaptionPanelFragment landscapeCaptionPanelFragment = this.LJLIL;
        if (landscapeCaptionPanelFragment != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            LIZ.LJIIIIZZ(R.id.dm7, 1, landscapeCaptionPanelFragment, "Caption");
            LIZ.LJI();
        }
        try {
            ViewTreeLifecycleOwner.set(linearLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(linearLayout, this);
            C10A.LIZIZ(linearLayout, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return linearLayout;
    }
}
