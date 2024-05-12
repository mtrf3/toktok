package com.ss.android.ugc.aweme.story.feed.immersive.vm;

import X.C189497c9;
import X.C189507cA;
import X.C189517cB;
import X.C189527cC;
import X.C221108m2;
import X.C33Q;
import X.C48841JEv;
import X.C54838Lfe;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C74221TAz;
import X.C78404Ups;
import X.C7XA;
import X.EV6;
import X.InterfaceC70422pa;
import X.M89;
import X.XKX;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryViewerEntranceViewModel extends FeedBaseViewModel<C189527cC> {
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C189507cA.LJLIL);
    public final EV6 LJLL = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C7XA.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C189527cC(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C48841JEv.LIZJ((InterfaceC70422pa) this.LJLJLLL.getValue(), null);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C189527cC iv0(C189527cC c189527cC, VideoItemParams item) {
        List<StoryInsertUser> list;
        M89 m89;
        C189517cB storyInsertUserWrapper;
        C189527cC state = c189527cC;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        long j = 0;
        if (item.getAweme().isProhibited()) {
            AwemeStatistics statistics = item.getAweme().getStatistics();
            if (statistics != null) {
                j = statistics.getPlayCount();
            }
            return C189527cC.LIZ(state, j, R.attr.dm, null, null, 12);
        }
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (C54838Lfe.LJIILL(aweme) || !C54838Lfe.LJJIIJ(aweme)) {
            return C189527cC.LIZ(state, -1L, R.attr.dm, null, null, 12);
        }
        String LIZJ = C74221TAz.LIZJ(item, "item.aweme.aid");
        BaseFeedPageParams baseFeedPageParams = item.baseFeedPageParams;
        if (baseFeedPageParams != null && (m89 = baseFeedPageParams.param) != null && (storyInsertUserWrapper = m89.getStoryInsertUserWrapper()) != null) {
            list = storyInsertUserWrapper.getInsertUsers();
        } else {
            list = null;
        }
        XKX.LIZLLL((InterfaceC70422pa) this.LJLJLLL.getValue(), null, null, new C189497c9(this, LIZJ, list, null), 3);
        AwemeStatistics statistics2 = item.getAweme().getStatistics();
        if (statistics2 != null) {
            j = statistics2.getPlayCount();
        }
        return C189527cC.LIZ(state, j, R.attr.dj, null, null, 12);
    }
}
