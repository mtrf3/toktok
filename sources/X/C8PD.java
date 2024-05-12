package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8PD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PD {
    public static boolean LIZ(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (item.getAweme() == null) {
            return false;
        }
        Aweme aweme = item.getAweme();
        if ((aweme != null && aweme.isAd() && aweme.getAwemeRawAd() != null) || item.getAweme().isHotSearchAweme() || item.getAweme().isHotVideoAweme()) {
            return false;
        }
        return true;
    }
}
