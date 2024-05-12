package com.ss.android.ugc.aweme.discover.ui;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C221108m2;
import X.C235779Nd;
import X.C26045AKb;
import X.C29S;
import X.C2NU;
import X.C36821Ecj;
import X.C38987FRv;
import X.C3C5;
import X.C50420Jqa;
import X.C54293LSn;
import X.C56601MJh;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C81334Vw2;
import X.C90903hW;
import X.FRW;
import X.InterfaceC208608Gq;
import X.InterfaceC56611MJr;
import X.InterfaceC65350Pko;
import X.LSC;
import X.MIX;
import X.MJE;
import X.QD3;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS52S0110000_9;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TrendsTabFragment extends BaseDiscoverTabFragment implements InterfaceC208608Gq, InterfaceC56611MJr {
    public MainAnimViewModel LJLJJLL;
    public int LJLJL;
    public final Set<String> LJLJLJ;
    public boolean LJLJLLL;
    public InterfaceC56611MJr LJLL;
    public InterfaceC208608Gq LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final Map<InterfaceC65350Pko<? extends RecyclerView.ViewHolder>, Queue<? extends RecyclerView.ViewHolder>> LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public MIX LJLZ;
    public DiscoverBannerViewHolder LJZ;
    public C56601MJh LJZI;
    public Boolean LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public final int LJLJI = R.string.ekk;
    public final String LJLJJI = "top_trends";
    public int LJLJJL = 1;

    @Override // com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
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

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public TrendsTabFragment() {
        new LinkedHashSet();
        this.LJLJLJ = new LinkedHashSet();
        this.LJLJLLL = true;
        C65776Prg LIZ = C65352Pkq.LIZ(TrendsTabViewModel.class);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 4));
        this.LJLLJ = new LinkedHashMap();
        this.LJLLLLLL = C221108m2.LIZIZ(MJE.LJLIL);
    }

    public final TrendsTabViewModel Dl() {
        return (TrendsTabViewModel) this.LJLLILLLL.getValue();
    }

    @Override // X.InterfaceC56611MJr
    public final void ak() {
        InterfaceC56611MJr interfaceC56611MJr = this.LJLL;
        if (interfaceC56611MJr != null) {
            interfaceC56611MJr.ak();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("discovery_trends");
        o.LJIIIIZZ(analysis, "Analysis().setLabelName(ANALYSIS_LABEL)");
        return analysis;
    }

    @Override // X.InterfaceC208608Gq
    public final void zj() {
        InterfaceC208608Gq interfaceC208608Gq = this.LJLLI;
        if (interfaceC208608Gq != null) {
            interfaceC208608Gq.zj();
        }
    }

    public final void Hl() {
        boolean z;
        getContext();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            ((C81334Vw2) _$_findCachedViewById(R.id.at7)).setRefreshing(false);
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            if (!this.LJLLL) {
                C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new AqS159S0100000_9(this, 94));
                c73305Spp.setStatus(c73306Spq);
                this.LJLLLL = false;
                ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                return;
            }
            return;
        }
        if (this.LJLLL) {
            Dl().Pv0(false);
            return;
        }
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
        this.LJLLLL = true;
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
        Dl().Pv0(true);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        new Handler(C16880lQ.LLJJJJ()).removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        TrendsTabViewModel Dl = Dl();
        Dl.getClass();
        Dl.setState(new AqS14S0010000_9(true, 4));
        ((RecyclerView) _$_findCachedViewById(R.id.fuc)).setAdapter(null);
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C54293LSn c54293LSn = C235779Nd.LIZ;
        if (c54293LSn.LJIIJ == null) {
            c54293LSn.LJIIJ = new C36821Ecj<>("should_show_pull_strong_guide", Boolean.TRUE);
        }
        c54293LSn.LJIIJ.LIZLLL(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment
    public final String vl() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment
    public final int wl() {
        return this.LJLJI;
    }

    public final RecyclerView.ViewHolder Al(C65776Prg c65776Prg) {
        RecyclerView.ViewHolder viewHolder;
        Queue queue = (Queue) ((LinkedHashMap) this.LJLLJ).get(c65776Prg);
        if (queue != null) {
            viewHolder = (RecyclerView.ViewHolder) queue.poll();
        } else {
            viewHolder = null;
        }
        if (!(viewHolder instanceof RecyclerView.ViewHolder)) {
            return null;
        }
        return viewHolder;
    }

    public final void Gl(boolean z) {
        if (!isViewValid()) {
            return;
        }
        if (_$_findCachedViewById(R.id.at7).isEnabled()) {
            _$_findCachedViewById(R.id.at7).setSelected(false);
        }
        if (_$_findCachedViewById(R.id.at7).isEnabled()) {
            ((C81334Vw2) _$_findCachedViewById(R.id.at7)).setRefreshing(false);
        }
        withState(Dl(), new AqS52S0110000_9(z, this, 2));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        int itemCount;
        AbstractC029409q adapter;
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        DiscoverBannerViewHolder discoverBannerViewHolder = this.LJZ;
        if (discoverBannerViewHolder != null) {
            discoverBannerViewHolder.onConfigurationChanged(mo49getActivity(), newConfig);
        }
        AbstractC029409q adapter2 = ((RecyclerView) _$_findCachedViewById(R.id.fuc)).getAdapter();
        if (adapter2 != null && (itemCount = adapter2.getItemCount()) >= 2 && (adapter = ((RecyclerView) _$_findCachedViewById(R.id.fuc)).getAdapter()) != null) {
            adapter.notifyItemRangeChanged(1, itemCount - 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        ViewModelProviders.of(mo49getActivity).get(SearchStateViewModel.class);
        if (this.LJLJLLL) {
            FRW.LIZ("discovery_trigger_net");
        }
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        o.LJIIIZ(event, "event");
        Object obj = event.LJLILLLLZI;
        if (obj instanceof Aweme) {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            TrendsTabViewModel Dl = Dl();
            Dl.getClass();
            Dl.withState(new AqS140S0200000_9(Dl, (Aweme) obj, 48));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (((java.lang.Number) r5.getValue()).intValue() != 3) goto L33;
     */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment
    public final void xl(boolean z, boolean z2) {
        MutableLiveData<Boolean> mutableLiveData;
        DiscoverBannerViewHolder discoverBannerViewHolder;
        super.xl(z, z2);
        if (!isViewValid() || _$_findCachedViewById(R.id.fuc) == null) {
            return;
        }
        if (!z && this.LJLJJL != 1) {
            return;
        }
        if (!z2 && (discoverBannerViewHolder = this.LJZ) != null) {
            discoverBannerViewHolder.w5(!z);
        }
        MainAnimViewModel mainAnimViewModel = this.LJLJJLL;
        if (mainAnimViewModel != null && (mutableLiveData = mainAnimViewModel.LJLIL) != null) {
            mutableLiveData.setValue(Boolean.valueOf(!z));
        }
        if (!z2) {
            TrendsTabViewModel Dl = Dl();
            Dl.getClass();
            Dl.setState(new AqS14S0010000_9(z, 4));
        }
        if (z) {
            return;
        }
        C38987FRv.LJI(LSC.DISCOVER);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LIZJ = C16970lZ.LIZJ(R.layout.amz, mo49getActivity(), viewGroup, false);
        C29S c29s = null;
        if (!(LIZJ instanceof View)) {
            LIZJ = null;
        }
        if (LIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZJ, this);
                C10A.LIZIZ(LIZJ, this);
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
        return LIZJ;
    }
}
