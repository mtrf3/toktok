package com.ss.android.ugc.aweme.watch.history.core;

import X.C0A2;
import X.C187957Zf;
import X.C187967Zg;
import X.C188007Zk;
import X.C188727au;
import X.C213688a4;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C57309MeP;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.C9XU;
import X.FMX;
import X.G27;
import X.InterfaceC191547fS;
import X.InterfaceC65784Pro;
import X.InterfaceC72324Sa0;
import X.LFH;
import X.SYL;
import X.TBT;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryContentAssem;
import com.ss.android.ugc.aweme.watch.history.ui.WatchHistoryFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS28S0100100_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class WatchHistoryContentAssem extends Hilt_WatchHistoryContentAssem implements InterfaceC72324Sa0, G27 {
    public final C214378bB LJLJJI;
    public boolean LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1225));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    public WatchHistoryContentAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C188007Zk c188007Zk = C188007Zk.LJLIL;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1228);
        C65776Prg LIZ = C65352Pkq.LIZ(WatchHistoryListViewModel.class);
        C187967Zg c187967Zg = C187967Zg.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 1227);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJI = new C214378bB(LIZ, c188007Zk, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), aqS153S0100000_3, c187967Zg, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public final WatchHistoryListViewModel A3() {
        return (WatchHistoryListViewModel) this.LJLJJI.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7Zf] */
    @Override // X.InterfaceC72324Sa0
    public final C57309MeP LJJJIL() {
        return new C57309MeP(v3(), (C187957Zf) new InterfaceC191547fS() { // from class: X.7Zf
            @Override // X.InterfaceC191547fS
            public final void LJIIJJI() {
                WatchHistoryContentAssem.this.A3().manualListRetry(SZP.Next);
            }
        });
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        return (SYL) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZ = 2;
        c57939MoZ.LIZJ = WatchHistoryFooterCell.class;
        return c57939MoZ;
    }

    public final void C3(String key) {
        WatchHistoryListViewModel A3 = A3();
        A3.getClass();
        o.LJIIIZ(key, "key");
        List<ITEM> listGetAll = A3.listGetAll();
        if (listGetAll != 0) {
            for (ITEM item : listGetAll) {
                if (o.LJ(item.LIZ(), key)) {
                    A3.LJLJJL.put(item.LIZ(), item);
                    A3.hv0();
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.7Zd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C188027Zm c188027Zm = (C188027Zm) obj;
                c188027Zm.getClass();
                return C208708Ha.LIZLLL(c188027Zm);
            }
        }, null, new AqS169S0100000_3(this, 536), new AqS153S0100000_3(this, 1226), new AqS28S0100100_3(this, System.currentTimeMillis(), 2), 2, null);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.7Zj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C188027Zm) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, LiveTryModeCountDownThresholdSetting.DEFAULT), 4);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.7Ze
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C188027Zm c188027Zm = (C188027Zm) obj;
                c188027Zm.getClass();
                return C208708Ha.LIZ(c188027Zm);
            }
        }, null, new AqS185S0100000_3(this, 121), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.7Zi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C188027Zm) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 118), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.7Zh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C188027Zm) obj).LJLJI;
            }
        }, null, new AqS185S0100000_3(this, 119), 6);
        Context context = getContext();
        if (context != null) {
            C9XU.LIZ(context.hashCode(), this);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "navigation_panel");
        FMX.LJIIL("enter_account_history", c188727au.LIZ);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        GridLayoutManager gridLayoutManager;
        o.LJIIIZ(newConfig, "newConfig");
        RecyclerView recyclerView = (RecyclerView) getContainerView().findViewById(R.id.nh9);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof WrapGridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            gridLayoutManager.LLJLIL(LFH.LIZIZ.LIZLLL().LJIIIZ().LJJ(3, 0, getContext()));
        }
        recyclerView.LJJJJZI();
    }
}
