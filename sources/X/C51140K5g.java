package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.K5g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51140K5g implements InterfaceC51124K4q {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.InterfaceC51124K4q
    public final String getKeyword() {
        LiveData liveData;
        SearchStartViewModel searchStartViewModel = this.LIZ.LLFZ;
        if (searchStartViewModel != null && (liveData = (LiveData) searchStartViewModel.LJLLILLLL.getValue()) != null) {
            return (String) liveData.getValue();
        }
        return null;
    }

    public C51140K5g(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.InterfaceC51124K4q
    public final void LIZ(String word) {
        LiveData liveData;
        o.LJIIIZ(word, "word");
        SearchStartViewModel searchStartViewModel = this.LIZ.LLFZ;
        if (searchStartViewModel == null || (liveData = (LiveData) searchStartViewModel.LJLLILLLL.getValue()) == null) {
            return;
        }
        liveData.setValue(word);
    }
}
