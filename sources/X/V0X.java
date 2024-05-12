package X;

import com.ss.android.ugc.aweme.relation.monitor.MonitorSamplingConfig;

/* loaded from: classes14.dex */
public final class V0X extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final V0X LJLIL = new V0X();

    public V0X() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (MonitorSamplingConfig.LIZ().recUserScene >= MonitorSamplingConfig.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
