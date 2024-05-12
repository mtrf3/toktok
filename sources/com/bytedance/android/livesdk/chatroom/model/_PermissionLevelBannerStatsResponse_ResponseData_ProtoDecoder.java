package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelBannerStatsResponse;

/* loaded from: classes17.dex */
public final class _PermissionLevelBannerStatsResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelBannerStatsResponse.ResponseData> {
    public static PermissionLevelBannerStatsResponse.ResponseData LIZIZ(Q9H q9h) {
        PermissionLevelBannerStatsResponse.ResponseData responseData = new PermissionLevelBannerStatsResponse.ResponseData();
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
                                responseData.status = q9h.LJIIJ();
                            }
                        } else {
                            responseData.thresholdValue = q9h.LJIIJ();
                        }
                    } else {
                        responseData.currentValue = q9h.LJIIJ();
                    }
                } else {
                    responseData.textKey = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermissionLevelBannerStatsResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
