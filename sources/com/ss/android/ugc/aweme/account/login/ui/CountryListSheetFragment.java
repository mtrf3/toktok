package com.ss.android.ugc.aweme.account.login.ui;

import X.AbstractC65590Pog;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C86804Y4y;
import X.C89143eg;
import X.C90903hW;
import X.C9KF;
import X.GBC;
import X.GBF;
import X.InterfaceC219588ja;
import Y.IDComparatorS340S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CountryListSheetFragment extends BaseFragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJI = 0;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final ArrayList<C86804Y4y> LJLIL = new ArrayList<>();

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
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.cqc);
        o.LJIIIIZZ(string, "getString(R.string.choose_country_or_region)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 50));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C89143eg.LIZ(requireContext);
        AbstractC65590Pog<C86804Y4y> abstractC65590Pog = C86804Y4y.LJLJL;
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("enable_country_code_local_alpha_sort", false)) {
                ArrayList arrayList = new ArrayList(abstractC65590Pog);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C86804Y4y c86804Y4y = (C86804Y4y) it.next();
                    String string = getString(c86804Y4y.LJLIL);
                    o.LJIIIIZZ(string, "getString(countryCode.nameRes)");
                    String substring = string.substring(0, 1);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    c86804Y4y.LJLILLLLZI = substring;
                }
                Collections.sort(arrayList, new IDComparatorS340S0100000_7(this, 2));
                abstractC65590Pog = arrayList;
            }
        } catch (Throwable unused) {
        }
        this.LJLIL.addAll(abstractC65590Pog);
        GBC gbc = new GBC(this.LJLIL);
        gbc.LJLJJI = new GBF(this);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.bwu);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.bwu)).setAdapter(gbc);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.mk, viewGroup, false);
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
