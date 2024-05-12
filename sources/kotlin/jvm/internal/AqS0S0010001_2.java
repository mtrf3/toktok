package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C133355Lf;
import X.C144955mV;
import X.C5M1;
import X.InterfaceC88472Yns;
import X.OSZ;

/* loaded from: classes3.dex */
public class AqS0S0010001_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public float f1;
    public boolean z0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S0010001_2 aqS0S0010001_2, Object obj) {
        C5M1 setState = (C5M1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5M1.LIZ(setState, null, aqS0S0010001_2.z0, null, null, false, null, false, new C133355Lf(false, aqS0S0010001_2.f1, true), 0, null, null, null, null, null, null, null, null, null, null, false, null, 2097021);
    }

    public static final Object invoke$1(AqS0S0010001_2 aqS0S0010001_2, Object obj) {
        C144955mV setState = (C144955mV) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C144955mV.LIZ(setState, null, null, new OSZ(Boolean.valueOf(aqS0S0010001_2.z0), Float.valueOf(aqS0S0010001_2.f1)), null, 23);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0010001_2(boolean z, float f, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.f1 = f;
    }
}
