package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SS3 {
    public static String LIZ(String str) {
        if (str.length() != 0) {
            str = UriProtector.parse(str).buildUpon().appendQueryParameter("bundle_webview_background", "ffffff").build().toString();
        }
        o.LJIIIIZZ(str, "if (!url.isNullOrEmpty()…            url\n        }");
        return str;
    }

    public static boolean LIZJ(Challenge challenge) {
        if (!TextUtils.isEmpty(challenge.getLinkText()) && !TextUtils.isEmpty(challenge.getLinkAction())) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Challenge challenge) {
        if (!TextUtils.isEmpty(challenge.getRuleDetailDesc()) && !TextUtils.isEmpty(challenge.getRuleDetailDesc())) {
            return true;
        }
        return false;
    }

    public static boolean LJ(Challenge challenge) {
        ChallengeDisclaimer challengeDisclaimer = challenge.getChallengeDisclaimer();
        if (challengeDisclaimer == null || TextUtils.isEmpty(challengeDisclaimer.getTitle()) || TextUtils.isEmpty(challengeDisclaimer.getContent())) {
            return false;
        }
        return true;
    }

    public static String LIZIZ(String url, String str, String str2) {
        o.LJIIIZ(url, "url");
        if (url.length() != 0) {
            url = UriProtector.parse(url).buildUpon().appendQueryParameter("commerce_enter_from", str).appendQueryParameter("challenge_id", str2).build().toString();
        }
        o.LJIIIIZZ(url, "if (!url.isNullOrEmpty()…            url\n        }");
        return url;
    }
}
