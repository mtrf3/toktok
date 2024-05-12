package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.GetSharedInviteePanelResponse;

/* loaded from: classes14.dex */
public final class _GetSharedInviteePanelResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetSharedInviteePanelResponse.ResponseData> {
    public static GetSharedInviteePanelResponse.ResponseData LIZIZ(Q9H q9h) {
        GetSharedInviteePanelResponse.ResponseData responseData = new GetSharedInviteePanelResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.replyInvitationPanelInfo = _ReplyInvitationPanelInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.inviteePanelType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetSharedInviteePanelResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
