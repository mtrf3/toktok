package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._PartnershipDropsRankItem_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.partnership.DropsRankListResponse;

/* loaded from: classes17.dex */
public final class _DropsRankListResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<DropsRankListResponse.ResponseData> {
    public static DropsRankListResponse.ResponseData LIZIZ(Q9H q9h) {
        DropsRankListResponse.ResponseData responseData = new DropsRankListResponse.ResponseData();
        responseData.rankList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.hasMore = Q9J.LIZ(q9h);
                    }
                } else {
                    responseData.rankList.add(_PartnershipDropsRankItem_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DropsRankListResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
