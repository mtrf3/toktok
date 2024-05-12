package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;

/* loaded from: classes6.dex */
public final class _LinkMicAudienceNoticeMessage_LinkMicAudienceInviteGuide_ProtoDecoder implements InterfaceC31105CIr<LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide> {
    public static LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide LIZIZ(Q9H q9h) {
        LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide = new LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            linkMicAudienceInviteGuide.user = _User_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        linkMicAudienceInviteGuide.buttonContent = _LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    linkMicAudienceInviteGuide.content = _LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicAudienceInviteGuide;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
