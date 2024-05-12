package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.music.experiment.AddMusicToDspButtonConfig;

/* renamed from: X.KuR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53207KuR extends AbstractC65781Prl implements InterfaceC65784Pro<AddMusicToDspButtonConfig> {
    public static final C53207KuR LJLIL = new C53207KuR();

    public C53207KuR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.music.experiment.AddMusicToDspButtonConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AddMusicToDspButtonConfig invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("feed_add_to_music_dsp_config", AddMusicToDspButtonConfig.class, C53206KuQ.LIZIZ);
        if (LJIIIIZZ == 0) {
            return new AddMusicToDspButtonConfig();
        }
        return LJIIIIZZ;
    }
}
