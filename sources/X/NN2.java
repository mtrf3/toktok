package X;

import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.jvm.internal.AqS70S0000000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NN2 {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || omVast.providerType != 3) {
            return false;
        }
        return true;
    }

    public static C59257NNl LIZIZ(AwemeRawAd awemeRawAd) {
        InterfaceC1039145z interfaceC1039145z;
        OmVast omVast;
        C59255NNj c59255NNj;
        List<C59259NNn> list;
        if (awemeRawAd != null && (omVast = awemeRawAd.getOmVast()) != null && (c59255NNj = omVast.vast) != null && (list = c59255NNj.creativeList) != null) {
            interfaceC1039145z = OJ4.LJJJJJL(ORZ.LJLIIIL(list), new AqS70S0000000_10(5));
        } else {
            interfaceC1039145z = OJA.LIZ;
        }
        return (C59257NNl) OJ4.LJJJJJ(interfaceC1039145z);
    }

    public static final String LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        C59257NNl LIZIZ;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (LIZIZ = LIZIZ(awemeRawAd)) != null) {
            String str = LIZIZ.clickThrough;
            if (str == null || str.length() == 0) {
                java.util.Set<String> set = LIZIZ.clickTracking;
                if (set != null && !set.isEmpty()) {
                    java.util.Set<String> set2 = LIZIZ.clickTracking;
                    o.LJIIIIZZ(set2, "click.clickTracking");
                    return (String) OJ4.LJJJJJ(OJ4.LJJJJIZL(ORZ.LJLIIIL(set2)));
                }
            } else {
                return LIZIZ.clickThrough;
            }
        }
        return null;
    }

    public static final void LIZLLL(AwemeRawAd awemeRawAd) {
        C59257NNl LIZIZ;
        String str;
        if (awemeRawAd != null && (LIZIZ = LIZIZ(awemeRawAd)) != null) {
            java.util.Set<String> set = LIZIZ.clickTracking;
            if (set == null || set.isEmpty()) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast == null || omVast.providerType != 2 || (str = LIZIZ.clickThrough) == null || str.length() == 0) {
                    return;
                }
                String str2 = LIZIZ.clickThrough;
                o.LJIIIIZZ(str2, "it.clickThrough");
                RawURLGetter.LIZIZ(str2, new C58771N4t(awemeRawAd));
                return;
            }
            java.util.Set<String> set2 = LIZIZ.clickTracking;
            o.LJIIIIZZ(set2, "it.clickTracking");
            C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJ(ORZ.LJLIIIL(set2), C58772N4u.LJLIL));
            while (c115524g8.hasNext()) {
                String url = (String) c115524g8.next();
                long currentTimeMillis = System.currentTimeMillis();
                o.LJIIIIZZ(url, "url");
                RawURLGetter.LIZIZ(url, new C58770N4s(url, currentTimeMillis, awemeRawAd));
            }
        }
    }
}
