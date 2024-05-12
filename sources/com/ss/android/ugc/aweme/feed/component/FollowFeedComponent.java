package com.ss.android.ugc.aweme.feed.component;

import X.AbstractC54421LXl;
import X.C1DH;
import X.C221108m2;
import X.C2MA;
import X.C51031K1b;
import X.C56509MFt;
import X.C62822Ol8;
import X.C77439UaJ;
import X.LXM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.fragment.IFollowFeedFragmentAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowFeedComponent extends HomeFeedComponent implements IFollowFeedFragmentAbility {
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    public FollowFeedComponent() {
        new LinkedHashMap();
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 224));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 223));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 225));
    }

    public final FeedFollowFragment A3() {
        return (FeedFollowFragment) this.LJLLI.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LJJIJIIJI() {
        if (this.LJLLJ.getValue() != null) {
            ((AbstractC54421LXl) this.LJLLJ.getValue()).LJIIIIZZ();
            A3().Nl("prefetch");
        }
        return ((AbstractC54421LXl) this.LJLLJ.getValue()).LJI();
    }

    @Override // X.InterfaceC55112Lk4
    public final void LJJIJIL() {
        ((AbstractC54421LXl) this.LJLLJ.getValue()).LJI();
        if (C1DH.LJIL()) {
            C77439UaJ.LIZIZ();
        }
        A3().Nl("slide_up");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final C51031K1b<?> Qv() {
        return ((AbstractC54421LXl) this.LJLLJ.getValue()).LIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility
    public final C2MA m30() {
        return ((BaseListFragmentPanel) this.LJLLILLLL.getValue()).getCurFeedViewHolder();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFollowFeedFragmentAbility
    public final boolean On0() {
        if (A3().LJLZ.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC58812Sn
    public final boolean mf() {
        return LXM.LIZ(this, C56509MFt.LIZLLL(getPanelContext()));
    }

    @Override // X.InterfaceC57302Ms
    public final boolean LJJIJLIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return LXM.LIZJ(this, aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility, X.InterfaceC57302Ms
    public final boolean deleteItem(String str) {
        return LXM.LIZIZ(this, str);
    }
}
