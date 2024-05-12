package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.VolumeAdjustmentExperimentParams;

/* renamed from: X.5PA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5PA extends AbstractC65781Prl implements InterfaceC65784Pro<VolumeAdjustmentExperimentParams> {
    public static final C5PA LJLIL = new C5PA();

    public C5PA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.edit.model.VolumeAdjustmentExperimentParams, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final VolumeAdjustmentExperimentParams invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        VolumeAdjustmentExperimentParams volumeAdjustmentExperimentParams = C5P9.LIZIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "volume_adjustment_optimization", 31744, VolumeAdjustmentExperimentParams.class, volumeAdjustmentExperimentParams);
        if (LJIJ == 0) {
            C5P9.LIZ.getClass();
            return volumeAdjustmentExperimentParams;
        }
        return LJIJ;
    }
}
