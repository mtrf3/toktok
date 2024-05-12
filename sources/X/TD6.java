package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TD6 implements T43 {
    public final int LJLIL;
    public final Effect LJLILLLLZI;

    public TD6(int i, Effect effect) {
        this.LJLIL = i;
        this.LJLILLLLZI = effect;
    }

    @Override // X.T43
    public final boolean LJJIJIIJIL(Effect effect, int i, int i2) {
        o.LJIIIZ(effect, "effect");
        if (i == this.LJLIL && (o.LJ(effect.getEffectId(), this.LJLILLLLZI.getParentId()) || (ID0.LJIIZILJ(effect) && o.LJ(effect.getEffectId(), this.LJLILLLLZI.getEffectId())))) {
            return true;
        }
        return false;
    }
}
