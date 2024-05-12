package com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.SGP;
import X.SGS;
import Y.AObserverS75S0200000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AgeGateExistingStartFragment extends AgeGateBaseLowerFragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 159));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLILLLLZI;
        Integer valueOf = Integer.valueOf(R.id.n9y);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.n9y)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final MutableLiveData<C76800UCe> vl() {
        return new MutableLiveData<>();
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final MutableLiveData wl() {
        return ((AgeGateCTNViewModel) this.LJLIL.getValue()).LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final LiveData<Boolean> xl() {
        return ((AgeGateCTNViewModel) this.LJLIL.getValue()).LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final void Nl(String str, boolean z) {
        ((AgeGateCTNViewModel) this.LJLIL.getValue()).LJLIL.postValue(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        FragmentManager requireFragmentManager = requireFragmentManager();
        o.LJIIIIZZ(requireFragmentManager, "requireFragmentManager()");
        SGP sgp = new SGP(requireFragmentManager);
        ((ViewPager) _$_findCachedViewById(R.id.n9y)).setAdapter(sgp);
        _$_findCachedViewById(R.id.n9y).setOnTouchListener(SGS.LJLIL);
        ((AgeGateCTNViewModel) this.LJLIL.getValue()).LJLILLLLZI.observe(this, new AObserverS75S0200000_12(sgp, this, 7));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.gt, viewGroup, false);
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
