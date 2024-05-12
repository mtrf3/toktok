package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.ActivityBannerResponse;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _ActivityBannerResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<ActivityBannerResponse.ResponseData> {
    public static ActivityBannerResponse.ResponseData LIZIZ(Q9H q9h) {
        ActivityBannerResponse.ResponseData responseData = new ActivityBannerResponse.ResponseData();
        responseData.inRoomMultiGuestBanner = new ArrayList();
        responseData.banner = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.inRoomMultiGuestBanner.add(_InRoomMultiGuestBanner_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    responseData.banner.add(_ActivityBannerResponse_BannerInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ActivityBannerResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
