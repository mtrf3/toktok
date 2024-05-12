package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CreatorHubAnchorArticleDetail_ProtoDecoder implements InterfaceC31105CIr<CreatorHubAnchorArticleDetail> {
    public static CreatorHubAnchorArticleDetail LIZIZ(Q9H q9h) {
        CreatorHubAnchorArticleDetail creatorHubAnchorArticleDetail = new CreatorHubAnchorArticleDetail();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        creatorHubAnchorArticleDetail.isRead = Q9J.LIZ(q9h);
                    }
                } else {
                    creatorHubAnchorArticleDetail.articleId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return creatorHubAnchorArticleDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CreatorHubAnchorArticleDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
