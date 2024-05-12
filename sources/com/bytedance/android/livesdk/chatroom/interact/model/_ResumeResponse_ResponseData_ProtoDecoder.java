package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.ResumeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostListUser_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _ResumeResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<ResumeResponse.ResponseData> {
    public static ResumeResponse.ResponseData LIZIZ(Q9H q9h) {
        ResumeResponse.ResponseData responseData = new ResumeResponse.ResponseData();
        responseData.users = new ArrayList();
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
                                    responseData.channelId = q9h.LJIIJJI();
                                }
                            } else {
                                responseData.totalPositionCount = q9h.LJIIJJI();
                            }
                        } else {
                            responseData.users.add(_CohostListUser_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        responseData.isResume = Q9J.LIZ(q9h);
                    }
                } else {
                    responseData.rtcExtInfo = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ResumeResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
