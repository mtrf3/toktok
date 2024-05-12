package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.measurement.exposure.ExposureMeasurementConfig;

/* renamed from: X.2Tg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59002Tg extends AbstractC65781Prl implements InterfaceC65784Pro<ExposureMeasurementConfig> {
    public static final C59002Tg LJLIL = new C59002Tg();

    public C59002Tg() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.commercialize.measurement.exposure.ExposureMeasurementConfig] */
    @Override // X.InterfaceC65784Pro
    public final ExposureMeasurementConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ExposureMeasurementConfig exposureMeasurementConfig = C58992Tf.LIZIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("exposure_measurement_experiment", ExposureMeasurementConfig.class, exposureMeasurementConfig);
        if (LJIIIIZZ == 0) {
            return exposureMeasurementConfig;
        }
        return LJIIIIZZ;
    }
}
