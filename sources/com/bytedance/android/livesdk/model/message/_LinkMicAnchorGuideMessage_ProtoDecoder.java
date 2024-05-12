package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _LinkMicAnchorGuideMessage_ProtoDecoder implements InterfaceC31105CIr<LinkMicAnchorGuideMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkMicAnchorGuideMessage LIZ(Q9H q9h) {
        LinkMicAnchorGuideMessage linkMicAnchorGuideMessage = new LinkMicAnchorGuideMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 21) {
                    if (LJI != 22) {
                        switch (LJI) {
                            case 1:
                                linkMicAnchorGuideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 2:
                                linkMicAnchorGuideMessage.guideContent = Q9J.LIZIZ(q9h);
                                break;
                            case 3:
                                linkMicAnchorGuideMessage.buttonContent = Q9J.LIZIZ(q9h);
                                break;
                            case 4:
                                linkMicAnchorGuideMessage.connectType = q9h.LJIIJ();
                                break;
                            case 5:
                                linkMicAnchorGuideMessage.guideType = q9h.LJIIJ();
                                break;
                            case 6:
                                linkMicAnchorGuideMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 7:
                                linkMicAnchorGuideMessage.logId = Q9J.LIZIZ(q9h);
                                break;
                            case 8:
                                linkMicAnchorGuideMessage.reserveInfo = _ReserveInfo_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 9:
                                linkMicAnchorGuideMessage.buttonShowType = q9h.LJIIJ();
                                break;
                            case 10:
                                linkMicAnchorGuideMessage.optPairInfo = _OptPairInfo_ProtoDecoder.LIZIZ(q9h);
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                    } else {
                        linkMicAnchorGuideMessage.availableFriendNumber = (int) q9h.LJIIJJI();
                    }
                } else {
                    linkMicAnchorGuideMessage.isFollowRival = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicAnchorGuideMessage;
            }
        }
    }
}
