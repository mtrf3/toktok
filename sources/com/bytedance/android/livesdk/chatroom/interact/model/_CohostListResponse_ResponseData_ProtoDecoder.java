package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostListResponse;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostListUser_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _CohostListResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<CohostListResponse.ResponseData> {
    public static CohostListResponse.ResponseData LIZIZ(Q9H q9h) {
        CohostListResponse.ResponseData responseData = new CohostListResponse.ResponseData();
        responseData.users = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.users.add(_CohostListUser_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        responseData.groupChannelId = q9h.LJIIJJI();
                    }
                } else {
                    responseData.totalPositionCount = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CohostListResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
