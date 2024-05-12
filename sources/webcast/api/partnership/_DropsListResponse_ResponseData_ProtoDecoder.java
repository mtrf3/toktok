package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._PartnershipBriefDrops_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsV1_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.partnership.DropsListResponse;

/* loaded from: classes17.dex */
public final class _DropsListResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<DropsListResponse.ResponseData> {
    public static DropsListResponse.ResponseData LIZIZ(Q9H q9h) {
        DropsListResponse.ResponseData responseData = new DropsListResponse.ResponseData();
        responseData.otherList = new ArrayList();
        responseData.drops = new ArrayList();
        responseData.joinableList = new ArrayList();
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
                                    responseData.priorityRegion = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                responseData.total = q9h.LJIIJJI();
                            }
                        } else {
                            responseData.drops.add(_PartnershipDropsV1_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        responseData.otherList.add(_PartnershipBriefDrops_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    responseData.joinableList.add(_PartnershipBriefDrops_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DropsListResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
