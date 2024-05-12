package X;

import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.TNm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC74546TNm<RESULT, INFO> implements TOA<InfoStickerEffect, RESULT, INFO> {
    public final InterfaceC65784Pro<InterfaceC84497XEf> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC74546TNm(InterfaceC65784Pro<? extends InterfaceC84497XEf> effectPlatform) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZ = effectPlatform;
    }

    @Override // X.TOA
    public final void LIZIZ(InfoStickerEffect infoStickerEffect, TO7 to7) {
        InfoStickerEffect key = infoStickerEffect;
        o.LJIIIZ(key, "key");
        this.LIZ.invoke().LJJJJJL(new C74548TNo(this, (TNZ) to7, key), key);
    }
}
