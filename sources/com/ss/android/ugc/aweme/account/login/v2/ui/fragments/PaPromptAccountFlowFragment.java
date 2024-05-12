package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

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
import X.GH3;
import X.GH5;
import X.InterfaceC36571c5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PaPromptAccountFlowFragment extends BaseAccountFlowFragment {
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String Gl() {
        return "PaPromptAccountFlowFragment";
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // X.InterfaceC69056R8i
    public final void ee(int i) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        InterfaceC36571c5 LJJJI = getChildFragmentManager().LJJJI(R.id.j71);
        o.LJII(LJJJI, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui.IPaPromptContainerFragment");
        return ((GH5) LJJJI).onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        GH5 gh5;
        o.LJIIIZ(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("private_account_prompt");
        } else {
            i = 1;
        }
        Fragment LJJJIL = getChildFragmentManager().LJJJIL("pa_prompt_process");
        Fragment fragment = LJJJIL;
        if (LJJJIL == null) {
            fragment = GH3.LIZ(i, 0, "register_flow");
        }
        if (fragment.isAdded()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJIIL(fragment);
            c1b3.LJI();
        } else {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager2, childFragmentManager2);
            LIZ.LJIIIIZZ(R.id.j71, 1, fragment, "pa_prompt_process");
            LIZ.LJI();
        }
        if ((fragment instanceof GH5) && (gh5 = (GH5) fragment) != null) {
            gh5.N8(new AqS161S0100000_11(this, 26));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.mr, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
