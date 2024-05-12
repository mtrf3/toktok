package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _RoomPushMessage_ProtoDecoder implements InterfaceC31105CIr<RoomPushMessage> {
    @Override // X.InterfaceC31105CIr
    public final RoomPushMessage LIZ(Q9H q9h) {
        RoomPushMessage roomPushMessage = new RoomPushMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 3) {
                        if (LJI != 6) {
                            if (LJI != 7) {
                                if (LJI != 8) {
                                    switch (LJI) {
                                        case 10:
                                            roomPushMessage.actionIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                            roomPushMessage.newBackgroundImage = _FlexImageModel_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 12:
                                            roomPushMessage.source = Q9J.LIZIZ(q9h);
                                            break;
                                        default:
                                            Q9J.LIZJ(q9h);
                                            break;
                                    }
                                } else {
                                    roomPushMessage.pushDisplayTime = q9h.LJIIJJI();
                                }
                            } else {
                                roomPushMessage.actionType = String.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            roomPushMessage.actionContent = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        roomPushMessage.color = Q9J.LIZIZ(q9h);
                    }
                } else {
                    roomPushMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return roomPushMessage;
            }
        }
    }
}
