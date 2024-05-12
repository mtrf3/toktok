package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchPressedPrefetchOptConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.JsY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50542JsY extends AbstractC65781Prl implements InterfaceC65784Pro<SearchPressedPrefetchOptConfig> {
    public static final C50542JsY LJLIL = new C50542JsY();

    public C50542JsY() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SearchPressedPrefetchOptConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SearchPressedPrefetchOptConfig searchPressedPrefetchOptConfig = C50541JsX.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "search_pressed_prefetch_config", 31744, SearchPressedPrefetchOptConfig.class, searchPressedPrefetchOptConfig);
        if (LJIJ != 0) {
            searchPressedPrefetchOptConfig = LJIJ;
        }
        o.LJIIIIZZ(searchPressedPrefetchOptConfig, "ABManager.getInstance().…nt::class.java) ?: CONFIG");
        return searchPressedPrefetchOptConfig;
    }
}
