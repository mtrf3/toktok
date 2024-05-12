package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.anchor.CreatorHubGetAnchorArticleDetailResponse;

/* loaded from: classes17.dex */
public final class _CreatorHubGetAnchorArticleDetailResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<CreatorHubGetAnchorArticleDetailResponse.ResponseData> {
    public static CreatorHubGetAnchorArticleDetailResponse.ResponseData LIZIZ(Q9H q9h) {
        CreatorHubGetAnchorArticleDetailResponse.ResponseData responseData = new CreatorHubGetAnchorArticleDetailResponse.ResponseData();
        responseData.list = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.list.add(_CreatorHubAnchorArticleDetail_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CreatorHubGetAnchorArticleDetailResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
