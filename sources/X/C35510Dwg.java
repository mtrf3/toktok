package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.appsettings.IMSparkViewReuseConfig;

/* renamed from: X.Dwg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35510Dwg {
    public static final IMSparkViewReuseConfig LIZ = new IMSparkViewReuseConfig(false, 0, 0, false, null, null, 63, null);

    public static IMSparkViewReuseConfig LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            IMSparkViewReuseConfig iMSparkViewReuseConfig = (IMSparkViewReuseConfig) SettingsManager.LJII("im_spark_view_reuse_settings", IMSparkViewReuseConfig.class);
            if (iMSparkViewReuseConfig == null) {
                return LIZ;
            }
            return iMSparkViewReuseConfig;
        } catch (Throwable unused) {
            return LIZ;
        }
    }
}
