package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchPreloadLayoutOptConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Jbl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49501Jbl extends AbstractC65781Prl implements InterfaceC65784Pro<SearchPreloadLayoutOptConfig> {
    public static final C49501Jbl LJLIL = new C49501Jbl();

    public C49501Jbl() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SearchPreloadLayoutOptConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SearchPreloadLayoutOptConfig searchPreloadLayoutOptConfig = C49500Jbk.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "search_optimize_preload_layout", 31744, SearchPreloadLayoutOptConfig.class, searchPreloadLayoutOptConfig);
        if (LJIJ != 0) {
            searchPreloadLayoutOptConfig = LJIJ;
        }
        o.LJIIIIZZ(searchPreloadLayoutOptConfig, "ABManager.getInstance().…nt::class.java) ?: CONFIG");
        return searchPreloadLayoutOptConfig;
    }
}
