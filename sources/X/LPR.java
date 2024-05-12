package X;

import com.ss.android.ugc.aweme.commercialize.feed.slide.guide.MainPageSlideImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LPR {
    public static boolean LIZ;

    public static final void LIZIZ(String msg) {
        o.LJIIIZ(msg, "msg");
    }

    public static final boolean LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        boolean z = MainPageSlideImpl.LIZIZ().LIZ(aweme).LIZ;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isEnableLeftSlideGuide() || z) {
            return false;
        }
        return true;
    }
}
