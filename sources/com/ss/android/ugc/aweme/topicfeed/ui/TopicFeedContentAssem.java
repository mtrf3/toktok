package com.ss.android.ugc.aweme.topicfeed.ui;

import X.C214298b3;
import X.C2K0;
import X.C47704Ins;
import X.C54520LaW;
import X.C54522LaY;
import X.C55096Ljo;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.LZT;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.topicfeed.panel.TopicFeedFragmentPanel;
import com.ss.android.ugc.aweme.topicfeed.vm.TopicFeedListViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopicFeedContentAssem extends UIContentAssem implements ITopicContentAssemAbility, InterfaceC55102Lju {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public TopicFeedFragmentPanel LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final boolean LJJIJIIJI() {
        this.LJLJJI = true;
        LJJJJJ();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final void LJJJJJ() {
        this.LJLJJL = false;
        TopicFeedFragmentPanel topicFeedFragmentPanel = this.LJLJI;
        if (topicFeedFragmentPanel != null) {
            topicFeedFragmentPanel.LJLJJI = this.LJLJJI;
        }
        v3().manualListLoadMore(0L);
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final void LJJJZ() {
        this.LJLJJL = true;
        TopicFeedFragmentPanel topicFeedFragmentPanel = this.LJLJI;
        if (topicFeedFragmentPanel != null) {
            topicFeedFragmentPanel.LJLJJI = this.LJLJJI;
        }
        ITopicToFYPAssemAbility iTopicToFYPAssemAbility = (ITopicToFYPAssemAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ITopicToFYPAssemAbility.class, null);
        if (iTopicToFYPAssemAbility != null) {
            iTopicToFYPAssemAbility.LJLLL();
        }
        v3().manualListRefresh();
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1351615169) {
            return null;
        }
        return this;
    }

    public TopicFeedContentAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicFeedListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 653), C54522LaY.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, LZT.class, null), checkSupervisorPrepared());
    }

    public final TopicFeedListViewModel v3() {
        return (TopicFeedListViewModel) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final boolean LJIILJJIL() {
        return ((Boolean) withState(v3(), C54520LaW.LJLIL)).booleanValue();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final boolean LJJZZI() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final boolean LLILZLL() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final boolean LJJIJLIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return ((Boolean) withState(v3(), new AqS140S0200000_9(aweme, this, 29))).booleanValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLJI = ((LZT) this.LJLILLLLZI.getValue()).LJLIL;
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.LaD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54667Lct) obj).getRefreshState();
            }
        }, null, new AqS175S0100000_9(this, 291), new AqS159S0100000_9(this, 651), new AqS175S0100000_9(this, 292), 2, null);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.LaX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54667Lct) obj).getLoadMoreState();
            }
        }, null, new AqS175S0100000_9(this, 293), new AqS159S0100000_9(this, 652), new AqS175S0100000_9(this, 294), 2, null);
        LJJJZ();
    }
}
