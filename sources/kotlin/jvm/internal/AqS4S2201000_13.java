package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C45804HyK;
import X.C76800UCe;
import X.C77177UQr;
import X.InterfaceC65784Pro;
import X.UQF;
import android.content.Context;

/* loaded from: classes14.dex */
public class AqS4S2201000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i4;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AqS4S2201000_13 aqS4S2201000_13) {
        C77177UQr c77177UQr = C77177UQr.LIZ;
        int i = aqS4S2201000_13.i4;
        UQF uqf = (UQF) aqS4S2201000_13.l2;
        String str = aqS4S2201000_13.s0;
        String str2 = aqS4S2201000_13.s1;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI((Context) aqS4S2201000_13.l3);
        o.LJI(LJJIFFI);
        c77177UQr.getClass();
        C77177UQr.LJIILL(i, LJJIFFI, uqf, null, str, str2, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS4S2201000_13 aqS4S2201000_13) {
        C77177UQr c77177UQr = C77177UQr.LIZ;
        UQF uqf = (UQF) aqS4S2201000_13.l2;
        String str = aqS4S2201000_13.s0;
        String str2 = aqS4S2201000_13.s1;
        int i = aqS4S2201000_13.i4;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI((Context) aqS4S2201000_13.l3);
        o.LJI(LJJIFFI);
        c77177UQr.getClass();
        C77177UQr.LJIILLIIL(uqf, str, str2, i, LJJIFFI, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S2201000_13(int i, ActivityC45651qj activityC45651qj, UQF uqf, int i2) {
        super(0);
        this.$t = i2;
        this.i4 = i;
        this.l2 = uqf;
        this.s0 = "personal_homepage";
        this.s1 = "auto";
        this.l3 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S2201000_13(int i, Context context, UQF uqf, String str, String str2, int i2) {
        super(0);
        this.$t = i2;
        this.l2 = uqf;
        this.s0 = str;
        this.s1 = str2;
        this.i4 = i;
        this.l3 = context;
    }
}
