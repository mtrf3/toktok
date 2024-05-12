package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.game.ListSugPollResponse;

/* loaded from: classes16.dex */
public final class _ListSugPollResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<ListSugPollResponse.ResponseData> {
    public static ListSugPollResponse.ResponseData LIZIZ(Q9H q9h) {
        ListSugPollResponse.ResponseData responseData = new ListSugPollResponse.ResponseData();
        responseData.sugPollTitles = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.sugPollTitles.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListSugPollResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
