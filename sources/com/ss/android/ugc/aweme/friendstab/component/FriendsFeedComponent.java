package com.ss.android.ugc.aweme.friendstab.component;

import X.C1DH;
import X.C221108m2;
import X.C2MA;
import X.C36161EHd;
import X.C51031K1b;
import X.C54396LWm;
import X.C62822Ol8;
import X.C73969T1h;
import X.C77439UaJ;
import X.LW8;
import X.LXM;
import Y.AfS61S0100000_9;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.fragment.IFriendsFeedFragmentAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsFeedComponent extends HomeFeedComponent implements IFriendsFeedFragmentAbility {
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    public FriendsFeedComponent() {
        new LinkedHashMap();
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 247));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 248));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 249));
    }

    public final C54396LWm A3() {
        return (C54396LWm) this.LJLLJ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFriendsFeedFragmentAbility
    public final void Pg0() {
        LW8.LIZIZ.LIZJ().LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 3), C36161EHd.LJLIL);
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility
    public final C2MA m30() {
        return ((BaseListFragmentPanel) this.LJLLILLLL.getValue()).getCurFeedViewHolder();
    }

    @Override // X.InterfaceC58812Sn
    public final boolean mf() {
        return LXM.LIZ(this, ((FeedFragment) this.LJLLI.getValue()).LJLJI);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LJJIJIIJI() {
        A3().LIZJ.LJLJLJ = true;
        return A3().LIZIZ();
    }

    @Override // X.InterfaceC55112Lk4
    public final void LJJIJIL() {
        A3().LIZIZ();
        if (C1DH.LJIL()) {
            C77439UaJ.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final C51031K1b Qv() {
        return A3().LIZJ;
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
