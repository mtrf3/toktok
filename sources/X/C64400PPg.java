package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.dsp.experiment.PerformanceConfig;

/* renamed from: X.PPg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64400PPg extends AbstractC65781Prl implements InterfaceC65784Pro<PerformanceConfig> {
    public static final C64400PPg LJLIL = new C64400PPg();

    public C64400PPg() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.dsp.experiment.PerformanceConfig] */
    @Override // X.InterfaceC65784Pro
    public final PerformanceConfig invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("music_dsp_performance_config", PerformanceConfig.class, C64399PPf.LIZIZ);
        if (LJIIIIZZ == 0) {
            return new PerformanceConfig();
        }
        return LJIIIIZZ;
    }
}
