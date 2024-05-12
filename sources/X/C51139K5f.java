package X;

import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;

/* renamed from: X.K5f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51139K5f implements KCU {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.KCU
    public final boolean E() {
        SearchStartViewModel searchStartViewModel = this.LIZ.LLFZ;
        if (searchStartViewModel != null) {
            return searchStartViewModel.LJLIL;
        }
        return true;
    }

    @Override // X.KCU
    public final void LIZ() {
        KeyboardUtils.LIZIZ(this.LIZ.LJLJJL);
        this.LIZ.LJLJJL.setCursorVisible(false);
    }

    public C51139K5f(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }
}
