package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._BenefitRecord_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.partnership.BenefitRecordsResponse;

/* loaded from: classes17.dex */
public final class _BenefitRecordsResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BenefitRecordsResponse.ResponseData> {
    public static BenefitRecordsResponse.ResponseData LIZIZ(Q9H q9h) {
        BenefitRecordsResponse.ResponseData responseData = new BenefitRecordsResponse.ResponseData();
        responseData.benefitRecords = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.benefitRecords.add(_BenefitRecord_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BenefitRecordsResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
