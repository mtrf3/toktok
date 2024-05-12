package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _GetShowRankResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetShowRankResponse.ResponseData> {
    public static GetShowRankResponse.ResponseData LIZIZ(Q9H q9h) {
        GetShowRankResponse.ResponseData responseData = new GetShowRankResponse.ResponseData();
        responseData.showRankUsers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.showRankUsers.add(_GetShowRankResponse_ShowRankUser_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetShowRankResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
