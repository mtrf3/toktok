package X;

import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import kotlin.jvm.internal.o;

/* renamed from: X.7Jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183877Jn {
    public static String LIZ(BaseFeedPageParams baseFeedPageParams) {
        o.LJIIIZ(baseFeedPageParams, "<this>");
        boolean LJ = o.LJ(baseFeedPageParams.eventType, "notification_page");
        String upvoteId = baseFeedPageParams.param.getUpvoteId();
        if ((upvoteId == null || upvoteId.length() == 0) && LJ) {
            return baseFeedPageParams.param.getCid();
        }
        return baseFeedPageParams.param.getUpvoteId();
    }
}
