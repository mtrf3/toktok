package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.GetLeaveLinkmicPanelResponse;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _GetLeaveLinkmicPanelResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetLeaveLinkmicPanelResponse.ResponseData> {
    public static GetLeaveLinkmicPanelResponse.ResponseData LIZIZ(Q9H q9h) {
        GetLeaveLinkmicPanelResponse.ResponseData responseData = new GetLeaveLinkmicPanelResponse.ResponseData();
        responseData.suggestUser = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        responseData.viewers = q9h.LJIIJJI();
                        break;
                    case 2:
                        responseData.gifters = q9h.LJIIJJI();
                        break;
                    case 3:
                        responseData.fanTicket = q9h.LJIIJJI();
                        break;
                    case 4:
                        responseData.newFollowers = q9h.LJIIJJI();
                        break;
                    case 5:
                        responseData.suggestUser.add(_LeaveLinkmicPanelSuggestUser_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 6:
                        responseData.linkBeginTime = q9h.LJIIJJI();
                        break;
                    case 7:
                        responseData.linkEndTime = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetLeaveLinkmicPanelResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
