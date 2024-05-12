package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.music.ab.ArtistMusicOfflineConfig;

/* renamed from: X.9eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242169eu {
    public static final ArtistMusicOfflineConfig LIZ = new ArtistMusicOfflineConfig(null, 0, 3, null);

    public static ArtistMusicOfflineConfig LIZ() {
        ArtistMusicOfflineConfig artistMusicOfflineConfig = (ArtistMusicOfflineConfig) SettingsManager.LIZLLL().LJIIIIZZ("artist_music_offline_notice_config", ArtistMusicOfflineConfig.class, LIZ);
        if (artistMusicOfflineConfig == null) {
            return new ArtistMusicOfflineConfig(null, 0, 3, null);
        }
        return artistMusicOfflineConfig;
    }
}
