package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C45804HyK;
import X.C76800UCe;
import X.C77177UQr;
import X.InterfaceC65784Pro;
import X.UQF;
import X.URA;
import android.content.Context;

/* loaded from: classes14.dex */
public class AqS1S2301000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i5;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S2301000_13 aqS1S2301000_13) {
        C77177UQr c77177UQr = C77177UQr.LIZ;
        int i = aqS1S2301000_13.i5;
        UQF uqf = (UQF) aqS1S2301000_13.l2;
        String str = aqS1S2301000_13.s0;
        String str2 = aqS1S2301000_13.s1;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI((Context) aqS1S2301000_13.l3);
        o.LJI(LJJIFFI);
        URA ura = (URA) aqS1S2301000_13.l4;
        c77177UQr.getClass();
        C77177UQr.LJIILL(i, LJJIFFI, uqf, ura, str, str2, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S2301000_13 aqS1S2301000_13) {
        C77177UQr c77177UQr = C77177UQr.LIZ;
        UQF uqf = (UQF) aqS1S2301000_13.l2;
        String str = aqS1S2301000_13.s0;
        String str2 = aqS1S2301000_13.s1;
        int i = aqS1S2301000_13.i5;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI((Context) aqS1S2301000_13.l3);
        o.LJI(LJJIFFI);
        URA ura = (URA) aqS1S2301000_13.l4;
        c77177UQr.getClass();
        C77177UQr.LJIILLIIL(uqf, str, str2, i, LJJIFFI, ura);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S2301000_13(ActivityC45651qj activityC45651qj, UQF uqf, String str, int i) {
        super(0);
        this.$t = i;
        this.i5 = 1;
        this.l2 = uqf;
        this.s0 = str;
        this.s1 = "auto_must";
        this.l3 = activityC45651qj;
        this.l4 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S2301000_13(int i, Context context, UQF uqf, URA ura, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l2 = uqf;
        this.s0 = str;
        this.s1 = "auto";
        this.i5 = i;
        this.l3 = context;
        this.l4 = ura;
    }
}
