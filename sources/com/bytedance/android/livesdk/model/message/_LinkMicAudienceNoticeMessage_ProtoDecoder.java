package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _LinkMicAudienceNoticeMessage_ProtoDecoder implements InterfaceC31105CIr<LinkMicAudienceNoticeMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkMicAudienceNoticeMessage LIZ(Q9H q9h) {
        LinkMicAudienceNoticeMessage linkMicAudienceNoticeMessage = new LinkMicAudienceNoticeMessage();
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
                                linkMicAudienceNoticeMessage.inviteGuide = _LinkMicAudienceNoticeMessage_LinkMicAudienceInviteGuide_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            linkMicAudienceNoticeMessage.turnOnGuide = _LinkMicAudienceNoticeMessage_LinkMicAudienceTurnOnGuide_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        linkMicAudienceNoticeMessage.noticeType = q9h.LJIIJ();
                    }
                } else {
                    linkMicAudienceNoticeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicAudienceNoticeMessage;
            }
        }
    }
}
