package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _HostCheckOtherAudienceMultiGuestPermissionResponse_ProtoDecoder implements InterfaceC31105CIr<HostCheckOtherAudienceMultiGuestPermissionResponse> {
    @Override // X.InterfaceC31105CIr
    public final HostCheckOtherAudienceMultiGuestPermissionResponse LIZ(Q9H q9h) {
        HostCheckOtherAudienceMultiGuestPermissionResponse hostCheckOtherAudienceMultiGuestPermissionResponse = new HostCheckOtherAudienceMultiGuestPermissionResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        hostCheckOtherAudienceMultiGuestPermissionResponse.extra = _HostCheckOtherAudienceMultiGuestPermissionResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    hostCheckOtherAudienceMultiGuestPermissionResponse.data = _HostCheckOtherAudienceMultiGuestPermissionResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return hostCheckOtherAudienceMultiGuestPermissionResponse;
            }
        }
    }
}