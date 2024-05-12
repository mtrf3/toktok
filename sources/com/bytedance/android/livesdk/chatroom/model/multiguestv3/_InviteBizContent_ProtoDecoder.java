package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _InviteBizContent_ProtoDecoder implements InterfaceC31105CIr<InviteBizContent> {
    public static InviteBizContent LIZIZ(Q9H q9h) {
        InviteBizContent inviteBizContent = new InviteBizContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    inviteBizContent.inviteeUserInfo = _User_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                inviteBizContent.operatorLinkAdminType = q9h.LJIIJ();
                            }
                        } else {
                            inviteBizContent.operatorUserInfo = _User_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        inviteBizContent.inviteSource = q9h.LJIIJ();
                    }
                } else {
                    inviteBizContent.multiLiveAnchorPanelSettings = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return inviteBizContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final InviteBizContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
