package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.TMm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74520TMm implements InterfaceC74533TMz {
    public final InterfaceC65784Pro<InterfaceC84497XEf> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C74520TMm(InterfaceC65784Pro<? extends InterfaceC84497XEf> effectPlatform) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZ = effectPlatform;
    }

    @Override // X.InterfaceC74533TMz
    public final boolean LIZ(Effect effect) {
        o.LJIIIZ(effect, "effect");
        return this.LIZ.invoke().LJJIL(effect);
    }
}
