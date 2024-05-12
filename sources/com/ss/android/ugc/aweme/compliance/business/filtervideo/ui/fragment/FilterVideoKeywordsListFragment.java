package com.ss.android.ugc.aweme.compliance.business.filtervideo.ui.fragment;

import X.AbstractC029409q;
import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C238529Xs;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.FMX;
import X.SY4;
import Y.ACListenerS24S0100000_4;
import Y.AObserverS72S0100000_4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.viewmodel.FilterVideoKeywordsViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FilterVideoKeywordsListFragment extends BaseFragment {
    public AddOrModifyKeywordFragment LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 83));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 81));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 82));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    public final FilterVideoKeywordsViewModel vl() {
        return (FilterVideoKeywordsViewModel) this.LJLIL.getValue();
    }

    public final void wl() {
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        FMX.onEventV3("filter_hashtag_settings_click_add_keyword");
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (supportFragmentManager2 = mo49getActivity2.getSupportFragmentManager()) != null) {
            fragment = supportFragmentManager2.LJJJIL("add_or_modify_keyword_fragment");
        } else {
            fragment = null;
        }
        AddOrModifyKeywordFragment addOrModifyKeywordFragment = (AddOrModifyKeywordFragment) fragment;
        this.LJLJJI = addOrModifyKeywordFragment;
        if (addOrModifyKeywordFragment == null) {
            this.LJLJJI = new AddOrModifyKeywordFragment();
        }
        AddOrModifyKeywordFragment addOrModifyKeywordFragment2 = this.LJLJJI;
        o.LJI(addOrModifyKeywordFragment2);
        if (!addOrModifyKeywordFragment2.isAdded() && (mo49getActivity = mo49getActivity()) != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIJJI(R.anim.fq, 0, 0, R.anim.fy);
            AddOrModifyKeywordFragment addOrModifyKeywordFragment3 = this.LJLJJI;
            o.LJI(addOrModifyKeywordFragment3);
            c1b3.LJIIIIZZ(R.id.dm7, 1, addOrModifyKeywordFragment3, "add_or_modify_keyword_fragment");
            c1b3.LJ(null);
            c1b3.LJI();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C238529Xs.LJLIL);
        super.onCreate(bundle);
        vl().LJLJI.observe(this, new AObserverS72S0100000_4(this, 33));
        vl().iv0().observe(this, new AObserverS72S0100000_4(this, 34));
        vl().hv0();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.title);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        String string = getString(R.string.aub);
        o.LJIIIIZZ(string, "getString(R.string.acces…lityLabels_settings_back)");
        LIZJ.LJII = string;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 84));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string2 = getString(R.string.hmy);
        o.LJIIIIZZ(string2, "getString(R.string.keywo…filtering_settings_title)");
        LIZLLL.LIZJ = string2;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        ((C252709vu) _$_findCachedViewById(R.id.title)).LJIILJJIL(true);
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setAdapter((AbstractC029409q) this.LJLJI.getValue());
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ftq);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.v1), new ACListenerS24S0100000_4(this, 38));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.age, viewGroup, false);
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
