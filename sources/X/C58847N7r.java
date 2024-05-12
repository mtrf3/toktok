package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.model.CommerceActivityStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.SpecialSticker;
import kotlin.jvm.internal.o;

/* renamed from: X.N7r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58847N7r {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Aweme aweme) {
        if (aweme == null || aweme.getActivityPendant() == null) {
            return false;
        }
        CommerceActivityStruct activityPendant = aweme.getActivityPendant();
        UrlModel image = activityPendant.getImage();
        long startTime = activityPendant.getStartTime();
        long endTime = activityPendant.getEndTime();
        if (image == null || C79004UzY.LJJIFFI(image.getUrlList())) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis < startTime || currentTimeMillis > endTime) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        UrlModel redImageUrl;
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        o.LJI(awemeRawAd);
        if (!TextUtils.equals(awemeRawAd.getType(), "redpacket") || (redImageUrl = awemeRawAd.getRedImageUrl()) == null || C79004UzY.LJJIFFI(redImageUrl.getUrlList())) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Aweme aweme) {
        SpecialSticker specialSticker;
        if (aweme == null || (specialSticker = aweme.getSpecialSticker()) == null || specialSticker.getStickerType() != 2) {
            return false;
        }
        return true;
    }
}
