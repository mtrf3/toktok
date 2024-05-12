package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.JZg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49372JZg {
    public static final boolean LIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() != 13 && aweme.getAwemeType() != 0 && aweme.getAwemeType() != 150 && aweme.getAwemeType() != 2 && aweme.getAwemeType() != 52 && aweme.getAwemeType() != 51 && aweme.getAwemeType() != 54 && aweme.getAwemeType() != 53 && aweme.getAwemeType() != 61 && aweme.getAwemeType() != 55 && aweme.getAwemeType() != 56 && !aweme.isAd()) {
            return false;
        }
        return true;
    }
}
