package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C131555Eh;
import X.C132315Hf;
import X.C5EA;
import X.C5QB;
import X.InterfaceC88472Yns;

/* loaded from: classes3.dex */
public class AqS14S0000100_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S0000100_2(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AqS14S0000100_2 aqS14S0000100_2, Object obj) {
        C131555Eh setState = (C131555Eh) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C131555Eh.LIZ(setState, aqS14S0000100_2.j0, 0L, null, null, null, null, null, 126);
    }

    public static final Object invoke$1(AqS14S0000100_2 aqS14S0000100_2, Object obj) {
        C131555Eh setState = (C131555Eh) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C131555Eh.LIZ(setState, 0L, aqS14S0000100_2.j0, null, null, null, null, null, 125);
    }

    public static final Object invoke$2(AqS14S0000100_2 aqS14S0000100_2, Object obj) {
        C5EA setState = (C5EA) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5EA.LIZ(setState, aqS14S0000100_2.j0, 0L, null, null, 14);
    }

    public static final Object invoke$3(AqS14S0000100_2 aqS14S0000100_2, Object obj) {
        C5EA setState = (C5EA) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5EA.LIZ(setState, 0L, aqS14S0000100_2.j0, null, null, 13);
    }

    public static final Object invoke$4(AqS14S0000100_2 aqS14S0000100_2, Object obj) {
        C5QB setState = (C5QB) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5QB.LIZ(setState, null, null, aqS14S0000100_2.j0, null, null, null, 123);
    }

    public static final Object invoke$5(AqS14S0000100_2 aqS14S0000100_2, Object obj) {
        C131555Eh setState = (C131555Eh) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C131555Eh.LIZ(setState, aqS14S0000100_2.j0, 0L, null, null, null, null, null, 126);
    }

    public static final Object invoke$6(AqS14S0000100_2 aqS14S0000100_2, Object obj) {
        C131555Eh setState = (C131555Eh) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C131555Eh.LIZ(setState, 0L, aqS14S0000100_2.j0, null, null, null, null, null, 125);
    }

    public static final Object invoke$7(AqS14S0000100_2 aqS14S0000100_2, Object obj) {
        return Long.valueOf(aqS14S0000100_2.j0);
    }

    public static final Object invoke$8(AqS14S0000100_2 aqS14S0000100_2, Object obj) {
        boolean z;
        C132315Hf setState = (C132315Hf) obj;
        o.LJIIIZ(setState, "$this$setState");
        if (aqS14S0000100_2.j0 > 1000) {
            z = true;
        } else {
            z = false;
        }
        return C132315Hf.L(setState, false, false, z, 3);
    }
}
