package X;

import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import kotlin.jvm.internal.o;

/* renamed from: X.838, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass838 {
    public static boolean LIZ(Aweme aweme, BaseFeedPageParams baseFeedPageParams) {
        o.LJIIIZ(baseFeedPageParams, "<this>");
        return CommentServiceImpl.LJJL().LJJIII(baseFeedPageParams.param, aweme, Boolean.valueOf(baseFeedPageParams.isMyProfile), Integer.valueOf(baseFeedPageParams.pageType), baseFeedPageParams.eventType);
    }
}
