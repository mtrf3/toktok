package com.ss.android.ugc.aweme.commercialize.profile;

import X.ActivityC45651qj;
import X.C0A2;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C56642Ke;
import X.C59148NJg;
import X.C59675NbT;
import X.C68312mB;
import X.C76800UCe;
import X.C90903hW;
import X.NZQ;
import X.QD3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class EnterpriseTabFragment extends ProfileListFragment {
    public C59148NJg LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // X.C8Z7
    public final boolean LJJ() {
        return true;
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJL;
        Integer valueOf = Integer.valueOf(R.id.isn);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.isn)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        if (this.LJLJJI != null) {
            return false;
        }
        return true;
    }

    @Override // X.OGG
    public final View LJIJJ() {
        return _$_findCachedViewById(R.id.isn);
    }

    @Override // X.C8Z7
    public final void LJJJJ() {
        String LIZ = SharePrefCache.inst().getMpTab().LIZ();
        o.LJIIIIZZ(LIZ, "getEnterpriseTabUrl(user)");
        String uri = C68312mB.LIZ(LIZ).LIZIZ().toString();
        o.LJIIIIZZ(uri, "urlBuilder.build().toString()");
        C59148NJg c59148NJg = this.LJLJJI;
        if (c59148NJg != null) {
            c59148NJg.LJLILLLLZI = uri;
            c59148NJg.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void LL() {
        C0A2 layoutManager;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.LJZL(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Oi() {
        if (getUserVisibleHint()) {
            mo49getActivity();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C0A2 layoutManager;
        View LJJIJIL;
        super.onDestroyView();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (LJJIJIL = layoutManager.LJJIJIL(0)) != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            ((NZQ) LJJIJIL).LIZJ(mo49getActivity);
        }
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void top(C56642Ke event) {
        boolean z;
        String LJJIFFI;
        j LJJIJ;
        NZQ nzq;
        o.LJIIIZ(event, "event");
        m LJIIZILJ = GsonProtectorUtils.parse(new com.google.gson.o(), event.LJLIL.toString()).LJIIZILJ();
        j LJJIJ2 = LJIIZILJ.LJJIJ("data");
        String str = null;
        if (LJJIJ2 == null || (LJJIJ2 instanceof l) || (LJJIJ = LJJIJ2.LJIIZILJ().LJJIJ("reactId")) == null || (LJJIJ instanceof l)) {
            z = false;
        } else {
            String LJJIFFI2 = LJJIJ.LJJIFFI();
            C59148NJg c59148NJg = this.LJLJJI;
            if (c59148NJg != null && (nzq = c59148NJg.LJLJJLL) != null) {
                str = nzq.getReactId();
            }
            z = o.LJ(LJJIFFI2, str);
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf.booleanValue()) {
            valueOf.booleanValue();
            j LJJIJ3 = LJIIZILJ.LJJIJ("eventName");
            if (LJJIJ3 != null && (LJJIFFI = LJJIJ3.LJJIFFI()) != null) {
                if (o.LJ(LJJIFFI, "mp_tab_top_arrived") || o.LJ(LJJIFFI, "mp_tab_top_left")) {
                    if (o.LJ(LJJIFFI, "mp_tab_top_arrived")) {
                        ((C59675NbT) _$_findCachedViewById(R.id.isn)).getEnterTabManager().LIZ = true;
                    } else {
                        if (!o.LJ(LJJIFFI, "mp_tab_top_left")) {
                            return;
                        }
                        ((C59675NbT) _$_findCachedViewById(R.id.isn)).getEnterTabManager().LIZ = false;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
        mo49getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabFragment$onViewCreated$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final boolean LJIJJLI() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final boolean LJIL() {
                return false;
            }
        });
        this.LJLJJI = new C59148NJg(this);
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).setAdapter(this.LJLJJI);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void ye(String str, String str2) {
        super.ye(str, str2);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        EventBus.LIZJ().LJIILJJIL(this);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        C29S c29s = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.awg, C16880lQ.LLZIL(mo49getActivity), null);
        if (!(LLLZIIL instanceof View)) {
            LLLZIIL = null;
        }
        if (LLLZIIL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLZIIL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLZIIL, this);
                C10A.LIZIZ(LLLZIIL, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLZIIL;
    }
}
