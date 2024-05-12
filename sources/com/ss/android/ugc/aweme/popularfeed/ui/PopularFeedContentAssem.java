package com.ss.android.ugc.aweme.popularfeed.ui;

import X.C214298b3;
import X.C2K0;
import X.C47704Ins;
import X.C54541Lar;
import X.C54544Lau;
import X.C55096Ljo;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.LZW;
import X.TBT;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.popularfeed.panel.PopularFeedFragmentPanel;
import com.ss.android.ugc.aweme.popularfeed.vm.PopularFeedListViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PopularFeedContentAssem extends UIContentAssem implements IPopularContentAssemAbility, InterfaceC55102Lju {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public PopularFeedFragmentPanel LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    @Override // com.ss.android.ugc.aweme.popularfeed.ui.IPopularContentAssemAbility
    public final boolean LJJIJIIJI() {
        this.LJLJJI = true;
        LJJJJJ();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.popularfeed.ui.IPopularContentAssemAbility
    public final void LJJJJJ() {
        this.LJLJJL = false;
        PopularFeedFragmentPanel popularFeedFragmentPanel = this.LJLJI;
        if (popularFeedFragmentPanel != null) {
            popularFeedFragmentPanel.LJLJJI = this.LJLJJI;
        }
        v3().manualListLoadMore(0L);
    }

    @Override // com.ss.android.ugc.aweme.popularfeed.ui.IPopularContentAssemAbility
    public final void LJJJZ() {
        this.LJLJJL = true;
        PopularFeedFragmentPanel popularFeedFragmentPanel = this.LJLJI;
        if (popularFeedFragmentPanel != null) {
            popularFeedFragmentPanel.LJLJJI = this.LJLJJI;
        }
        IPopularToFYPAssemAbility iPopularToFYPAssemAbility = (IPopularToFYPAssemAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IPopularToFYPAssemAbility.class, null);
        if (iPopularToFYPAssemAbility != null) {
            iPopularToFYPAssemAbility.LJLLL();
        }
        v3().manualListRefresh();
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1864980331) {
            return null;
        }
        return this;
    }

    public PopularFeedContentAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PopularFeedListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, LiveMaxRetainAlogMessageSizeSetting.DEFAULT), C54544Lau.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, LZW.class, null), checkSupervisorPrepared());
    }

    public final PopularFeedListViewModel v3() {
        return (PopularFeedListViewModel) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.popularfeed.ui.IPopularContentAssemAbility
    public final boolean LJIILJJIL() {
        return ((Boolean) withState(v3(), C54541Lar.LJLIL)).booleanValue();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.popularfeed.ui.IPopularContentAssemAbility
    public final boolean LJJZZI() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.popularfeed.ui.IPopularContentAssemAbility
    public final boolean LLILZLL() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.popularfeed.ui.IPopularContentAssemAbility
    public final boolean LJJIJLIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return ((Boolean) withState(v3(), new AqS140S0200000_9(aweme, this, 22))).booleanValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLJI = ((LZW) this.LJLILLLLZI.getValue()).LJLIL;
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.Las
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54664Lcq) obj).getRefreshState();
            }
        }, null, new AqS175S0100000_9(this, 186), new AqS159S0100000_9(this, 498), new AqS175S0100000_9(this, 187), 2, null);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.Lat
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54664Lcq) obj).getLoadMoreState();
            }
        }, null, new AqS175S0100000_9(this, 188), new AqS159S0100000_9(this, 499), new AqS175S0100000_9(this, 189), 2, null);
        LJJJZ();
    }
}
