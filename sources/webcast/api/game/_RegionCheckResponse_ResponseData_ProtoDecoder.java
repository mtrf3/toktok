package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.RegionCheckResponse;

/* loaded from: classes17.dex */
public final class _RegionCheckResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<RegionCheckResponse.ResponseData> {
    public static RegionCheckResponse.ResponseData LIZIZ(Q9H q9h) {
        RegionCheckResponse.ResponseData responseData = new RegionCheckResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.priorityRegion = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        responseData.ttpRegionType = q9h.LJIIJJI();
                    }
                } else {
                    responseData.storeRegion = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RegionCheckResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
