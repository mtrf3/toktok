package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _BarrageMessage_ProtoDecoder implements InterfaceC31105CIr<BarrageMessage> {
    @Override // X.InterfaceC31105CIr
    public final BarrageMessage LIZ(Q9H q9h) {
        BarrageMessage barrageMessage = new BarrageMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        barrageMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        barrageMessage.event = _BarrageMessage_BarrageEvent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        barrageMessage.msgType = q9h.LJIIJ();
                        break;
                    case 4:
                        barrageMessage.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        barrageMessage.content = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        barrageMessage.duration = q9h.LJIIJJI();
                        break;
                    case 7:
                        barrageMessage.backGround = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        barrageMessage.rightIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        barrageMessage.displayConfig = q9h.LJIIJ();
                        break;
                    default:
                        switch (LJI) {
                            case 100:
                                barrageMessage.userGradeParam = _BarrageTypeUserGradeParam_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 101:
                                barrageMessage.fansLevelParam = _BarrageTypeFansLevelParam_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 102:
                                barrageMessage.subscribeGiftParam = _BarrageTypeSubscribeGiftParam_ProtoDecoder.LIZIZ(q9h);
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return barrageMessage;
            }
        }
    }
}
