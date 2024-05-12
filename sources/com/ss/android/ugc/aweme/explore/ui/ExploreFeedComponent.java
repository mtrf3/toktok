package com.ss.android.ugc.aweme.explore.ui;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C0A2;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C73411SrX;
import X.C78926UyI;
import X.C79045V0n;
import X.C80896Voy;
import X.C83I;
import X.C8AM;
import X.C8AN;
import X.C8AO;
import X.C8AP;
import X.C8AV;
import X.C8AW;
import X.C8AX;
import X.C8BJ;
import X.C8YN;
import X.C9BE;
import X.C9XU;
import X.G27;
import X.InterfaceC117044ia;
import X.InterfaceC57784Mm4;
import X.LFH;
import X.MZ9;
import X.SYL;
import X.TBT;
import X.XKX;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExploreFeedComponent extends UIListContentAssem<ExploreFeedListViewModel> implements InterfaceC117044ia, G27 {
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public C73411SrX LJLJJL;
    public final C214298b3 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 219));
    public final C8AP LJLJJI = C8AP.LJLIL;

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public ExploreFeedComponent() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ExploreFeedListViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 222), C8AO.INSTANCE, null);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: C3, reason: merged with bridge method [inline-methods] */
    public final ExploreFeedListViewModel A3() {
        return (ExploreFeedListViewModel) this.LJLJJLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        return (SYL) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZ = 4;
        c57939MoZ.LIZJ = ExploreFeedFooterCell.class;
        c57939MoZ.LJI = "homepage_explore";
        return c57939MoZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        MutableLiveData<MZ9> mutableLiveData;
        super.onDestroy();
        C72808Sho<InterfaceC57784Mm4> state = v3().getState();
        if (state != null && (mutableLiveData = state.LIZ) != null) {
            mutableLiveData.removeObserver(this.LJLJJI);
        }
        C9XU.LIZLLL(this);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer LJI;
        MutableLiveData<MZ9> mutableLiveData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Context context = _$_findCachedViewById(R.id.d1u).getContext();
        o.LJIIIIZZ(context, "explore_feed_container.context");
        int i = C8AV.LIZ;
        if (i != 1) {
            if (i != 2) {
                LJI = C79045V0n.LJI(R.attr.c9, context);
            } else {
                LJI = C79045V0n.LJI(R.attr.cl, context);
            }
        } else {
            LJI = C79045V0n.LJI(R.attr.cc, context);
        }
        if (LJI != null) {
            _$_findCachedViewById(R.id.d1u).setBackgroundColor(LJI.intValue());
        }
        ((C80896Voy) _$_findCachedViewById(R.id.itq)).setScrollMode(C8BJ.REFRESH);
        ExploreFeedListViewModel A3 = A3();
        AqS169S0100000_3 aqS169S0100000_3 = new AqS169S0100000_3(this, 112);
        A3.getClass();
        if (C8AX.LIZ().getBoolean("key_cache_explore_available", false)) {
            aqS169S0100000_3.invoke(Boolean.TRUE);
            XKX.LIZLLL(A3.getAssemVMScope(), null, null, new C8AW(A3, null), 3);
        } else {
            aqS169S0100000_3.invoke(Boolean.FALSE);
        }
        ((C80896Voy) _$_findCachedViewById(R.id.itq)).setOnRefreshListener(new AqS153S0100000_3(this, 221));
        C8YN.LJII(this, A3(), new TBT() { // from class: X.8AQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8AS) obj).LJLJI;
            }
        }, null, new AqS185S0100000_3(this, 42), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.8AR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8AS) obj).LJLIL;
            }
        }, null, C83I.LJLIL, 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.8AT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8AS) obj).LJLILLLLZI;
            }
        }, null, new AqS185S0100000_3(this, 43), 6);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.83J
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C8AS c8as = (C8AS) obj;
                c8as.getClass();
                return C208708Ha.LIZLLL(c8as);
            }
        }, null, new AqS169S0100000_3(this, 110), new AqS153S0100000_3(this, 220), new AqS169S0100000_3(this, 111), 2, null);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.83K
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C8AS c8as = (C8AS) obj;
                c8as.getClass();
                return C208708Ha.LIZJ(c8as);
            }
        }, null, C8AM.LJLIL, null, C8AN.LJLIL, 10, null);
        C72808Sho<InterfaceC57784Mm4> state = v3().getState();
        if (state != null && (mutableLiveData = state.LIZ) != null) {
            mutableLiveData.observeForever(this.LJLJJI);
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C9XU.LIZIZ(LIZ, this);
        }
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        o.LJIIIZ(newConfig, "newConfig");
        C0A2 layoutManager = v3().getLayoutManager();
        if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
            staggeredGridLayoutManager.LLJJIJIL(LFH.LIZIZ.LIZLLL().LIZ().LJJIIJ(2));
            v3().LJJJJZI();
            AbstractC029409q adapter = v3().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }
}
