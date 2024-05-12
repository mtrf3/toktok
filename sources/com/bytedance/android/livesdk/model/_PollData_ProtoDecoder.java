package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PollOptionInfo_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _PollData_ProtoDecoder implements InterfaceC31105CIr<PollData> {
    public static PollData LIZIZ(Q9H q9h) {
        PollData pollData = new PollData();
        pollData.pollOptionList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        pollData.pollId = q9h.LJIIJJI();
                        break;
                    case 2:
                        pollData.pollStatus = q9h.LJIIJ();
                        break;
                    case 3:
                        pollData.startTime = q9h.LJIIJJI();
                        break;
                    case 4:
                        pollData.endTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        pollData.pollOptionList.add(_PollOptionInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 6:
                        pollData.pollKind = q9h.LJIIJ();
                        break;
                    case 7:
                        pollData.title = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        pollData.operator = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        pollData.templateId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return pollData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PollData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
