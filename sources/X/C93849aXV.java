package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.search.voice.core.config.TiktokMusicSearchEngineSettingsSettings;

/* renamed from: X.aXV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93849aXV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SpeechEngine speechEngine) {
        String str;
        TiktokMusicSearchEngineSettingsSettings.TiktokMusicSearchEngineSettingsModel tiktokMusicSearchEngineSettingsModel = (TiktokMusicSearchEngineSettingsSettings.TiktokMusicSearchEngineSettingsModel) TiktokMusicSearchEngineSettingsSettings.LIZIZ.getValue();
        String valueOf = String.valueOf(EF7.LJIIIZ);
        RBY LJFF = AccountService.LJIJ().LJFF();
        if (LJFF.isLogin()) {
            str = LJFF.getCurUserId();
        } else {
            str = "DEFAULT_USER";
        }
        speechEngine.setOptionString("appid", valueOf);
        speechEngine.setOptionString("uid", str);
        speechEngine.setOptionString("engine_name", "au");
        speechEngine.setOptionString("au_address", tiktokMusicSearchEngineSettingsModel.address);
        speechEngine.setOptionString("au_uri", tiktokMusicSearchEngineSettingsModel.uri);
        speechEngine.setOptionString("au_cluster", tiktokMusicSearchEngineSettingsModel.cluster);
        speechEngine.setOptionInt("au_ability", 2);
        speechEngine.setOptionInt("au_conn_timeout", 3000);
        speechEngine.setOptionInt("au_recv_timeout", 5000);
        speechEngine.setOptionInt("vad_max_music_duration", tiktokMusicSearchEngineSettingsModel.maxSpeechDuration);
        speechEngine.setOptionInt("au_process_timeout", tiktokMusicSearchEngineSettingsModel.maxProcessTimeout);
        speechEngine.setOptionInt("sample_rate", 16000);
        speechEngine.setOptionInt("channel", 1);
        speechEngine.setOptionString("recorder_data_source_type", "Recorder");
        speechEngine.setOptionBoolean("au_auto_stop", true);
    }
}
