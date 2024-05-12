package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* renamed from: X.9mz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247179mz {
    public static final /* synthetic */ int LIZ = 0;

    public static final long LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return 0L;
        }
        C73340SqO.LJIL().getClass();
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            return 0L;
        }
        return groupId.longValue();
    }

    public static final void LIZIZ(Context context, String str, String str2, String str3, long j, JSONObject jSONObject) {
        String str4 = "draw_ad";
        if (TextUtils.equals(str2, "challenge") || TextUtils.equals(str2, "challenge_fresh")) {
            if (TextUtils.equals("draw_ad", "background_ad")) {
                str4 = "background_ads";
            } else {
                str4 = "topic_ads";
            }
        }
        C73340SqO.LJIL().getClass();
        NN1.LIZJ(j, context, str4, str, str3, jSONObject);
    }
}
