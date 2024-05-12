package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ad.settings.IntentSchemeInterceptConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NUL {
    public static final IntentSchemeInterceptConfig[] LIZ = new IntentSchemeInterceptConfig[0];

    public static IntentSchemeInterceptConfig[] LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            Object LJII = SettingsManager.LJII("intent_scheme_intercept_config", IntentSchemeInterceptConfig[].class);
            o.LJIIIIZZ(LJII, "{\n            SettingsMa…gs::class.java)\n        }");
            return (IntentSchemeInterceptConfig[]) LJII;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return LIZ;
        }
    }
}
