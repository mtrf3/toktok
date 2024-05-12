package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class TO5<RESULT, INFO> implements TOA<ProviderEffect, RESULT, INFO> {
    public final InterfaceC65784Pro<InterfaceC84497XEf> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public TO5(InterfaceC65784Pro<? extends InterfaceC84497XEf> effectPlatform) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZ = effectPlatform;
    }

    @Override // X.TOA
    public final void LIZIZ(ProviderEffect providerEffect, TO7 to7) {
        ProviderEffect key = providerEffect;
        o.LJIIIZ(key, "key");
        this.LIZ.invoke().LJIIJ(key, new TO6(this, (C74534TNa) to7, key));
    }
}
