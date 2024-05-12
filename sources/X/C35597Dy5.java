package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.hybridkit.experiment.TiktokInterceptIllegalBundleConfigModel;

/* renamed from: X.Dy5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35597Dy5 {
    public static final TiktokInterceptIllegalBundleConfigModel LIZ = new TiktokInterceptIllegalBundleConfigModel(true, true, C47261Igj.LJJIJIL(".."));

    public static final TiktokInterceptIllegalBundleConfigModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        TiktokInterceptIllegalBundleConfigModel tiktokInterceptIllegalBundleConfigModel = LIZ;
        TiktokInterceptIllegalBundleConfigModel tiktokInterceptIllegalBundleConfigModel2 = (TiktokInterceptIllegalBundleConfigModel) LIZLLL.LJIIIIZZ("tiktok_intercept_illegal_bundle_config", TiktokInterceptIllegalBundleConfigModel.class, tiktokInterceptIllegalBundleConfigModel);
        if (tiktokInterceptIllegalBundleConfigModel2 == null) {
            return tiktokInterceptIllegalBundleConfigModel;
        }
        return tiktokInterceptIllegalBundleConfigModel2;
    }
}
