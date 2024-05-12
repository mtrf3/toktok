package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;

/* loaded from: classes9.dex */
public final class K5O implements InterfaceC50548Jse {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.InterfaceC50548Jse
    public final int LIZ() {
        NextLiveData<Integer> hv0;
        Integer value;
        SearchStartViewModel searchStartViewModel = this.LIZ.LLFZ;
        if (searchStartViewModel == null || (hv0 = searchStartViewModel.hv0()) == null || (value = hv0.getValue()) == null) {
            return 0;
        }
        return value.intValue();
    }

    @Override // X.InterfaceC50548Jse
    public final void LIZLLL() {
        InterfaceC51158K5y interfaceC51158K5y = this.LIZ.LLIIIZ;
        if (interfaceC51158K5y != null) {
            interfaceC51158K5y.LJI(0);
        }
        InterfaceC51158K5y interfaceC51158K5y2 = this.LIZ.LLIIIL;
        if (interfaceC51158K5y2 != null) {
            interfaceC51158K5y2.LJI(0);
        }
    }

    @Override // X.InterfaceC50548Jse
    public final int getInnerState() {
        boolean LJII = KB1.LJII(KB1.LIZ(JTO.LIZIZ(this.LIZ.mo49getActivity())));
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZIZ() && LJII) {
            InterfaceC51158K5y interfaceC51158K5y = this.LIZ.LLIIIZ;
            if (interfaceC51158K5y == null) {
                return 0;
            }
            return interfaceC51158K5y.getInnerState();
        }
        InterfaceC51158K5y interfaceC51158K5y2 = this.LIZ.LLIIIL;
        if (interfaceC51158K5y2 == null) {
            return 0;
        }
        return interfaceC51158K5y2.getInnerState();
    }

    public K5O(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.InterfaceC50548Jse
    public final void LIZIZ(int i) {
        SearchStartViewModel searchStartViewModel = this.LIZ.LLFZ;
        if (searchStartViewModel == null) {
            return;
        }
        searchStartViewModel.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC50548Jse
    public final void LIZJ(int i) {
        NextLiveData<Integer> hv0;
        SearchStartViewModel searchStartViewModel = this.LIZ.LLFZ;
        if (searchStartViewModel == null || (hv0 = searchStartViewModel.hv0()) == null) {
            return;
        }
        hv0.setValue(Integer.valueOf(i));
    }
}
