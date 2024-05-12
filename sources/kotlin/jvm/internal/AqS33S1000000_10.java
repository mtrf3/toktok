package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C45322HqY;
import X.C47261Igj;
import X.C58620MzY;
import X.C58740N3o;
import X.C59261NNp;
import X.C60737Nsb;
import X.C60999Nwp;
import X.C61878OQg;
import X.C62427Oel;
import X.C76800UCe;
import X.InterfaceC60819Ntv;
import X.InterfaceC88472Yns;
import X.N0H;
import X.NMB;
import X.OQL;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* loaded from: classes11.dex */
public class AqS33S1000000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS33S1000000_10(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AqS33S1000000_10 aqS33S1000000_10, Object obj) {
        String str;
        C59261NNp c59261NNp = (C59261NNp) obj;
        if (c59261NNp != null) {
            str = c59261NNp.name;
        } else {
            str = null;
        }
        return Boolean.valueOf(o.LJ(str, aqS33S1000000_10.s0));
    }

    public static final Object invoke$1(AqS33S1000000_10 aqS33S1000000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        logAd.LJII(NMB.LJIJJLI, aqS33S1000000_10.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS33S1000000_10 aqS33S1000000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        N0H.LIZ.getClass();
        logAd.LJII(N0H.LJII, aqS33S1000000_10.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS33S1000000_10 aqS33S1000000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        NMB.LIZ.getClass();
        logAd.LJII(NMB.LJJI, aqS33S1000000_10.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS33S1000000_10 aqS33S1000000_10, Object obj) {
        String str;
        C59261NNp c59261NNp = (C59261NNp) obj;
        if (c59261NNp != null) {
            str = c59261NNp.name;
        } else {
            str = null;
        }
        return Boolean.valueOf(o.LJ(str, aqS33S1000000_10.s0));
    }

    public static final Object invoke$3(AqS33S1000000_10 aqS33S1000000_10, Object obj) {
        C62427Oel imageCardTranslationInfoMap = (C62427Oel) obj;
        o.LJIIIZ(imageCardTranslationInfoMap, "$this$imageCardTranslationInfoMap");
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        imageCardTranslationInfoMap.LJ("AIGC_directMessage_share_description", c61878OQg);
        imageCardTranslationInfoMap.LIZJ("self_sent_profile", C47261Igj.LJJIJ(aqS33S1000000_10.s0));
        imageCardTranslationInfoMap.LIZIZ("cell_sent_profile", C47261Igj.LJJIJ(aqS33S1000000_10.s0));
        imageCardTranslationInfoMap.LIZ("im_quote_profile", c61878OQg);
        imageCardTranslationInfoMap.LJI = new C45322HqY("cell_sent_profile", C47261Igj.LJJIJ(aqS33S1000000_10.s0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS33S1000000_10 aqS33S1000000_10, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        sendLog.LIZLLL("popup_name", aqS33S1000000_10.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS33S1000000_10 aqS33S1000000_10, Object it) {
        o.LJIIIZ(it, "it");
        LiveOuterService.LJJJLL().LJJIJIL().LJIIIIZZ();
        OQL.LIZ(aqS33S1000000_10.s0, "go_live", "live_take_popup_in_room", true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS33S1000000_10 aqS33S1000000_10, Object obj) {
        C60737Nsb it = (C60737Nsb) obj;
        o.LJIIIZ(it, "it");
        it.LJII(InterfaceC60819Ntv.class, new C60999Nwp(aqS33S1000000_10.s0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS33S1000000_10 aqS33S1000000_10, Object obj) {
        String str;
        Aweme aweme = (Aweme) obj;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            str = awemeRawAd.getCreativeIdStr();
        } else {
            str = null;
        }
        boolean LJ = o.LJ(str, aqS33S1000000_10.s0);
        boolean z = false;
        if (LJ && (C58740N3o.LIZJ(C58740N3o.LIZ, aweme) & 2) == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$8(AqS33S1000000_10 aqS33S1000000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        logAd.LJII(NMB.LJIJJLI, aqS33S1000000_10.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS33S1000000_10 aqS33S1000000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        NMB.LIZ.getClass();
        logAd.LJII(NMB.LJJI, aqS33S1000000_10.s0);
        return C76800UCe.LIZ;
    }
}
