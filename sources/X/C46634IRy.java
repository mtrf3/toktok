package X;

import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;

/* renamed from: X.IRy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46634IRy extends AbstractC65781Prl implements InterfaceC65784Pro<SuperResolutionStrategyConfigV2> {
    public static final C46634IRy LJLIL = new C46634IRy();

    public C46634IRy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SuperResolutionStrategyConfigV2 invoke() {
        ICommonConfig commonConfig;
        ISimKitConfig config = C1DG.LIZ().getConfig();
        if (config == null || (commonConfig = config.getCommonConfig()) == null) {
            return null;
        }
        return commonConfig.getSuperResolutionStrategyConfigV2();
    }
}
