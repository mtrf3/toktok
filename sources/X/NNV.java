package X;

import com.bytedance.vast.model.AdVerification;
import com.ss.android.ugc.aweme.commercialize.model.AdNodeTrackUrl;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.jvm.internal.AqS33S1000000_10;
import kotlin.jvm.internal.AqS70S0000000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NNV {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new OJD("(\\d+)%");
        new OJD("(\\d{2}):(\\d{2}):(\\d{2})");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x000e, code lost:
    
        if (r2 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.vast.model.AdVerification LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r2) {
        /*
            r1 = 0
            if (r2 == 0) goto La
            boolean r0 = r2.isAd()
            if (r0 != 0) goto L10
            r1 = 1
        La:
            r0 = 0
            if (r1 == 0) goto Le
        Ld:
            return r0
        Le:
            if (r2 == 0) goto L14
        L10:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.getAwemeRawAd()
        L14:
            com.bytedance.vast.model.AdVerification r0 = LIZIZ(r0)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NNV.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):com.bytedance.vast.model.AdVerification");
    }

    public static final AdVerification LIZIZ(AwemeRawAd awemeRawAd) {
        List<AdVerification> list;
        C59255NNj c59255NNj;
        List<AdVerification> list2;
        AdVerification adVerification;
        C59255NNj c59255NNj2;
        List<AdVerification> list3;
        OmVast omVast;
        boolean z = false;
        if (awemeRawAd != null && (omVast = awemeRawAd.getOmVast()) != null && omVast.providerType == 3) {
            z = true;
        }
        if (z) {
            OmVast omVast2 = awemeRawAd.getOmVast();
            if (omVast2 == null || (c59255NNj2 = omVast2.vast) == null || (list3 = c59255NNj2.adVerificationList) == null) {
                return null;
            }
            return (AdVerification) ORZ.LJLLLL(list3);
        }
        if (awemeRawAd == null) {
            return null;
        }
        OmVast omVast3 = awemeRawAd.getOmVast();
        if (omVast3 == null || (c59255NNj = omVast3.vast) == null || (list2 = c59255NNj.adVerificationList) == null || (adVerification = (AdVerification) ORZ.LJLLLL(list2)) == null) {
            OmVast omVast4 = awemeRawAd.getOmVast();
            if (omVast4 == null || (list = omVast4.adVerificationList) == null) {
                return null;
            }
            return (AdVerification) ORZ.LJLLLL(list);
        }
        return adVerification;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getOmVast() == null || LIZIZ(awemeRawAd) == null) {
            return false;
        }
        try {
            Boolean disableOmSdk = C2YJ.LIZIZ.LIZ.getDisableOmSdk();
            o.LJIIIIZZ(disableOmSdk, "{\n            SettingsRe…().disableOmSdk\n        }");
            if (disableOmSdk.booleanValue()) {
                return false;
            }
            return true;
        } catch (C158056If e) {
            C78983UzD.LJIIZILJ(e);
            return false;
        }
    }

    public static final List<String> LIZJ(int i, AwemeRawAd awemeRawAd) {
        List<AdNodeTrackUrl> adNodeTrackUrlList = awemeRawAd.getAdNodeTrackUrlList();
        if (adNodeTrackUrlList == null || adNodeTrackUrlList.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        for (AdNodeTrackUrl adNodeTrackUrl : adNodeTrackUrlList) {
            if (adNodeTrackUrl.percent == i) {
                List<String> list = adNodeTrackUrl.urlList;
                if (list == null) {
                    return C61878OQg.INSTANCE;
                }
                return list;
            }
        }
        return C61878OQg.INSTANCE;
    }

    public static final void LJ(AwemeRawAd awemeRawAd, String str, String str2) {
        InterfaceC1039145z interfaceC1039145z;
        OmVast omVast;
        C59255NNj c59255NNj;
        List<C59259NNn> list;
        OmVast omVast2 = null;
        if (awemeRawAd != null) {
            omVast2 = awemeRawAd.getOmVast();
        }
        if (omVast2 != null && omVast2.providerType == 3) {
            if (awemeRawAd != null && (omVast = awemeRawAd.getOmVast()) != null && (c59255NNj = omVast.vast) != null && (list = c59255NNj.creativeList) != null) {
                interfaceC1039145z = OJ4.LJJJJJL(ORZ.LJLIIIL(list), new AqS70S0000000_10(0));
            } else {
                interfaceC1039145z = OJA.LIZ;
            }
            N94.LIZ(new C58769N4r(awemeRawAd, str2), OJ4.LJJLIIIJ(OJ4.LJJJJLL(OJ4.LJJJJIZL(OJ4.LJJJJLL(OJ4.LJJJJ(interfaceC1039145z, new AqS33S1000000_10(str, 0)), NNW.LJLIL)), N3Q.LJLIL)), false);
        }
    }
}
