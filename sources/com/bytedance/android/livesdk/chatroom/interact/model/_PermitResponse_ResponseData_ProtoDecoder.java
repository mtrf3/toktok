package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.PermitResponse;

/* loaded from: classes14.dex */
public final class _PermitResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<PermitResponse.ResponseData> {
    public static PermitResponse.ResponseData LIZIZ(Q9H q9h) {
        PermitResponse.ResponseData responseData = new PermitResponse.ResponseData();
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
                                    responseData.actionId = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                responseData.rtcExtInfo = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            responseData.rivalLinkmicIdStr = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        responseData.linkmicIdStr = Q9J.LIZIZ(q9h);
                    }
                } else {
                    responseData.channelId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermitResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
