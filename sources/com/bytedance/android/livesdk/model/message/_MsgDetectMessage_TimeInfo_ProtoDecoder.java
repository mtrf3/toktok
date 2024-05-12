package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.MsgDetectMessage;

/* loaded from: classes14.dex */
public final class _MsgDetectMessage_TimeInfo_ProtoDecoder implements InterfaceC31105CIr<MsgDetectMessage.TimeInfo> {
    public static MsgDetectMessage.TimeInfo LIZIZ(Q9H q9h) {
        MsgDetectMessage.TimeInfo timeInfo = new MsgDetectMessage.TimeInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            timeInfo.apiSendToGoimMs = q9h.LJIIJJI();
                        }
                    } else {
                        timeInfo.apiRecvTimeMs = q9h.LJIIJJI();
                    }
                } else {
                    timeInfo.clientStartMs = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return timeInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MsgDetectMessage.TimeInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
