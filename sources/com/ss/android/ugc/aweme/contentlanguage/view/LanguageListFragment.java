package com.ss.android.ugc.aweme.contentlanguage.view;

import X.ABA;
import X.ABQ;
import X.ABS;
import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C109824Ss;
import X.C10A;
import X.C116644hw;
import X.C141335gf;
import X.C16880lQ;
import X.C234509Ig;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C79004UzY;
import X.C90903hW;
import X.C9KF;
import X.EnumC252729vw;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LanguageListFragment extends AmeBaseFragment implements Observer<ArrayList<ABA>>, ABS {
    public ContentPreferenceViewModel LJLIL;
    public C252709vu LJLILLLLZI;
    public RecyclerView LJLJI;
    public ABQ LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ContentPreferenceViewModel contentPreferenceViewModel = this.LJLIL;
        if (contentPreferenceViewModel != null) {
            o.LJI(contentPreferenceViewModel);
            if (contentPreferenceViewModel.LJLJJL) {
                contentPreferenceViewModel.gv0();
                contentPreferenceViewModel.LJLJJL = false;
            }
        }
    }

    @Override // X.ABS
    public final void LJJIFFI(int i) {
        ABA aba;
        ArrayList<ABA> value;
        ABA aba2;
        if (i == this.LJLJJL) {
            return;
        }
        C252709vu c252709vu = this.LJLILLLLZI;
        o.LJI(c252709vu);
        c252709vu.LJIJ("done", new AqS94S0101000_4(i, this, 4));
        ContentPreferenceViewModel contentPreferenceViewModel = this.LJLIL;
        o.LJI(contentPreferenceViewModel);
        int i2 = this.LJLJJL;
        MutableLiveData<ArrayList<ABA>> iv0 = contentPreferenceViewModel.iv0();
        if (!C79004UzY.LJJIFFI(iv0.getValue())) {
            if (i2 >= 0 && (value = iv0.getValue()) != null && (aba2 = (ABA) ListProtector.get(value, i2)) != null) {
                aba2.LIZ = false;
            }
            ArrayList<ABA> value2 = iv0.getValue();
            if (value2 != null && (aba = (ABA) ListProtector.get(value2, i)) != null) {
                aba.LIZ = true;
            }
            contentPreferenceViewModel.LJLIL = i;
        }
        this.LJLJJL = i;
        ABQ abq = this.LJLJJI;
        o.LJI(abq);
        abq.notifyDataSetChanged();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ArrayList<ABA> arrayList) {
        ArrayList<ABA> arrayList2 = arrayList;
        if (C79004UzY.LJJIFFI(arrayList2)) {
            return;
        }
        ABQ abq = this.LJLJJI;
        if (abq == null) {
            Context context = getContext();
            o.LJI(context);
            ABQ abq2 = new ABQ(context, this);
            this.LJLJJI = abq2;
            abq2.LJLJI = arrayList2;
            RecyclerView recyclerView = this.LJLJI;
            o.LJI(recyclerView);
            recyclerView.setAdapter(this.LJLJJI);
            return;
        }
        abq.LJLJI = arrayList2;
        ABQ abq3 = this.LJLJJI;
        o.LJI(abq3);
        abq3.notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        ArrayList<ABA> value;
        ABA aba;
        super.onCreate(bundle);
        if (mo49getActivity() == null) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        ContentPreferenceViewModel contentPreferenceViewModel = (ContentPreferenceViewModel) ViewModelProviders.of(mo49getActivity).get(ContentPreferenceViewModel.class);
        this.LJLIL = contentPreferenceViewModel;
        o.LJI(contentPreferenceViewModel);
        contentPreferenceViewModel.iv0().observe(this, this);
        ContentPreferenceViewModel contentPreferenceViewModel2 = this.LJLIL;
        o.LJI(contentPreferenceViewModel2);
        o.LJI(getContext());
        if (!C79004UzY.LJJIFFI(contentPreferenceViewModel2.iv0().getValue()) && (i = contentPreferenceViewModel2.LJLIL) >= 0) {
            ArrayList<ABA> value2 = contentPreferenceViewModel2.iv0().getValue();
            Integer num = null;
            if (value2 != null) {
                num = Integer.valueOf(value2.size());
            }
            o.LJI(num);
            if (i <= num.intValue() - 1 && (value = contentPreferenceViewModel2.iv0().getValue()) != null && (aba = (ABA) ListProtector.get(value, contentPreferenceViewModel2.LJLIL)) != null) {
                aba.LIZ = false;
            }
        }
        this.LJLJJLL = -1;
        this.LJLJJL = -1;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI = (C252709vu) view.findViewById(R.id.l_2);
        this.LJLJI = (RecyclerView) view.findViewById(R.id.fu6);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.LJLJI;
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        }
        C116644hw LJII = C116644hw.LJII(getContext());
        RecyclerView recyclerView2 = this.LJLJI;
        if (recyclerView2 != null) {
            recyclerView2.LJII(LJII, -1);
        }
        C252709vu c252709vu = this.LJLILLLLZI;
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            C234509Ig c234509Ig = new C234509Ig();
            String string = getString(R.string.cel);
            o.LJIIIIZZ(string, "getString(R.string.button_cancel)");
            c234509Ig.LIZJ = string;
            c234509Ig.LIZ(EnumC252729vw.SECONDARY);
            c234509Ig.LIZ = new C109824Ss(new AqS154S0100000_4(this, 98));
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{c234509Ig});
            String string2 = getString(R.string.dvo);
            o.LJIIIIZZ(string2, "getString(R.string.content_languages)");
            LIZLLL.LIZJ = string2;
            c235119Kp.LIZJ = LIZLLL;
            C234509Ig c234509Ig2 = new C234509Ig();
            String string3 = getString(R.string.gi1);
            o.LJIIIIZZ(string3, "getString(R.string.finish)");
            c234509Ig2.LIZJ = string3;
            c234509Ig2.LJ = false;
            c234509Ig2.LIZIZ = "done";
            c234509Ig2.LIZ = new C109824Ss(new AqS154S0100000_4(this, 99));
            c235119Kp.LIZIZ(c234509Ig2);
            c235119Kp.LIZLLL = true;
            c252709vu.setNavActions(c235119Kp);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dv, viewGroup, false);
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
