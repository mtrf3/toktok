package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _FeedV2Response_ProtoDecoder implements InterfaceC31105CIr<FeedV2Response> {
    @Override // X.InterfaceC31105CIr
    public final FeedV2Response LIZ(Q9H q9h) {
        FeedV2Response feedV2Response = new FeedV2Response();
        feedV2Response.awemeList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 4) {
                    if (LJI != 5) {
                        if (LJI != 9) {
                            if (LJI != 10) {
                                Q9J.LIZJ(q9h);
                            } else {
                                feedV2Response.logPb = _LogPbStructV2_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            feedV2Response.extra = _ExtraStructV2_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        feedV2Response.awemeList.add(_AwemeStructV2_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    feedV2Response.hasMore = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return feedV2Response;
            }
        }
    }
}
