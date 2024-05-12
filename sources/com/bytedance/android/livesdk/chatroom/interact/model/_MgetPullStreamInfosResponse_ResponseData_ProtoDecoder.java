package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.MgetPullStreamInfosResponse;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _MgetPullStreamInfosResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<MgetPullStreamInfosResponse.ResponseData> {
    public static MgetPullStreamInfosResponse.ResponseData LIZIZ(Q9H q9h) {
        MgetPullStreamInfosResponse.ResponseData responseData = new MgetPullStreamInfosResponse.ResponseData();
        responseData.pullStreamInfos = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.pullStreamInfos.add(_MgetPullStreamInfosResponse_PullStreamInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MgetPullStreamInfosResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
