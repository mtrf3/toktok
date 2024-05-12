package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K7Y implements InterfaceC50796Jwe {
    public final /* synthetic */ EcSearchResultFragmentNew LIZ;

    @Override // X.InterfaceC50796Jwe
    public final void LIZIZ() {
        EcSearchResultFragmentNew ecSearchResultFragmentNew = this.LIZ;
        ecSearchResultFragmentNew.zm();
        ecSearchResultFragmentNew.Mm(new C51201K7p(ecSearchResultFragmentNew.Il()));
    }

    public K7Y(EcSearchResultFragmentNew ecSearchResultFragmentNew) {
        this.LIZ = ecSearchResultFragmentNew;
    }

    @Override // X.InterfaceC50796Jwe
    public final void LIZ(Word word) {
        LiveData liveData;
        o.LJIIIZ(word, "word");
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLZ;
        if (ecSearchStartViewModel == null || (liveData = (LiveData) ecSearchStartViewModel.LJLJLLL.getValue()) == null) {
            return;
        }
        liveData.setValue(word);
    }
}
