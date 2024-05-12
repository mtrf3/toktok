package X;

import com.ss.android.ugc.aweme.discover.experiment.DiscoveryCommonPoolExperiment;

/* loaded from: classes10.dex */
public final class MJD extends AbstractC65781Prl implements InterfaceC65784Pro<DiscoveryCommonPoolExperiment.DiscoveryCommonPoolExperimentConfig> {
    public static final MJD LJLIL = new MJD();

    public MJD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final DiscoveryCommonPoolExperiment.DiscoveryCommonPoolExperimentConfig invoke() {
        try {
            FFL.LJIIIZ().getClass();
            DiscoveryCommonPoolExperiment.DiscoveryCommonPoolExperimentConfig discoveryCommonPoolExperimentConfig = (DiscoveryCommonPoolExperiment.DiscoveryCommonPoolExperimentConfig) FFL.LJIJ(true, "discovery_common_recyclerview_pool", 31744, DiscoveryCommonPoolExperiment.DiscoveryCommonPoolExperimentConfig.class, null);
            if (discoveryCommonPoolExperimentConfig == null) {
                return DiscoveryCommonPoolExperiment.LIZ;
            }
            return discoveryCommonPoolExperimentConfig;
        } catch (Throwable unused) {
            return DiscoveryCommonPoolExperiment.LIZ;
        }
    }
}
