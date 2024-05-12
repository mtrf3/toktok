package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.message.proto.RankUser;

/* loaded from: classes17.dex */
public final class _RankUser_FollowInfo_ProtoDecoder implements InterfaceC31105CIr<RankUser.FollowInfo> {
    public static RankUser.FollowInfo LIZIZ(Q9H q9h) {
        RankUser.FollowInfo followInfo = new RankUser.FollowInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                followInfo.pushStatus = q9h.LJIIJJI();
                            }
                        } else {
                            followInfo.followStatus = q9h.LJIIJJI();
                        }
                    } else {
                        followInfo.followerCount = q9h.LJIIJJI();
                    }
                } else {
                    followInfo.followingCount = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return followInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankUser.FollowInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
