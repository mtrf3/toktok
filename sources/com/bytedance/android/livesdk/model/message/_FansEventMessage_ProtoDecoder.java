package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import webcast.data._FansLevelInfo_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _FansEventMessage_ProtoDecoder implements InterfaceC31105CIr<FansEventMessage> {
    @Override // X.InterfaceC31105CIr
    public final FansEventMessage LIZ(Q9H q9h) {
        FansEventMessage fansEventMessage = new FansEventMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 11) {
                            if (LJI != 12) {
                                if (LJI != 21) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    fansEventMessage.data = _FansEventData_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                fansEventMessage.fansLevelInfo = _FansLevelInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            fansEventMessage.eventType = q9h.LJIIJ();
                        }
                    } else {
                        fansEventMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    fansEventMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansEventMessage;
            }
        }
    }
}
