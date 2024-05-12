package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchResp;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _AutoMatchResp_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AutoMatchResp.ResponseData> {
    public static AutoMatchResp.ResponseData LIZIZ(Q9H q9h) {
        AutoMatchResp.ResponseData responseData = new AutoMatchResp.ResponseData();
        responseData.avatars = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.avatars.add(_ImageModel_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    responseData.settings = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AutoMatchResp.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
