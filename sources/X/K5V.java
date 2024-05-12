package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K5V implements InterfaceC50796Jwe {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.InterfaceC50796Jwe
    public final void LIZIZ() {
        SearchResultFragmentNew searchResultFragmentNew = this.LIZ;
        searchResultFragmentNew.Vm();
        searchResultFragmentNew.An(new C51157K5x(searchResultFragmentNew.Kl()));
    }

    public K5V(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.InterfaceC50796Jwe
    public final void LIZ(Word word) {
        LiveData liveData;
        o.LJIIIZ(word, "word");
        SearchStartViewModel searchStartViewModel = this.LIZ.LLFZ;
        if (searchStartViewModel == null || (liveData = (LiveData) searchStartViewModel.LJLLI.getValue()) == null) {
            return;
        }
        liveData.setValue(word);
    }
}
