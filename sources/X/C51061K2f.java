package X;

import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;

/* renamed from: X.K2f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51061K2f implements C0C3 {
    public int LJLIL = -1;
    public final /* synthetic */ SearchContainerFragment LJLILLLLZI;

    public C51061K2f(SearchContainerFragment searchContainerFragment) {
        this.LJLILLLLZI = searchContainerFragment;
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        SearchContainerHeaderVM searchContainerHeaderVM;
        if (C49804Jge.LJJIZ() && i == 1 && (searchContainerHeaderVM = this.LJLILLLLZI.LLFFF) != null) {
            searchContainerHeaderVM.LLFF = true;
            searchContainerHeaderVM.iv0();
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        this.LJLILLLLZI.LL.LJLJI.postValue(Boolean.TRUE);
        if (C49804Jge.LJJIZ() && this.LJLILLLLZI.LLFFF != null && this.LJLIL == C50605JtZ.LJIIJJI()) {
            SearchContainerHeaderVM searchContainerHeaderVM = this.LJLILLLLZI.LLFFF;
            searchContainerHeaderVM.LLFF = true;
            searchContainerHeaderVM.iv0();
        }
        this.LJLIL = i;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        SearchContainerFragment searchContainerFragment = this.LJLILLLLZI;
        if (searchContainerFragment.LJLILLLLZI && f == 0.0f && i2 == 0) {
            searchContainerFragment.Al();
            this.LJLILLLLZI.LJLILLLLZI = false;
        }
    }
}