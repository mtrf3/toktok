package com.ss.android.ugc.aweme.feed.assem.avatar;

import X.AV1;
import X.C2049682q;
import X.C225458t3;
import X.C33Q;
import X.C43I;
import X.C59251NNf;
import X.C63081OpJ;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedAvatarDefaultVM extends FeedBaseViewModel<C225458t3> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C225458t3(0);
    }

    public final void mv0() {
        setState(new AqS169S0100000_3(this, 185));
    }

    public final int kv0() {
        Aweme aweme;
        AwemeCommerceStruct commerceVideoAuthInfo;
        VideoItemParams gv0;
        Aweme aweme2;
        VideoItemParams gv02 = gv0();
        if (gv02 == null || (aweme = gv02.getAweme()) == null || !aweme.isCanPlay() || aweme.isDelete()) {
            return 8;
        }
        FeedAvatarAssemWrap.LLII.getClass();
        if (C59251NNf.LIZIZ(3, aweme) || C63081OpJ.LLJLILLLLZIIL(aweme)) {
            return 8;
        }
        if (AV1.LJIILJJIL(aweme) || AV1.LJIJ(aweme.getAuthor()) || (C63081OpJ.LJLL(aweme) && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isPersonalPageForbidden())) {
            return 4;
        }
        VideoItemParams gv03 = gv0();
        Aweme aweme3 = null;
        if (gv03 != null) {
            aweme3 = gv03.getAweme();
        }
        if (C2049682q.LIZ(aweme3) && ((gv0 = gv0()) == null || (aweme2 = gv0.getAweme()) == null || aweme2.getAuthor() == null)) {
            return 0;
        }
        if (aweme.getAuthor() != null) {
            User author = aweme.getAuthor();
            o.LJI(author);
            if (!author.isAdFake()) {
                return 0;
            }
        }
        return 4;
    }

    public final String lv0() {
        Aweme aweme;
        User author;
        ProfileBadgeStruct profileBadge;
        VideoItemParams gv0 = gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null || (author = aweme.getAuthor()) == null || (profileBadge = author.getProfileBadge()) == null || !profileBadge.getShouldShow() || profileBadge.getUrl().length() <= 0) {
            return null;
        }
        return profileBadge.getUrl();
    }

    public final void nv0(C43I<Integer> c43i) {
        setState(new AqS169S0100000_3(c43i, (C43I<Integer>) 186));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C225458t3 iv0(C225458t3 c225458t3, VideoItemParams item) {
        C225458t3 state = c225458t3;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return C225458t3.LIZ(state, kv0(), lv0(), null, 4);
    }
}
