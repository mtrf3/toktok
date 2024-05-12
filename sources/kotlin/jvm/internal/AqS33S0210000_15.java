package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C188727au;
import X.C2068389v;
import X.C244659iv;
import X.C26227ARb;
import X.C44729Hgz;
import X.C76800UCe;
import X.C79045V0n;
import X.C85136XbA;
import X.C85144XbI;
import X.C85150XbO;
import X.EnumC85151XbP;
import X.FMX;
import X.InterfaceC88472Yns;
import X.UC0;
import android.content.Context;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityAssem;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes16.dex */
public class AqS33S0210000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AqS33S0210000_15 aqS33S0210000_15, Object it) {
        int i;
        o.LJIIIZ(it, "it");
        if (aqS33S0210000_15.z2) {
            C85144XbI.LJJIIJZLJL(((TwoStepVerificationActivityAssem) aqS33S0210000_15.l0).LJLLLLLL.getVerifyTypeFromMethod(((C85136XbA) aqS33S0210000_15.l1).LIZJ), ((TwoStepVerificationActivityAssem) aqS33S0210000_15.l0).getEnterFrom());
        }
        TwoStepVerificationActivityAssem twoStepVerificationActivityAssem = (TwoStepVerificationActivityAssem) aqS33S0210000_15.l0;
        EnumC85151XbP enumC85151XbP = ((C85136XbA) aqS33S0210000_15.l1).LIZJ;
        boolean z = aqS33S0210000_15.z2;
        Context context = twoStepVerificationActivityAssem.getContext();
        if (context != null) {
            C26227ARb c26227ARb = new C26227ARb(context);
            if (z) {
                int i2 = C85150XbO.LIZ[enumC85151XbP.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                c26227ARb.LJFF(context.getString(R.string.t8o));
                            }
                        } else {
                            c26227ARb.LJFF(context.getString(R.string.t8s));
                        }
                    } else {
                        c26227ARb.LJFF(context.getString(R.string.t8p));
                    }
                } else {
                    c26227ARb.LJFF(context.getString(R.string.t8t));
                }
                String methodType = twoStepVerificationActivityAssem.LJLLLLLL.getVerifyTypeFromMethod(enumC85151XbP);
                String enterFrom = twoStepVerificationActivityAssem.getEnterFrom();
                o.LJIIIZ(methodType, "methodType");
                o.LJIIIZ(enterFrom, "enterFrom");
                C188727au LJFF = C85144XbI.LJFF();
                LJFF.LJIIIZ("method_edited", C85144XbI.LJI(methodType));
                LJFF.LJIIIZ("enter_from", enterFrom);
                FMX.LJIIL("twosv_remove_second_popup", LJFF.LIZ);
                c26227ARb.LIZIZ(context.getString(R.string.t8r));
                UC0.LIZJ(c26227ARb, new AqS119S0300000_15(context, twoStepVerificationActivityAssem, enumC85151XbP, 9));
            } else {
                C85144XbI.LJJIJLIJ(twoStepVerificationActivityAssem.LJLLLLLL.getVerifyTypeFromMethod(enumC85151XbP), twoStepVerificationActivityAssem.getEnterFrom());
                int i3 = R.raw.icon_3pt_exclamation_mark_circle;
                Integer LJI = C79045V0n.LJI(R.attr.eb, context);
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = 0;
                }
                c26227ARb.LJIIIZ = new C244659iv(context, i3, Integer.valueOf(i), 8, 0);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_3pt_exclamation_mark_circle;
                c2068389v.LJ = Integer.valueOf(R.attr.eb);
                C44729Hgz.LJJIJ(c26227ARb, c2068389v.LIZ(context));
                c26227ARb.LJFF(context.getString(R.string.t8y));
                c26227ARb.LIZIZ(context.getString(R.string.t8v));
                UC0.LIZJ(c26227ARb, new AqS119S0300000_15(context, twoStepVerificationActivityAssem, enumC85151XbP, 10));
            }
            c26227ARb.LJI().LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS33S0210000_15 aqS33S0210000_15, Object obj) {
        String str;
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        int i = !((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0).uv0() ? 1 : 0;
        if (((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0).uv0()) {
            str = "on";
        } else {
            str = "off";
        }
        C85144XbI.LJIIIIZZ(str, ((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0).getEnterFrom(), (List) aqS33S0210000_15.l1, ((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0).rv0());
        ((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0).qv0((List) aqS33S0210000_15.l1);
        ((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0).Hv0(it, new AqS7S0211000_15((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0, (TwoStepVerificationActivityViewModel) aqS33S0210000_15.z2, (boolean) aqS33S0210000_15.l1, (List<String>) i, 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS33S0210000_15 aqS33S0210000_15, Object obj) {
        String str;
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        int i = !((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0).uv0() ? 1 : 0;
        if (((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0).uv0()) {
            str = "on";
        } else {
            str = "off";
        }
        C85144XbI.LJIIIIZZ(str, ((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0).getEnterFrom(), (List) aqS33S0210000_15.l1, ((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0).rv0());
        ((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0).qv0((List) aqS33S0210000_15.l1);
        ((TwoStepVerificationActivityViewModel) aqS33S0210000_15.l0).gv0((List) aqS33S0210000_15.l1, "trusted_environment", it, i, aqS33S0210000_15.z2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS33S0210000_15(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel2, List<String> list, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = twoStepVerificationActivityViewModel;
        this.l1 = twoStepVerificationActivityViewModel2;
        this.z2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS33S0210000_15(boolean z, TwoStepVerificationActivityAssem twoStepVerificationActivityAssem, C85136XbA c85136XbA, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = twoStepVerificationActivityAssem;
        this.l1 = c85136XbA;
    }
}
