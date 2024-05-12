package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.measurement.video.VideoMeasurementConfig;

/* renamed from: X.IEc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46274IEc extends AbstractC65781Prl implements InterfaceC65784Pro<VideoMeasurementConfig> {
    public static final C46274IEc LJLIL = new C46274IEc();

    public C46274IEc() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.measurement.video.VideoMeasurementConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final VideoMeasurementConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        VideoMeasurementConfig videoMeasurementConfig = C46273IEb.LIZIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("commerce_video_measurement_config", VideoMeasurementConfig.class, videoMeasurementConfig);
        if (LJIIIIZZ == 0) {
            return videoMeasurementConfig;
        }
        return LJIIIIZZ;
    }
}
