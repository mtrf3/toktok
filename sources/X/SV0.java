package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.dsp.experiment.AnchorSettings;

/* loaded from: classes13.dex */
public final class SV0 extends AbstractC65781Prl implements InterfaceC65784Pro<AnchorSettings> {
    public static final SV0 LJLIL = new SV0();

    public SV0() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.dsp.experiment.AnchorSettings, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AnchorSettings invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("music_dsp_anchor_settings", AnchorSettings.class, C72193SUz.LIZIZ);
        if (LJIIIIZZ == 0) {
            return new AnchorSettings();
        }
        return LJIIIIZZ;
    }
}
