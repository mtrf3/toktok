package X;

import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.knadapt.DataPreProcess;

/* renamed from: X.XDx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84489XDx extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC84498XEg> {
    public static final C84489XDx LJLIL = new C84489XDx();

    public C84489XDx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC84498XEg invoke() {
        IEffectPlatformFactory LIZ = EffectPlatformFactory.LIZ();
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(C60903NvH.LJ);
        effectPlatformBuilder.setSingleton(true);
        DataPreProcess.enable = ((Boolean) C84488XDw.LIZ.getValue()).booleanValue();
        DataPreProcess.enableOptimize = C52510KjC.LIZ();
        return LIZ.create(effectPlatformBuilder);
    }
}
