package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.dsp.experiment.MusicDspConfig;

/* loaded from: classes16.dex */
public final class YBL extends AbstractC65781Prl implements InterfaceC65784Pro<MusicDspConfig> {
    public static final YBL LJLIL = new YBL();

    public YBL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.dsp.experiment.MusicDspConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final MusicDspConfig invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("music_dsp_config", MusicDspConfig.class, YBK.LIZIZ);
        if (LJIIIIZZ == 0) {
            return new MusicDspConfig();
        }
        return LJIIIIZZ;
    }
}
