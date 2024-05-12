package X;

import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;

/* loaded from: classes10.dex */
public final class LPE extends AbstractC65781Prl implements InterfaceC65784Pro<ISearchService> {
    public static final LPE LJLIL = new LPE();

    public LPE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ISearchService invoke() {
        return SearchServiceImpl.LLLZI();
    }
}
