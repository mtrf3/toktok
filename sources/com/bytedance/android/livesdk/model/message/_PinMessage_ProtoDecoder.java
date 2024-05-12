package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _PinMessage_ProtoDecoder implements InterfaceC31105CIr<PinMessage> {
    public static PinMessage LIZIZ(Q9H q9h) {
        PinMessage pinMessage = new PinMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        pinMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        pinMessage.chatMessage = _ChatMessage_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        pinMessage.socialMessage = _SocialMessage_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        pinMessage.giftMessage = _GiftMessage_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        pinMessage.memberMessage = _MemberMessage_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        pinMessage.likeMessage = _LikeMessage_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        switch (LJI) {
                            case 30:
                                pinMessage.method = Q9J.LIZIZ(q9h);
                                break;
                            case 31:
                                pinMessage.pinTime = q9h.LJIIJJI();
                                break;
                            case 32:
                                pinMessage.operator = _User_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 33:
                                pinMessage.action = q9h.LJIIJ();
                                break;
                            case 34:
                                pinMessage.displayDuration = q9h.LJIIJJI();
                                break;
                            case 35:
                                pinMessage.pinId = q9h.LJIIJJI();
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return pinMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PinMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
