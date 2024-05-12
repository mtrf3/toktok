package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C41835GbP;
import X.C56593MIz;
import X.C58620MzY;
import X.C58684N1k;
import X.C62449Of7;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.N1V;
import X.N8D;
import X.NAW;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillPopupModel;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public class AqS98S0101000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS98S0101000_10 aqS98S0101000_10, Object obj) {
        C41835GbP param = (C41835GbP) obj;
        o.LJIIIZ(param, "param");
        return C41835GbP.L(param, ((C62449Of7) aqS98S0101000_10.l0).LJLJI, "long_press", aqS98S0101000_10.i1 + 1, "action", "default_story_icon", 365);
    }

    public static final Object invoke$1(AqS98S0101000_10 aqS98S0101000_10, Object obj) {
        String str;
        String str2;
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJIIIIZZ, "native");
        C56593MIz c56593MIz = C58684N1k.LJFF;
        AdAutofillPopupModel adAutofillPopupModel = ((N8D) aqS98S0101000_10.l0).LIZLLL;
        if (adAutofillPopupModel != null) {
            str = adAutofillPopupModel.url;
        } else {
            str = null;
        }
        logAd.LJII(c56593MIz, str);
        logAd.LJII(C58684N1k.LJI, Integer.valueOf(((N8D) aqS98S0101000_10.l0).LIZIZ ? 1 : 0));
        logAd.LJII(C58684N1k.LJIIIZ, Integer.valueOf(aqS98S0101000_10.i1));
        C56593MIz c56593MIz2 = C58684N1k.LJII;
        JSONArray LJIIIIZZ = NAW.LJIIIIZZ();
        if (LJIIIIZZ == null || (str2 = LJIIIIZZ.toString()) == null) {
            str2 = "[]";
        }
        logAd.LJII(c56593MIz2, str2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS98S0101000_10 aqS98S0101000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJIILJJIL, Integer.valueOf(((N1V) aqS98S0101000_10.l0).LIZIZ));
        logAd.LJII(C58684N1k.LJIILL, ((N1V) aqS98S0101000_10.l0).LJII);
        logAd.LJII(C58684N1k.LJJJJL, "iab");
        logAd.LJII(C58684N1k.LJJIJIL, Integer.valueOf(((N1V) aqS98S0101000_10.l0).LJIILLIIL));
        logAd.LJII(C58684N1k.LJJLIIIJLJLI, Integer.valueOf(aqS98S0101000_10.i1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0101000_10(N1V n1v, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = n1v;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0101000_10(N8D n8d, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = n8d;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0101000_10(C62449Of7 c62449Of7, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c62449Of7;
        this.i1 = i;
    }
}
