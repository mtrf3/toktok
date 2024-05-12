package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.HostCheckOtherAudienceMultiGuestPermissionResponse;

/* loaded from: classes6.dex */
public final class _HostCheckOtherAudienceMultiGuestPermissionResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<HostCheckOtherAudienceMultiGuestPermissionResponse.ResponseData> {
    public static HostCheckOtherAudienceMultiGuestPermissionResponse.ResponseData LIZIZ(Q9H q9h) {
        HostCheckOtherAudienceMultiGuestPermissionResponse.ResponseData responseData = new HostCheckOtherAudienceMultiGuestPermissionResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.otherPermissionInfo = _MultiGuestPermissionInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final HostCheckOtherAudienceMultiGuestPermissionResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
