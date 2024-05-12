package com.ss.android.ugc.aweme.toptab.ui;

import X.C214298b3;
import X.C2K0;
import X.C47704Ins;
import X.C54951LhT;
import X.C54952LhU;
import X.C54953LhV;
import X.C54956LhY;
import X.C55096Ljo;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.FMX;
import X.InterfaceC50037JkP;
import X.InterfaceC55102Lju;
import X.LZU;
import X.OSZ;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.ss.android.ugc.aweme.toptab.panel.LiveSingleFeedFragmentPanel;
import com.ss.android.ugc.aweme.toptab.vm.LiveSingleFeedListViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LiveSingleFeedContentAssem extends UIContentAssem implements ILiveSingleFeedContentAssemAbility, InterfaceC55102Lju {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public LiveSingleFeedFragmentPanel LJLJI;
    public boolean LJLJJI;
    public InterfaceC50037JkP LJLJJL;
    public int LJLJJLL;

    @Override // com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility
    public final boolean LJJIJIIJI() {
        this.LJLJJI = true;
        LJJJJJ();
        return true;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -882608657) {
            return null;
        }
        return this;
    }

    public LiveSingleFeedContentAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(LiveSingleFeedListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 662), C54956LhY.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, LZU.class, null), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility
    public final void LJJJJJ() {
        LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel = this.LJLJI;
        if (liveSingleFeedFragmentPanel != null) {
            liveSingleFeedFragmentPanel.LJLJJI = this.LJLJJI;
        }
        v3().manualListLoadMore(0L);
    }

    @Override // com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility
    public final void LJJJZ() {
        LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel = this.LJLJI;
        if (liveSingleFeedFragmentPanel != null) {
            liveSingleFeedFragmentPanel.LJLJJI = this.LJLJJI;
        }
        v3().manualListRefresh();
    }

    public final LiveSingleFeedListViewModel v3() {
        return (LiveSingleFeedListViewModel) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility
    public final boolean LJIILJJIL() {
        return ((Boolean) withState(v3(), C54951LhT.LJLIL)).booleanValue();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility
    public final boolean LJJIJLIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return ((Boolean) withState(v3(), new AqS140S0200000_9(aweme, this, 30))).booleanValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLJI = ((LZU) this.LJLILLLLZI.getValue()).LJLIL;
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.LhW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54668Lcu) obj).getRefreshState();
            }
        }, null, new AqS175S0100000_9(this, 308), new AqS159S0100000_9(this, 660), new AqS175S0100000_9(this, 309), 2, null);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.LhX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54668Lcu) obj).getLoadMoreState();
            }
        }, null, new AqS175S0100000_9(this, 310), new AqS159S0100000_9(this, 661), new C54953LhV(this), 2, null);
        LJJJZ();
    }

    public final void x3(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        FMX.LJIILL("refresh_homepage_live", new OSZ("homepage_live", "enter_from"), new OSZ("live_cell", "enter_method"), new OSZ(str, "refresh_method"), new OSZ(Integer.valueOf(NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getEffectiveConnectionType()), "network_status"));
        LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel = this.LJLJI;
        if (liveSingleFeedFragmentPanel != null) {
            liveSingleFeedFragmentPanel.onFeedRefreshEvent(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility
    public final void zR(Context context, Aweme aweme, EnterRoomConfig enterRoomConfig) {
        LiveOuterService.LJJJLL().LJIILL().LIZJ(context, enterRoomConfig, aweme, v3().LJLJI, new C54952LhU(this), null);
    }
}
