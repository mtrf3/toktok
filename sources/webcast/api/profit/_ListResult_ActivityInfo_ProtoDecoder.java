package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public final class _ListResult_ActivityInfo_ProtoDecoder implements InterfaceC31105CIr<ListResult.ActivityInfo> {
    public static ListResult.ActivityInfo LIZIZ(Q9H q9h) {
        ListResult.ActivityInfo activityInfo = new ListResult.ActivityInfo();
        activityInfo.activityList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        activityInfo.activityList.add(_ListResult_ActivityDetail_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    activityInfo.isShowBanner = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return activityInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListResult.ActivityInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
