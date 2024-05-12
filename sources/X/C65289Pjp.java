package X;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.security.SecureRandom;

/* renamed from: X.Pjp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65289Pjp {
    public static final SecureRandom LJ = new SecureRandom();
    public final TwitterAuthConfig LIZ;
    public final TwitterAuthToken LIZIZ;
    public final String LIZJ;
    public final java.util.Map<String, String> LIZLLL;

    public final String LIZIZ() {
        String str;
        TwitterAuthToken twitterAuthToken = this.LIZIZ;
        if (twitterAuthToken != null) {
            str = twitterAuthToken.secret;
        } else {
            str = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C78999UzT.LJJII(this.LIZ.consumerSecret));
        LIZ.append('&');
        LIZ.append(C78999UzT.LJJII(str));
        return X1D.LIZIZ(LIZ);
    }

    public static void LIZ(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ');
            sb.append(C78999UzT.LJIJ(str));
            sb.append("=\"");
            sb.append(C78999UzT.LJIJ(str2));
            sb.append("\",");
        }
    }

    public C65289Pjp(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, java.util.Map<String, String> map) {
        this.LIZ = twitterAuthConfig;
        this.LIZIZ = twitterAuthToken;
        this.LIZJ = str;
        this.LIZLLL = map;
    }
}
