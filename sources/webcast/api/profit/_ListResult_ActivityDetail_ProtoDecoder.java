package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public final class _ListResult_ActivityDetail_ProtoDecoder implements InterfaceC31105CIr<ListResult.ActivityDetail> {
    public static ListResult.ActivityDetail LIZIZ(Q9H q9h) {
        ListResult.ActivityDetail activityDetail = new ListResult.ActivityDetail();
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
                                    activityDetail.endTime = q9h.LJIIJJI();
                                }
                            } else {
                                activityDetail.startTime = q9h.LJIIJJI();
                            }
                        } else {
                            activityDetail.activityImage = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        activityDetail.activityMainPath = Q9J.LIZIZ(q9h);
                    }
                } else {
                    activityDetail.activityId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return activityDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListResult.ActivityDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
