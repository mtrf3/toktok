package X;

import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Le4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54740Le4 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(LiveRoomStruct liveRoomStruct) {
        User user;
        if (liveRoomStruct != null && (user = liveRoomStruct.owner) != null) {
            int followStatus = user.getFollowStatus();
            int followerStatus = user.getFollowerStatus();
            if (followStatus == 0 && followerStatus == 1) {
                return 3;
            }
            return followStatus;
        }
        return -1;
    }

    public static int LIZIZ(User user) {
        if (user != null) {
            int followStatus = user.getFollowStatus();
            int followerStatus = user.getFollowerStatus();
            if (followStatus == 0 && followerStatus == 1) {
                return 3;
            }
            return followStatus;
        }
        return -1;
    }
}
