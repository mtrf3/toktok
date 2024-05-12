package X;

import com.ss.android.ugc.aweme.discover.experiment.DiscoveryCommonPoolExperiment;

/* loaded from: classes10.dex */
public final class MJE extends AbstractC65781Prl implements InterfaceC65784Pro<G3U> {
    public static final MJE LJLIL = new MJE();

    public MJE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final G3U invoke() {
        C62822Ol8 c62822Ol8 = DiscoveryCommonPoolExperiment.LIZIZ;
        if (((DiscoveryCommonPoolExperiment.DiscoveryCommonPoolExperimentConfig) c62822Ol8.getValue()).enable) {
            G3U g3u = new G3U();
            g3u.setMaxRecycledViews(0, ((DiscoveryCommonPoolExperiment.DiscoveryCommonPoolExperimentConfig) c62822Ol8.getValue()).poolSize);
            return g3u;
        }
        return null;
    }
}
