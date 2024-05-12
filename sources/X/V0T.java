package X;

import com.ss.android.ugc.aweme.relation.monitor.MonitorSamplingConfig;

/* loaded from: classes14.dex */
public final class V0T extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final V0T LJLIL = new V0T();

    public V0T() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (MonitorSamplingConfig.LIZ().imageValue >= MonitorSamplingConfig.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
