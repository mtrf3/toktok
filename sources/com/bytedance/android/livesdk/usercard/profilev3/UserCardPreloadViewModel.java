package com.bytedance.android.livesdk.usercard.profilev3;

import X.C0M6;
import X.C29273BeH;
import X.C29469BhR;
import X.XKQ;
import X.XKX;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileV3Setting;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class UserCardPreloadViewModel extends ViewModel {
    public volatile User LJLIL;
    public volatile boolean LJLILLLLZI;
    public volatile FollowPair LJLJI;
    public XKQ LJLJJL;
    public User LJLJJLL;
    public volatile int LJLJJI = -1;
    public final C0M6<Long, C29469BhR> LJLJL = new C0M6<>(3);

    public final void hv0(FollowPair followPair) {
        FollowInfo followInfo;
        o.LJIIIZ(followPair, "followPair");
        User user = this.LJLIL;
        if (user == null || this.LJLILLLLZI) {
            this.LJLJI = followPair;
            if (user == null) {
                return;
            }
        }
        if (user.getId() != followPair.LIZ) {
            return;
        }
        FollowInfo followInfo2 = user.getFollowInfo();
        if (followInfo2 != null) {
            followInfo2.setFollowStatus(followPair.LIZJ);
        }
        user.followStatus = Long.valueOf(followPair.LIZJ);
        if (user.isFollowing() || (followInfo = user.getFollowInfo()) == null) {
            return;
        }
        followInfo.setPushStatus(2L);
    }

    public final void gv0(long j, Room room, User currUser, long j2) {
        o.LJIIIZ(room, "room");
        o.LJIIIZ(currUser, "currUser");
        if (!LiveProfileV3Setting.INSTANCE.isEnableAuthorPrefetch() || j != room.getOwnerUserId() || this.LJLILLLLZI || currUser.getId() == j) {
            return;
        }
        XKQ xkq = this.LJLJJL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLJJL = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C29273BeH(j2, currUser, j, room, this, null), 3);
    }
}
