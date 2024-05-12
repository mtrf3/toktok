package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ReplyInvitationPanelInfo_ProtoDecoder implements InterfaceC31105CIr<ReplyInvitationPanelInfo> {
    public static ReplyInvitationPanelInfo LIZIZ(Q9H q9h) {
        ReplyInvitationPanelInfo replyInvitationPanelInfo = new ReplyInvitationPanelInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        replyInvitationPanelInfo.layoutId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    replyInvitationPanelInfo.anchorSettingInfo = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return replyInvitationPanelInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReplyInvitationPanelInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
