package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdTopContainerInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.NFt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59057NFt {
    public static String LIZ(Aweme aweme) {
        String str;
        AdDescriptiveCTAStruct adDescriptiveCTA;
        AdTopContainerInfoStruct leftContainer;
        o.LJIIIZ(aweme, "aweme");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(aweme.getAid());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA()) != null && (leftContainer = adDescriptiveCTA.getLeftContainer()) != null) {
            str = leftContainer.getContainerUrl();
        } else {
            str = null;
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public static C59421NTt LIZIZ(Context context, Aweme aweme) {
        String str;
        AdDescriptiveCTAStruct adDescriptiveCTA;
        AdTopContainerInfoStruct leftContainer;
        String containerUrl;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA()) != null && (leftContainer = adDescriptiveCTA.getLeftContainer()) != null && (containerUrl = leftContainer.getContainerUrl()) != null) {
            str = UriProtector.parse(containerUrl).buildUpon().appendQueryParameter("initialData", NG3.LIZ(context, aweme).toString()).toString();
        } else {
            str = null;
        }
        return new C59421NTt(EnumC59053NFp.CACHE_WITH_RETRY, LIZ(aweme), 4, false, new NIA("feed_fyp_descriptive_left_container", str, NG3.LIZIZ(context, aweme), C59055NFr.LIZ("feed_fyp_descriptive_left_container"), new C1PH(), false, null, false, 992), null, false, 200);
    }

    public static C59066NGc LIZJ(Context context, Aweme aweme) {
        String str;
        String str2;
        Integer num;
        Long creativeId;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        EnumC59241NMv enumC59241NMv = EnumC59241NMv.SPARK;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        Integer num2 = null;
        if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
            str = String.valueOf(creativeId);
        } else {
            str = null;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            str2 = awemeRawAd2.getLogExtra();
        } else {
            str2 = null;
        }
        String groupId = aweme.getGroupId();
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            num = Integer.valueOf(awemeRawAd3.getChargeType());
        } else {
            num = null;
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 != null) {
            num2 = Integer.valueOf(awemeRawAd4.getSystemOrigin());
        }
        return new C59066NGc("feed_fyp_descriptive_left_container", enumC59241NMv, context, new NGY(str, str2, groupId, num, num2, 32));
    }
}
