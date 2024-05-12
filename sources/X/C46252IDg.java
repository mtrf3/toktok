package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: X.IDg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46252IDg {
    public static boolean LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isEnableVideoResume()) {
            return false;
        }
        return true;
    }
}
