package X;

import com.ss.android.ugc.aweme.ecommerce.video.api.VideoRecommendApi;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedRequest;

/* renamed from: X.LvF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55805LvF {
    public static final /* synthetic */ C55805LvF LIZ = new C55805LvF();
    public static final InterfaceC789838c LIZIZ = C40084FoG.LIZIZ("https://oec-api.tiktokv.com/");

    public static AbstractC73672Svk LIZ(CommonFeedRequest commonFeedRequest) {
        return ((VideoRecommendApi) LIZIZ.create(VideoRecommendApi.class)).queryVideoRecommendation(commonFeedRequest);
    }
}
