package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C77186URa;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.UR7;
import X.URZ;
import X.US3;
import X.US6;
import X.US7;

/* loaded from: classes14.dex */
public class AqS0S2210000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

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

    public static final Object invoke$0(AqS0S2210000_13 aqS0S2210000_13, Object obj) {
        US3 buildAuthPipeline = (US3) obj;
        o.LJIIIZ(buildAuthPipeline, "$this$buildAuthPipeline");
        buildAuthPipeline.LIZLLL((InterfaceC70422pa) aqS0S2210000_13.l2);
        buildAuthPipeline.LIZJ(US6.LJLIL);
        buildAuthPipeline.LJ(new AqS14S2000000_13(aqS0S2210000_13.s0, aqS0S2210000_13.s1, 1));
        buildAuthPipeline.LIZIZ(new URZ((UR7) aqS0S2210000_13.l3, aqS0S2210000_13.z4));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S2210000_13 aqS0S2210000_13, Object obj) {
        US3 buildAuthPipeline = (US3) obj;
        o.LJIIIZ(buildAuthPipeline, "$this$buildAuthPipeline");
        buildAuthPipeline.LIZLLL((InterfaceC70422pa) aqS0S2210000_13.l2);
        buildAuthPipeline.LIZJ(US7.LJLIL);
        buildAuthPipeline.LJ(new AqS14S2000000_13(aqS0S2210000_13.s0, aqS0S2210000_13.s1, 2));
        buildAuthPipeline.LIZIZ(new C77186URa((UR7) aqS0S2210000_13.l3, aqS0S2210000_13.z4));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2210000_13(InterfaceC70422pa interfaceC70422pa, String str, String str2, UR7 ur7, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l2 = interfaceC70422pa;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = ur7;
        this.z4 = z;
    }
}
