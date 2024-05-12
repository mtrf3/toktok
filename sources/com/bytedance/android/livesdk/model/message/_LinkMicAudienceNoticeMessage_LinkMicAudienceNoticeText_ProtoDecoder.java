package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;

/* loaded from: classes6.dex */
public final class _LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder implements InterfaceC31105CIr<LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText> {
    public static LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText LIZIZ(Q9H q9h) {
        LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText linkMicAudienceNoticeText = new LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    linkMicAudienceNoticeText.text = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicAudienceNoticeText;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
