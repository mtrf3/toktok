package X;

import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class K5X implements K55 {
    public final /* synthetic */ AbstractSearchIntermediateFragmentNew LIZ;

    @Override // X.K55
    public final void onDismiss() {
        SearchResultFragmentNew searchResultFragmentNew;
        EditText editText;
        if (!this.LIZ.isViewValid()) {
            return;
        }
        Fragment parentFragment = this.LIZ.getParentFragment();
        if (!(parentFragment instanceof SearchResultFragmentNew) || (searchResultFragmentNew = (SearchResultFragmentNew) parentFragment) == null || !SearchStateViewModel.isSearchIntermediate(searchResultFragmentNew.Jl()) || (editText = searchResultFragmentNew.LJLJJL) == null) {
            return;
        }
        C51493KIv.LIZIZ(editText, new AqS158S0100000_8(searchResultFragmentNew, 531));
    }

    public K5X(AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew) {
        this.LIZ = abstractSearchIntermediateFragmentNew;
    }

    @Override // X.K55
    public final void LIZ(C50674Jug c50674Jug) {
        SearchResultFragmentNew searchResultFragmentNew;
        if (!this.LIZ.isViewValid()) {
            return;
        }
        Fragment parentFragment = this.LIZ.getParentFragment();
        if ((parentFragment instanceof SearchResultFragmentNew) && (searchResultFragmentNew = (SearchResultFragmentNew) parentFragment) != null) {
            searchResultFragmentNew.rn(c50674Jug);
        }
    }
}
