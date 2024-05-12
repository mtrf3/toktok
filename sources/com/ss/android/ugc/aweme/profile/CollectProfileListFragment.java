package com.ss.android.ugc.aweme.profile;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C195927mW;
import X.C1B3;
import X.C221108m2;
import X.C225658tN;
import X.C225668tO;
import X.C26338AVi;
import X.C29S;
import X.C3C5;
import X.C53765L8f;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C76800UCe;
import X.C7MY;
import X.C90903hW;
import X.InterfaceC36571c5;
import X.LEZ;
import X.LFH;
import X.LFQ;
import X.LLQ;
import X.LNZ;
import X.OGG;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.profile.CollectProfileListFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CollectProfileListFragment extends ProfileListFragment {
    public static final /* synthetic */ int LJLLI = 0;
    public Fragment LJLJJI;
    public User LJLJJL;
    public boolean LJLJJLL;
    public C225658tN LJLJL;
    public View LJLJLJ;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C225668tO.LJLIL);

    static {
        new Object() { // from class: X.8tP
        };
    }

    @Override // X.C8Z7
    public final boolean LJJ() {
        return true;
    }

    @Override // X.C8Z7
    public final void LJJJJ() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void LL() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Oi() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    public final void Hl() {
        AmeBaseFragment ameBaseFragment;
        Fragment fragment;
        FragmentManager fragmentManager;
        if (this.LJLJJI == null) {
            IFavoriteService iFavoriteService = (IFavoriteService) this.LJLJLLL.getValue();
            if (iFavoriteService != null) {
                ameBaseFragment = iFavoriteService.LJIIIIZZ(this.LJLJJL, this.LJLJJLL);
            } else {
                ameBaseFragment = null;
            }
            this.LJLJJI = ameBaseFragment;
            if (getView() != null && (fragment = this.LJLJJI) != null && (fragmentManager = getFragmentManager()) != null && !fragmentManager.LJJJLZIJ()) {
                C1B3 c1b3 = new C1B3(fragmentManager);
                c1b3.LJIIJ(fragment, "user_favorites_fragment_tag", R.id.i70);
                c1b3.LJIILJJIL();
            }
        }
    }

    @Override // X.OGG
    public final View LJIJJ() {
        OGG ogg;
        InterfaceC36571c5 interfaceC36571c5 = this.LJLJJI;
        if (!(interfaceC36571c5 instanceof OGG) || (ogg = (OGG) interfaceC36571c5) == null) {
            return null;
        }
        return ogg.LJIJJ();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C225658tN c225658tN = this.LJLJL;
        if (c225658tN != null) {
            LFQ.LIZJ(c225658tN);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Gl(boolean z) {
        if (z) {
            Hl();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "5431471576578903034");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/profile/CollectProfileListFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/CollectProfileListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        Fragment fragment = this.LJLJJI;
        if (fragment != null) {
            fragment.setUserVisibleHint(z);
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/CollectProfileListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IFavoriteService iFavoriteService;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (iFavoriteService = (IFavoriteService) this.LJLJLLL.getValue()) != null) {
            iFavoriteService.LJIILJJIL(context);
        }
        IFavoriteService iFavoriteService2 = (IFavoriteService) this.LJLJLLL.getValue();
        if (iFavoriteService2 != null && iFavoriteService2.LIZIZ() > 0) {
            view.postDelayed(new ARunnableS39S0100000_3(this, 88), iFavoriteService2.LIZIZ());
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.8tN, X.LLY] */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        int i;
        boolean z;
        o.LJIIIZ(inflater, "inflater");
        View view = this.LJLJLJ;
        if (view == null) {
            if (this.LJLJJL != null || C53765L8f.LJIIJJI()) {
                i = 0;
            } else {
                i = C7MY.LIZIZ(58);
            }
            LFH.LIZIZ.LIZLLL().LJIIZILJ();
            if (LEZ.LIZ.LIZ() && this.LJLJJL == null) {
                ?? r0 = new C195927mW() { // from class: X.8tN
                    @Override // X.LLY
                    public final void s0(AbstractC225698tR tabStyle, boolean z2) {
                        int i2;
                        o.LJIIIZ(tabStyle, "tabStyle");
                        CollectProfileListFragment collectProfileListFragment = CollectProfileListFragment.this;
                        if (collectProfileListFragment.isAdded()) {
                            if (o.LJ(tabStyle, C225688tQ.LIZ)) {
                                i2 = C7MY.LIZIZ(58);
                            } else {
                                i2 = 0;
                            }
                            View view2 = collectProfileListFragment.getView();
                            if (view2 != null) {
                                view2.setPadding(0, 0, 0, i2);
                            }
                        }
                    }
                };
                LFQ.LIZIZ(r0);
                this.LJLJL = r0;
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null) {
                    LLQ Xm0 = LNZ.LIZIZ.getHomeTabViewModel(mo49getActivity).Xm0();
                    if (Xm0 != null) {
                        z = Xm0.LJIILLIIL();
                    } else {
                        z = true;
                    }
                    if (!z) {
                        i = 0;
                    }
                }
            }
            view = new FrameLayout(inflater.getContext());
            view.setId(R.id.i70);
            C26338AVi.LJIIIZ(view, 0, 0, 0, Integer.valueOf(i), 16);
            this.LJLJLJ = view;
        }
        try {
            ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(view, this);
            C10A.LIZIZ(view, this);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 instanceof C29S) {
                c29s = (C29S) mo49getActivity2;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return view;
    }
}
