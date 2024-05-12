package X;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NGJ {
    public static final /* synthetic */ int LIZ = 0;

    public static m LIZ(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String str;
        m LIZ2 = NG2.LIZ(context, aweme);
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            JSONObject frontendData = awemeRawAd.getFrontendData();
            String str2 = null;
            if (frontendData != null) {
                str = frontendData.toString();
            } else {
                str = null;
            }
            LIZ2.LJJIIZ("cardData", str);
            NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig != null) {
                str2 = nativeSiteConfig.getLynxScheme();
            }
            LIZ2.LJJIIZ("lynxSchema", str2);
        }
        LIZ2.LJJIIJ("isCardState", 1);
        return LIZ2;
    }

    public static Bundle LIZIZ(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String nativeSiteCustomData;
        Bundle LIZIZ = NG2.LIZIZ(context, aweme);
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (nativeSiteCustomData = awemeRawAd.getNativeSiteCustomData()) != null) {
            LIZIZ.putString("bundle_native_site_custom_data", nativeSiteCustomData);
        }
        return LIZIZ;
    }
}
