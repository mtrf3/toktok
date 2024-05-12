package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchFirstRefreshOptConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.JlD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50087JlD extends AbstractC65781Prl implements InterfaceC65784Pro<SearchFirstRefreshOptConfig> {
    public static final C50087JlD LJLIL = new C50087JlD();

    public C50087JlD() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SearchFirstRefreshOptConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SearchFirstRefreshOptConfig searchFirstRefreshOptConfig = C50086JlC.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "search_first_refresh_optimize_config", 31744, SearchFirstRefreshOptConfig.class, searchFirstRefreshOptConfig);
        if (LJIJ != 0) {
            searchFirstRefreshOptConfig = LJIJ;
        }
        o.LJIIIIZZ(searchFirstRefreshOptConfig, "ABManager.getInstance().…nt::class.java) ?: CONFIG");
        return searchFirstRefreshOptConfig;
    }
}
