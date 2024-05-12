package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.dsp.experiment.MusicDspNewEntranceConfig;

/* renamed from: X.YbI, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87692YbI extends AbstractC65781Prl implements InterfaceC65784Pro<MusicDspNewEntranceConfig> {
    public static final C87692YbI LJLIL = new C87692YbI();

    public C87692YbI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.dsp.experiment.MusicDspNewEntranceConfig] */
    @Override // X.InterfaceC65784Pro
    public final MusicDspNewEntranceConfig invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("music_dsp_new_entrance_config", MusicDspNewEntranceConfig.class, C87691YbH.LIZIZ);
        if (LJIIIIZZ == 0) {
            return new MusicDspNewEntranceConfig();
        }
        return LJIIIIZZ;
    }
}
