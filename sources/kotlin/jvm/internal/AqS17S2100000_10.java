package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C58620MzY;
import X.C58684N1k;
import X.C59091NHb;
import X.C61593OFh;
import X.C76800UCe;
import X.HHH;
import X.InterfaceC88472Yns;
import X.N1E;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackBannerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.BottomSurveyAssem;

/* loaded from: classes11.dex */
public class AqS17S2100000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS17S2100000_10 aqS17S2100000_10, Object obj) {
        C61593OFh setInteractionWithButton = (C61593OFh) obj;
        o.LJIIIZ(setInteractionWithButton, "$this$setInteractionWithButton");
        C61593OFh.LIZJ(setInteractionWithButton, aqS17S2100000_10.s0, new AqS176S0100000_10((EarlyFeedbackBannerAssem) aqS17S2100000_10.l2, 80));
        String text = aqS17S2100000_10.s1;
        AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10((EarlyFeedbackBannerAssem) aqS17S2100000_10.l2, 81);
        o.LJIIIZ(text, "text");
        setInteractionWithButton.LIZ.add(new C59091NHb(text, null, aqS176S0100000_10));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS17S2100000_10 aqS17S2100000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LIZIZ, ((N1E) aqS17S2100000_10.l2).LIZ);
        logAd.LJII(C58684N1k.LIZJ, aqS17S2100000_10.s0);
        logAd.LJII(C58684N1k.LJ, aqS17S2100000_10.s1);
        logAd.LJII(C58684N1k.LJJJJL, "boc");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS17S2100000_10 aqS17S2100000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LIZIZ, ((N1E) aqS17S2100000_10.l2).LIZ);
        logAd.LJII(C58684N1k.LIZJ, aqS17S2100000_10.s0);
        logAd.LJII(C58684N1k.LJ, aqS17S2100000_10.s1);
        logAd.LJII(C58684N1k.LJIJJ, Long.valueOf(System.currentTimeMillis() - ((N1E) aqS17S2100000_10.l2).LIZIZ));
        logAd.LJII(C58684N1k.LJIJJLI, Long.valueOf(System.currentTimeMillis() - ((N1E) aqS17S2100000_10.l2).LIZIZ));
        logAd.LJII(C58684N1k.LJJJJL, "boc");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS17S2100000_10 aqS17S2100000_10, Object obj) {
        C61593OFh setInteractionWithButton = (C61593OFh) obj;
        o.LJIIIZ(setInteractionWithButton, "$this$setInteractionWithButton");
        C61593OFh.LIZJ(setInteractionWithButton, aqS17S2100000_10.s0, new AqS176S0100000_10((BottomSurveyAssem) aqS17S2100000_10.l2, 256));
        String text = aqS17S2100000_10.s1;
        HHH hhh = HHH.LJLIL;
        AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10((BottomSurveyAssem) aqS17S2100000_10.l2, 257);
        o.LJIIIZ(text, "text");
        setInteractionWithButton.LIZ.add(new C59091NHb(text, hhh, aqS176S0100000_10));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S2100000_10(N1E n1e, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = n1e;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S2100000_10(String str, String str2, EarlyFeedbackBannerAssem earlyFeedbackBannerAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = earlyFeedbackBannerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S2100000_10(String str, String str2, BottomSurveyAssem bottomSurveyAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = bottomSurveyAssem;
    }
}
