package Y;

import X.C188727au;
import X.C40517FvF;
import X.C54688LdE;
import X.C54690LdG;
import X.C78688UuS;
import X.LYU;
import X.LZE;
import com.bytedance.android.livesdk.livesetting.other.LiveEventAndSubscribeConfig;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.feed.cell.FollowLiveSkylightDoubleBigAvatarCell;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;

/* loaded from: classes10.dex */
public class ARunnableS0S2210200_9 implements Runnable {
    public final int $t;
    public long j5;
    public long j6;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

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
        String str;
        String str2;
        String str3;
        FollowingInterestUser followingInterestUser;
        FollowingInterestUser followingInterestUser2;
        Integer valueOf;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from_merge", "homepage_follow");
        c188727au.LJIIIZ("enter_method", "live_cover");
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJ(this.j5, "anchor_id");
        c188727au.LJ(this.j6, "room_id");
        c188727au.LJIIIZ("request_id", this.s0);
        c188727au.LIZLLL(((C54690LdG) this.l2).Y(), "follow_status");
        int i = 0;
        c188727au.LIZLLL(0, "is_from_list");
        String str4 = "1";
        if (this.z4) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_guest_connection", str);
        c188727au.LIZLLL(((C54690LdG) this.l2).LJLIL, "room_position");
        c188727au.LIZLLL(0, "is_from_draw_req");
        c188727au.LIZLLL(((C54690LdG) this.l2).Y(), "initial_follow_status");
        if (LYU.LJII(((C54690LdG) this.l2).LJLLILLLL)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_miss_char", str2);
        SlimRoom slimRoom = (SlimRoom) this.l3;
        if (slimRoom != null) {
            if (!slimRoom.hasCommerceGoods) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJI("is_ecom", str4);
            SlimRoom.RoomAuthStatus roomAuthStatus = ((SlimRoom) this.l3).roomAuthStatus;
            if (roomAuthStatus != null) {
                c188727au.LIZLLL(roomAuthStatus.commercePermission, "commerce_permission");
            }
        }
        if (this.z4) {
            c188727au.LJI("distribution_type", this.s1);
        }
        FollowingInterestUser followingInterestUser3 = ((C54690LdG) this.l2).LLFF;
        Integer num = null;
        if (followingInterestUser3 != null) {
            num = Integer.valueOf(followingInterestUser3.getInterestUserType());
        }
        if (num != null) {
            if (num.intValue() == 1) {
                str3 = "subscription";
            } else if (num.intValue() == 2) {
                str3 = "live_event";
            }
            c188727au.LJI("window_tag", str3);
            C40517FvF c40517FvF = new C40517FvF(1, 2);
            followingInterestUser = ((C54690LdG) this.l2).LLFF;
            if (followingInterestUser != null && (valueOf = Integer.valueOf(followingInterestUser.getInterestUserType())) != null && c40517FvF.LJIILJJIL(valueOf.intValue())) {
                c188727au.LIZLLL(((LiveEventAndSubscribeConfig) ((C54690LdG) this.l2).LLF.getValue()).styleOfLiveEventAndSubscribe, "window_tag_type");
            }
            followingInterestUser2 = ((C54690LdG) this.l2).LLFF;
            if (followingInterestUser2 != null && followingInterestUser2.getInterestUserType() == 1) {
                i = 1;
            }
            c188727au.LIZLLL(i, "is_subscription");
            C78688UuS.LJJJJZ(c188727au.LIZ);
        }
        str3 = "follow";
        c188727au.LJI("window_tag", str3);
        C40517FvF c40517FvF2 = new C40517FvF(1, 2);
        followingInterestUser = ((C54690LdG) this.l2).LLFF;
        if (followingInterestUser != null) {
            c188727au.LIZLLL(((LiveEventAndSubscribeConfig) ((C54690LdG) this.l2).LLF.getValue()).styleOfLiveEventAndSubscribe, "window_tag_type");
        }
        followingInterestUser2 = ((C54690LdG) this.l2).LLFF;
        if (followingInterestUser2 != null) {
            i = 1;
        }
        c188727au.LIZLLL(i, "is_subscription");
        C78688UuS.LJJJJZ(c188727au.LIZ);
    }

    public final void LIZ$1() {
        String str;
        String str2;
        Integer num;
        String str3;
        FollowingInterestUser followingInterestUser;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from_merge", "homepage_follow");
        c188727au.LJIIIZ("enter_method", "live_cover");
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJ(this.j5, "anchor_id");
        c188727au.LJ(this.j6, "room_id");
        c188727au.LJIIIZ("request_id", this.s0);
        c188727au.LIZLLL(((C54688LdE) this.l2).Y(), "follow_status");
        int i = 0;
        c188727au.LIZLLL(0, "is_from_list");
        String str4 = "1";
        if (this.z4) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_guest_connection", str);
        c188727au.LIZLLL(((C54688LdE) this.l2).LJLIL, "room_position");
        c188727au.LIZLLL(0, "is_from_draw_req");
        c188727au.LIZLLL(((C54688LdE) this.l2).Y(), "initial_follow_status");
        if (LYU.LJII(((C54688LdE) this.l2).LJLJLJ)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_miss_char", str2);
        SlimRoom slimRoom = (SlimRoom) this.l3;
        if (slimRoom != null) {
            if (!slimRoom.hasCommerceGoods) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJI("is_ecom", str4);
            SlimRoom.RoomAuthStatus roomAuthStatus = ((SlimRoom) this.l3).roomAuthStatus;
            if (roomAuthStatus != null) {
                c188727au.LIZLLL(roomAuthStatus.commercePermission, "commerce_permission");
            }
        }
        if (this.z4) {
            c188727au.LJI("distribution_type", this.s1);
        }
        FollowingInterestUser followingInterestUser2 = ((C54688LdE) this.l2).LJLLJ;
        if (followingInterestUser2 != null) {
            num = Integer.valueOf(followingInterestUser2.getInterestUserType());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                str3 = "subscription";
            } else if (num.intValue() == 2) {
                str3 = "live_event";
            }
            c188727au.LJI("window_tag", str3);
            followingInterestUser = ((C54688LdE) this.l2).LJLLJ;
            if (followingInterestUser != null && followingInterestUser.getInterestUserType() == 1) {
                i = 1;
            }
            c188727au.LIZLLL(i, "is_subscription");
            C78688UuS.LJJJJZ(c188727au.LIZ);
        }
        str3 = "follow";
        c188727au.LJI("window_tag", str3);
        followingInterestUser = ((C54688LdE) this.l2).LJLLJ;
        if (followingInterestUser != null) {
            i = 1;
        }
        c188727au.LIZLLL(i, "is_subscription");
        C78688UuS.LJJJJZ(c188727au.LIZ);
    }

    public final void LIZ$2() {
        String str;
        Integer num;
        String str2;
        String str3;
        FollowingInterestUser followingInterestUser;
        FollowingInterestUser followingInterestUser2;
        Integer valueOf;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from_merge", "homepage_follow");
        c188727au.LJIIIZ("enter_method", "live_cover");
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJ(this.j5, "anchor_id");
        c188727au.LJ(this.j6, "room_id");
        c188727au.LJIIIZ("request_id", this.s0);
        c188727au.LIZLLL(((FollowLiveSkylightDoubleBigAvatarCell) this.l2).N(), "follow_status");
        int i = 0;
        c188727au.LIZLLL(0, "is_from_list");
        String str4 = "1";
        if (this.z4) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_guest_connection", str);
        LZE item = ((FollowLiveSkylightDoubleBigAvatarCell) this.l2).getItem();
        Integer num2 = null;
        if (item != null) {
            num = Integer.valueOf(item.LJLJI);
        } else {
            num = null;
        }
        c188727au.LJFF(num, "room_position");
        c188727au.LIZLLL(0, "is_from_draw_req");
        c188727au.LIZLLL(((FollowLiveSkylightDoubleBigAvatarCell) this.l2).N(), "initial_follow_status");
        if (LYU.LJII(((FollowLiveSkylightDoubleBigAvatarCell) this.l2).P())) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_miss_char", str2);
        SlimRoom slimRoom = (SlimRoom) this.l3;
        if (slimRoom != null) {
            if (!slimRoom.hasCommerceGoods) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJI("is_ecom", str4);
            SlimRoom.RoomAuthStatus roomAuthStatus = ((SlimRoom) this.l3).roomAuthStatus;
            if (roomAuthStatus != null) {
                c188727au.LIZLLL(roomAuthStatus.commercePermission, "commerce_permission");
            }
        }
        if (this.z4) {
            c188727au.LJI("distribution_type", this.s1);
        }
        FollowingInterestUser followingInterestUser3 = ((FollowLiveSkylightDoubleBigAvatarCell) this.l2).LJLZ;
        if (followingInterestUser3 != null) {
            num2 = Integer.valueOf(followingInterestUser3.getInterestUserType());
        }
        if (num2 != null) {
            if (num2.intValue() == 1) {
                str3 = "subscription";
            } else if (num2.intValue() == 2) {
                str3 = "live_event";
            }
            c188727au.LJI("window_tag", str3);
            C40517FvF c40517FvF = new C40517FvF(1, 2);
            followingInterestUser = ((FollowLiveSkylightDoubleBigAvatarCell) this.l2).LJLZ;
            if (followingInterestUser != null && (valueOf = Integer.valueOf(followingInterestUser.getInterestUserType())) != null && c40517FvF.LJIILJJIL(valueOf.intValue())) {
                c188727au.LIZLLL(((LiveEventAndSubscribeConfig) ((FollowLiveSkylightDoubleBigAvatarCell) this.l2).LJLLLLLL.getValue()).styleOfLiveEventAndSubscribe, "window_tag_type");
            }
            followingInterestUser2 = ((FollowLiveSkylightDoubleBigAvatarCell) this.l2).LJLZ;
            if (followingInterestUser2 != null && followingInterestUser2.getInterestUserType() == 1) {
                i = 1;
            }
            c188727au.LIZLLL(i, "is_subscription");
            C78688UuS.LJJJJZ(c188727au.LIZ);
        }
        str3 = "follow";
        c188727au.LJI("window_tag", str3);
        C40517FvF c40517FvF2 = new C40517FvF(1, 2);
        followingInterestUser = ((FollowLiveSkylightDoubleBigAvatarCell) this.l2).LJLZ;
        if (followingInterestUser != null) {
            c188727au.LIZLLL(((LiveEventAndSubscribeConfig) ((FollowLiveSkylightDoubleBigAvatarCell) this.l2).LJLLLLLL.getValue()).styleOfLiveEventAndSubscribe, "window_tag_type");
        }
        followingInterestUser2 = ((FollowLiveSkylightDoubleBigAvatarCell) this.l2).LJLZ;
        if (followingInterestUser2 != null) {
            i = 1;
        }
        c188727au.LIZLLL(i, "is_subscription");
        C78688UuS.LJJJJZ(c188727au.LIZ);
    }

    public static final void run$0(ARunnableS0S2210200_9 aRunnableS0S2210200_9) {
        boolean LIZ;
        try {
            aRunnableS0S2210200_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S2210200_9 aRunnableS0S2210200_9) {
        boolean LIZ;
        try {
            aRunnableS0S2210200_9.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S2210200_9 aRunnableS0S2210200_9) {
        boolean LIZ;
        try {
            aRunnableS0S2210200_9.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S2210200_9(long j, long j2, String str, Object obj, boolean z, Object obj2, String str2, int i) {
        this.$t = i;
        this.j5 = j;
        this.j6 = j2;
        this.s0 = str;
        this.l2 = obj;
        this.z4 = z;
        this.l3 = obj2;
        this.s1 = str2;
    }
}
