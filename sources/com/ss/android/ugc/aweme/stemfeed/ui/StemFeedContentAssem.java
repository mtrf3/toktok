package com.ss.android.ugc.aweme.stemfeed.ui;

import X.C214298b3;
import X.C2K0;
import X.C47704Ins;
import X.C54516LaS;
import X.C54518LaU;
import X.C55096Ljo;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.LZS;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.stemfeed.panel.StemFeedFragmentPanel;
import com.ss.android.ugc.aweme.stemfeed.vm.StemFeedListViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StemFeedContentAssem extends UIContentAssem implements IStemContentAssemAbility, InterfaceC55102Lju {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public StemFeedFragmentPanel LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final boolean LJJIJIIJI() {
        this.LJLJJI = true;
        LJJJJJ();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final void LJJJJJ() {
        this.LJLJJL = false;
        StemFeedFragmentPanel stemFeedFragmentPanel = this.LJLJI;
        if (stemFeedFragmentPanel != null) {
            stemFeedFragmentPanel.LJLJJI = this.LJLJJI;
        }
        v3().manualListLoadMore(0L);
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final void LJJJZ() {
        this.LJLJJL = true;
        StemFeedFragmentPanel stemFeedFragmentPanel = this.LJLJI;
        if (stemFeedFragmentPanel != null) {
            stemFeedFragmentPanel.LJLJJI = this.LJLJJI;
        }
        IStemToFYPAssemAbility iStemToFYPAssemAbility = (IStemToFYPAssemAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IStemToFYPAssemAbility.class, null);
        if (iStemToFYPAssemAbility != null) {
            iStemToFYPAssemAbility.LJLLL();
        }
        v3().manualListRefresh();
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1082365663) {
            return null;
        }
        return this;
    }

    public StemFeedContentAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StemFeedListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 629), C54518LaU.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, LZS.class, null), checkSupervisorPrepared());
    }

    public final StemFeedListViewModel v3() {
        return (StemFeedListViewModel) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final boolean LJIILJJIL() {
        return ((Boolean) withState(v3(), C54516LaS.LJLIL)).booleanValue();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final boolean LJJZZI() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final boolean LLILZLL() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final boolean LJJIJLIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return ((Boolean) withState(v3(), new AqS140S0200000_9(aweme, this, 28))).booleanValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLJI = ((LZS) this.LJLILLLLZI.getValue()).LJLIL;
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.LaC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54666Lcs) obj).getRefreshState();
            }
        }, null, new AqS175S0100000_9(this, 269), new AqS159S0100000_9(this, 627), new AqS175S0100000_9(this, 270), 2, null);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.LaT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54666Lcs) obj).getLoadMoreState();
            }
        }, null, new AqS175S0100000_9(this, 271), new AqS159S0100000_9(this, 628), new AqS175S0100000_9(this, 272), 2, null);
        LJJJZ();
    }
}
