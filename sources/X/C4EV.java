package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.search.voice.core.config.TiktokMusicSearchEngineSettingsSettings;

/* renamed from: X.4EV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EV extends AbstractC65781Prl implements InterfaceC65784Pro<TiktokMusicSearchEngineSettingsSettings.TiktokMusicSearchEngineSettingsModel> {
    public static final C4EV LJLIL = new C4EV();

    public C4EV() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.search.voice.core.config.TiktokMusicSearchEngineSettingsSettings$TiktokMusicSearchEngineSettingsModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final TiktokMusicSearchEngineSettingsSettings.TiktokMusicSearchEngineSettingsModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        TiktokMusicSearchEngineSettingsSettings.TiktokMusicSearchEngineSettingsModel tiktokMusicSearchEngineSettingsModel = TiktokMusicSearchEngineSettingsSettings.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("tiktok_music_search_engine_settings", TiktokMusicSearchEngineSettingsSettings.TiktokMusicSearchEngineSettingsModel.class, tiktokMusicSearchEngineSettingsModel);
        if (LJIIIIZZ == 0) {
            return tiktokMusicSearchEngineSettingsModel;
        }
        return LJIIIIZZ;
    }
}
