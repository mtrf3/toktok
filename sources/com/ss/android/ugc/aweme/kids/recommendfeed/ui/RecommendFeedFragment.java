package com.ss.android.ugc.aweme.kids.recommendfeed.ui;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C0H1;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C29S;
import X.C3C5;
import X.C65300Pk0;
import X.C71801SFx;
import X.C76800UCe;
import X.C90903hW;
import X.O6B;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class RecommendFeedFragment extends AmeBaseFragment implements O6B {
    public KidsFeedFragment LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // X.O6B
    public final void sk() {
        KidsFeedFragment kidsFeedFragment = this.LJLIL;
        if (kidsFeedFragment != null) {
            kidsFeedFragment.sk();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.O6B
    public final void b5(boolean z) {
        KidsFeedFragment kidsFeedFragment = this.LJLIL;
        if (kidsFeedFragment != null) {
            if (kidsFeedFragment.LJLJLJ || KidsFeedFragment.LJZ) {
                kidsFeedFragment.LJLJLJ = false;
                KidsFeedFragment.LJZ = false;
                kidsFeedFragment.LJLJJI.startPlay();
                return;
            }
            kidsFeedFragment.LJLJJI.handlePageResume(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-8478295770607365761");
        if (c03880Dg.LIZJ(10501, "com/ss/android/ugc/aweme/kids/recommendfeed/ui/RecommendFeedFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/kids/recommendfeed/ui/RecommendFeedFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        KidsFeedFragment kidsFeedFragment = this.LJLIL;
        if (kidsFeedFragment != null) {
            kidsFeedFragment.LJLJJI.setFeedResume(!z);
        }
        c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/kids/recommendfeed/ui/RecommendFeedFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.O6B
    public final void vf(boolean z) {
        KidsFeedFragment kidsFeedFragment = this.LJLIL;
        if (kidsFeedFragment != null) {
            kidsFeedFragment.LJLJJI.handlePagePause(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        KidsFeedFragment kidsFeedFragment;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Fragment LJJJIL = getChildFragmentManager().LJJJIL("recommend_feed_fragment");
        if (LJJJIL instanceof KidsFeedFragment) {
            kidsFeedFragment = (KidsFeedFragment) LJJJIL;
        } else {
            kidsFeedFragment = null;
        }
        this.LJLIL = kidsFeedFragment;
        if (kidsFeedFragment != null) {
            return;
        }
        Bundle LIZ = C0H1.LIZ("enter_from", "homepage_hot");
        C71801SFx c71801SFx = new C71801SFx();
        KidsFeedFragment kidsFeedFragment2 = new KidsFeedFragment();
        kidsFeedFragment2.LJLJJLL = c71801SFx;
        kidsFeedFragment2.setArguments(LIZ);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LJIIJ(kidsFeedFragment2, "recommend_feed_fragment", R.id.ba7);
        c1b3.LJI();
        this.LJLIL = kidsFeedFragment2;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bfi, viewGroup, false);
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
