package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._PartnershipDropsV1_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDrops_ProtoDecoder;
import webcast.api.partnership.DropsDetailResponse;

/* loaded from: classes17.dex */
public final class _DropsDetailResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<DropsDetailResponse.ResponseData> {
    public static DropsDetailResponse.ResponseData LIZIZ(Q9H q9h) {
        DropsDetailResponse.ResponseData responseData = new DropsDetailResponse.ResponseData();
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
                                responseData.canJoin = Q9J.LIZ(q9h);
                            }
                        } else {
                            responseData.priorityRegion = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        responseData.detail = _PartnershipDropsV1_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.drops = _PartnershipDrops_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DropsDetailResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}