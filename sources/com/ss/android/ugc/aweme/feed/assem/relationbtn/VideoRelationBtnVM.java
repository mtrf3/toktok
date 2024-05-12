package com.ss.android.ugc.aweme.feed.assem.relationbtn;

import X.C33Q;
import X.C56602Ka;
import X.C61984OUi;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS15S0010000_10;

/* loaded from: classes11.dex */
public final class VideoRelationBtnVM extends FeedBaseViewModel<C61984OUi> {
    public static final /* synthetic */ int LJLLI = 0;
    public Integer LJLJLLL;
    public boolean LJLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C61984OUi(0);
    }

    public final void lv0() {
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null) {
            return;
        }
        withState(new AqS141S0200000_10(aweme, this, 13));
    }

    public final boolean kv0(Integer num) {
        Aweme aweme;
        Boolean bool;
        VideoItemParams gv0 = gv0();
        User user = null;
        if (gv0 != null) {
            aweme = gv0.getAweme();
            if (aweme != null) {
                user = aweme.getAuthor();
            }
        } else {
            aweme = null;
        }
        if (num == null || user == null || user.getFollowStatus() != 0) {
            return false;
        }
        String LIZ = C56602Ka.LIZ(aweme);
        if (LIZ != null && (bool = C56602Ka.LIZIZ.get(LIZ)) != null && bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void mv0(boolean z) {
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null) {
            return;
        }
        setState(new AqS15S0010000_10(z, 2));
        C56602Ka.LIZJ(aweme, !z);
    }
}
