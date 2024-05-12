package com.ss.android.ugc.aweme.journey.step.privacyhighlights;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C29S;
import X.C35656Dz2;
import X.C35878E6g;
import X.C3C5;
import X.C40791Fzf;
import X.C76800UCe;
import X.C7FV;
import X.C90903hW;
import X.InterfaceC182807Fk;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeens;
import com.ss.android.ugc.aweme.compliance.api.phl.vm.PhlViewModel;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class PrivacyHighlightsForTeensComponent extends NUJComponentFragment {
    public Fragment LJLJJL;
    public PhlViewModel LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C40791Fzf c40791Fzf;
        PrivacyHighlightsForTeens privacyHighlightsForTeens;
        super.onCreate(bundle);
        C35878E6g.LIZ();
        C35656Dz2 wl = wl();
        if (!(wl instanceof C40791Fzf) || (c40791Fzf = (C40791Fzf) wl) == null || (privacyHighlightsForTeens = c40791Fzf.LIZIZ) == null) {
            vl(Boolean.TRUE);
        } else {
            this.LJLJJLL = (PhlViewModel) ViewModelProviders.of(requireActivity(), new C7FV(privacyHighlightsForTeens)).get(PhlViewModel.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Fragment LJJJIL = getChildFragmentManager().LJJJIL("phl_fragment");
        this.LJLJJL = LJJJIL;
        if (LJJJIL == null) {
            Fragment LJIJJ = a.LJFF().LJIJJ();
            this.LJLJJL = LJIJJ;
            if (LJIJJ == 0) {
                vl(Boolean.TRUE);
            } else {
                ((InterfaceC182807Fk) LJIJJ).ij(new AqS156S0100000_6(this, 88));
                Fragment fragment = this.LJLJJL;
                o.LJI(fragment);
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                C1B3 c1b3 = new C1B3(childFragmentManager);
                c1b3.LJIIJ(fragment, "phl_fragment", R.id.ba7);
                c1b3.LJIIL(fragment);
                c1b3.LJI();
            }
        }
        PhlViewModel phlViewModel = this.LJLJJLL;
        if (phlViewModel != null) {
            phlViewModel.gv0();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bex, viewGroup, false);
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
