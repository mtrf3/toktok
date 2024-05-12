package Y;

import X.C76800UCe;
import X.C83556Wqm;
import X.C83560Wqq;
import X.InterfaceC88472Yns;

/* loaded from: classes15.dex */
public class AObjectS11S1101000_14 implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AObjectS11S1101000_14 aObjectS11S1101000_14, Object obj) {
        C83560Wqq c83560Wqq = (C83560Wqq) aObjectS11S1101000_14.l1;
        c83560Wqq.LJFF.runOnUiThread(new ARunnableS5S1201000_14(aObjectS11S1101000_14.i2, c83560Wqq, (Integer) obj, aObjectS11S1101000_14.s0, 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS11S1101000_14 aObjectS11S1101000_14, Object obj) {
        C83556Wqm c83556Wqm = (C83556Wqm) aObjectS11S1101000_14.l1;
        c83556Wqm.LJFF.runOnUiThread(new ARunnableS5S1201000_14(aObjectS11S1101000_14.i2, c83556Wqm, (Integer) obj, aObjectS11S1101000_14.s0, 2));
        return C76800UCe.LIZ;
    }

    public AObjectS11S1101000_14(Object obj, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i2 = i;
        this.s0 = str;
    }
}
