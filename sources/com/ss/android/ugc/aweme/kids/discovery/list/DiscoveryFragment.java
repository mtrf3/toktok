package com.ss.android.ugc.aweme.kids.discovery.list;

import X.AFM;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C26045AKb;
import X.C29S;
import X.C2NU;
import X.C3C5;
import X.C42625Go9;
import X.C56619MJz;
import X.C61878OQg;
import X.C61932OSi;
import X.C61933OSj;
import X.C61934OSk;
import X.C61938OSo;
import X.C61939OSp;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.KL2;
import X.MLI;
import X.QD3;
import X.ViewOnTouchListenerC61935OSl;
import Y.AObserverS78S0100000_10;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.kids.discovery.model.Category;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class DiscoveryFragment extends Fragment {
    public DiscoverViewModel LJLIL;
    public boolean LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    public final void vl() {
        boolean z;
        getContext();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            ((SwipeRefreshLayout) _$_findCachedViewById(R.id.at7)).setRefreshing(false);
            if (!this.LJLILLLLZI) {
                C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new C61932OSi(this));
                c73305Spp.setStatus(c73306Spq);
                ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                return;
            }
            return;
        }
        if (this.LJLILLLLZI) {
            DiscoverViewModel discoverViewModel = this.LJLIL;
            if (discoverViewModel != null) {
                discoverViewModel.refresh();
                return;
            } else {
                o.LJIJI("mDiscoverViewModel");
                throw null;
            }
        }
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
        DiscoverViewModel discoverViewModel2 = this.LJLIL;
        if (discoverViewModel2 != null) {
            discoverViewModel2.refresh();
        } else {
            o.LJIJI("mDiscoverViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C42625Go9.LIZIZ(this);
        DiscoverViewModel discoverViewModel = (DiscoverViewModel) ViewModelProviders.of(this).get(DiscoverViewModel.class);
        this.LJLIL = discoverViewModel;
        if (discoverViewModel != null) {
            discoverViewModel.LJLJJLL.observe(this, new AObserverS78S0100000_10(this, 0));
            DiscoverViewModel discoverViewModel2 = this.LJLIL;
            if (discoverViewModel2 != null) {
                discoverViewModel2.LJLJI.observe(this, new AObserverS78S0100000_10(this, 1));
                DiscoverViewModel discoverViewModel3 = this.LJLIL;
                if (discoverViewModel3 != null) {
                    discoverViewModel3.LJLJJI.observe(this, new AObserverS78S0100000_10(this, 2));
                    DiscoverViewModel discoverViewModel4 = this.LJLIL;
                    if (discoverViewModel4 != null) {
                        discoverViewModel4.LJLJJL.observe(this, new AObserverS78S0100000_10(this, 3));
                        return;
                    } else {
                        o.LJIJI("mDiscoverViewModel");
                        throw null;
                    }
                }
                o.LJIJI("mDiscoverViewModel");
                throw null;
            }
            o.LJIJI("mDiscoverViewModel");
            throw null;
        }
        o.LJIJI("mDiscoverViewModel");
        throw null;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onReportEvent(AFM event) {
        o.LJIIIZ(event, "event");
        DiscoverViewModel discoverViewModel = this.LJLIL;
        if (discoverViewModel != null) {
            ArrayList arrayList = new ArrayList();
            List<Category> value = discoverViewModel.LJLJJLL.getValue();
            if (value == null) {
                value = C61878OQg.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Category category : value) {
                if (!discoverViewModel.gv0(category)) {
                    arrayList2.add(category);
                }
            }
            arrayList.addAll(arrayList2);
            discoverViewModel.LJLJJLL.postValue(arrayList);
            return;
        }
        o.LJIJI("mDiscoverViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.fuc);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        C56619MJz c56619MJz = new C56619MJz();
        C61938OSo c61938OSo = new C61938OSo(c56619MJz);
        c61938OSo.LJLL = new C61939OSp(c61938OSo);
        c61938OSo.LJLLI = new C61934OSk(this);
        ((RecyclerView) _$_findCachedViewById(R.id.fuc)).setAdapter(c61938OSo);
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        Integer LJI = C79045V0n.LJI(R.attr.dz, requireActivity);
        if (LJI != null) {
            ((RecyclerView) _$_findCachedViewById(R.id.fuc)).LJII(new MLI(LJI.intValue(), c56619MJz, (int) KL2.LIZJ(getContext(), 16.0f), (int) KL2.LIZJ(getContext(), 16.0f)), -1);
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.at7);
        int LIZJ = (int) KL2.LIZJ(mo49getActivity(), 49.0f);
        int LIZJ2 = (int) KL2.LIZJ(mo49getActivity(), 113.0f);
        swipeRefreshLayout.LJZ = false;
        swipeRefreshLayout.LLFF = LIZJ;
        swipeRefreshLayout.LLFFF = LIZJ2;
        swipeRefreshLayout.LLIIIZ = true;
        swipeRefreshLayout.LJFF();
        swipeRefreshLayout.LJLJI = false;
        ((SwipeRefreshLayout) _$_findCachedViewById(R.id.at7)).setOnRefreshListener(new C61933OSj(this));
        vl();
        _$_findCachedViewById(R.id.kf_).setOnTouchListener(ViewOnTouchListenerC61935OSl.LJLIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bfb, viewGroup, false);
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
