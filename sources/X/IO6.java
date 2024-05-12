package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchDoFrameBalanceConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IO6 extends AbstractC65781Prl implements InterfaceC65784Pro<SearchDoFrameBalanceConfig> {
    public static final IO6 LJLIL = new IO6();

    public IO6() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SearchDoFrameBalanceConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SearchDoFrameBalanceConfig searchDoFrameBalanceConfig = IO5.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "search_do_frame_balance_config", 31744, SearchDoFrameBalanceConfig.class, searchDoFrameBalanceConfig);
        if (LJIJ != 0) {
            searchDoFrameBalanceConfig = LJIJ;
        }
        o.LJIIIIZZ(searchDoFrameBalanceConfig, "ABManager.getInstance().…nt::class.java) ?: CONFIG");
        return searchDoFrameBalanceConfig;
    }
}
