package com.ss.android.ugc.aweme.paidcontent.seriescreation.activity;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C47261Igj;
import X.C55230Lly;
import X.C55247LmF;
import X.C65352Pkq;
import X.C76800UCe;
import X.C7VU;
import X.C7VX;
import X.C7VZ;
import X.C8VV;
import X.C90903hW;
import X.InterfaceC65350Pko;
import X.OSZ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesDraftFragment;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftAdvanceVoucherPriceAssem;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftCoverImageAssem;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftPriceAssem;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftTitleDescriptionAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SeriesDraftFragment extends BaseFragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C7VU LJLIL = new C7VU(new C7VZ() { // from class: X.7VS
        @Override // X.C7VZ
        public final void LIZ() {
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C7VT(SeriesDraftFragment.this, null), 3);
        }
    });

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
    public final void onViewCreated(View view, Bundle bundle) {
        List<OSZ> LJJIJIIJI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C55247LmF.LIZIZ(C55230Lly.LIZJ(this, null), this.LJLIL, C7VU.class, "source_default_key");
        if (C7VX.LIZ()) {
            LJJIJIIJI = C47261Igj.LJJIJIIJI(new OSZ(C65352Pkq.LIZ(SeriesDraftTitleDescriptionAssem.class), Integer.valueOf(View.generateViewId())), new OSZ(C65352Pkq.LIZ(SeriesDraftCoverImageAssem.class), Integer.valueOf(View.generateViewId())), new OSZ(C65352Pkq.LIZ(SeriesDraftAdvanceVoucherPriceAssem.class), Integer.valueOf(View.generateViewId())));
        } else {
            LJJIJIIJI = C47261Igj.LJJIJIIJI(new OSZ(C65352Pkq.LIZ(SeriesDraftTitleDescriptionAssem.class), Integer.valueOf(View.generateViewId())), new OSZ(C65352Pkq.LIZ(SeriesDraftPriceAssem.class), Integer.valueOf(View.generateViewId())), new OSZ(C65352Pkq.LIZ(SeriesDraftCoverImageAssem.class), Integer.valueOf(View.generateViewId())));
        }
        Context context = getContext();
        if (context != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
            for (OSZ osz : LJJIJIIJI) {
                ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.ftx);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                frameLayout.setId(((Number) osz.getSecond()).intValue());
                viewGroup.addView(frameLayout);
                arrayList.add(C76800UCe.LIZ);
            }
        }
        C8VV.LIZ(this, false, new AqS134S0200000_3(this, (SeriesDraftFragment) LJJIJIIJI, (List<? extends OSZ<? extends InterfaceC65350Pko<? extends UISlotAssem>, Integer>>) 118));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ajb, viewGroup, false);
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
