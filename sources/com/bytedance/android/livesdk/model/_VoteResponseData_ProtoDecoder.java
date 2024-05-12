package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PollOptionInfo_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _VoteResponseData_ProtoDecoder implements InterfaceC31105CIr<VoteResponseData> {
    @Override // X.InterfaceC31105CIr
    public final VoteResponseData LIZ(Q9H q9h) {
        VoteResponseData voteResponseData = new VoteResponseData();
        voteResponseData.optionList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        voteResponseData.commentBanned = Q9J.LIZ(q9h);
                    }
                } else {
                    voteResponseData.optionList.add(_PollOptionInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return voteResponseData;
            }
        }
    }
}
