package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.VideoSmartCroppingSettingsConfig;

/* renamed from: X.95j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2311595j extends AbstractC65781Prl implements InterfaceC65784Pro<VideoSmartCroppingSettingsConfig> {
    public static final C2311595j LJLIL = new C2311595j();

    public C2311595j() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.experiment.VideoSmartCroppingSettingsConfig] */
    @Override // X.InterfaceC65784Pro
    public final VideoSmartCroppingSettingsConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        VideoSmartCroppingSettingsConfig videoSmartCroppingSettingsConfig = C2311495i.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("video_smart_cropping_settings", VideoSmartCroppingSettingsConfig.class, videoSmartCroppingSettingsConfig);
        if (LJIIIIZZ == 0) {
            return videoSmartCroppingSettingsConfig;
        }
        return LJIIIIZZ;
    }
}
