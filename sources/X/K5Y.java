package X;

import android.widget.EditText;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class K5Y implements K55 {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.K55
    public final void onDismiss() {
        EditText editText;
        if (!this.LIZ.isViewValid()) {
            return;
        }
        SearchResultFragmentNew searchResultFragmentNew = this.LIZ;
        if (!SearchStateViewModel.isSearchIntermediate(searchResultFragmentNew.Jl()) || (editText = searchResultFragmentNew.LJLJJL) == null) {
            return;
        }
        C51493KIv.LIZIZ(editText, new AqS158S0100000_8(searchResultFragmentNew, 531));
    }

    public K5Y(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.K55
    public final void LIZ(C50674Jug c50674Jug) {
        if (!this.LIZ.isViewValid()) {
            return;
        }
        this.LIZ.rn(c50674Jug);
    }
}
