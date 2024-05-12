package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.bot.DMASRSpeechOptions;

/* renamed from: X.4EC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EC extends AbstractC65781Prl implements InterfaceC65784Pro<DMASRSpeechOptions> {
    public static final C4EC LJLIL = new C4EC();

    public C4EC() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.im.service.bot.DMASRSpeechOptions] */
    @Override // X.InterfaceC65784Pro
    public final DMASRSpeechOptions invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        DMASRSpeechOptions dMASRSpeechOptions = C4EA.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("dm_tako_voice_input_asr_options", DMASRSpeechOptions.class, dMASRSpeechOptions);
        if (LJIIIIZZ == 0) {
            return dMASRSpeechOptions;
        }
        return LJIIIIZZ;
    }
}
