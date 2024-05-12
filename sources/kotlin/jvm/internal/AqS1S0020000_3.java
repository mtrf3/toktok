package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C177616y5;
import X.C178336zF;
import X.C43I;
import X.InterfaceC88472Yns;
import X.OSZ;

/* loaded from: classes4.dex */
public class AqS1S0020000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;
    public boolean z1;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0020000_3(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
        this.z1 = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0020000_3(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
        this.z1 = z;
    }

    public static final Object invoke$0(AqS1S0020000_3 aqS1S0020000_3, Object obj) {
        C178336zF setStateImmediate = (C178336zF) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return C178336zF.LIZ(setStateImmediate, null, null, null, false, 0, null, null, null, null, false, null, null, new C43I(new OSZ(Boolean.valueOf(aqS1S0020000_3.z0), Boolean.valueOf(aqS1S0020000_3.z1))), null, false, false, false, 1015807);
    }

    public static final Object invoke$1(AqS1S0020000_3 aqS1S0020000_3, Object obj) {
        boolean z;
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        if (!aqS1S0020000_3.z0 && aqS1S0020000_3.z1) {
            z = true;
        } else {
            z = false;
        }
        return C177616y5.LIZ(setState, null, null, false, 0, 0, null, z, false, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, null, -513, 31);
    }

    public static final Object invoke$2(AqS1S0020000_3 aqS1S0020000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, false, 0, 0, null, false, false, null, null, null, new C43I(new OSZ(Boolean.valueOf(aqS1S0020000_3.z0), Boolean.valueOf(aqS1S0020000_3.z1))), null, null, false, null, null, null, false, false, false, false, false, false, null, -65537, 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0020000_3(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
