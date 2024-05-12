package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.game.SearchTagResponse;

/* loaded from: classes6.dex */
public final class _SearchTagResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<SearchTagResponse.ResponseData> {
    public static SearchTagResponse.ResponseData LIZIZ(Q9H q9h) {
        SearchTagResponse.ResponseData responseData = new SearchTagResponse.ResponseData();
        responseData.resultList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.isEnd = Q9J.LIZ(q9h);
                        }
                    } else {
                        responseData.resultList.add(_GameTagSearchResult_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    responseData.searchId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SearchTagResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
