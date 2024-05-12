package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusAccuracyAnalysisConfig;

/* renamed from: X.Dxa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35566Dxa extends AbstractC65781Prl implements InterfaceC65784Pro<ActivityStatusAccuracyAnalysisConfig> {
    public static final C35566Dxa LJLIL = new C35566Dxa();

    public C35566Dxa() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusAccuracyAnalysisConfig] */
    @Override // X.InterfaceC65784Pro
    public final ActivityStatusAccuracyAnalysisConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ActivityStatusAccuracyAnalysisConfig activityStatusAccuracyAnalysisConfig = C35564DxY.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("tt_im_show_activity_status_accuracy_analysis", ActivityStatusAccuracyAnalysisConfig.class, activityStatusAccuracyAnalysisConfig);
        if (LJIIIIZZ == 0) {
            return activityStatusAccuracyAnalysisConfig;
        }
        return LJIIIIZZ;
    }
}
