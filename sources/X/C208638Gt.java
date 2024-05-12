package X;

import com.ss.android.ugc.aweme.discover.experiment.DiscoveryFpsOptExperiment;
import kotlin.jvm.internal.o;

/* renamed from: X.8Gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208638Gt extends AbstractC65781Prl implements InterfaceC65784Pro<DiscoveryFpsOptExperiment.Config> {
    public static final C208638Gt LJLIL = new C208638Gt();

    public C208638Gt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final DiscoveryFpsOptExperiment.Config invoke() {
        DiscoveryFpsOptExperiment.Config config;
        try {
            FFL.LJIIIZ().getClass();
            config = (DiscoveryFpsOptExperiment.Config) FFL.LJIJ(true, "discovery_fps_opt_experiment", 31744, DiscoveryFpsOptExperiment.Config.class, null);
            if (config == null) {
                config = DiscoveryFpsOptExperiment.LIZ;
            }
            o.LJIIIIZZ(config, "{\n            ABManager.…     ?: default\n        }");
        } catch (Throwable unused) {
            config = DiscoveryFpsOptExperiment.LIZ;
        }
        C36922EeM.LIZLLL(4, "DiscoveryFpsOptExperiment", "enableOptFunction=" + config.enable1 + " ; enableOptEventTrace=" + config.enable2);
        return config;
    }
}
