package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.experiment.GuideUserBindPhoneNumberConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.9zx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C255219zx {
    public static final GuideUserBindPhoneNumberConfig LIZ = new GuideUserBindPhoneNumberConfig();

    public static final GuideUserBindPhoneNumberConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        GuideUserBindPhoneNumberConfig guideUserBindPhoneNumberConfig = LIZ;
        GuideUserBindPhoneNumberConfig guideUserBindPhoneNumberConfig2 = (GuideUserBindPhoneNumberConfig) LIZLLL.LJIIIIZZ("remind_bar_freq", GuideUserBindPhoneNumberConfig.class, guideUserBindPhoneNumberConfig);
        if (guideUserBindPhoneNumberConfig2 != null) {
            guideUserBindPhoneNumberConfig = guideUserBindPhoneNumberConfig2;
        }
        o.LJIIIIZZ(guideUserBindPhoneNumberConfig, "SettingsManager.getInsta….java)\n        ?: DEFAULT");
        return guideUserBindPhoneNumberConfig;
    }
}
