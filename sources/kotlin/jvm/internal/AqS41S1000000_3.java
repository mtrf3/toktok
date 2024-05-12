package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C188727au;
import X.C194767ke;
import X.C210408No;
import X.C227538wP;
import X.C35979EAd;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC65784Pro;

/* loaded from: classes4.dex */
public class AqS41S1000000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return this.s0;
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS41S1000000_3 aqS41S1000000_3) {
        return C210408No.LIZ(aqS41S1000000_3.s0);
    }

    public static final Object invoke$1(AqS41S1000000_3 aqS41S1000000_3) {
        if (C227538wP.LIZ > 0) {
            String str = aqS41S1000000_3.s0;
            C188727au c188727au = new C188727au();
            c188727au.LJ(System.currentTimeMillis() - C227538wP.LIZ, "click_to_show_duration");
            c188727au.LJ(System.currentTimeMillis() - C227538wP.LIZIZ, "init_to_show_duration");
            c188727au.LJ(System.currentTimeMillis() - C227538wP.LIZJ, "api_end_to_show_duration");
            c188727au.LJIIIZ("enter_from", str);
            FMX.LJIIL("ttk_profileviewer_enter_perf", c188727au.LIZ);
            C227538wP.LIZ = 0L;
            C227538wP.LIZIZ = 0L;
            C227538wP.LIZJ = 0L;
            C227538wP.LIZLLL = false;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS41S1000000_3 aqS41S1000000_3) {
        ((C35979EAd) C194767ke.LIZ.getValue()).LJ(aqS41S1000000_3.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS41S1000000_3(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
