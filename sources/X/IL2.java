package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.measurement.mrc.experiment.MRCImpressionOptimizeConfig;

/* loaded from: classes9.dex */
public final class IL2 extends AbstractC65781Prl implements InterfaceC65784Pro<MRCImpressionOptimizeConfig> {
    public static final IL2 LJLIL = new IL2();

    public IL2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.measurement.mrc.experiment.MRCImpressionOptimizeConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final MRCImpressionOptimizeConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        MRCImpressionOptimizeConfig mRCImpressionOptimizeConfig = IL1.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("mrc_impression_optimize_experiment", MRCImpressionOptimizeConfig.class, mRCImpressionOptimizeConfig);
        if (LJIIIIZZ == 0) {
            return mRCImpressionOptimizeConfig;
        }
        return LJIIIIZZ;
    }
}
