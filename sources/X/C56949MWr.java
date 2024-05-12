package X;

import android.content.Context;
import com.ss.android.ugc.aweme.notification.followrequest.vh.NewFollowRequestViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.MWr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56949MWr implements InterfaceC51703KQx {
    public final /* synthetic */ User LIZ;
    public final /* synthetic */ NewFollowRequestViewHolder LIZIZ;

    public C56949MWr(User user, NewFollowRequestViewHolder newFollowRequestViewHolder) {
        this.LIZ = user;
        this.LIZIZ = newFollowRequestViewHolder;
    }

    @Override // X.InterfaceC51703KQx
    public final boolean LIZ() {
        EnumC57365MfJ enumC57365MfJ;
        if (AXU.LIZJ(this.LIZ)) {
            if (this.LIZ.getFollowStatus() == EnumC57435MgR.UNFOLLOW.ordinal()) {
                enumC57365MfJ = EnumC57365MfJ.FOLLOW;
            } else {
                enumC57365MfJ = EnumC57365MfJ.ENTER_CHAT;
            }
            C57362MfG c57362MfG = new C57362MfG();
            c57362MfG.LJJJJIZL(this.LIZ);
            c57362MfG.LJJIIZI("notification_page");
            c57362MfG.LJJJ("follow_request");
            c57362MfG.LJJLIIIIJ = enumC57365MfJ;
            c57362MfG.LJJLI = EnumC57366MfK.RELATION_LABEL;
            c57362MfG.LJJJJI();
            c57362MfG.LJIILIIL();
        }
        Context context = this.LIZIZ.itemView.getContext();
        NewFollowRequestViewHolder newFollowRequestViewHolder = this.LIZIZ;
        User user = newFollowRequestViewHolder.mUser;
        String str = newFollowRequestViewHolder.mEnterFrom;
        newFollowRequestViewHolder.mFollowButton.getClass();
        return C112714bb.LIZ(context, user, str, null, !C78966Uyw.LJJIJ().LIZIZ(), 24);
    }
}
