package X;

import com.ss.android.ugc.aweme.relation.monitor.MonitorSamplingConfig;

/* loaded from: classes14.dex */
public final class V0V extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final V0V LJLIL = new V0V();

    public V0V() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (MonitorSamplingConfig.LIZ().recUserRefresh >= MonitorSamplingConfig.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
