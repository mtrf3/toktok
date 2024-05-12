package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings;

/* renamed from: X.4d3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113614d3 extends AbstractC65781Prl implements InterfaceC65784Pro<VoiceSearchMultiLanguageSettings.TiktokVoiceSearchMultiLanguageSettingsModel> {
    public static final C113614d3 LJLIL = new C113614d3();

    public C113614d3() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings$TiktokVoiceSearchMultiLanguageSettingsModel] */
    @Override // X.InterfaceC65784Pro
    public final VoiceSearchMultiLanguageSettings.TiktokVoiceSearchMultiLanguageSettingsModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        VoiceSearchMultiLanguageSettings.TiktokVoiceSearchMultiLanguageSettingsModel tiktokVoiceSearchMultiLanguageSettingsModel = VoiceSearchMultiLanguageSettings.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("tiktok_voice_search_multi_language_settings", VoiceSearchMultiLanguageSettings.TiktokVoiceSearchMultiLanguageSettingsModel.class, tiktokVoiceSearchMultiLanguageSettingsModel);
        if (LJIIIIZZ == 0) {
            return tiktokVoiceSearchMultiLanguageSettingsModel;
        }
        return LJIIIIZZ;
    }
}
