package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.profit.ListResult;

/* loaded from: classes17.dex */
public final class _ListResult_WebDisplayData_ProtoDecoder implements InterfaceC31105CIr<ListResult.WebDisplayData> {
    public static ListResult.WebDisplayData LIZIZ(Q9H q9h) {
        ListResult.WebDisplayData webDisplayData = new ListResult.WebDisplayData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            webDisplayData.displaySubMessage = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        webDisplayData.displaySchema = Q9J.LIZIZ(q9h);
                    }
                } else {
                    webDisplayData.displayMessage = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return webDisplayData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListResult.WebDisplayData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
