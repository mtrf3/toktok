package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8ML, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8ML {
    public static boolean LIZ(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (LIZIZ(item) || item.getAweme().shouldShowReviewStatus() || C220858ld.LJII(item.getAweme())) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            return aweme.isProhibitedAndShouldTell();
        }
        return false;
    }
}
