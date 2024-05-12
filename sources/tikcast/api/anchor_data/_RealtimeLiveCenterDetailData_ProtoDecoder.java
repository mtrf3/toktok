package tikcast.api.anchor_data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.data._RealtimeLiveCenterBaseData_ProtoDecoder;
import webcast.data._RealtimeLiveCenterShopData_ProtoDecoder;
import webcast.data._RealtimeLiveCenterTips_ProtoDecoder;
import webcast.data._RealtimeViolationRecord_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _RealtimeLiveCenterDetailData_ProtoDecoder implements InterfaceC31105CIr<RealtimeLiveCenterDetailData> {
    public static RealtimeLiveCenterDetailData LIZIZ(Q9H q9h) {
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData = new RealtimeLiveCenterDetailData();
        realtimeLiveCenterDetailData.violationRecords = new ArrayList();
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
                                    realtimeLiveCenterDetailData.violationRecords.add(_RealtimeViolationRecord_ProtoDecoder.LIZIZ(q9h));
                                }
                            } else {
                                realtimeLiveCenterDetailData.shopInfo = _RealtimeLiveCenterShopData_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            realtimeLiveCenterDetailData.tipsInfo = _RealtimeLiveCenterTips_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        realtimeLiveCenterDetailData.baseInfo = _RealtimeLiveCenterBaseData_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    realtimeLiveCenterDetailData.roomId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return realtimeLiveCenterDetailData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RealtimeLiveCenterDetailData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
