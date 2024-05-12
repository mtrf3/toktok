package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.model.AdLynxEntryData;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.NFo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59052NFo {
    public static C59066NGc LIZ(Context context, Aweme aweme) {
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
        return new C59066NGc("feed_fyp_super_like", enumC59241NMv, context, new NGY(str, str2, groupId, num, num2, 32));
    }

    public static C59421NTt LIZIZ(Context context, Aweme aweme) {
        EnumC59053NFp enumC59053NFp;
        NLW nlw;
        AdLynxEntryData lynxEntryData;
        String lynxScheme;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String str = null;
        if (awemeRawAd != null && (lynxEntryData = awemeRawAd.getLynxEntryData()) != null && (lynxScheme = lynxEntryData.getLynxScheme()) != null) {
            str = UriProtector.parse(lynxScheme).buildUpon().appendQueryParameter("initialData", NG1.LIZ(context, aweme).toString()).toString();
        }
        Bundle bundle = new Bundle();
        InterfaceC1803976d LIZLLL = CommercializeAdServiceImpl.LJ().LIZLLL(17);
        if ((LIZLLL instanceof NLW) && (nlw = (NLW) LIZLLL) != null) {
            nlw.LJIIIIZZ(context, bundle, aweme);
        }
        NIA nia = new NIA("feed_fyp_super_like", str, bundle, C59055NFr.LIZ("feed_fyp_super_like"), new C1PH(), false, null, false, 992);
        if (C58562Ro.LIZ()) {
            enumC59053NFp = EnumC59053NFp.CACHE_WITH_RETRY;
        } else {
            enumC59053NFp = EnumC59053NFp.ONLY_RENDER;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        return new C59421NTt(enumC59053NFp, aid, 4, true, nia, null, false, 200);
    }
}
