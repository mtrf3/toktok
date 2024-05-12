package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchAheadPrefetchOptConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Jgt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49819Jgt extends AbstractC65781Prl implements InterfaceC65784Pro<SearchAheadPrefetchOptConfig> {
    public static final C49819Jgt LJLIL = new C49819Jgt();

    public C49819Jgt() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SearchAheadPrefetchOptConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SearchAheadPrefetchOptConfig searchAheadPrefetchOptConfig = C49818Jgs.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "search_ahead_prefetch_config", 31744, SearchAheadPrefetchOptConfig.class, searchAheadPrefetchOptConfig);
        if (LJIJ != 0) {
            searchAheadPrefetchOptConfig = LJIJ;
        }
        o.LJIIIIZZ(searchAheadPrefetchOptConfig, "ABManager.getInstance().…nt::class.java) ?: CONFIG");
        return searchAheadPrefetchOptConfig;
    }
}
