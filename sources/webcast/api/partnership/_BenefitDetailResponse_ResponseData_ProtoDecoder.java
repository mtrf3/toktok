package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._BenefitDetail_ProtoDecoder;
import webcast.api.partnership.BenefitDetailResponse;

/* loaded from: classes17.dex */
public final class _BenefitDetailResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BenefitDetailResponse.ResponseData> {
    public static BenefitDetailResponse.ResponseData LIZIZ(Q9H q9h) {
        BenefitDetailResponse.ResponseData responseData = new BenefitDetailResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.benefitDetail = _BenefitDetail_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BenefitDetailResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
