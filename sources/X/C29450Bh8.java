package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;

/* renamed from: X.Bh8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29450Bh8 extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ C29448Bh6 LJLIL;
    public final /* synthetic */ UserProfileEvent LJLILLLLZI;
    public final /* synthetic */ C29456BhE LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29450Bh8(C29448Bh6 c29448Bh6, UserProfileEvent userProfileEvent, C29456BhE c29456BhE, int i) {
        super(1);
        this.LJLIL = c29448Bh6;
        this.LJLILLLLZI = userProfileEvent;
        this.LJLJI = c29456BhE;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        long j;
        if (bool.booleanValue()) {
            C29448Bh6 c29448Bh6 = this.LJLIL;
            C29292Bea c29292Bea = c29448Bh6.LIZLLL;
            User user = c29448Bh6.LIZIZ;
            long id = user.getId();
            String str = this.LJLILLLLZI.interactLogLabel;
            boolean LIZ = this.LJLJI.LIZ();
            int i = this.LJLJJI;
            boolean LJ = this.LJLJI.LJ();
            long j2 = 0;
            if (this.LJLIL.LIZIZ.getFollowInfo() != null) {
                j = this.LJLIL.LIZIZ.getFollowInfo().getFollowStatus();
            } else {
                j = 0;
            }
            C29448Bh6 c29448Bh62 = this.LJLIL;
            boolean z = c29448Bh62.LIZ.LJ;
            UserProfileEvent userProfileEvent = this.LJLILLLLZI;
            String str2 = userProfileEvent.mEventPage;
            boolean z2 = userProfileEvent.isFromProgrammedLiveMenu;
            boolean z3 = userProfileEvent.isFromProgrammedLiveFollowCard;
            FollowInfo followInfo = c29448Bh62.LJIIIZ;
            if (followInfo != null) {
                j2 = followInfo.getFollowStatus();
            }
            c29292Bea.LIZLLL(user, true, id, str, LIZ, i, LJ, j, z, str2, z2, z3, Long.valueOf(j2));
        } else {
            this.LJLIL.LJFF();
        }
        return C76800UCe.LIZ;
    }
}
