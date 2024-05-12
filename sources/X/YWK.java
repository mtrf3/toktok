package X;

import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.friendstab.cache.FriendsFeeRespDatabase;

/* loaded from: classes16.dex */
public final class YWK extends C1CG<LW0> {
    public final /* synthetic */ YWU LIZLLL;

    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR REPLACE INTO `friends_feed_resp_cache` (`uid`,`friends_feed_resp`,`created_time_millis`) VALUES (?,?,?)";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YWK(YWU ywu, FriendsFeeRespDatabase friendsFeeRespDatabase) {
        super(friendsFeeRespDatabase);
        this.LIZLLL = ywu;
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, LW0 lw0) {
        LW0 lw02 = lw0;
        String str = lw02.LIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        C77857Uh3 c77857Uh3 = this.LIZLLL.LIZJ;
        FriendsFeedResponse friendsFeedResponse = lw02.LIZIZ;
        c77857Uh3.getClass();
        String LIZJ = C75792yF.LIZJ(friendsFeedResponse);
        if (LIZJ == null) {
            interfaceC37591dj.LLLLLLJ(2);
        } else {
            interfaceC37591dj.LJJII(2, LIZJ);
        }
        interfaceC37591dj.LJIIIZ(3, lw02.LIZJ);
    }
}
