package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes16.dex */
public final class XV2 implements IAVEffectService.EffectPlatformLoader {
    public final IAVEffectService LIZ;
    public InterfaceC84498XEg LIZIZ;

    public XV2(IAVEffectService effectService) {
        o.LJIIIZ(effectService, "effectService");
        this.LIZ = effectService;
        this.LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.EffectPlatformLoader
    public final void load(C10I<InterfaceC84498XEg, Void> continuation) {
        o.LJIIIZ(continuation, "continuation");
        n nVar = new n();
        InterfaceC84498XEg interfaceC84498XEg = this.LIZIZ;
        if (interfaceC84498XEg == null) {
            this.LIZ.buildEffectPlatform(EF7.LIZIZ(), new XV1(this, nVar, continuation), C43941HMj.LIZ());
        } else {
            nVar.LJ(interfaceC84498XEg);
            nVar.LIZ.LIZLLL(continuation);
        }
    }
}
