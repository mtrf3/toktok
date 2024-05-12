package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.measurement.mrc.experiment.MRCImpressionEventAbModel;

/* loaded from: classes16.dex */
public final class YHA extends AbstractC65781Prl implements InterfaceC65784Pro<MRCImpressionEventAbModel> {
    public static final YHA LJLIL = new YHA();

    public YHA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.measurement.mrc.experiment.MRCImpressionEventAbModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final MRCImpressionEventAbModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        MRCImpressionEventAbModel mRCImpressionEventAbModel = YH8.LIZIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("mrc_impression_experiment", MRCImpressionEventAbModel.class, mRCImpressionEventAbModel);
        if (LJIIIIZZ == 0) {
            return mRCImpressionEventAbModel;
        }
        return LJIIIIZZ;
    }
}
