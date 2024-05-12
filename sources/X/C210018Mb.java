package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.8Mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210018Mb {
    public static boolean LIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (!C78996UzQ.LJJIJIL(aweme)) {
            return false;
        }
        String url = aweme.getAwemeRiskModel().getUrl();
        if ((url != null && url.length() != 0) || aweme.isAd()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (LIZ(aweme) && C210428Nq.LIZ()) {
            return true;
        }
        return false;
    }
}
