package com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedfeed;

import X.A7N;
import X.A7O;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C1DJ;
import X.C25600zU;
import X.C283619k;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC88472Yns;
import X.V66;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ManageFeedsPanelFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public A7O LJLIL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLIL = null;
        this.LJLILLLLZI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        Context c25600zU;
        o.LJIIIZ(inflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_in_sheet");
        } else {
            z = true;
        }
        if (z) {
            c25600zU = requireContext();
        } else {
            c25600zU = new C25600zU(mo49getActivity(), R.style.uw);
        }
        o.LJIIIIZZ(c25600zU, "if (inSheet) {\n         …eOverlay_Const)\n        }");
        C29S c29s = null;
        ComposeView composeView = new ComposeView(c25600zU, null, 6);
        composeView.setViewCompositionStrategy(C283619k.LIZIZ);
        V66.LIZIZ(composeView, C1DJ.LJFF(new A7N(z, this), -142132546, true));
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            C10A.LIZIZ(composeView, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return composeView;
    }
}
