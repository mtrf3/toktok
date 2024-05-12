package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _PollUpdateVotesContent_ProtoDecoder implements InterfaceC31105CIr<PollUpdateVotesContent> {
    public static PollUpdateVotesContent LIZIZ(Q9H q9h) {
        PollUpdateVotesContent pollUpdateVotesContent = new PollUpdateVotesContent();
        pollUpdateVotesContent.optionList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    Q9J.LIZJ(q9h);
                } else {
                    pollUpdateVotesContent.optionList.add(_PollOptionInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return pollUpdateVotesContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PollUpdateVotesContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
