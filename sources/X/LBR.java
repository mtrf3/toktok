package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.chatlist.experiment.DMAvatarLoadConfig;

/* loaded from: classes10.dex */
public final class LBR extends AbstractC65781Prl implements InterfaceC65784Pro<DMAvatarLoadConfig> {
    public static final LBR LJLIL = new LBR();

    public LBR() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final DMAvatarLoadConfig invoke() {
        DMAvatarLoadConfig dMAvatarLoadConfig;
        try {
            DMAvatarLoadConfig dMAvatarLoadConfig2 = (DMAvatarLoadConfig) SettingsManager.LIZLLL().LJIIIIZZ("tt_im_avatar_load_config", DMAvatarLoadConfig.class, LBS.LIZ);
            C3C5.m7constructorimpl(dMAvatarLoadConfig2);
            dMAvatarLoadConfig = dMAvatarLoadConfig2;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            dMAvatarLoadConfig = LIZ;
        }
        if (C3C5.m12isFailureimpl(dMAvatarLoadConfig) || dMAvatarLoadConfig == 0) {
            return LBS.LIZ;
        }
        return dMAvatarLoadConfig;
    }
}
