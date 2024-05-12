package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.dsp.experiment.AFSettings;

/* loaded from: classes13.dex */
public final class SVC extends AbstractC65781Prl implements InterfaceC65784Pro<AFSettings> {
    public static final SVC LJLIL = new SVC();

    public SVC() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.dsp.experiment.AFSettings, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AFSettings invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("music_dsp_af_settings", AFSettings.class, SV9.LIZIZ);
        if (LJIIIIZZ == 0) {
            return new AFSettings();
        }
        return LJIIIIZZ;
    }
}
