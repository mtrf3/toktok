package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.relation.monitor.MonitorSamplingConfig;

/* loaded from: classes14.dex */
public final class V0Y extends AbstractC65781Prl implements InterfaceC65784Pro<MonitorSamplingConfig.ConfigValue> {
    public static final V0Y LJLIL = new V0Y();

    public V0Y() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.relation.monitor.MonitorSamplingConfig$ConfigValue, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final MonitorSamplingConfig.ConfigValue invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        MonitorSamplingConfig.ConfigValue configValue = MonitorSamplingConfig.LIZIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("relation_monitor_sampling", MonitorSamplingConfig.ConfigValue.class, configValue);
        if (LJIIIIZZ == 0) {
            return configValue;
        }
        return LJIIIIZZ;
    }
}
