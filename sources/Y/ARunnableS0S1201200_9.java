package Y;

import X.C188727au;
import X.C40517FvF;
import X.C54691LdH;
import X.C54695LdL;
import X.C78688UuS;
import X.LYU;
import X.LZD;
import com.bytedance.android.livesdk.livesetting.other.LiveEventAndSubscribeConfig;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.feed.cell.FollowLiveSkylightBigAvatarCell;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public class ARunnableS0S1201200_9 implements Runnable {
    public final int $t;
    public int i3;
    public long j4;
    public long j5;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        String str;
        String str2;
        FollowingInterestUser followingInterestUser;
        FollowingInterestUser followingInterestUser2;
        Integer valueOf;
        Integer valueOf2;
        User user;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from_merge", "homepage_follow");
        c188727au.LJIIIZ("enter_method", "live_cover");
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJ(this.j4, "anchor_id");
        c188727au.LJ(this.j5, "room_id");
        c188727au.LJIIIZ("request_id", this.s0);
        FollowingInterestUser followingInterestUser3 = ((C54691LdH) this.l1).LJLLL;
        int i2 = 0;
        if (followingInterestUser3 != null && (user = followingInterestUser3.getUser()) != null) {
            i = user.getFollowStatus();
            if (i != 0 && i != 1 && i != 2) {
                i = user.getFollowerStatus() == 0 ? 0 : 3;
            }
        } else {
            i = -1;
        }
        c188727au.LIZLLL(i, "follow_status");
        c188727au.LIZLLL(this.i3, "initial_follow_status");
        c188727au.LIZLLL(0, "is_from_list");
        String str3 = "1";
        if (LYU.LJII(((C54691LdH) this.l1).LJLLI)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_miss_char", str);
        c188727au.LIZLLL(((C54691LdH) this.l1).LJLIL, "room_position");
        c188727au.LIZLLL(0, "is_from_draw_req");
        SlimRoom slimRoom = (SlimRoom) this.l2;
        if (slimRoom != null) {
            if (!slimRoom.hasCommerceGoods) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJI("is_ecom", str3);
            SlimRoom.RoomAuthStatus roomAuthStatus = ((SlimRoom) this.l2).roomAuthStatus;
            if (roomAuthStatus != null) {
                c188727au.LIZLLL(roomAuthStatus.commercePermission, "commerce_permission");
            }
        }
        FollowingInterestUser followingInterestUser4 = ((C54691LdH) this.l1).LJLLL;
        if (followingInterestUser4 != null && (valueOf2 = Integer.valueOf(followingInterestUser4.getInterestUserType())) != null) {
            if (valueOf2.intValue() == 1) {
                str2 = "subscription";
            } else if (valueOf2.intValue() == 2) {
                str2 = "live_event";
            }
            c188727au.LJI("window_tag", str2);
            C40517FvF c40517FvF = new C40517FvF(1, 2);
            followingInterestUser = ((C54691LdH) this.l1).LJLLL;
            if (followingInterestUser != null && (valueOf = Integer.valueOf(followingInterestUser.getInterestUserType())) != null && c40517FvF.LJIILJJIL(valueOf.intValue())) {
                c188727au.LIZLLL(((LiveEventAndSubscribeConfig) ((C54691LdH) this.l1).LJLLLL.getValue()).styleOfLiveEventAndSubscribe, "window_tag_type");
            }
            followingInterestUser2 = ((C54691LdH) this.l1).LJLLL;
            if (followingInterestUser2 != null && followingInterestUser2.getInterestUserType() == 1) {
                i2 = 1;
            }
            c188727au.LIZLLL(i2, "is_subscription");
            C78688UuS.LJJJJZ(c188727au.LIZ);
        }
        str2 = "follow";
        c188727au.LJI("window_tag", str2);
        C40517FvF c40517FvF2 = new C40517FvF(1, 2);
        followingInterestUser = ((C54691LdH) this.l1).LJLLL;
        if (followingInterestUser != null) {
            c188727au.LIZLLL(((LiveEventAndSubscribeConfig) ((C54691LdH) this.l1).LJLLLL.getValue()).styleOfLiveEventAndSubscribe, "window_tag_type");
        }
        followingInterestUser2 = ((C54691LdH) this.l1).LJLLL;
        if (followingInterestUser2 != null) {
            i2 = 1;
        }
        c188727au.LIZLLL(i2, "is_subscription");
        C78688UuS.LJJJJZ(c188727au.LIZ);
    }

    public final void LIZ$1() {
        int i;
        String str;
        String str2;
        FollowingInterestUser followingInterestUser;
        Integer valueOf;
        User user;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from_merge", "homepage_follow");
        c188727au.LJIIIZ("enter_method", "live_cover");
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJ(this.j4, "anchor_id");
        c188727au.LJ(this.j5, "room_id");
        c188727au.LJIIIZ("request_id", this.s0);
        FollowingInterestUser followingInterestUser2 = ((C54695LdL) this.l1).LJLLI;
        int i2 = 1;
        if (followingInterestUser2 != null && (user = followingInterestUser2.getUser()) != null) {
            i = user.getFollowStatus();
            if (i != 0 && i != 1 && i != 2) {
                i = user.getFollowerStatus() == 0 ? 0 : 3;
            }
        } else {
            i = -1;
        }
        c188727au.LIZLLL(i, "follow_status");
        c188727au.LIZLLL(this.i3, "initial_follow_status");
        c188727au.LIZLLL(0, "is_from_list");
        String str3 = "1";
        if (LYU.LJII(((C54695LdL) this.l1).LJLJL)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_miss_char", str);
        c188727au.LIZLLL(((C54695LdL) this.l1).LJLIL, "room_position");
        c188727au.LIZLLL(0, "is_from_draw_req");
        SlimRoom slimRoom = (SlimRoom) this.l2;
        if (slimRoom != null) {
            if (!slimRoom.hasCommerceGoods) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJI("is_ecom", str3);
            SlimRoom.RoomAuthStatus roomAuthStatus = ((SlimRoom) this.l2).roomAuthStatus;
            if (roomAuthStatus != null) {
                c188727au.LIZLLL(roomAuthStatus.commercePermission, "commerce_permission");
            }
        }
        FollowingInterestUser followingInterestUser3 = ((C54695LdL) this.l1).LJLLI;
        if (followingInterestUser3 != null && (valueOf = Integer.valueOf(followingInterestUser3.getInterestUserType())) != null) {
            if (valueOf.intValue() == 1) {
                str2 = "subscription";
            } else if (valueOf.intValue() == 2) {
                str2 = "live_event";
            }
            c188727au.LJI("window_tag", str2);
            followingInterestUser = ((C54695LdL) this.l1).LJLLI;
            if (followingInterestUser != null || followingInterestUser.getInterestUserType() != 1) {
                i2 = 0;
            }
            c188727au.LIZLLL(i2, "is_subscription");
            C78688UuS.LJJJJZ(c188727au.LIZ);
        }
        str2 = "follow";
        c188727au.LJI("window_tag", str2);
        followingInterestUser = ((C54695LdL) this.l1).LJLLI;
        if (followingInterestUser != null) {
        }
        i2 = 0;
        c188727au.LIZLLL(i2, "is_subscription");
        C78688UuS.LJJJJZ(c188727au.LIZ);
    }

    public final void LIZ$2() {
        int i;
        String str;
        String str2;
        FollowingInterestUser followingInterestUser;
        FollowingInterestUser followingInterestUser2;
        Integer valueOf;
        Integer valueOf2;
        User user;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from_merge", "homepage_follow");
        c188727au.LJIIIZ("enter_method", "live_cover");
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJ(this.j4, "anchor_id");
        c188727au.LJ(this.j5, "room_id");
        c188727au.LJIIIZ("request_id", this.s0);
        FollowingInterestUser followingInterestUser3 = ((FollowLiveSkylightBigAvatarCell) this.l1).LJLJL;
        int i2 = 0;
        if (followingInterestUser3 != null && (user = followingInterestUser3.getUser()) != null) {
            i = user.getFollowStatus();
            if (i != 0 && i != 1 && i != 2) {
                i = user.getFollowerStatus() == 0 ? 0 : 3;
            }
        } else {
            i = -1;
        }
        c188727au.LIZLLL(i, "follow_status");
        c188727au.LIZLLL(this.i3, "initial_follow_status");
        c188727au.LIZLLL(0, "is_from_list");
        String str3 = "1";
        if (LYU.LJII(((FollowLiveSkylightBigAvatarCell) this.l1).M())) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_miss_char", str);
        LZD item = ((FollowLiveSkylightBigAvatarCell) this.l1).getItem();
        Integer num = null;
        if (item != null) {
            num = Integer.valueOf(item.LJLJI);
        }
        c188727au.LJFF(num, "room_position");
        c188727au.LIZLLL(0, "is_from_draw_req");
        SlimRoom slimRoom = (SlimRoom) this.l2;
        if (slimRoom != null) {
            if (!slimRoom.hasCommerceGoods) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJI("is_ecom", str3);
            SlimRoom.RoomAuthStatus roomAuthStatus = ((SlimRoom) this.l2).roomAuthStatus;
            if (roomAuthStatus != null) {
                c188727au.LIZLLL(roomAuthStatus.commercePermission, "commerce_permission");
            }
        }
        FollowingInterestUser followingInterestUser4 = ((FollowLiveSkylightBigAvatarCell) this.l1).LJLJL;
        if (followingInterestUser4 != null && (valueOf2 = Integer.valueOf(followingInterestUser4.getInterestUserType())) != null) {
            if (valueOf2.intValue() == 1) {
                str2 = "subscription";
            } else if (valueOf2.intValue() == 2) {
                str2 = "live_event";
            }
            c188727au.LJI("window_tag", str2);
            C40517FvF c40517FvF = new C40517FvF(1, 2);
            followingInterestUser = ((FollowLiveSkylightBigAvatarCell) this.l1).LJLJL;
            if (followingInterestUser != null && (valueOf = Integer.valueOf(followingInterestUser.getInterestUserType())) != null && c40517FvF.LJIILJJIL(valueOf.intValue())) {
                c188727au.LIZLLL(((LiveEventAndSubscribeConfig) ((FollowLiveSkylightBigAvatarCell) this.l1).LJLJLLL.getValue()).styleOfLiveEventAndSubscribe, "window_tag_type");
            }
            followingInterestUser2 = ((FollowLiveSkylightBigAvatarCell) this.l1).LJLJL;
            if (followingInterestUser2 != null && followingInterestUser2.getInterestUserType() == 1) {
                i2 = 1;
            }
            c188727au.LIZLLL(i2, "is_subscription");
            C78688UuS.LJJJJZ(c188727au.LIZ);
        }
        str2 = "follow";
        c188727au.LJI("window_tag", str2);
        C40517FvF c40517FvF2 = new C40517FvF(1, 2);
        followingInterestUser = ((FollowLiveSkylightBigAvatarCell) this.l1).LJLJL;
        if (followingInterestUser != null) {
            c188727au.LIZLLL(((LiveEventAndSubscribeConfig) ((FollowLiveSkylightBigAvatarCell) this.l1).LJLJLLL.getValue()).styleOfLiveEventAndSubscribe, "window_tag_type");
        }
        followingInterestUser2 = ((FollowLiveSkylightBigAvatarCell) this.l1).LJLJL;
        if (followingInterestUser2 != null) {
            i2 = 1;
        }
        c188727au.LIZLLL(i2, "is_subscription");
        C78688UuS.LJJJJZ(c188727au.LIZ);
    }

    public static final void run$0(ARunnableS0S1201200_9 aRunnableS0S1201200_9) {
        boolean LIZ;
        try {
            aRunnableS0S1201200_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1201200_9 aRunnableS0S1201200_9) {
        boolean LIZ;
        try {
            aRunnableS0S1201200_9.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S1201200_9 aRunnableS0S1201200_9) {
        boolean LIZ;
        try {
            aRunnableS0S1201200_9.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1201200_9(long j, long j2, String str, Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.j4 = j;
        this.j5 = j2;
        this.s0 = str;
        this.l1 = obj;
        this.i3 = i;
        this.l2 = obj2;
    }
}
