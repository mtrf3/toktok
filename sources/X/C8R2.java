package X;

import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.8R2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8R2 {
    public static boolean LIZ(VideoItemParams item) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        o.LJIIIZ(item, "item");
        BaseFeedPageParams baseFeedPageParams = item.baseFeedPageParams;
        if (baseFeedPageParams == null || !AV1.LJIJ(item.getAweme().getAuthor()) || item.getAweme().isAd() || item.getAweme().getAwemeRawAd() != null || (((commerceVideoAuthInfo = item.getAweme().getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isPreventSelfSee()) || item.getAweme().getStarAtlasOrderId() > 0)) {
            return false;
        }
        if (!baseFeedPageParams.isMyProfile && !o.LJ(baseFeedPageParams.eventType, "notification_page")) {
            return false;
        }
        C8R4 surveyAfterPostService = AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService();
        o.LJIIIIZZ(surveyAfterPostService, "get().getService(IExtern…().surveyAfterPostService");
        String aid = item.getAweme().getAid();
        if (aid == null) {
            return false;
        }
        return surveyAfterPostService.shouldShowAuthorSurveyInVideoPlayer(aid);
    }
}
