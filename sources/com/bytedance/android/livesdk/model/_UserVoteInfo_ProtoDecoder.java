package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _UserVoteInfo_ProtoDecoder implements InterfaceC31105CIr<UserVoteInfo> {
    public static UserVoteInfo LIZIZ(Q9H q9h) {
        UserVoteInfo userVoteInfo = new UserVoteInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        userVoteInfo.voteOptionIndex = (int) q9h.LJIIJJI();
                    }
                } else {
                    userVoteInfo.hasVoted = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return userVoteInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserVoteInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
