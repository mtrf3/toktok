package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.TNb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC74535TNb<RESULT, INFO> implements TOA<Effect, RESULT, INFO> {
    public final InterfaceC65784Pro<InterfaceC84497XEf> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC74535TNb(InterfaceC65784Pro<? extends InterfaceC84497XEf> effectPlatform) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZ = effectPlatform;
    }

    @Override // X.TOA
    public final void LIZIZ(Effect effect, TO7 to7) {
        Effect key = effect;
        o.LJIIIZ(key, "key");
        this.LIZ.invoke().LJJIIZI(key, new TNK(this, (TOZ) to7, key));
    }
}
