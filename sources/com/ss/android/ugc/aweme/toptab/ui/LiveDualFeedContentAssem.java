package com.ss.android.ugc.aweme.toptab.ui;

import X.C214298b3;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C80896Voy;
import X.C8BJ;
import X.C8BX;
import X.C8YN;
import X.C9BE;
import X.InterfaceC117044ia;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.toptab.vm.LiveDualFeedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LiveDualFeedContentAssem extends UIListContentAssem<LiveDualFeedListViewModel> implements InterfaceC117044ia {
    public boolean LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1116));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    public LiveDualFeedContentAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(LiveDualFeedListViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1119), C8BX.INSTANCE, null);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: C3, reason: merged with bridge method [inline-methods] */
    public final LiveDualFeedListViewModel A3() {
        return (LiveDualFeedListViewModel) this.LJLJI.getValue();
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
        c57939MoZ.LIZJ = LiveDualFeedFooterCell.class;
        c57939MoZ.LJI = "Live";
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ((C80896Voy) _$_findCachedViewById(R.id.itq)).setScrollMode(C8BJ.REFRESH);
        LiveDualFeedListViewModel A3 = A3();
        A3.getClass();
        A3.withState(new AqS57S1100000_3(A3, "click_top_icon", 11));
        ((C80896Voy) _$_findCachedViewById(R.id.itq)).setOnRefreshListener(new AqS153S0100000_3(this, 1117));
        C8YN.LJII(this, A3(), new TBT() { // from class: X.8BW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C207148Ba) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 98), 6);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.8BV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C207148Ba c207148Ba = (C207148Ba) obj;
                c207148Ba.getClass();
                return C208708Ha.LIZLLL(c207148Ba);
            }
        }, null, new AqS169S0100000_3(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT), new AqS153S0100000_3(this, 1118), new AqS169S0100000_3(this, 501), 2, null);
    }
}
