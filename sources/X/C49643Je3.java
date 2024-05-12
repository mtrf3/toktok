package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchJitBlockConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Je3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49643Je3 extends AbstractC65781Prl implements InterfaceC65784Pro<SearchJitBlockConfig> {
    public static final C49643Je3 LJLIL = new C49643Je3();

    public C49643Je3() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SearchJitBlockConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SearchJitBlockConfig searchJitBlockConfig = C49642Je2.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "search_jit_block_experiment", 31744, SearchJitBlockConfig.class, searchJitBlockConfig);
        if (LJIJ != 0) {
            searchJitBlockConfig = LJIJ;
        }
        o.LJIIIIZZ(searchJitBlockConfig, "ABManager.getInstance().…nt::class.java) ?: CONFIG");
        return searchJitBlockConfig;
    }
}
