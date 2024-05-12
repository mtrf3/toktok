package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.dsp.experiment.MusicArtistCertificationConfig;

/* renamed from: X.9lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246179lN extends AbstractC65781Prl implements InterfaceC65784Pro<MusicArtistCertificationConfig> {
    public static final C246179lN LJLIL = new C246179lN();

    public C246179lN() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.dsp.experiment.MusicArtistCertificationConfig] */
    @Override // X.InterfaceC65784Pro
    public final MusicArtistCertificationConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        MusicArtistCertificationConfig musicArtistCertificationConfig = C246139lJ.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("music_artist_certification_settings", MusicArtistCertificationConfig.class, musicArtistCertificationConfig);
        if (LJIIIIZZ == 0) {
            return musicArtistCertificationConfig;
        }
        return LJIIIIZZ;
    }
}
