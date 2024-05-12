package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RawAdData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceRerankInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.SQk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72074SQk {
    public static RankData LIZ(Aweme aweme) {
        RawAdData rawAdData;
        int i;
        String itemParamForPitaya;
        long longValue;
        o.LJIIIZ(aweme, "aweme");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            Long adId = awemeRawAd.getAdId();
            if (adId == null) {
                longValue = 0;
            } else {
                longValue = adId.longValue();
            }
            rawAdData = new RawAdData(longValue, awemeRawAd.getComponentType(), awemeRawAd.getAdSourceType(), awemeRawAd.getChargeType(), awemeRawAd.getSystemOrigin());
        } else {
            rawAdData = null;
        }
        String aid = aweme.getAid();
        String str = "";
        if (aid == null) {
            aid = "";
        }
        int awemeType = aweme.getAwemeType();
        int musicBeginTime = aweme.getMusicBeginTime();
        int musicEndTime = aweme.getMusicEndTime();
        CommerceRerankInfo commerceRerankInfo = aweme.getCommerceRerankInfo();
        if (commerceRerankInfo != null && (itemParamForPitaya = commerceRerankInfo.getItemParamForPitaya()) != null) {
            str = itemParamForPitaya;
        }
        com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.CommerceRerankInfo commerceRerankInfo2 = new com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.CommerceRerankInfo(str);
        if (C1DJ.LJIJJLI(aweme) || C1DJ.LJJ(aweme)) {
            i = 1;
        } else {
            i = 0;
        }
        return new RankData(aid, awemeType, musicBeginTime, musicEndTime, commerceRerankInfo2, aweme, rawAdData, i, null);
    }
}
