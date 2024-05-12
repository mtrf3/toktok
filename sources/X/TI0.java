package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TI0 implements InterfaceC73389SrB {
    public final InterfaceC65784Pro<InterfaceC84497XEf> LIZ;
    public final C74385THh LIZIZ;

    @Override // X.InterfaceC73389SrB
    public final boolean LIZ(Effect effect) {
        o.LJIIIZ(effect, "effect");
        if (o.LJ(this.LIZIZ.LJLLLLLL, effect.getEffect_id())) {
            return true;
        }
        InterfaceC84497XEf checkEffectExist = this.LIZ.invoke();
        o.LJIIIZ(checkEffectExist, "$this$checkEffectExist");
        if (effect.getEffectType() != 0 || checkEffectExist.LJJIL(effect)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73389SrB
    public final boolean LIZIZ(Effect effect) {
        o.LJIIIZ(effect, "effect");
        return C30591Hz.LJII(effect, this.LIZ.invoke());
    }

    public TI0(AqS162S0100000_12 aqS162S0100000_12, C74385THh c74385THh) {
        this.LIZ = aqS162S0100000_12;
        this.LIZIZ = c74385THh;
    }
}
