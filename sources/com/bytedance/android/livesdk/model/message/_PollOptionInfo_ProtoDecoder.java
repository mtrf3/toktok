package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._VoteUser_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _PollOptionInfo_ProtoDecoder implements InterfaceC31105CIr<PollOptionInfo> {
    public static PollOptionInfo LIZIZ(Q9H q9h) {
        PollOptionInfo pollOptionInfo = new PollOptionInfo();
        pollOptionInfo.voteUserList = new ArrayList();
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
                                pollOptionInfo.voteUserList.add(_VoteUser_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            pollOptionInfo.optionIndex = (int) q9h.LJIIJJI();
                        }
                    } else {
                        pollOptionInfo.displayContent = Q9J.LIZIZ(q9h);
                    }
                } else {
                    pollOptionInfo.votes = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return pollOptionInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PollOptionInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
