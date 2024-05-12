package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;

/* loaded from: classes9.dex */
public final class K7X implements InterfaceC50548Jse {
    public final /* synthetic */ EcSearchResultFragmentNew LIZ;

    @Override // X.InterfaceC50548Jse
    public final int LIZ() {
        LiveData liveData;
        Integer num;
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLZ;
        if (ecSearchStartViewModel == null || (liveData = (LiveData) ecSearchStartViewModel.LJLLI.getValue()) == null || (num = (Integer) liveData.getValue()) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.InterfaceC50548Jse
    public final void LIZLLL() {
        InterfaceC51158K5y interfaceC51158K5y = this.LIZ.LLFII;
        if (interfaceC51158K5y != null) {
            interfaceC51158K5y.LJI(0);
        }
    }

    @Override // X.InterfaceC50548Jse
    public final int getInnerState() {
        InterfaceC51158K5y interfaceC51158K5y = this.LIZ.LLFII;
        if (interfaceC51158K5y != null) {
            return interfaceC51158K5y.getInnerState();
        }
        return 0;
    }

    public K7X(EcSearchResultFragmentNew ecSearchResultFragmentNew) {
        this.LIZ = ecSearchResultFragmentNew;
    }

    @Override // X.InterfaceC50548Jse
    public final void LIZJ(int i) {
        LiveData liveData;
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLZ;
        if (ecSearchStartViewModel == null || (liveData = (LiveData) ecSearchStartViewModel.LJLLI.getValue()) == null) {
            return;
        }
        liveData.setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC50548Jse
    public final void LIZIZ(int i) {
    }
}
