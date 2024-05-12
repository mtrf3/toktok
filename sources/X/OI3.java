package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.gamora.editor.text.TextModeBackgroundSettings;

/* loaded from: classes11.dex */
public final class OI3 extends AbstractC65781Prl implements InterfaceC65784Pro<TextModeBackgroundSettings.TextModeBackgroundConfig> {
    public static final OI3 LJLIL = new OI3();

    public OI3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TextModeBackgroundSettings.TextModeBackgroundConfig invoke() {
        TextModeBackgroundSettings.TextModeBackgroundConfig textModeBackgroundConfig;
        try {
            SettingsManager.LIZLLL().getClass();
            Object LJII = SettingsManager.LJII("textmode_background_config", TextModeBackgroundSettings.TextModeBackgroundConfig.class);
            if (!(LJII instanceof TextModeBackgroundSettings.TextModeBackgroundConfig) || (textModeBackgroundConfig = (TextModeBackgroundSettings.TextModeBackgroundConfig) LJII) == null) {
                return TextModeBackgroundSettings.LIZ;
            }
            return textModeBackgroundConfig;
        } catch (Throwable unused) {
            return TextModeBackgroundSettings.LIZ;
        }
    }
}
