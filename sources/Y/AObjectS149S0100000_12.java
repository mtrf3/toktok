package Y;

import X.C70858RrS;
import X.C76800UCe;
import X.C78915Uy7;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AObjectS149S0100000_12 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;

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

    public AObjectS149S0100000_12(AqS178S0100000_12 aqS178S0100000_12, int i) {
        this.$t = i;
        this.l0 = aqS178S0100000_12;
    }

    public static final Object invoke$0(AObjectS149S0100000_12 aObjectS149S0100000_12, Object obj) {
        C70858RrS p1 = (C70858RrS) obj;
        o.LJIIIZ(p1, "p1");
        C78915Uy7.LJJIZ(p1, "lib_track_builtin_lane_param_pass", (InterfaceC88472Yns) aObjectS149S0100000_12.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS149S0100000_12 aObjectS149S0100000_12, Object obj) {
        C70858RrS p1 = (C70858RrS) obj;
        o.LJIIIZ(p1, "p1");
        C78915Uy7.LJJIZ(p1, "lib_track_builtin_lane_param_pass", (InterfaceC88472Yns) aObjectS149S0100000_12.l0);
        return C76800UCe.LIZ;
    }
}
