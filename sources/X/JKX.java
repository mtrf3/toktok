package X;

import com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JKX extends AbstractC65781Prl implements InterfaceC65784Pro<SearchVideoAndUserOptimizeExperiment.OptimizeConfig> {
    public static final JKX LJLIL = new JKX();

    public JKX() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SearchVideoAndUserOptimizeExperiment.OptimizeConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SearchVideoAndUserOptimizeExperiment.OptimizeConfig optimizeConfig = SearchVideoAndUserOptimizeExperiment.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "search_video_user_optimize", 31744, SearchVideoAndUserOptimizeExperiment.OptimizeConfig.class, optimizeConfig);
        if (LJIJ != 0) {
            optimizeConfig = LJIJ;
        }
        o.LJIIIIZZ(optimizeConfig, "ABManager.getInstance().…nt::class.java) ?: CONFIG");
        return optimizeConfig;
    }
}
