package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C122034qd;
import X.C5N1;
import X.C6MT;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.OSZ;

/* loaded from: classes3.dex */
public class AqS0S0020000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S0020000_2 aqS0S0020000_2, Object obj) {
        C122034qd editorPro = (C122034qd) obj;
        o.LJIIIZ(editorPro, "editorPro");
        C5N1 X8 = editorPro.LJIIJJI.X8();
        if (aqS0S0020000_2.z0) {
            X8.LJIIIZ(aqS0S0020000_2.z1);
        } else {
            X8.LJIIIIZZ(aqS0S0020000_2.z1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0020000_2 aqS0S0020000_2, Object obj) {
        C6MT setState = (C6MT) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C6MT.LIZ(setState, false, null, null, null, null, 0.0f, false, 0, null, null, new OSZ(Boolean.valueOf(aqS0S0020000_2.z0), Boolean.valueOf(aqS0S0020000_2.z1)), 1023);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0020000_2(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
