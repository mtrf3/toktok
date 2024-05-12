package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class LWP<T> implements InterfaceC64592gB {
    public final /* synthetic */ LWR LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public LWP(LWR lwr, long j, String str) {
        this.LJLIL = lwr;
        this.LJLILLLLZI = j;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        ILiveOuterService LJJJLL;
        int i;
        FollowingInterestUsersResponse followingInterestUsersResponse = (FollowingInterestUsersResponse) obj;
        C73353Sqb.LJFF().LJIIJJI();
        if (((Boolean) this.LJLIL.LIZLLL.getValue()).booleanValue()) {
            C188727au c188727au = new C188727au();
            List<FollowingInterestUser> followingInterestUsers = followingInterestUsersResponse.getFollowingInterestUsers();
            if (followingInterestUsers != null) {
                i = followingInterestUsers.size();
            } else {
                i = 0;
            }
            c188727au.LIZLLL(i, "room_num");
            c188727au.LJ(SystemClock.elapsedRealtime() - this.LJLILLLLZI, "duration");
            c188727au.LJIIIZ("enter_from_merge", "homepage_follow");
            c188727au.LJIIIZ("enter_method", "live_cover");
            c188727au.LJIIIZ("action_type", "click");
            c188727au.LJIIIZ("request_api", "/aweme/v1/following/interest/users/");
            FMX.LJIIL("livesdk_live_request_response", c188727au.LIZ);
        }
        List<FollowingInterestUser> followingInterestUsers2 = followingInterestUsersResponse.getFollowingInterestUsers();
        if (followingInterestUsers2 == null || followingInterestUsers2.isEmpty()) {
            C73353Sqb.LJFF().LIZJ();
            return;
        }
        List<FollowingInterestUser> followingInterestUsers3 = followingInterestUsersResponse.getFollowingInterestUsers();
        if (followingInterestUsers3 != null) {
            Iterator<FollowingInterestUser> it = followingInterestUsers3.iterator();
            while (it.hasNext()) {
                it.next().setLogPbBean(followingInterestUsersResponse.getLogPbBean());
            }
        }
        if (((Boolean) this.LJLIL.LIZJ.getValue()).booleanValue() && (LJJJLL = LiveOuterService.LJJJLL()) != null) {
            LJJJLL.LJII();
            C54285LSf.LIZ.LIZ(0, "ttlive_from_following_show_live", C51029K0z.LJJIIZI(new OSZ("source", "following")));
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", this.LJLJI);
        c188727au2.LJIIIZ("is_live", "1");
        FMX.LJIIL("enter_following_window_feed", c188727au2.LIZ);
    }
}
