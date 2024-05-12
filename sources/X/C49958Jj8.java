package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchImagePrefetchConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Jj8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49958Jj8 extends AbstractC65781Prl implements InterfaceC65784Pro<SearchImagePrefetchConfig> {
    public static final C49958Jj8 LJLIL = new C49958Jj8();

    public C49958Jj8() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SearchImagePrefetchConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SearchImagePrefetchConfig searchImagePrefetchConfig = C49957Jj7.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "search_image_prefetch_config", 31744, SearchImagePrefetchConfig.class, searchImagePrefetchConfig);
        if (LJIJ != 0) {
            searchImagePrefetchConfig = LJIJ;
        }
        o.LJIIIIZZ(searchImagePrefetchConfig, "ABManager.getInstance().…nt::class.java) ?: CONFIG");
        return searchImagePrefetchConfig;
    }
}
