package com.ss.android.ugc.aweme.topicfeed.component;

import X.C1DH;
import X.C214298b3;
import X.C221108m2;
import X.C2MA;
import X.C46434IKg;
import X.C51031K1b;
import X.C55096Ljo;
import X.C56509MFt;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77439UaJ;
import X.C78926UyI;
import X.C9BE;
import X.LXO;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility;
import com.ss.android.ugc.aweme.topicfeed.vm.TopicFeedListViewModel;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopicFeedComponent extends HomeFeedComponent {
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C214298b3 LJLLJ;

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final C51031K1b<?> Qv() {
        return null;
    }

    public TopicFeedComponent() {
        new LinkedHashMap();
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 650));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 649));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicFeedListViewModel.class);
        this.LJLLJ = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 648), LXO.INSTANCE, null);
    }

    @Override // X.InterfaceC55112Lk4
    public final void LJJIJIL() {
        withState(this.LJLLJ.getValue(), new AqS175S0100000_9(this, 289));
        if (C1DH.LJIL()) {
            C77439UaJ.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility
    public final C2MA m30() {
        return ((BaseListFragmentPanel) this.LJLLILLLL.getValue()).getCurFeedViewHolder();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LJIILJJIL() {
        ITopicContentAssemAbility iTopicContentAssemAbility = (ITopicContentAssemAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ITopicContentAssemAbility.class, null);
        if (iTopicContentAssemAbility != null) {
            return iTopicContentAssemAbility.LJIILJJIL();
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LJJIJIIJI() {
        ITopicContentAssemAbility iTopicContentAssemAbility = (ITopicContentAssemAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ITopicContentAssemAbility.class, null);
        if (iTopicContentAssemAbility != null) {
            return iTopicContentAssemAbility.LJJIJIIJI();
        }
        return false;
    }

    @Override // X.InterfaceC58812Sn
    public final boolean mf() {
        if (!LJIILJJIL()) {
            return false;
        }
        MLCommonService.Companion.getClass();
        C46434IKg.LIZ.onBeforeLoadMore(C56509MFt.LIZLLL(getPanelContext()));
        return LJJIJIIJI();
    }

    @Override // X.InterfaceC57302Ms
    public final boolean LJJIJLIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        ITopicContentAssemAbility iTopicContentAssemAbility = (ITopicContentAssemAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ITopicContentAssemAbility.class, null);
        if (iTopicContentAssemAbility != null) {
            return iTopicContentAssemAbility.LJJIJLIJ(aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility, X.InterfaceC57302Ms
    public final boolean deleteItem(String str) {
        Aweme i6;
        if (str == null || (i6 = AwemeService.LIZ().i6(str)) == null || !LJJIJLIJ(i6)) {
            return false;
        }
        return true;
    }
}
