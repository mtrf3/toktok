package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.search.voice.core.config.TiktokMusicSearchEngineSettingsSettings;
import com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings;

/* renamed from: X.aZL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93963aZL {
    public static int LIZ = -1;

    public static void LIZ(SpeechEngine speechEngine, String str) {
        String str2;
        VoiceSearchMultiLanguageSettings.TiktokVoiceSearchMultiLanguageSettingsModel tiktokVoiceSearchMultiLanguageSettingsModel = (VoiceSearchMultiLanguageSettings.TiktokVoiceSearchMultiLanguageSettingsModel) VoiceSearchMultiLanguageSettings.LIZIZ.getValue();
        String valueOf = String.valueOf(EF7.LJIIIZ);
        RBY LJFF = AccountService.LJIJ().LJFF();
        if (LJFF.isLogin()) {
            str2 = LJFF.getCurUserId();
        } else {
            str2 = "DEFAULT_USER";
        }
        C93877aXx.LIZ.getClass();
        if (C93877aXx.LIZ()) {
            TiktokMusicSearchEngineSettingsSettings.TiktokMusicSearchEngineSettingsModel tiktokMusicSearchEngineSettingsModel = (TiktokMusicSearchEngineSettingsSettings.TiktokMusicSearchEngineSettingsModel) TiktokMusicSearchEngineSettingsSettings.LIZIZ.getValue();
            speechEngine.setOptionString("engine_name", "au");
            speechEngine.setOptionInt("au_ability", 3);
            speechEngine.setOptionInt("vad_max_music_duration", tiktokMusicSearchEngineSettingsModel.maxSpeechDuration);
        } else {
            speechEngine.setOptionString("engine_name", "asr");
        }
        speechEngine.setOptionString("log_level", "TRACE");
        speechEngine.setOptionString("appid", valueOf);
        speechEngine.setOptionString("uid", str2);
        speechEngine.setOptionBoolean("enable_get_volume", false);
        speechEngine.setOptionBoolean("recorder_disable_reuse", false);
        speechEngine.setOptionString("recorder_data_source_type", "Recorder");
        speechEngine.setOptionString("asr_address", tiktokVoiceSearchMultiLanguageSettingsModel.address);
        speechEngine.setOptionBoolean("asr_auto_stop", true);
        speechEngine.setOptionBoolean("asr_show_punctuation", true);
        speechEngine.setOptionInt("asr_conn_timeout", 3000);
        speechEngine.setOptionInt("asr_recv_timeout", 5000);
        speechEngine.setOptionBoolean("asr_show_utterances", true);
        speechEngine.setOptionString("asr_uri", tiktokVoiceSearchMultiLanguageSettingsModel.saucUri);
        speechEngine.setOptionString("asr_cluster", tiktokVoiceSearchMultiLanguageSettingsModel.saucCluster);
        speechEngine.setOptionBoolean("asr_enable_itn", true);
        speechEngine.setOptionString("asr_language", str);
    }
}
