package kotlin.jvm.internal;

import X.AbstractC234519Ih;
import X.AbstractC65781Prl;
import X.C234529Ii;
import X.C43I;
import X.C58620MzY;
import X.C59542NYk;
import X.C61984OUi;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.N0W;

/* loaded from: classes11.dex */
public class AqS15S0010000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;

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
    public AqS15S0010000_10(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AqS15S0010000_10 aqS15S0010000_10, Object obj) {
        C58620MzY log = (C58620MzY) obj;
        o.LJIIIZ(log, "$this$log");
        N0W.LIZ.getClass();
        log.LJII(N0W.LJIILL, Boolean.valueOf(aqS15S0010000_10.z0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS15S0010000_10 aqS15S0010000_10, Object obj) {
        C61984OUi setState = (C61984OUi) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C61984OUi.L(setState, new C43I(Boolean.valueOf(aqS15S0010000_10.z0)), null, null, 6);
    }

    public static final Object invoke$2(AqS15S0010000_10 aqS15S0010000_10, Object obj) {
        C61984OUi setState = (C61984OUi) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C61984OUi.L(setState, new C43I(Boolean.valueOf(aqS15S0010000_10.z0)), null, null, 6);
    }

    public static final Object invoke$3(AqS15S0010000_10 aqS15S0010000_10, Object obj) {
        AbstractC234519Ih it = (AbstractC234519Ih) obj;
        o.LJIIIZ(it, "it");
        ((C234529Ii) it).LJI = aqS15S0010000_10.z0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS15S0010000_10 aqS15S0010000_10, Object obj) {
        C59542NYk setState = (C59542NYk) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C59542NYk.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(Boolean.valueOf(aqS15S0010000_10.z0)), null, null, 28671);
    }

    public static final Object invoke$5(AqS15S0010000_10 aqS15S0010000_10, Object obj) {
        C59542NYk setState = (C59542NYk) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C59542NYk.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, new C43I(Boolean.valueOf(aqS15S0010000_10.z0)), null, null, null, 30719);
    }

    public static final Object invoke$6(AqS15S0010000_10 aqS15S0010000_10, Object obj) {
        C59542NYk setState = (C59542NYk) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C59542NYk.LIZ(setState, null, new C43I(Boolean.valueOf(aqS15S0010000_10.z0)), null, null, null, null, null, null, null, null, null, null, null, null, null, 32765);
    }

    public static final Object invoke$7(AqS15S0010000_10 aqS15S0010000_10, Object obj) {
        C59542NYk setState = (C59542NYk) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C59542NYk.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(Boolean.valueOf(aqS15S0010000_10.z0)), null, 24575);
    }

    public static final Object invoke$8(AqS15S0010000_10 aqS15S0010000_10, Object obj) {
        C59542NYk setState = (C59542NYk) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C59542NYk.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(Boolean.valueOf(aqS15S0010000_10.z0)), 16383);
    }
}
