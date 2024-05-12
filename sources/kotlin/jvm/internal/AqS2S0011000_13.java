package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C72912tb;
import X.C75814TpC;
import X.C76439TzH;
import X.C76449TzR;
import X.F9E;
import X.InterfaceC88472Yns;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;

/* loaded from: classes14.dex */
public class AqS2S0011000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
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

    public static final Object invoke$0(AqS2S0011000_13 aqS2S0011000_13, Object obj) {
        BattleItem4FEModel battleItem4FEModel;
        BattleItem4FEModel battleItem4FEModel2;
        BattleItem4FEModel battleItem4FEModel3;
        BattleItem4FEModel battleItem4FEModel4;
        C76439TzH setState = (C76439TzH) obj;
        o.LJIIIZ(setState, "$this$setState");
        C76449TzR c76449TzR = new C76449TzR(aqS2S0011000_13.i1, aqS2S0011000_13.z0);
        if (aqS2S0011000_13.z0 && aqS2S0011000_13.i1 == 1) {
            battleItem4FEModel = new BattleItem4FEModel();
        } else {
            battleItem4FEModel = setState.LJLIL;
        }
        if (aqS2S0011000_13.z0 && aqS2S0011000_13.i1 == 2) {
            battleItem4FEModel2 = new BattleItem4FEModel();
        } else {
            battleItem4FEModel2 = setState.LJLILLLLZI;
        }
        if (!aqS2S0011000_13.z0 && aqS2S0011000_13.i1 == 2) {
            battleItem4FEModel3 = new BattleItem4FEModel();
        } else {
            battleItem4FEModel3 = setState.LJLJJI;
        }
        if (!aqS2S0011000_13.z0 && aqS2S0011000_13.i1 == 1) {
            battleItem4FEModel4 = new BattleItem4FEModel();
        } else {
            battleItem4FEModel4 = setState.LJLJI;
        }
        return C76439TzH.L(battleItem4FEModel, battleItem4FEModel2, battleItem4FEModel4, battleItem4FEModel3, c76449TzR);
    }

    public static final Object invoke$1(AqS2S0011000_13 aqS2S0011000_13, Object obj) {
        C75814TpC setStateImmediate = (C75814TpC) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return C75814TpC.LIZ(setStateImmediate, 0L, null, null, new C72912tb(new F9E(aqS2S0011000_13.i1, aqS2S0011000_13.z0) { // from class: X.2Mz
            public final int LJLIL;
            public final boolean LJLILLLLZI;

            @Override // X.F9E
            public final Object[] getObjects() {
                return new Object[]{Integer.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI)};
            }

            {
                this.LJLIL = r1;
                this.LJLILLLLZI = r2;
            }
        }), null, 23);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S0011000_13(int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.z0 = z;
    }
}
