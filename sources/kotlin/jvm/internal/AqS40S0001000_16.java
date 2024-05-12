package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1539362j;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectState;

/* loaded from: classes17.dex */
public class AqS40S0001000_16 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS40S0001000_16(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS40S0001000_16 aqS40S0001000_16, Object obj) {
        FTCEditEffectState setStateImmediate = (FTCEditEffectState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return FTCEditEffectState.copy$default(setStateImmediate, null, Integer.valueOf(aqS40S0001000_16.i0), null, null, null, null, 61, null);
    }

    public static final Object invoke$1(AqS40S0001000_16 aqS40S0001000_16, Object obj) {
        FTCEditEffectState setStateImmediate = (FTCEditEffectState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return FTCEditEffectState.copy$default(setStateImmediate, null, null, null, null, null, new C1539362j(aqS40S0001000_16.i0), 31, null);
    }
}
