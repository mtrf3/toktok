package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _AudienceReserveUserStateMessage_ProtoDecoder implements InterfaceC31105CIr<AudienceReserveUserStateMessage> {
    @Override // X.InterfaceC31105CIr
    public final AudienceReserveUserStateMessage LIZ(Q9H q9h) {
        AudienceReserveUserStateMessage audienceReserveUserStateMessage = new AudienceReserveUserStateMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                switch (LJI) {
                                    case 100:
                                        audienceReserveUserStateMessage.audienceReserveContent = _AudienceReserveContent_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 101:
                                        audienceReserveUserStateMessage.audienceCancelContent = _AudienceCancelContent_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 102:
                                        audienceReserveUserStateMessage.audienceReplyContent = _AudienceReplyContent_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    default:
                                        Q9J.LIZJ(q9h);
                                        break;
                                }
                            } else {
                                audienceReserveUserStateMessage.audienceReserveUserInfo = _AudienceReserveUserInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            audienceReserveUserStateMessage.type = q9h.LJIIJ();
                        }
                    } else {
                        audienceReserveUserStateMessage.roomId = q9h.LJIIJJI();
                    }
                } else {
                    audienceReserveUserStateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return audienceReserveUserStateMessage;
            }
        }
    }
}
