package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CreatorHubGetAnchorArticleDetailResponse_ProtoDecoder implements InterfaceC31105CIr<CreatorHubGetAnchorArticleDetailResponse> {
    @Override // X.InterfaceC31105CIr
    public final CreatorHubGetAnchorArticleDetailResponse LIZ(Q9H q9h) {
        CreatorHubGetAnchorArticleDetailResponse creatorHubGetAnchorArticleDetailResponse = new CreatorHubGetAnchorArticleDetailResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    creatorHubGetAnchorArticleDetailResponse.data = _CreatorHubGetAnchorArticleDetailResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return creatorHubGetAnchorArticleDetailResponse;
            }
        }
    }
}
