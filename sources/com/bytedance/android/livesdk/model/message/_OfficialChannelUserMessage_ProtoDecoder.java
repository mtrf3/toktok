package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _OfficialChannelUserMessage_ProtoDecoder implements InterfaceC31105CIr<OfficialChannelUserMessage> {
    @Override // X.InterfaceC31105CIr
    public final OfficialChannelUserMessage LIZ(Q9H q9h) {
        OfficialChannelUserMessage officialChannelUserMessage = new OfficialChannelUserMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            officialChannelUserMessage.maxEnterTime = q9h.LJIIJJI();
                        }
                    } else {
                        officialChannelUserMessage.startTimeStamp = q9h.LJIIJJI();
                    }
                } else {
                    officialChannelUserMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return officialChannelUserMessage;
            }
        }
    }
}
