package X;

import com.ss.android.ugc.aweme.notification.followrequest.vh.NewFollowRequestViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.MWt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56951MWt extends MWY {
    public final /* synthetic */ NewFollowRequestViewHolder LIZ;

    @Override // X.MWY, X.InterfaceC51701KQv
    public final String getEnterFrom() {
        return this.LIZ.mEnterFrom;
    }

    public C56951MWt(NewFollowRequestViewHolder newFollowRequestViewHolder) {
        this.LIZ = newFollowRequestViewHolder;
    }

    @Override // X.MWY, X.InterfaceC51701KQv
    public final void LIZIZ(User user, int i) {
        if (user != null) {
            if (2 != i) {
                boolean z = true;
                if (1 != i && 4 != i) {
                    if (i != 0) {
                        return;
                    }
                    if (user.getFollowStatus() != 4) {
                        z = false;
                    }
                    C56952MWu.LIZIZ(user, z, this.LIZ.mEnterFrom);
                    return;
                }
            }
            C56952MWu.LIZ(user, this.LIZ.mEnterFrom);
        }
    }
}