package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NGP {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Aweme aweme, m mVar) {
        String str;
        String str2;
        String str3 = null;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                JSONObject frontendData = awemeRawAd.getFrontendData();
                if (frontendData != null) {
                    str = frontendData.toString();
                } else {
                    str = null;
                }
                mVar.LJJIIZ("frontendData", str);
                NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str2 = nativeSiteConfig.getLynxScheme();
                } else {
                    str2 = null;
                }
                mVar.LJJIIZ("lynxSchema", str2);
            }
            User author = aweme.getAuthor();
            if (author != null) {
                str3 = author.getNickname();
            }
        }
        mVar.LJJIIZ("accountName", str3);
    }
}
