package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _UserIdentity_ProtoDecoder implements InterfaceC31105CIr<UserIdentity> {
    public static UserIdentity LIZIZ(Q9H q9h) {
        UserIdentity userIdentity = new UserIdentity();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        userIdentity.isGiftGiverOfAnchor = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        userIdentity.isSubscriberOfAnchor = Q9J.LIZ(q9h);
                        break;
                    case 3:
                        userIdentity.isMutualFollowingWithAnchor = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        userIdentity.isFollowerOfAnchor = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        userIdentity.isModeratorOfAnchor = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        userIdentity.isAnchor = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return userIdentity;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserIdentity LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
