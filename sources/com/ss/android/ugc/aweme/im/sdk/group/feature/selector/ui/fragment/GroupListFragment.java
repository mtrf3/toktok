package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.fragment;

import X.AbstractC234519Ih;
import X.AbstractC72278SYg;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C4NO;
import X.C73305Spp;
import X.C76800UCe;
import X.C90903hW;
import X.C91703io;
import X.C9KF;
import X.GD0;
import X.InterfaceC61213O0r;
import X.SYL;
import Y.AObserverS65S0200000_1;
import Y.AObserverS69S0100000_1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.GroupListCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.IndexCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes2.dex */
public final class GroupListFragment extends BaseFragment {
    public GroupListViewModel LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C91703io LJLILLLLZI = C91703io.LJLIL;

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
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        GroupListViewModel groupListViewModel = (GroupListViewModel) ViewModelProviders.of(this).get(GroupListViewModel.class);
        groupListViewModel.LJLIL.observe(this, new AObserverS69S0100000_1(this, 117));
        groupListViewModel.LJLILLLLZI.observe(this, new AObserverS69S0100000_1(this, 118));
        groupListViewModel.LJLJJI.observe(this, new AObserverS65S0200000_1(groupListViewModel, this, 14));
        this.LJLIL = groupListViewModel;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        fragmentConfiguration(GD0.LJLIL);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C4NO.LIZ(mo49getActivity);
        }
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ(new AqS151S0100000_1(this, 963));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string = getString(R.string.gx5);
        o.LJIIIIZZ(string, "getString(R.string.group…t_93_select_a_group_chat)");
        LIZLLL.LIZJ = string;
        c235119Kp.LIZJ = LIZLLL;
        c235119Kp.LIZLLL = true;
        ((C252709vu) _$_findCachedViewById(R.id.gwg)).setNavActions(c235119Kp);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
        SYL syl = (SYL) _$_findCachedViewById(R.id.dz2);
        syl.LLLF.LJZL(IndexCell.class, GroupListCell.class);
        GroupListViewModel groupListViewModel = this.LJLIL;
        if (groupListViewModel != null) {
            syl.LJLJLLL((AbstractC72278SYg) groupListViewModel.LJLJL.getValue());
            syl.getState().LJFF();
        } else {
            o.LJIJI("mViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b1w, viewGroup, false);
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
