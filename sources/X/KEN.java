package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.HalfDynamicSearchShopFragment;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KEN implements KEA {
    public final /* synthetic */ HalfDynamicSearchShopFragment LJLIL;

    @Override // X.KEA
    public final String LJ(int i) {
        return "";
    }

    @Override // X.KEA
    public final NextLiveData<Integer> LJI() {
        return null;
    }

    @Override // X.KEA
    public final int LJII() {
        return 0;
    }

    @Override // X.KEA
    public final int LJIIIIZZ(KAK tabName) {
        o.LJIIIZ(tabName, "tabName");
        return 0;
    }

    public KEN(HalfDynamicSearchShopFragment halfDynamicSearchShopFragment) {
        this.LJLIL = halfDynamicSearchShopFragment;
    }

    @Override // X.KEA
    public final String LIZJ(int i) {
        SearchResultParam searchResultParam;
        C50948Jz6 searchEnterParam;
        KAK targetTab;
        String tabName;
        KE2 ke2 = this.LJLIL.LJLJJI;
        if (ke2 == null || (searchResultParam = ke2.getSearchResultParam()) == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null || (targetTab = searchEnterParam.getTargetTab()) == null || (tabName = targetTab.getTabName()) == null) {
            return "";
        }
        return tabName;
    }
}
