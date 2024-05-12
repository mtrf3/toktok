package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PollInfo_ProtoDecoder implements InterfaceC31105CIr<PollInfo> {
    public static PollInfo LIZIZ(Q9H q9h) {
        PollInfo pollInfo = new PollInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        pollInfo.userVoteInfo = _UserVoteInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    pollInfo.pollData = _PollData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return pollInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PollInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
