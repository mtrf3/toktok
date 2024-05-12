package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TMs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74526TMs extends AbstractC74560TOa<Effect, Effect, C44371HbD> implements InterfaceC74530TMw {
    public final InterfaceC74533TMz LJII;
    public final InterfaceC65784Pro<InterfaceC74531TMx> LJIIIIZZ;

    @Override // X.AbstractC74560TOa
    public final String LJI(Effect effect) {
        Effect key = effect;
        o.LJIIIZ(key, "key");
        String effectId = key.getEffectId();
        if (effectId.length() > 0) {
            return effectId;
        }
        return key.getId();
    }

    public C74526TMs(C74520TMm c74520TMm, AqS162S0100000_12 aqS162S0100000_12) {
        super(3);
        this.LJII = c74520TMm;
        this.LJIIIIZZ = aqS162S0100000_12;
    }

    @Override // X.AbstractC74560TOa
    public final void LJFF(Object obj, TOZ toz) {
        Effect key = (Effect) obj;
        o.LJIIIZ(key, "key");
        if (this.LJII.LIZ(key)) {
            toz.LJIIJJI(key, key);
        } else {
            this.LJIIIIZZ.invoke().LIZIZ(key, toz);
        }
    }
}
