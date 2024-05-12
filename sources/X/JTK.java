package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchHorizontalCardRecyclerViewSlideOptConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JTK extends AbstractC65781Prl implements InterfaceC65784Pro<SearchHorizontalCardRecyclerViewSlideOptConfig> {
    public static final JTK LJLIL = new JTK();

    public JTK() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SearchHorizontalCardRecyclerViewSlideOptConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SearchHorizontalCardRecyclerViewSlideOptConfig searchHorizontalCardRecyclerViewSlideOptConfig = JTJ.LJLJI;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "search_horizontal_card_recycler_view_slide_opt_config", 31744, SearchHorizontalCardRecyclerViewSlideOptConfig.class, searchHorizontalCardRecyclerViewSlideOptConfig);
        if (LJIJ == 0) {
            JTJ.LJLILLLLZI.getClass();
        } else {
            searchHorizontalCardRecyclerViewSlideOptConfig = LJIJ;
        }
        o.LJIIIIZZ(searchHorizontalCardRecyclerViewSlideOptConfig, "ABManager.getInstance()\n…  )\n            ?: CONFIG");
        return searchHorizontalCardRecyclerViewSlideOptConfig;
    }
}
