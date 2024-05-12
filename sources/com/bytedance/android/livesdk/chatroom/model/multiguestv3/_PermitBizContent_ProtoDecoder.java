package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _PermitBizContent_ProtoDecoder implements InterfaceC31105CIr<PermitBizContent> {
    public static PermitBizContent LIZIZ(Q9H q9h) {
        PermitBizContent permitBizContent = new PermitBizContent();
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
                                permitBizContent.operatorLinkAdminType = q9h.LJIIJ();
                            }
                        } else {
                            permitBizContent.operatorUserInfo = _User_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        permitBizContent.expireTime = q9h.LJIIJJI();
                    }
                } else {
                    permitBizContent.multiLiveAnchorPanelSettings = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return permitBizContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermitBizContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
