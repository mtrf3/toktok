package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.K7e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51190K7e implements InterfaceC51124K4q {
    public final /* synthetic */ EcSearchResultFragmentNew LIZ;

    @Override // X.InterfaceC51124K4q
    public final String getKeyword() {
        LiveData liveData;
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLZ;
        if (ecSearchStartViewModel != null && (liveData = (LiveData) ecSearchStartViewModel.LJLL.getValue()) != null) {
            return (String) liveData.getValue();
        }
        return null;
    }

    public C51190K7e(EcSearchResultFragmentNew ecSearchResultFragmentNew) {
        this.LIZ = ecSearchResultFragmentNew;
    }

    @Override // X.InterfaceC51124K4q
    public final void LIZ(String word) {
        LiveData liveData;
        o.LJIIIZ(word, "word");
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLZ;
        if (ecSearchStartViewModel == null || (liveData = (LiveData) ecSearchStartViewModel.LJLL.getValue()) == null) {
            return;
        }
        liveData.setValue(word);
    }
}
