package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;

/* loaded from: classes6.dex */
public final class _LinkMicAudienceNoticeMessage_LinkMicAudienceTurnOnGuide_ProtoDecoder implements InterfaceC31105CIr<LinkMicAudienceNoticeMessage.LinkMicAudienceTurnOnGuide> {
    public static LinkMicAudienceNoticeMessage.LinkMicAudienceTurnOnGuide LIZIZ(Q9H q9h) {
        LinkMicAudienceNoticeMessage.LinkMicAudienceTurnOnGuide linkMicAudienceTurnOnGuide = new LinkMicAudienceNoticeMessage.LinkMicAudienceTurnOnGuide();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        linkMicAudienceTurnOnGuide.buttonContent = _LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    linkMicAudienceTurnOnGuide.content = _LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicAudienceTurnOnGuide;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkMicAudienceNoticeMessage.LinkMicAudienceTurnOnGuide LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
