package com.ss.android.ugc.aweme.effectplatform;

import X.C44191HVz;
import X.C48841JEv;
import X.C60903NvH;
import X.C76800UCe;
import X.C78613UtF;
import X.HW5;
import X.InterfaceC88472Yns;
import X.XKX;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EffectStorageCleanServiceImpl implements IEffectStorageCleanService {
    @Override // com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService
    public final void tryClean(InterfaceC88472Yns<? super Long, C76800UCe> cleanCallback) {
        o.LJIIIZ(cleanCallback, "cleanCallback");
        if (!((Boolean) C44191HVz.LIZ.getValue()).booleanValue()) {
            cleanCallback.invoke(0L);
            return;
        }
        IEffectPlatformFactory LIZ = EffectPlatformFactory.LIZ();
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(C60903NvH.LJ);
        EffectConfiguration build = LIZ.createEffectConfigurationBuilder(effectPlatformBuilder).build();
        o.LJIIIIZZ(build, "get()\n            .getSe…())\n            ).build()");
        EffectManager effectManager = new EffectManager();
        effectManager.init(build);
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new HW5(build, effectManager, cleanCallback, null), 3);
    }
}
