package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileAudienceOperationCell;
import com.bytedance.android.livesdk.usercard.profilev3.UserCardPreloadViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.BeI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29274BeI implements InterfaceC29613Bjl {
    public final /* synthetic */ LiveProfileAudienceOperationCell LIZ;

    @Override // X.InterfaceC29613Bjl
    public final void LIZIZ() {
    }

    public C29274BeI(LiveProfileAudienceOperationCell liveProfileAudienceOperationCell) {
        this.LIZ = liveProfileAudienceOperationCell;
    }

    @Override // X.InterfaceC29613Bjl
    public final void LIZ(int i) {
        long j = i;
        this.LIZ.LJIILLIIL(j);
        User user = this.LIZ.LJLLL;
        if (user != null) {
            FollowInfo followInfo = user.getFollowInfo();
            if (followInfo != null) {
                followInfo.setPushStatus(j);
            }
            UserCardPreloadViewModel userCardPreloadViewModel = this.LIZ.LJZ;
            if (userCardPreloadViewModel != null) {
                User user2 = userCardPreloadViewModel.LJLIL;
                if (user2 == null || userCardPreloadViewModel.LJLILLLLZI) {
                    userCardPreloadViewModel.LJLJJI = i;
                    if (user2 == null) {
                        return;
                    }
                }
                FollowInfo followInfo2 = user2.getFollowInfo();
                if (followInfo2 == null) {
                    return;
                }
                followInfo2.setPushStatus(j);
                return;
            }
            return;
        }
        o.LJIJI("targetUser");
        throw null;
    }
}
